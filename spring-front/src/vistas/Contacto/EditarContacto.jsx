import { useEffect, useState } from "react";
import style from "./Contacto.module.css";
import { useLocation, Link, useNavigate } from "react-router-dom";
import { useSelector } from "react-redux";
import { editarContacto } from "../../redux/actions";

const Contacto = () => {
  const location = useLocation()
  const traslado = useNavigate()

  const {contacto} = useSelector(state => state)
  const [nuevo, setNuevo] = useState({
    id: "",
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
    editarContacto(nuevo)
    alert("se ha actualizado el contacto! :D")
    traslado("/inicio")
  
  }

  useEffect(() => {
    setNuevo(contacto)
  }, [contacto])
  
  return (
    <div className={style.menu} >
      <div className={style.contenido} >
      <form onSubmit={handleSubmit} >
          <label htmlFor="nombres"> Nombres </label>
          <input className={style.input} type="text" name="nombres" placeholder="ingrese sus nombres" value={nuevo.nombres} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="apellidos"> Apellidos </label>
          <input className={style.input} type="text" name="apellidos" placeholder="ingrese sus apellidos" value={nuevo.apellidos} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="email"> Email </label>
          <input className={style.input} type="text" name="email" placeholder="ingrese su email" value={nuevo.email} onChange={handleInputChange} />
          {/* {errors.name && <p className={style.error}> {errors.name}</p>} */}

          <label htmlFor="telefono"> Telefono</label>
          <input className={style.input} type="text" name="telefono" placeholder="telefono" value={nuevo.telefono} onChange={handleInputChange} />

          <label htmlFor="fechaNacimiento"> Fecha de Nacimiento</label>
          <input className={style.input} type="date" name="fechaNacimiento" placeholder="fechaNacimiento" value={nuevo.fechaNacimiento} onChange={handleInputChange} />

          <label htmlFor="tipoContacto"> Tipo de Contacto </label>
          <select name="" id="">
            <option value="email">email</option>
            <option value="telefono">telefono</option>
          </select>

          <label htmlFor="origen"> origen </label>
          <input className={style.inputHWeightDos} type="text" name="origen" placeholder="Escriba el origen" value={nuevo.origen} onChange={handleInputChange} />

          <button> Actualizar </button>
      </form>
      </div>
      <Link to="/inicio" >Ir Atras</Link>
    </div>
  );
};

export default Contacto;
