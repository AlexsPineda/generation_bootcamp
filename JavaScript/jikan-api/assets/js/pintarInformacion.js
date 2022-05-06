const idInfo = window.location.href.split("=").pop()
const imagenPortada = document.getElementById('imagenPortada')
/* console.log(idInfo); */
const informacionAnime = document.getElementById('informacionAnime')
const urlID = `https://api.jikan.moe/v4/anime/${idInfo}`

fetch(urlID).then(resp => resp.json()).then(datos =>{
   /*  console.log(datos.data); */

   //Insertar imagen
    const datosNecesarios = {
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.large_image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title
    }
    const templateImg = `<img src="${datosNecesarios.imagen}" alt="" class="img-fluid">`
    imagenPortada.innerHTML += templateImg;

    //INSERTAR INFORMACION
    const templateInfo = `<h1>${datosNecesarios.nombre}</h1>
    <p>${datosNecesarios.sinopsis}</p>
    <div class="favorito">
      <button id="agregarFavoritos" type="button" class="btn btn-dark">Agregar a Favoritos</button>
    </div>`
    /* console.log(datosNecesarios); */
    
    informacionAnime.innerHTML += templateInfo

    const agregarFavoritos = document.getElementById("agregarFavoritos")

    agregarFavoritos.addEventListener("click",()=>{
        console.log("Agregado")

        const datos = {
            id: datosNecesarios.id,
            nombre:datosNecesarios.nombre,
            imagen: datosNecesarios.imagen
        }

        if(localStorage.getItem("favoritos")){
            console.log("ya hay elemnto")

            const favoritos = JSON.parse(localStorage.getItem("favoritos"))
            favoritos.push(datos)
            localStorage.setItem("favoritos",JSON.stringify(favoritos))
        }else{
            console.log("no existen favoritos")
            const favoritos = []
            favoritos.push(datos)
            localStorage.setItem("favoritos",JSON.stringify(favoritos))
        }

        /* JSON.parse(localStorage.getItem("favoritos")); */


        
        /* console.log(datos)*/
    })
})