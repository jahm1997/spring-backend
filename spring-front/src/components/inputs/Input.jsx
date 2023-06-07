// Input.jsx
import style from "./Input.module.css";
import React, { useState } from "react";

const Input = ({ childrenOne, placeholder, buscar, noBuscar, childrenTwo}) => {
  const [valor, setValor] = useState("");

  const handleChange = (e) => {
    setValor(e.target.value);
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
      <button onClick={handleBuscarClick}>{childrenOne}</button>
      <button onClick={handleBuscarClickTwo}>{childrenTwo}</button>
    </div>
  );
};

export default Input;
