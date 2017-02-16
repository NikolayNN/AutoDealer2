<div class="header">
    <p>Hello ${sessionScope.user.name}!</p>
    <form action="/logOut.do" method="get">
        <input type="submit" value="Log out">
    </form>
    <a href="regPage.html">Registration</a>
    <a href="signIn.html">Sign In</a>
    <a href="secret/userOffice.jsp">Secret</a>
    <a href="showAdverts.do">all adverts</a>
</div>