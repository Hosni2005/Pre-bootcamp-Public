function alwaysHungry(arr) {
    var found = false;

    for (var i = 0; i < arr.length; i++) {
        if (arr[i] === "food") {
            console.log("yummy");
            found = true;
        }
    }

    if (found === false) {
        console.log("I'm hungry");
    }
}

// Test
alwaysHungry([3.14, "food", "pie", true, "food"]);
alwaysHungry([4, 1, 5, 7, 2]);
