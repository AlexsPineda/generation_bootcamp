const url = "https://dog.ceo/api/breeds/image/random"
const imagen = document.getElementById("imagenPerrito")
const imagen2 = document.getElementById("imagenPerrito2")

fetch(url).then(respuesta => respuesta.json()).then(datos => {
    console.log(datos.message);
    imagen.src = datos.message;
    imagen2.src = datos.message;

})
