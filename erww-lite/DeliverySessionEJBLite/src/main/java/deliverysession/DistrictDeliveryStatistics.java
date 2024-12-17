/*
 * Created on Nov 10, 2003
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package deliverysession;

/**
 * @author lamodeo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DistrictDeliveryStatistics implements java.io.Serializable {

	/**
	 * AutoGenerated UID
	 */
	private static final long serialVersionUID = 4459416698080735530L;
	private int districtsSkipped   = 0;
	private int districtsProcessed = 0;
	private Throwable aThrowable   = null;
	
	public DistrictDeliveryStatistics() {
		super();
	}	
	public synchronized int getDistrictsProcessed() {
		return districtsProcessed;
	}	
	public synchronized int getDistrictsSkipped() {
		return districtsSkipped;
	}
	public synchronized int addProcessedDistrict() {
		return districtsProcessed +=1;
	}
	public synchronized  int addSkippedDistrict() {
		return districtsSkipped +=1;
	}

	public void setAThrowable(Throwable aThrowable) {
		this.aThrowable = aThrowable;
	}

	public Throwable getAThrowable() {
		return aThrowable;
	}	

}
