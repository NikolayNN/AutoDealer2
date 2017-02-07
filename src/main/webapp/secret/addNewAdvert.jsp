<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Nikol
  Date: 2/7/2017
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="back">
    <div class="main">
        <div class="header">
            <p>Hello ${sessionScope.user.name}!</p>
            <form action="/logOut.do" method="get">
                <input type="submit" value="Log out">
            </form>
        </div>
        <div class="content">
            <form>
                <select>
                    <c:forEach items="${applicationScope.makers}" var="maker">
                        <option>${maker}</option>
                    </c:forEach>
                </select>
                <select>
                    <c:forEach items="${applicationScope.models}" var="model">
                        <option>${model}</option>
                    </c:forEach>
                </select>
                <select>
                    <c:forEach items="${applicationScope.bodies}" var="body">
                        <option>${body}</option>
                    </c:forEach>
                </select>
                <select>
                    <c:forEach items="${applicationScope.transmissions}" var="transmission">
                        <option>${transmission}</option>
                    </c:forEach>
                </select>
                <select>
                    <c:forEach items="${applicationScope.fuelTypes}" var="fuelType">
                        <option>${fuelType}</option>
                    </c:forEach>
                </select>
                <select>
                    <c:forEach items="${applicationScope.conditions}" var="condition">
                        <option>${condition}</option>
                    </c:forEach>
                </select>
            </form>
        </div>
    </div>
</div>
</body>
</html>
