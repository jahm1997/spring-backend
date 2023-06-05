import styled from "./Inicio.module.css"

import React from "react";

import Filter from "../Filters/Filter";
import Navbar from "../Navbar/Navbar";
import DetallesContacto from "../Informacion/Detalles";

import { useDispatch, useSelector } from "react-redux"
import { useNavigate } from "react-router-dom"
import {  } from "../redux/actions"

function Home() {

  const traslado = useNavigate();

  const {contactos} = useSelector(state => state )

  const handleClick = () => {
    traslado(`/inicio`)
  };
  
  return (
    <div>
        <Filter/>

        <h2>Lista de contactos</h2>

        {contactos.map((contacto) => <DetallesContacto contactos={contactos} />)}

        <button onClick={handleClick} className="{}" >Agregar</button>
        
        <Navbar/>
    </div>
  )
}

export default Home