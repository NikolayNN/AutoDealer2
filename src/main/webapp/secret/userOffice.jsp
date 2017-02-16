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
            <jsp:include page="../advertList.jsp"/>
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