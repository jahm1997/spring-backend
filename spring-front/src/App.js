import "./App.css";
import React from "react";
// import Dog from "./components/Dog/Dog";
// import Form from "./components/Form/Form";
import Inicio from "./vistas/Home/Inicio";
import Bienvenido from "./vistas/Bienvenida/Bienvenido";
import { Route, Routes, useLocation } from "react-router-dom";
import Contacto from "./vistas/Contacto/Contacto";
import Editar from "./vistas/Contacto/EditarContacto";
import Tarea from "./vistas/Tareas/Tarea";
import Navbar from "./components/Navbar/Navbar";
import Informacion from "./components/Datos/Informacion";

function App() {
  const location = useLocation();
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Bienvenido />} />
        <Route path="/inicio" element={<Inicio />} />
        <Route path="/nuevo" element={<Contacto />} />
        <Route path="/editar" element={<Editar />} />
        <Route path="/tarea" element={<Tarea />} />
        <Route path="/informacion" element={<Informacion />} />
      </Routes>
    </div>
  );
}

export default App;
