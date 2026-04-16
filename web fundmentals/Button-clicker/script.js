
var input = document.querySelector(".btn");

input.addEventListener('click',function(paa){
    if(input.value == "Login"){
        input.value ="logout";
    }else{
        input.value ="Login";
    }
})

function removeText(element){
    element.remove();
}

function displayMesaege(){
    alert('niga was liked')
}