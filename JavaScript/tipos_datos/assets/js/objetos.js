const nombre = "Alex";
const nombre2 = new String("Alerx");

const persona = new Object();//ya no se ocupa
persona.nombre = "Alex";
persona.edad = "23";

console.log(persona);

const  nuevaPersona = {
    /* atributos y propiedades */
    nombreCompleto: {
        nombre: "Alex",
        apellido: "Peña",
    },
    edad : 33,
    pastiempo: ["correr", "nadar"],
    /* metodo */
    saludar: function(){
        console.log("Hola")
    }
}


"Hola".length//atributo o propiedad
"Hola".toLocaleLowerCase()//metodo

console.log(nuevaPersona.nombreCompleto.nombre);

nuevaPersona.saludar();
/* Para cambiar el valor */
nuevaPersona.edad = 10
console.log(nuevaPersona);

/* Agregar nuevo atributo */
nuevaPersona.colorFavorito = "Rojo"
console.log(nuevaPersona.colorFavorito);

nuevaPersona.hasOwnProperty("edad");
console.log(Object.keys(nuevaPersona));
console.log(Object.values(nuevaPersona));

const Alex = {
    nombreCompleto: {
        nombre: "Alex",
        apellido: "Peña"
    },
    edad: 33,
    pasatiempos: ["nadar","correr","jugar"]
}

