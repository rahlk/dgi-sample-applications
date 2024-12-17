package webstateful;

/**
 * Insert the type's description here. Creation date: (09/10/00 16:37:04)
 * 
 * @author: Administrator
 */

import java.io.Serializable;



import jakarta.ejb.NoSuchEJBException;

import stateful.*;
import irwwbase.*;


public class Client extends IRWWBase implements Serializable {

	/**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = -8682284549351778278L;

	private int num, loopnum;

	private long duration = 10;

	private String results = null;

	private String status = "SUCCESFUL";

	private String stack = "none";

	// I18nService declarations

	// protected I18nService i18n;
	// protected Internationalization callerI18n;
	// protected Locale locale;

	/**
	 * PriceChangeClient constructor comment.
	 */
	public Client() {
		super();
	}

	private int generateNum() throws Exception {

		ExtendedRandom rand = new ExtendedRandom();
		try {
			num = rand.nextInt(1, MaxValues.itemId((byte) 1));

		} catch (java.lang.Exception ex) {
			throw new Exception("StatefulTest Client.generateNum()", ex);
		}

		return num;
	}

	/*
	 * /************************************************************** Allows
	 * you to turn debug statements on/off in jvm.properties
	 */
	/*
	 * public void debugOut(String message) { if
	 * (System.getProperty("DEBUG_OUT_HTTP") != null) { if
	 * (System.getProperty("DEBUG_OUT_HTTP").equals("ON")) { String ts = (new
	 * Timestamp(System.currentTimeMillis())).toString(); String tn =
	 * Thread.currentThread().getName(); System.out.println("Trace: " + ts + " "
	 * + tn + " " + message); } } }
	 */
	public void web(AdditupLocal aab) throws Exception {
		// I18nService i18n = new I18nService();
		// i18n.setSessionContext();
		// i18n.setResourceBundle();
		// locale=i18n.getLocale();
		// java.text.DateFormat df = java.text.DateFormat.getDateInstance
		// (java.text.DateFormat.DEFAULT, locale);
		// java.text.DateFormat tf = java.text.DateFormat.getTimeInstance
		// (java.text.DateFormat.DEFAULT, locale);
		// java.text.NumberFormat nf =
		// java.text.NumberFormat.getCurrencyInstance(locale);
		
		//Comment out unused variable
		//String s = new String();
		displayOut("Running StatefulTest");
		// System.out.print('.');

		String clientIdent = String.valueOf(System.currentTimeMillis());
		StatefulOutput output = null;

		/*
		 * displayOut( "Starting Time is: " + new java.util.Date().toString() +
		 * ", milliseconds: " + String.valueOf(System.currentTimeMillis()));
		 */

		// AddItupAccessBean aab = new AddItupAccessBean();
		// aab.setInit_JNDIName("java:comp/env/ejb/AddItUpHome");

		String clientMatch;
		int sumFromBean = 0;
		int sum = 0, i;

		try {

			aab.setClientIdentifier(clientIdent);

			// System.out.println("setClientIdentifier success!");

			for (i = 1; i <= loopnum; i++) {
				clientMatch = aab.addIt(generateNum());
				debugOut("<Client> Random number is: " + num);

				if (!(clientMatch.equalsIgnoreCase(clientIdent))) {
					results = "Mismatch on session bean ids, wrong bean retrieved after"
							+ i
							+ "remote method calls, identifier on client side is:"
							+ clientIdent
							+ "identifier on bean side is"
							+ clientMatch + "STCNUM:" + aab.getStcNum();
					setStatus("FAILED");
					break;
				}
				debugOut("Identifier on client side is: " + clientIdent
						+ " identifier on bean side is: " + clientMatch);
				sum = sum + num;
				// System.out.println("The value of sum is :" + sum);
				output = aab.total();

				sumFromBean = output.getTotal();
				debugOut("Sum at client is: " + sum + " sum from bean is: "
						+ sumFromBean);
				if (sum != sumFromBean) {
					results = "State data did not sum properly after" + i
							+ "remote method calls, sum at client is:" + sum
							+ "sum from bean is:" + sumFromBean + "STCNUM:"
							+ aab.getStcNum();
					setStatus("FAILED");

					break;
				}
				debugOut("<Client> Current sum is: " + sum);
				if (i == loopnum)
					break;
				Thread.sleep(duration);
			}
			if (results == null) {
				output = aab.total();

				clientMatch = output.getClientIdentifier();
				if (!(clientMatch.equalsIgnoreCase(clientIdent)))
					results = "Mismatch on session bean ids, wrong bean retrieved"
							+ ", " + "STCNUM:" + aab.getStcNum();
				sumFromBean = output.getTotal();
				if (sum == sumFromBean && results == null) {
					results = "Test Succeeded!! After" + " " + i + " "
							+ "remote method calls, sum at client is:" + " "
							+ sum + " " + "sum from bean is:" + " "
							+ sumFromBean;
					setStatus("SUCCESSFUL");

				} else {
					results = "State data did not sum properly after" + " " + i
							+ " " + "remote method calls, sum at client is:"
							+ " " + sum + " " + "sum from bean is:" + " "
							+ sumFromBean + " " + results + " " + "STCNUM:"
							+ " " + aab.getStcNum();
					setStatus("FAILED");
				}
			}

		} catch (java.lang.Exception ex) {
			aab.remove();
			setStatus("FAILED: " + ex.getMessage() + getSTC());
			setStack(getStackTrace(ex));
		}

		try {
			aab.remove();
		} catch (Exception re) {
			re.printStackTrace();
			setStatus("FAILED: " + re.getMessage() + getSTC());
			setStack(getStackTrace(re));
		}

		// aab.remove();
		Exception ex = null;
		try {
			aab.setClientIdentifier("end of test");
		} catch (NoSuchEJBException ne) {
			ex = ne;
			
			// Since this is an expected exception, there is no need to print the stack trace here
			// ne.printStackTrace();
			
			debugOut("<<< Got jakarta.ejb.NoSuchEJBException, this is correct since we previously removed the stateful EJB.  Exception msg is: "
					+ ne.getMessage());
			setStatus("SUCCESSFUL");
		} catch (Exception e) {
			ex = e;
			e.printStackTrace();
			debugOut("<<< Did not get NoSuchObjectException, got: "
					+ e.getMessage());
			setStatus("FAILED: Did not get NoSuchObjectException, got:"
					+ e.getMessage() + getSTC());
			setStack(getStackTrace(e));
			// throw new
			// UserException("SFSB was removed, then something else went wrong: "+e.getMessage()+" "+getSTC());
		}
		if (ex != null) {
			if (ex instanceof NoSuchEJBException)
				;
			// else throw new
			// UserException("SFSB was removed, then something else went wrong: "+ex.getMessage()+" "+getSTC());
			else {
				setStatus("FAILED: SFSB was removed, then something else went wrong: "
						+ ex.getMessage() + getSTC());
				setStack(getStackTrace(ex));
			}
		} else
			setStatus("FAILED: SFSB was removed, yet it still works, STCNUM: "
					+ getSTC());

		// continueProcessing:
		debugOut(" Exiting StatefulTest");
		debugOut(" Timestamp is:" + new String(new java.util.Date().toString()));

	}

	/**
	 * @return
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * @return
	 */
	public int getLoopnum() {
		return loopnum;
	}

	/**
	 * @param l
	 */
	public void setDuration(long l) {
		duration = l;
	}

	/**
	 * @param i
	 */
	public void setLoopnum(int i) {
		loopnum = i;
	}

	/**
	 * @return
	 */
	public String getResults() {
		return results;
	}

	/**
	 * @param string
	 */
	public void setResults(String string) {
		results = string;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

}