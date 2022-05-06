const busquedaInf = window.location.href.split("=").pop();

const urlBusqueda = `https://api.jikan.moe/v4/anime?q=${busquedaInf}&order_by=popularity`
const busquedaAnimes = document.getElementById("busquedaAnimes")

fetch(urlBusqueda).then(resp => resp.json()).then(datos=>{
    console.log(datos.data);

    const resultadoBusqueda = datos.data

    resultadoBusqueda.forEach((resultado)=>{
        console.log(resultado)

        const datosNecesarios = {
            nombre: resultado.title,
            imagen: resultado.images.jpg.image_url
        }
        const template = `<div class="col mb-4">
         <div class="card">
          <img src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">${datosNecesarios.nombre}</h5>
            
          </div>
        </div>
      </div>`
        /* console.log(datosNecesarios); */
        busquedaAnimes.innerHTML += template
    })
})



