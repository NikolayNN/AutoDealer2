<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
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
        <a href="/addAdvert.do">add new advert</a>
    </div>
</div>
</body>
</html>