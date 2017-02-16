<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="UTF-8">
    <link href="CSS/style.css" rel="stylesheet">
    <title>${sessionScope.user.name}</title>
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
        <a href="/addAdvert.do">add new advert</a>
        <div class="content">
            <c:forEach items="${adverts}" var="advert">
                <table>
                    <tr>
                        <td>
                            <span class="text">Maker</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.refMaker.maker}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">model</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.refModel.model}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">car body</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.refCarBody.carBody}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">transmission</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.refTransmission.transmission}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">fuel type</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.refFuelType.fuelType}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">condition</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.ownerInfo.refCondition.condition}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">cubic capacity</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.capacity}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">year</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.makerInfo.year}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">mileage</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.ownerInfo.mileage}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">price</span>
                        </td>
                        <td>
                            <span class="text">${advert.car.ownerInfo.price}</span>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">description</span>
                        </td>
                        <td><span class="text">${advert.car.ownerInfo.description}</span></td>
                    </tr>
                    <tr>
                        <td>
                            <span class="text">added</span>
                        </td>
                        <td>
                            <span class="text">${advert.users.name}</span>
                        </td>
                    </tr>
                </table>
                <hr/>
            </c:forEach>
            <div class="nav-bar">
                <form method="post" action="userOffice.do" class="nav">
                    <input type="submit" value="<<"/>
                </form>
                <form method="post" action="userOffice.do" class="nav">
                    <input type="hidden" name="page" value="${previousPage}"/>
                    <input type="submit" value="<"/>
                </form>
                <span> page: ${currentPage}</span>
                <span> pages: ${pagesCount}</span>
                <form method="post" action="userOffice.do" class="nav">
                    <input type="number" name="page" size="3" min="0" max="${pagesCount}"/>
                    <input type="submit" value="go"/>
                </form>
                <form method="post" action="userOffice.do" class="nav">
                    <input type="hidden" name="page" value="${nextPage}"/>
                    <input type="submit" value=">"/>
                </form>
                <form method="post" action="userOffice.do" class="nav">
                    <input type="hidden" name="page" value="${pagesCount}"/>
                    <input type="submit" value=">>"/>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>