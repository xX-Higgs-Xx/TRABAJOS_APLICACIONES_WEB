


 let formulario = () => {
    let nombre = prompt("Ingrese su nombre");    
    let telefono = prompt("Ingrese su telefono");
    let correo = prompt("Ingrese su correo");

    document.getElementById("nombre").innerHTML = "Nombre completo: " + nombre;
    document.getElementById("telefono").innerHTML = "Télefono: " + telefono;
    document.getElementById("correo").innerHTML = "Correo: " + correo;
}
