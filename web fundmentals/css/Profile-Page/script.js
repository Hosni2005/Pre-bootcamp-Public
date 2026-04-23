function validateLogin() {
    let user = document.getElementById("username").value;
    let pass = document.getElementById("password").value;

    if (user === "hosninouraldin@gmail.com" && pass === "2912005hosni") {
        window.location.href = "Profile-page.html";
        return false;
    } else {
        alert("Wrong username or password");
        return false;
    }
}

function logout() {
    window.location.href = "signin-page.html";
}

var changeName = document.querySelector(".profile-name");
var inputField = document.querySelector(".inputclass");
var oke = document.querySelector(".ok-btn");

function edit() {
    inputField.style.display = "inline-block";
    inputField.value = changeName.innerText;
    changeName.style.display = "none";
    oke.style.display = "inline-block";
}

function ok() {
    var newname = inputField.value;
    changeName.innerText = newname;
    changeName.style.display = "block";
    inputField.style.display = "none";
    oke.style.display = "none";
}

var req2 = document.querySelector(".req2");
var con500 = document.querySelector(".con500");

function accept(elem) {
    elem.closest(".linereq").style.display = "none";
    req2.innerText = parseInt(req2.innerText) - 1;
    con500.innerText = parseInt(con500.innerText) + 1;
}

function False(elem) {
    elem.closest(".linereq").style.display = "none";
    req2.innerText = parseInt(req2.innerText) - 1;
}