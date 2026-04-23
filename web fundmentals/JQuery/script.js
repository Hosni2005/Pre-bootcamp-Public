$(document).ready(function () {

    // 1. Hover animation
    $(".card").hover(function () {
        $(this).animate({
            width: "330px"
        }, 200);
    }, function () {
        $(this).animate({
            width: "300px"
        }, 200);
    });

    // 2. Show/Hide details 
    $("#moreBtn").click(function () {
        $(".details").slideToggle();

        if ($(this).text() === "Show Details") {
            $(this).text("Hide Details");
        } else {
            $(this).text("Show Details");
        }
    });

    // 3. Change Theme
    $("#themeBtn").click(function () {
        $("body").toggleClass("dark");

        if ($("body").hasClass("dark")) {
            $("body").css("background", "#111");
            $(".card").css("background", "#222").css("color", "white");
        } else {
            $("body").css("background", "linear-gradient(135deg, #0d1d39, #21a951)");
            $(".card").css("background", "white").css("color", "black");
        }
    });

});