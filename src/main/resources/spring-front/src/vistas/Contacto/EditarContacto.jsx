import { useState } from "react";
import style from "./Contacto.module.css";
import { useLocation, Link } from "react-router-dom";

const Contacto = () => {
  const location = useLocation()

  const [nuevo, setNuevo] = useState({
    nombres: "",
    apellidos: "",
    email: "",
    telefono: "",
    fechaNacimiento: "",
    direccion: "",
    tipoContacto: "",

    origen: "",
    tareas: ""
  })

  const handleInputChange = (eve) => {
    setNuevo({
      ...nuevo,
      [eve.target.name]: eve.target.value
    })
  }

  const handleSubmit = (event) => {
    event.preventDefault()
    // if(dog.temperamentos.length < 2){
    //   setDog({
    //     ...dog,
    //     temperamentos:[]
    //   })
    //   return alert("Por favor ingresemos mas de 2 temperamentos")
    // }
    // else if(dog.temperamentos.length > 6){
    //   setDog({
    //     ...dog,
    //     temperamentos:[]
    //   })
    //   return alert("No puede tener mas de 6 temperamentos")
    // }
    console.log("simulamos que se agrega el nuevo contacto")
    // postdog(dog)
    // alert("haz creado una nueva raza! :D")
    // traslado(`/dogs/${myDogs[myDogs.length-1].id+1}`)
  
  }
  
  return (
    <div className={style.menu} >
      <form onSubmit={handleSubmit} >
          <label htmlFor="nombres"> Nombres </label>
          <input className={style.input} type="text" name="nombres" placeholder="ingrese sus nombres" value={nuevo.nombres} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="apellidos"> Apellidos </label>
          <input className={style.input} type="text" name="apellidos" placeholder="ingrese sus apellidos" value={nuevo.apellidos} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="email"> Apellidos </label>
          <input className={style.input} type="text" name="email" placeholder="ingrese su email" value={nuevo.email} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="telefono"> Telefono</label>
          <input className={style.inputHWeightUno} type="text" name="weightUno" placeholder="min" value={nuevo.telefono} onChange={handleInputChange} />

          <label htmlFor="fechaNacimiento"> Fecha de Nacimiento</label>
          <input className={style.inputHWeightDos} type="date" name="fechaNacimiento" placeholder="fechaNacimiento" value={nuevo.fechaNacimiento} onChange={handleInputChange} />

          <label htmlFor="tipoContacto"> Tipo de Contacto </label>
          <select name="" id="">
            <option value="email">email</option>
            <option value="telefono">telefono</option>
          </select>

          <label htmlFor="origen"> origen </label>
          <input className={style.inputHWeightDos} type="text" name="origen" placeholder="Escriba el origen" value={nuevo.origen} onChange={handleInputChange} />

      </form>
    </div>
  );
};

export default Contacto;
