/* Algunas cosa coN DOM */
console.log(window.document);
console.log(document);//es lo mismo que el anterior
console.log(document.head);//regresa el head del documento
console.log(document.documentElement);/* Trae todo el html */
console.log(document.charset);
console.log(document.links);
console.log(document.images);
console.log(document.styleSheets);//regresa los css
console.log(document.scripts);

setTimeout(() => {
    console.log(document.getSelection().toString());    
}, 3000);

document.write('hola mundo desde un write')//solo se usa en desarrollo
