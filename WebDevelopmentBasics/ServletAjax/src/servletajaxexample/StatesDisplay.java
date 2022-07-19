package servletajaxexample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StatesDisplay
 */
@WebServlet("/StatesDisplay")
public class StatesDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatesDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String statenames[]={"Andra Pradesh", "Arunachal Pradesh","Assam", "Bihar", "Uttar Pradesh","Uttrakhand"};
		String stValue=request.getParameter("state");
		
		StringBuffer result=new StringBuffer();
		if(stValue.length()>0){
			for (String state : statenames){
				if(state.startsWith(stValue)){
					result.append(state+"<br>");
				}
			}
			response.getWriter().println(result.toString());
		}
	}

}
