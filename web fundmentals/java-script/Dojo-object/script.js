 var pizzaOven ={
        "crust" : ["(deep Dish)","(Traditional)"],
        "cheese": ["(mozzarella)","(feta)"],
        "Sausage":["(Pepperoni)","(Sausage)"],
        "Extra" : ["(Olives)","(Onions)","(Mushrooms)"],
    }
    var randomcurst = Math.floor(Math.random() * 2);
    var randomchesse = Math.floor(Math.random() * 2);
    var randomsausage =Math.floor(Math.random() * 2);
    var randomextra =Math.floor(Math.random() * 2);
    var randompizza = pizzaOven.crust[randomcurst] + pizzaOven.cheese[randomchesse] +pizzaOven.Sausage[randomsausage] + pizzaOven.Extra[randomextra];
    
    function pizza() {
        var pizza1 = pizzaOven.crust[0]+" "+pizzaOven.cheese[0]+" "+pizzaOven.Sausage[0];
        var pizza2 = pizzaOven.crust[1]+" " + pizzaOven.cheese[0] + " " +pizzaOven.cheese[1]+" "+pizzaOven.Extra;
        var pizza3 = pizzaOven.crust[0]+" " + pizzaOven.cheese[1] + " " +  pizzaOven.Sausage[1];
        var pizza4 = randompizza;
        return pizza1+ "\n" +pizza2 + "\n"+pizza3+ "\n" +pizza4;
    }
    console.log(pizza());