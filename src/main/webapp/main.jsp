<%--
  Created by IntelliJ IDEA.
  User: Nikol
  Date: 2/12/2017
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
            <c:forEach items="${adverts}" var="advert">
                <table>
                    <tr>
                        <td>
                            Maker
                        </td>
                        <td>
                            <p>${advert.car.makerinfo.maker.manufactor}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>model</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>car body</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>transmission</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>fuel type</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>condition</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>cubic capacity</td>
                        <td>
                            <p></p>
                        </td>
                    </tr>
                    <tr>
                        <td>year</td>
                        <td><p></p></td>
                    </tr>
                    <tr>
                        <td>mileage</td>
                        <td><p></p></td>
                    </tr>
                    <tr>
                        <td>price</td>
                        <td><p></p></td>
                    </tr>
                    <tr>
                        <td>description</td>
                        <td><p></p></td>
                    </tr>
                    <tr>
                        <td>status</td>
                        <td><p></p></td>
                    </tr>
                </table>
            </c:forEach>
        </div>
    </div>
</div>
</body>
</html>

</body>
</html>
