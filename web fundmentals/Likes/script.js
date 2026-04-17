function addLike(element) {
    var newLike = element.parentElement.querySelector("span")
    var y = parseInt(newLike.innerText)
    y++;
    newLike.innerText = y + "like(s)";
}