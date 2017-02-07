<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <p>Hello ${sessionScope.user.name}!</p>
    <form action="/logOut.do" method="get">
        <input type="submit" value="Log out">
    </form>
</body>
</html>