let num = 1;
let siguiente = () => {
    num++;
    if(num > 5){
        num = 1;
    }
    let imagen = document.getElementById("imagen");
    imagen.src = "img/" + num + ".jpg";
}
let anterior = () => {
    num--;
    if(num < 1){
        num = 5;
    }
    let imagen = document.getElementById("imagen");
    imagen.src = "img/" + num + ".jpg";
}