function funct(){
    var input_string = document.getElementById("input_string").value;
    if (input_string === "Syed") {
        document.write("Hello " + input_string);
    }
    else{
        window.alert("You put the incorrect data");
    }
}