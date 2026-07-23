//=================================** Question 1 **===================================//

var hello;
console.log(hello) //undefined
hello = 'world';

//=================================** Question 2 **===================================//

var needle;

function test() {
    var needle;
    needle = "magnet";
    console.log(needle);
}
needle = "haystack";
test(); // magnet

//=================================** Question 3 **===================================//

var brendan;
function print() {
    brendan = "only okay";
    console.log(brendan);
}

brendan = "super cool";
console.log(brendan); //super cool

//=================================** Question 4 **===================================//

var food ;

function eat() {
    var food;
    food = "half-chicken";
    console.log(food);
    
    food = "gone";
}

food = "chicken";
console.log(food); // chicken

eat(); //half-chicken

//=================================** Question 5 **===================================//

var mean;

mean(); // error
console.log(food);

var mean = function () {
    food = "chicken";
    console.log(food);

    var food = "fish";
    console.log(food);
};

console.log(food);

//=================================** Question 6 **===================================//

var genre ;

function rewind() {
    var genre;
    genre = "rock";
    console.log(genre);
    
    genre = "r&b";
    console.log(genre);
}
console.log(genre); //undefined

rewind(); // rock , r&b

genre = "disco";
console.log(genre); //disco

//=================================** Question 7 **===================================//

function learn() {
    var dojo ;

    dojo = "burbank";
    console.log(dojo);
    
    dojo = "seattle";
    console.log(dojo);
}
dojo = "san jose";
console.log(dojo); //san jose

learn(); // burbank ,seattle
console.log(dojo); //san jose

//=================================** Question 8 **===================================//

function makeDojo(name, students) {
    const dojo = {};
    
    dojo.name = name;
    dojo.students = students;
    
    if (dojo.students > 50) {
        dojo.hiring = true;
    } else if (dojo.students <= 0) {
        dojo = "closed for now";
    }
    
    return dojo;
}
console.log(makeDojo("Chicago", 65)); // { name: 'Chicago', students: 65, hiring: true }
console.log(makeDojo("Berkeley", 0)); // error