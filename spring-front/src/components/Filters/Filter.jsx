// Filter.jsx
import React from "react";
import style from "./Filter.module.css";

function Filter({ children, buscar }) {
  return (
    <button className={style.filtro} onClick={buscar}>
      {children + "Pendejo"}
    </button>
  );
}

export default Filter;
