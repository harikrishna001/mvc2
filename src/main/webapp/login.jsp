<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="black" text="red">
<center>

<form  action="Verify.form"   method="post">
  <table border=1  bgcolor="black">
    <tr>
      <td>Username</td> <td><input  type="text"  name="username"></td>
    </tr>  
    
    <tr>
      <td>Password</td> <td><input  type="password"  name="password"></td>
    </tr>
    
    <tr>
      <td  colspan="2" align="center">
       <input  type="submit"   value="LOGIN">
      </td> 
    </tr>
  </table>

</form>
</center>
</body>
</html>