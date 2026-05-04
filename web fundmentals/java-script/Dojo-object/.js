
function getMax(arr) {
    var maxHeight = Infinity
    var count=0;
    for (var i = 0; i < arr.length - 1; i++) {

        if (arr[i] >= maxHeight) {
            count++;
        }
        arr += arr;

    }

}


var result = getMax([6,2,8,4,11,13])
console.log(result)