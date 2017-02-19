<%--
  Created by IntelliJ IDEA.
  User: Nikol
  Date: 2/12/2017
  Time: 6:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="../js/formValidate.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <link href="../CSS/style.css" rel="stylesheet">
    <title>Title</title>
</head>
<body>
<div class="back">
    <div class="main">
        <jsp:include page="../view/include/header.jsp"/>
        <div class="content">
            <jsp:include page="../view/include/advertList.jsp"/>
            <div class="nav-bar">
                <form method="get" action="showAdverts.do" class="nav">
                    <input type="submit" value="<<"/>
                </form>
                <form method="get" action="showAdverts.do" class="nav">
                    <input type="hidden" name="page" value="${previousPage}"/>
                    <input type="submit" value="<"/>
                </form>
                <span> page: ${currentPage}</span>
                <span> pages: ${pagesCount}</span>
                <form method="get" action="showAdverts.do" class="nav">
                    <input type="number" name="page" size="3" min="0" max="${pagesCount}"/>
                    <input type="submit" value="go"/>
                </form>
                <form method="get" action="showAdverts.do" class="nav">
                    <input type="hidden" name="page" value="${nextPage}"/>
                    <input type="submit" value=">"/>
                </form>
                <form method="get" action="showAdverts.do" class="nav">
                    <input type="hidden" name="page" value="${pagesCount}"/>
                    <input type="submit" value=">>"/>
                </form>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>

</body>
</html>
