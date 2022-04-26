
addEventListener('load', function(){
    this.alert('Se ha terminado de cargar la página');
});

function saludar(){
    alert('hola')
}

/* Manejador de eventos semanticos */
const $botonSemantico = document.getElementById('evento-semantico');
$botonSemantico.onclick = saludar;

$botonSemantico.onclick = function(evento){
    //alert('hola desde un manejador semantico');
    console.log(evento.target);
}

/* Manejador de eventos multiples */
const $botonMultiple = document.getElementById('evento-multiple');

$botonMultiple.addEventListener('click', saludarMultiple)

$botonMultiple.addEventListener('click', function(e){
    console.log(e.target);
})

function saludarMultiple(){
    alert('hola desde evento multiple')
}

