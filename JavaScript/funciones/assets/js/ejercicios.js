/* const invertirP = (palabra = "") => {

    if(palabra.length <=1)return console.warn('No ingresaste texto');//alerta amarilla por no ingresar texto
    if(typeof(palabra !== 'string')) return console.error('El valor ingresado no es una palabra');//no ingreso texto

    let separarC = palabra.split("");
    let invertirArreglo = separarC.reverse()
    let unirArreglo = invertirArreglo.join("")
    return unirArreglo;
}
console.log(invertirP("12"));
 */
function voltearPalabra(a = "") {


    if (a <= 1) { return console.warn("No ingresaste texto");
        
    }
    if (typeof(a) !== "string") { return console.warn("No es un texto");
        
    }
    
    let palabraVolteada = a.split('').reverse('').join('');
    /* console.log(palabraVolteada); */

    if (a === palabraVolteada) {
        console.log(`Si en un palindromo ${a}`);

        
    }
    else 
    console.log("No es un palindromo");

}

voltearPalabra("sala")

function repetirTexto(palabra, veces){
    for(let i = 0; i<veces; i++)
    console.log(palabra);
}

repetirTexto("hola mundo",3)

function txtSustraer(cadena,numeroLetras){
    return cadena.substring(0, numeroLetras);
}
console.log(txtSustraer('Hola Mundo',5));

function factorial (n) {
	var total = 1; 
	for (i=1; i<=n; i++) {
		total = total * i; 
	}
	return total; 
}
console.log(factorial(4))




