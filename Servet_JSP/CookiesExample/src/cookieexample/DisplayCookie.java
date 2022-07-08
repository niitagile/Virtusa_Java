package cookieexample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayCookie
 */
@WebServlet("/DisplayCookie")
public class DisplayCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	doPost(req, resp);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie[]=request.getCookies();
		PrintWriter out=response.getWriter();
		if(cookie!=null){
			for(Cookie c:cookie){
			String uname=c.getValue();
			if(uname!=null ||uname.equals("") ){
				out.println("Welcome "+uname);
			}
			}
		}
		
	/*	HttpSession session=request.getSession();
		if(session!=null){
			out.println("Welcome "+ (String)session.getAttribute("uname"));
		}*/

}
}
