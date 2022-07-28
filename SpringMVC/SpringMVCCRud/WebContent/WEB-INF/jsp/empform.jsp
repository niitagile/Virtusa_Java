<%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Employee</h1>
       <fm:form method="post" action="save" modelAttribute="emp">  
      	<table >
      	<tr>  
          <td>eid : </td> 
          <td><fm:input path="eid"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><fm:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><fm:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><fm:input path="designation" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </fm:form>  
