/* let anhos = parseInt(prompt("¿En qué año naciste?"));
const anioActual = 2022;
console.log(anhos);

console.log(`Tienes ${anhos-anioActual} años`)
 */

//Nivel 2
//Opción 1

/* const anioActual = 2022;

function calcularEdad(){
    const anioNacimento = parseInt(document.getElementById("anio").value);
    console.log(anioNacimento);
    console.log(`Tienes ${anioActual-anioActual} años`)
} */

//Opción 2
/* const boton = document.getElementById("calcular")
console.log(boton);

boton.addEventListener("click", () =>{
    const anioNacimento = parseInt(document.getElementById("anio").value);
    console.log(anioNacimento);
    console.log(`Tienes ${anioActual-anioNacimiento} años`)   
}) */

//Nivel 3

const fecha = new Date()

const anioActual = fecha.getFullYear()

const mesActual = fecha.getMonth() +1

const diaActual = fecha.getDate()

/* const anioActual = 2022;
const mesActual = 4;
const diaActual= 27; */

function mostrarDatos(){
    const nacimiento = document.getElementById("anio").value;
    console.log(nacimiento);
    const nacimientoDividido = nacimiento.split("-");//lo divide cada vez que encuentra el -
    console.log(nacimientoDividido);
    const anioNacimento = nacimientoDividido[0];
    const mesNacimiento = nacimientoDividido[1];
    const diaNacimiento = nacimientoDividido[2];
    console.log(anioNacimento,mesNacimiento,diaNacimiento);

    if(mesNacimiento <= mesActual && diaNacimiento <= diaActual){
        console.log(`Tienes ${anioActual-anioNacimento} años`)
    }else{
        console.log(`Tienes ${anioActual-anioNacimento - 1} años`)
    }

}
