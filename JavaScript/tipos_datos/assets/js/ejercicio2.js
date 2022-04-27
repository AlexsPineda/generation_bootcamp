const Alex = {
    nombreCompleto: {
        nombre: "Alex",
        apellido: "Peña"
    },
    edad: 33,
    pasatiempos: ["nadar","correr","jugar"]
}
const santiago = {
    nombreCompleto: {
        nombre:"carlos",
    apellido:"cruz",
    },
    edad: 29,
    pasatiempos: ["futbol", "estudiar", "anime"],    
    }

const victor = {
        nombreCompleto: {
          nombre: "Víctor Manuel",
          apellido: "Soto Alexander",
        },
        edad: 26,
        pasatiempos: ["anime", "leer", "tomar"],
      }
const Jonathan = {
        nombreCompleto: {
            nombre: "Yair",
            apellido: "Uriostegui"
        },
        edad: 23,
        pasatiempos: ["nadar","dibujar","anime"]
    }
    


      const cohorte12 = [Alex, santiago, victor, Jonathan];
      console.log(cohorte12);

      for(let i=0; i<cohorte12.length; i++){
          console.log(cohorte12[i].nombreCompleto.nombre);
      }