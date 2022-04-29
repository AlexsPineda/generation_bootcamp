/* funciones, nos permiten reutilizar código */

function saludar(nombre = "azyu", apellido = "" ){
    /* console.log('Hola mi nombre es:', nombre, apellido) */
    
    //console.log(`Hola mi nombre es: ${nombre?"Alex":"Desconocido"}`);//template Strings
    return `Mi nombre es ${nombre} ${apellido}`
}

saludar("Alex", "Peña" );

let funcionSaludar = saludar('Alex', 'Peña');
//console.log(funcionSaludar);

//console.log(`<h1>Este es un h1</h1>`)//plantilla literal

/* Funcion declarada */
//console.log(suma(10,20));
function suma(a,b){
    return a + b;
}

/* Funciones expresadas || expresion */
const resta = function(a,b){
    return a - b;
}
//console.log(resta(20, 10));

/* Funcion flecha */
const multiplicacion = (a,b) => {
    return a * b;
}

//console.log(multiplicacion(5, 10));

//tambien se puede de esta forma
const division = (a,b)=> a/b;
//console.log(division(9, 3));

const invertirP = (palabra) => {
    let separarC = palabra.split("");
    let invertirArreglo = separarC.reverse()
    let unirArreglo = invertirArreglo.join("")
    return unirArreglo;
}
console.log(invertirP("Hola mundo"));