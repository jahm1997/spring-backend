// Input.jsx
import style from "./Input.module.css";
import React, { useState } from "react";

const Input = ({ childrenOne, placeholder, buscar, noBuscar, filtrar, childrenTwo }) => {
  const [valor, setValor] = useState("");

  const handleChange = (e) => {
    const inputValor = e.target.value;
    setValor(inputValor);
    filtrar(inputValor);
  };

  const handleBuscarClick = () => {
    // console.log(valor)
    buscar(valor);
  };

  const handleBuscarClickTwo = () => {
    // console.log(valor)
    noBuscar(valor);
  };

  return (
    <div className={style.contenedor}>
      <input
        className={style.input}
        placeholder={placeholder}
        type="text"
        value={valor}
        onChange={handleChange}
      />
      <div>imagenBuscar</div>
    </div>
  );
};

export default Input;
