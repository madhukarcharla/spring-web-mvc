<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
 
 <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Home Page</title>
        </head>

        <body>
            <form:form id="regForm" modelAttribute="user" action="RegisterOrLogIn" method="post">

                <table align="center">
                     <tr>
                        <td>
                        <h4>Create a new account.</h4>
                        </td>
                        <td>
                        <form:button id="register" name="register">Register</form:button>
                        </td>
                        
                    </tr>
                    <tr>
                        <td>
                        <h4>Already have an account?</h4>
                        </td>
                        <td>
                            <form:button id="login" name="login">LogIn</form:button>
                        </td>
                    </tr>
                 </table>
            </form:form>

        </body>

        </html>