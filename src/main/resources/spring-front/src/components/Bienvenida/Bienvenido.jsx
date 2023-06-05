import styled from "./Bienvenido.module.css"
import { Link, useNavigate } from "react-router-dom"
import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";

import { obtenerUsuarios } from "../redux/actions";

const Bienvenido = () => {

    const traslado = useNavigate();
    const dispatch = useDispatch();

    const {usuarios} = useSelector(state => state)
    const [seleccion,setSeleccion] = useState({
        usuario: "seleccionar"
    })

    const select = (e) =>{
        console.log("Cambió: " + e.target.value)
        // setSeleccion({
        //   ...seleccion,
        //   usuario:e.target.value
        // })
    }

    const handleClick = () => {
        console.log(seleccion)
        console.log("------------------------------------------------")
        console.log("Esto es usuarios = " + typeof usuarios)
        // dispatch(atraparUsuario(seleccion.usuario))
        // traslado(`/inicio`)
      };
    
    console.log(usuarios);
    useEffect(() => {
        dispatch(obtenerUsuarios())
      }, [dispatch])
    
return (
    <div className={styled.divImagen}> 
            {/* <div className={styled.divBoton} >
                <Link to={"/dogs"} >
                        <img  className={styled.img} src={Boton} alt="Boton Bienvenido" />
                </Link>
            </div> */}
            <label htmlFor="usuario"> Seleccionar Usuario para ingresar </label>
            <select  onChange={(e) =>  select(e)} >
                <option disabled >Seleccionar </option>
                {usuarios.map(e=>
                    <option  key={e.id} value={e.id} >{e.nombre}</option>
                    )}
            </select>
            <div>
                <button onClick={handleClick} className="{}" >Ingresar</button>
            </div>
    </div>
)
}

export default Bienvenido