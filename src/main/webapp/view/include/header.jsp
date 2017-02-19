<div class="header">
    <p>Hello ${sessionScope.user.name}!</p>
    <form action="/logOut.do" method="get">
        <input type="submit" value="Log out">
    </form>
    <a href="view/regPage.html">Registration</a>
    <a href="view/signIn.html">Sign In</a>
    <a href="view/secret/userOffice.jsp">Secret</a>
    <a href="showAdverts.do">all adverts</a>
</div>