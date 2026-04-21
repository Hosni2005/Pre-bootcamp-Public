const cities = document.querySelectorAll(".city");
const acceptBtn = document.getElementById("acceptBtn");
const cookieBox = document.getElementById("cookieBox");
const degreeSelect = document.getElementById("degree");
const temperatures = document.querySelectorAll(".high, .low");

cities.forEach(city => {
    city.addEventListener("click", function (e) {
        e.preventDefault();
        alert("Loading weather report...");
    });
});

acceptBtn.addEventListener("click", function () {
    cookieBox.remove();
});

degreeSelect.addEventListener("change", function () {
    temperatures.forEach(temp => {
        const celsius = Number(temp.dataset.c);

        if (degreeSelect.value === "f") {
            temp.textContent = Math.round(celsius * 9 / 5 + 32) + "°";
        } else {
            temp.textContent = celsius + "°";
        }
    });
});