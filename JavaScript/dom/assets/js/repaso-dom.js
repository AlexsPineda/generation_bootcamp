//Se llama al id o clase del html
const $padre = document.querySelector('.padre')

//Crear un elemento
//La forma más correcta
const $parr = document.createElement('p');
$parr.textContent += 'Lorem ipsum'
$parr.textContent += 'Lorem ipsum'

$padre.appendChild($parr)

//Agregar elementos con innerHTML

const $cuadro = document.querySelector('.cuadro');
$cuadro.innerHTML = '';

$cuadro.innerHTML = `<a href="#">Este es un enlace</a>
<ol>
  <li>Elemento 1 </li>
  <li>Elemento 2 </li>
  <li>Elemento 3 </li>
</ol>  
`;



///////////////////////////
const continentes = ['Africa', 'Europa', 'America', 'Asia', 'Oceania'];

const $ol = document.createElement('ol');
$cuadro.appendChild($ol);

continentes.forEach(continentes => {$ol.innerHTML += `<li>${continentes}</li>`})