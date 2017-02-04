function checkUsername() {
    if ($("#username").val().match("^[a-zA-Z0-9]+$") == null){
        alert("input correct username");
        return false;
    }

}

function checkPassword(){
    var password = $("#password").val();
    var passwordRepeat = $("#passwordRepeat").val();
    if(password.localeCompare(passwordRepeat)){
        alert("inputed passwords don't match");
        return false;
    }
}

function checkForm(){
    var isValid = true;
    isValid = checkUsername();
    isValid = checkPassword();
    return isValid;
}