<%--
  Created by IntelliJ IDEA.
  User: LinHuan
  Date: 14-4-30
  Time: 上午9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>
  </head>
  <body>



      <table>
           <tr><td>id</td><td>name</td><td>address</td></tr>
          <td>${users.id}</td> <td>${users.name}</td><td>${users.address}</td>
           <c:forEach items="${userList}" var="users">
          <tr>
             <td>${users.id}</td> <td>${users.name}</td><td>${users.address}</td>

          </tr>
           </c:forEach>
      </table>

  </body>
</html>
