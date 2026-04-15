function validateLogin(){
let user= document.getElementById("username").value;
let pass= document.getElementById("password").value;
if (user === "hosninouraldin@gmail.com" && pass === "2912005hosni"){
    window.location.href = "Profile-page.html";
}else{
    alert("Wrong username or password")
    return false;
}
}
function logout() {
    window.location.href = "signin-page.html";
}