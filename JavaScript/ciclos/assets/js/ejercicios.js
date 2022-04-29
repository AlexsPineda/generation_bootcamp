//imprimir
/* 

*
**
***
****
*****

*/
/* for (let i = 1; i<=5; i++) {
    for(let j= 1; j<=i; j++){
        document.write('*');
    }   
    document.write('<br>');
} */
//imprime disminuyendo -0.5
/* let numeroPositivo = 10
do {
    console.log(numeroPositivo);
    numeroPositivo=numeroPositivo-0.5;
} while (numeroPositivo>0); */

//imprime impar
/* for (let i = 0; i <= 100; i++) {
    if(i%2!=0) {
        console.log('El numero ' + i + ' es impar');
    }
}
 */
/* let n=6
let contador=1;
while (contador<=n){
    document.write("["+contador+"]");
    contador++;
} */

let n=15;
let suma=0;

for(let i=1; i<=n; i++){
    suma=suma+i;
}
console.log(suma)
