package logoff;

import java.io.*;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LogOffController extends HttpServlet  
    implements Serializable
{
   
    /**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = -2782714343250113902L;

	public LogOffController()
    {}

    public void init(ServletConfig config)
        throws ServletException
    {
        super.init(config);
    }

    public void debugOut(String message)
    {
        if(System.getProperty("DEBUG_OUT") != null && System.getProperty("DEBUG_OUT").equals("ON"))
        {
            String ts = (new Timestamp(System.currentTimeMillis())).toString();
            String tn = Thread.currentThread().getName();
            System.out.println((new StringBuilder("Trace WebLogOff: ")).append(ts).append(" ").append(tn).append(" ").append(message).toString());
        }
    }

    public void printOut(String message)
    {
        String ts = (new Timestamp(System.currentTimeMillis())).toString();
        String tn = Thread.currentThread().getName();
        System.out.println((new StringBuilder("Trace WebLogoff: ")).append(ts).append(" ").append(tn).append(" ").append(message).toString());
    }

    public void destroy()
    {
    }

    public void performServices(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
    {
    }

    public void performTask(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        debugOut("Entering Logoff Controller performTask method");
        //Commenting out unused variable
        //String reportTitle = "WebLogoff";
        HttpSession aHttpSession = null;
        String nextPage;
        try
        {
            performServices(request, response);
            nextPage = getInitParameter(request.getParameter("command"));
        }
        catch(Exception ex)
        {
            nextPage = "/error.jsp";
        }
        try
        {
            aHttpSession = request.getSession(false);
        }
        catch(Throwable t)
        {
            printOut("Error:  request.getSession(false) failed");
            t.printStackTrace();
            response.sendError(600, "Error:  request.getSession(false) failed");
            throw new RemoteException("Error:  request.getSession(false) failed", t);
        }
        debugOut("Got a handle to the session - aHttpSession  ");
        try
        {
            if(aHttpSession != null)
                aHttpSession.invalidate();
        }
        catch(Throwable t)
        {
            printOut("Error: aHttpSession.invalidate failed");
            t.printStackTrace();
            response.sendError(600, "Error: aHttpSession.invalidate failed");
            throw new RemoteException("Error: aHttpSession.invalidate failed", t);
        }
        dispatch(request, response, nextPage);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        performTask(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        performTask(request, response);
    }

    public void dispatch(HttpServletRequest request, HttpServletResponse response, String nextPage)
        throws ServletException, IOException
    {
        RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
        dispatch.forward(request, response);
    }

}