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
    <script src="js/formValidate.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
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
            <form method="post" action="/addAdvert.do">
                <table>
                    <tr>
                        <td>
                            Maker
                        </td>
                        <td>
                            <select name="maker">
                                <c:forEach items="${applicationScope.makers}" var="maker">
                                    <option>${maker}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>model</td>
                        <td>
                            <select name="model">
                                <c:forEach items="${applicationScope.models}" var="model">
                                    <option>${model}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>car body</td>
                        <td>
                            <select name="body">
                                <c:forEach items="${applicationScope.bodies}" var="body">
                                    <option>${body}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>transmission</td>
                        <td>
                            <select name="transmission">
                                <c:forEach items="${applicationScope.transmissions}" var="transmission">
                                    <option>${transmission}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>fuel type</td>
                        <td>
                            <select name="fuelType">
                                <c:forEach items="${applicationScope.fuelTypes}" var="fuelType">
                                    <option>${fuelType}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>condition</td>
                        <td>
                            <select name="condition">
                                <c:forEach items="${applicationScope.conditions}" var="condition">
                                    <option>${condition}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>cubic capacity</td>
                        <td><input type="number" name="capacity" min="100" max="20000" required></td>
                    </tr>

                    <tr>
                        <td>year</td>
                        <td><input type="number" name="year" min="1960" max="2099" id="year" required></td>
                    </tr>
                    <tr>
                        <td>mileage</td>
                        <td><input type="number" name="mileage" min="0" max="9999999" required></td>
                    </tr>
                    <tr>
                        <td>price</td>
                        <td><input type="number" name="price" min="0" max="9999999" required></td>
                    </tr>
                    <tr>
                        <td>description</td>
                        <td><textarea name="description" maxlength="1000" cols="70" rows="10" required></textarea></td>
                    </tr>
                    <tr>
                        <td>status</td>
                        <td><input type="text" name="status" value="new" readonly></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="add"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</div>
</body>
</html>
