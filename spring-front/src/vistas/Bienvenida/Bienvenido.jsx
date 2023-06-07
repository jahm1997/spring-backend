import styled from "./Bienvenido.module.css"
import { Link, useNavigate } from "react-router-dom"
import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";

import { obtenerUsuarios, atraparUsuario, atraparContactos } from "../../redux/actions";

const Bienvenido = () => {

    const traslado = useNavigate();
    const dispatch = useDispatch();

    const {usuarios} = useSelector(state => state)
    const [seleccion,setSeleccion] = useState({
        login: "seleccionar"
    })

    const select = (e) =>{
        setSeleccion({
          ...seleccion,
          login:e.target.value
        })
    }

    const handleClick = () => {
        if(seleccion.login !== "seleccionar"){
            dispatch(atraparUsuario(seleccion.login))
            traslado(`/inicio`)
        }
      };
    
    useEffect(() => {
        dispatch(obtenerUsuarios())
      }, [dispatch])
    
return (
    <div className={styled.general}> 
            {/* <div className={styled.divBoton} >
                <Link to={"/dogs"} >
                        <img  className={styled.img} src={Boton} alt="Boton Bienvenido" />
                </Link>
            </div> */}
            <label htmlFor="usuario"> Seleccionar Usuario para ingresar </label>
            <select  onChange={(e) =>  select(e)} >
                <option disabled >Seleccionar </option>
                {usuarios.map(e=>
                    <option  key={e.id} value={e.id} >{e.nombres}</option>
                    )}
            </select>
            <div>
                <button onClick={handleClick} className="{}" >Ingresar</button>
            </div>
    </div>
)
}

export default Bienvenido