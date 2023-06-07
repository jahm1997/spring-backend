import style from "./Inicio.module.css"
import React from "react";
import Filter from "../../components/Filters/Filter";
import Navbar from "../../components/Navbar/Navbar";
import DetallesContacto from "../../components/Informacion/Detalles";
import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import { filterCards, orderCards, atraparContactos, editarContacto, atraparContacto,  } from "../../redux/actions"
import Input from "../../components/inputs/Input";

function Home() {

  const traslado = useNavigate();
  const dispatch = useDispatch();

  const { contactos, usuario } = useSelector(state => state)
  const [valor,setValor] = React.useState("")
  // const [boton,setBoton] = React.useState(false)

  const handleOrder = (e) => {
    dispatch(orderCards(e.target.value))
  }

  const handleChange = (e) => {
    setValor(e.target.value)
  }

  const buscar = (valor) =>{
    dispatch(filterCards(valor))
  }

  const noBuscar = (valor) =>{
    dispatch(atraparContactos(valor))
  }

  const handleClick = () => {
    traslado(`/nuevo`)
  };

  const [muestra, setMuestra] = React.useState(null);

  const handleTriggerClick = (contactoId) => {
    setMuestra((prevMuestra) => (prevMuestra === contactoId ? null : contactoId));
  };

  const edicion = (parametro) => {
    console.log("linea 47 " + parametro)
    dispatch(atraparContacto(parametro))
    traslado(`/editar`)
  }

  const filtrarContactos = (valor) => {
    if (valor.trim() === "") {
      dispatch(atraparContactos(usuario));
    } else {
      dispatch(filterCards(valor));
    }
  };
  
  React.useEffect(() => {
    filtrarContactos(valor);
  }, [valor, dispatch, usuario]);

  return (
    <div className={style.contenedor} >
       <Input placeholder="Buscar" buscar={buscar} noBuscar={noBuscar} filtrar={filtrarContactos} chilrenOne="Buscar" chilrenTwo="Limpiar"></Input>
    
      <h2>Lista de contactos</h2>
      <div className={style.mapeo} >
        {contactos.map((contacto) => <DetallesContacto key={contacto.id} props={contacto} muestra={muestra === contacto.id} handleTriggerClick={() => handleTriggerClick(contacto.id)} edicion={edicion} />)}

        <div className={style.boton} >
          <button onClick={handleClick} className="{}" >Agregar</button>
        </div>
      </div>

      <Navbar/>
    </div>
  )
}

export default Home