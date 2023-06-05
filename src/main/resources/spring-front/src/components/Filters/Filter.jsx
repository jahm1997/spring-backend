import React from "react"
import style from "./Filter.module.css";

import { useDispatch,useSelector } from "react-redux";

import { filterCards, orderCards } from "../redux/actions"

function Filter() {

  const dispatch = useDispatch()

  const {contactos} = useSelector(state => state)
  const [valor,setValor] = React.useState("")
  // const [boton,setBoton] = React.useState(false)

  const handleOrder = (e) => {
    dispatch(orderCards(e.target.value))
  }

  const handleChange = (e) => {
    setValor(e.target.value)
  }

  const enviar = () =>{
    dispatch(filterCards(valor))
  }
  
  return (
          <div className="{}" >
            <div >
              <select className="{}" onChange={handleOrder}>
                <option value="ascendente">A to Z</option>
                <option value="descendente">Z to A</option>
              </select>
            </div>
            <div>
              <input className="{style.espaciado}" type="text" name="nombre" placeholder="Buscar" onChange= {handleChange} value={valor}/>
            </div>
            <div>
              <button className={style.espaciado} onClick={enviar} >Buscar</button>
            </div>
        </div>)
        // && contactos.filter(e=>e.toLowerCase().includes(e.target.value.toLowerCase()))
}

export default Filter