const url = "https://api.thecatapi.com/v1/images/search"
const imagen = document.getElementById('imagenMichi');
const btnMichi = document.querySelector('.btn-michi');
// console.log(btnMichi);


btnMichi.addEventListener('click',(e)=>{
    e.preventDefault;
    fetch(url).then(respuesta => respuesta.json()).then(datos =>{
        imagen.src = datos[0].url;
    });
});
