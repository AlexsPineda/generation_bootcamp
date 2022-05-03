/* let tiempo = 5000;
let datos
setTimeout(()=>{
    datos ="Alex";
    console.log(datos);
},tiempo)

console.log(datos) */

const datos = [
    {
        nombre: "Alex",
        edad: 33,

    },
    {
        nombre: "Azyu",
        edad: 32,

    },
    {
        nombre: "David",
        edad: 30,

    },
]

function obtenerDatos(){
    return new Promise((resolve,reject) =>{
    setTimeout(()=>{
        resolve(datos)
    },3000)
})
}

obtenerDatos().then((datos) =>{
    console.log(datos);
})

async function obtenerDatosAsync(){
    const datosObtenidos = await obtenerDatos()
    console.log(datosObtenidos);
}
 
obtenerDatosAsync();
