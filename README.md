# jsp-webapp
Simple Web Application using jsp

# TAGS
Directive Tag : <%@ %>
@page is Used to import packages, mention content type,error page etc....
Example : <%@ page import = "java.util.date","java.util.name" %>

@include is used to include other jsp page into this one

@taglib is used to include other external tags (example: Spring framework tags)

Declaration Tag : <%! %>
-Used to declare variables outside the method
Example : <%! int val = 1; %>

Scriptlet Tag : <% %>
-Used to include code inside the method (ex : doGet, doPost, service)
Example : <% String a = request.getParameter("t1");
             String b = request.getParameter("t2");
          %>
          
Expression Tag : <%=  %>
-Used to print directly without using "out" object
Example : I have entered a value : <%=val %>
