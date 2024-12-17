
package pricechange.jms.lite;
/**
*Description - JMS Front Controller
* 
* The Controller is the initial point of contact for handling a request.  
* Place in this class any services you would like to do on every request
* (Logging, Dubuging, Authentication...)
*/
// Imports
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.concurrent.atomic.AtomicInteger;


public class JMSController  extends HttpServlet implements Serializable
{
	
	/**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = 1653729936048739243L;
	static AtomicInteger PriceChangeClientTxInFlightCounter = new AtomicInteger(0);
	
   /**************************************************************
   * Initializes the servlet
   * @param config The servlets configuration information
   */
   public void init(ServletConfig config) throws ServletException {
      super.init(config);
      //Place code here to be done when the servlet is initialized
   }

   /***************************************************************
   * Destroy the Servlet
   */
   public void destroy() {
      //Place code here to be done when the servlet is shutdown
   }

   /***************************************************************
   * This method is run once for each request.
   * @param request The incoming request information
   * @param response The outgoing response information
   */
   public void performServices(HttpServletRequest request, 
                               HttpServletResponse response) {
      //Place any code here that you would like to run on every request
      //Logging, Authentication, Debugging...
   }

   /***************************************************************
   * Process both HTTP GET and HTTP POST methods
   * @param request The incoming request information
   * @param response The outgoing response information
   */
   public void performTask(HttpServletRequest request,
                           HttpServletResponse response)
		                    throws ServletException, IOException {
      String nextPage;
      
      try {   	  
    	 
   		JMS_MDB_debugOut(">> JMSPriceChangeClientTxInFlightCounter = " + PriceChangeClientTxInFlightCounter.incrementAndGet());	  

         //Perform any specialized sevices
         performServices(request, response);

         //Select next web page associated with the command in the request
         nextPage = getInitParameter(request.getParameter("command"));
              		 
      } catch (Exception ex) {
         //If an exception is thrown serve the error page
         nextPage = getInitParameter("error_page");
      }
         //Forward the request to the next page
         dispatch(request, response, nextPage);
         
  		JMS_MDB_debugOut("<< JMSPriceChangeClientTxInFlightCounter = " + PriceChangeClientTxInFlightCounter.decrementAndGet() );
   }

   /***************************************************************
   * Process incoming requests for a HTTP GET method
   * @param request The incoming request information
   * @param response The outgoing response information
   */
   public void doGet(HttpServletRequest request, 
                     HttpServletResponse response)
		                    throws ServletException, IOException {
      performTask(request, response);
   }

   /***************************************************************
   * Process incoming requests for a HTTP POST method
   * @param request The incoming request information
   * @param response The outgoing response information
   */
   public void doPost(HttpServletRequest request, 
                      HttpServletResponse response)
		                    throws ServletException, IOException {
      performTask(request, response);
   }

   /****************************************************************
   * Dispatches to the next page
   * @param request The incoming request information
   * @param response The outgoing response information
   * @param nextPage The page to dispatch to 
   */
   public void dispatch(HttpServletRequest request,
                        HttpServletResponse response, String nextPage)
                                    throws ServletException, IOException {
      RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
      dispatch.forward(request, response);
   }
   
   
   private void JMS_MDB_debugOut(String message) {
		if (System.getProperty("JMS_MDB_DEBUG_OUT") != null)
			if (System.getProperty("JMS_MDB_DEBUG_OUT").equals("ON"))
				System.out.println(message);
   }
   
}
