/* ESTE ES UN NODO DE COMENTARIO */

const $parr = document.querySelector('p');
const $titulo = document.querySelector('h1');
const $card = document.querySelector('.card');

console.log($parr.nodeName);
//para mostrar el contenido de un elemento o reasignar
$parr.textContent += "Hola mundo";
console.log($parr.textContent);

$titulo.textContent = 'Modificando elemntos con JS'

//innerHTML

console.log($parr.innerHTML);

$parr.innerHTML = '<a href="">Este es un elace</a>'


//outerHTML

/* $parr.outerHTML = '<a href="">Este es un elace</a>' */

//CREAR ELEMENTOS HTML
function crearElemento(){
    const img = document.createElement('img');
    img.src = "https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU"

    //appendChild
    $card.appendChild(img);

}

crearElemento();
