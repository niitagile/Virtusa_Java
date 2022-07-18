package net.virtusa.handler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.virtusa.dao.UserDao;
import net.virtusa.bean.UserBean;

public class UserHandler extends HttpServlet {    
	 private UserDao dao;

    public UserHandler() {
        super();
        dao = new UserDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	String action = request.getParameter("action");
    	if(action.equalsIgnoreCase("insert")) {
    		String uId = request.getParameter("userid");
    		int id = Integer.parseInt(uId);
    		String firstname=request.getParameter("firstName");
    		String lastname=request.getParameter("lastName");
    		UserBean user = new UserBean();
    		user.setId(id);
    		user.setfName(firstname);
    		user.setlName(lastname);
    		dao.addUser(user);
    		request.setAttribute("users", dao.getAllUsers()); 
    		RequestDispatcher rd = request.getRequestDispatcher("/listUser.jsp");
            rd.forward(request, response);
    	}
    	
    	if (action.equalsIgnoreCase("delete")){
            String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);
            dao.removeUser(uid);
           
            request.setAttribute("users", dao.getAllUsers());
            RequestDispatcher rd = request.getRequestDispatcher("/listUser.jsp");
            rd.forward(request, response);
        }
    	if (action.equalsIgnoreCase("edit")){
        	String userId = request.getParameter("userId");
            int uid = Integer.parseInt(userId);            
            UserBean user = new UserBean();
        	user.setId(uid);
            user.setfName(request.getParameter("firstName"));
            user.setlName(request.getParameter("lastName"));
            dao.editUser(user);
            request.setAttribute("users", dao.getAllUsers());
            RequestDispatcher rd = request.getRequestDispatcher("/listUser.jsp");
            rd.forward(request, response);
         }
    	
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}