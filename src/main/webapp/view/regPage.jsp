<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="js/formValidate.js"></script>
    <script src="../js/ajaxRegPage.js"></script>
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<div class="main">
    <div class="content">
        <h2>Create new user</h2>
        <form action = "addUser.do" method="post">
            <table class="regForm">
                <tr>
                    <td>username</td>
                    <td><input type="text" name="username" onblur="checkUsername()" id="username" required/></td>
                </tr>
                <tr>
                    <td>email</td>
                    <td><input type="email" name="email" required/></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="password" id="password" required/></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="passwordRepeat" id="passwordRepeat" required onblur="checkPassword()"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="ok"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
<body>

</body>
</html>