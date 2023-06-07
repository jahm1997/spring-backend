import style from "./Detalles.module.css"
import Option from "../Opciones/Option";
import { Link } from "react-router-dom";
import { useState } from "react";
import Modal from 'react-modal';

const DetallesContacto = ({props,muestra,handleTriggerClick}) => {
   


   return (
    <div className={style.abuelo}>
      <button className={style.boton}  onClick={handleTriggerClick}>
      <div className={`${style.container} ${muestra ? style.open : ''}`}>
        <div className={style.item1}  >
          <h4 >{props.nombres + ' ' + props.apellidos}</h4>
          <h4 >{'(+57) ' + props.telefono}</h4>
          <div className={style.option}>
            {muestra && <Option />}
          </div>
        </div>
        
      </div>
    </button>

    <div className={style.padre} >
          <button className={style.item2} >editar</button>
          <button className={style.item3} >añadir tarea</button>
          <button className={style.item4} >borrar</button>
    </div>
    </div>
  );
}

 export default DetallesContacto