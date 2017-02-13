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
                            <p>${advert.car.makerInfo.refMaker.maker}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>model</td>
                        <td>
                            <p>${advert.car.makerInfo.refModel.model}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>car body</td>
                        <td>
                            <p>${advert.car.makerInfo.refCarBody.carBody}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>transmission</td>
                        <td>
                            <p>${advert.car.makerInfo.refTransmission.transmission}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>fuel type</td>
                        <td>
                            <p>${advert.car.makerInfo.refFuelType.fuelType}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>condition</td>
                        <td>
                            <p>${advert.car.ownerInfo.refCondition.condition}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>cubic capacity</td>
                        <td>
                            <p>${advert.car.makerInfo.capacity}</p>
                        </td>
                    </tr>
                    <tr>
                        <td>year</td>
                        <td><p>${advert.car.makerInfo.year}</p></td>
                    </tr>
                    <tr>
                        <td>mileage</td>
                        <td><p>${advert.car.ownerInfo.mileage}</p></td>
                    </tr>
                    <tr>
                        <td>price</td>
                        <td><p>${advert.car.ownerInfo.price}</p></td>
                    </tr>
                    <tr>
                        <td>description</td>
                        <td><p>${advert.car.ownerInfo.description}</p></td>
                    </tr>
                    <tr>
                        <td>added</td>
                        <td><p>${advert.users.name}</p></td>
                    </tr>
                </table>
                <hr/>
            </c:forEach>
        </div>
        <div class="nav-bar">
            <form method="get" action="showAdverts.do">
                <input type="submit" value="first"/>
            </form>
            <form method="get" action="showAdverts.do">
                <input type="hidden" name="page" value="${nextPage}"/>
                <input type="submit" value="next"/>
            </form>
            <p> page: ${currentPage}</p>
            <p> pages: ${pagesCount}</p>
            <form method="get" action="showAdverts.do">
                <input type="number" name="page"/>
                <input type="submit" value="go"/>
            </form>
            <form method="get" action="showAdverts.do">
                <input type="hidden" name="page" value="${previousPage}"/>
                <input type="submit" value="prev"/>
            </form>
            <form method="get" action="showAdverts.do">
                <input type="hidden" name="page" value="${pagesCount}"/>
                <input type="submit" value="last"/>
            </form>
            </form>
        </div>
    </div>
</div>
</body>
</html>

</body>
</html>
