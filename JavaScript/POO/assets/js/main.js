/* const { getMaxListeners } = require("process"); */

class Persona{
    //atributos
    #id = 0;
    static #contador = 0;
    #nombre = '';//variable privada
    #edad = 0;
    #correo = '';

    constructor(nombre, edad, correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++Persona.#contador;

    }
    //Set & get -----> fijar y obtener
    //se usan y se llamarn como si fuerarn atributos
    get getNombre(){
        return this.#nombre;
    }
    set setNombre(nombre){
        this.#nombre = nombre;
    }
    get getEdad(){
        return this.#edad;
    }
    set setEdad(edad){
        this.#edad = edad;
    }
    get getCorreo(){
        return this.#correo;
    }
    set setCorreo(correo){
        this.#correo = correo;
    }
    //METODOS
    cambiarNombre(nombre){
        this.#nombre = nombre;
    }

    #saludar(){
        let mensaje = `Hola mi nombre es ${this.#nombre}`
        return mensaje;
    }
    mostrarSaludo(){
        return this.#saludar();
    }

    static mostrarContador(){
        return Persona.#contador;
    }
}
//Instancia de la clase

const persona1 = new Persona('Alex', 33,'asas@adsd.com')
const persona2 = new Persona('Raul', 33,'asas@adsd.com')
const persona3 = new Persona('Jonathan', 33,'asas@adsd.com')

persona1.setNombre= 'Azyu'

persona1.cambiarNombre('Miguel')
console.log(persona1.getNombre)

console.log(persona1)
console.log(persona2)

console.log(persona1.mostrarSaludo());
console.log(persona2.mostrarSaludo());

console.log(Persona.mostrarContador());
/* console.log(persona1.saludar()); */


