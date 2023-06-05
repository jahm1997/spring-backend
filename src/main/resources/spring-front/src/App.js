import "./App.css";
import React from "react";
// import Dog from "./components/Dog/Dog";
// import Form from "./components/Form/Form";
import Inicio from "./components/Home/Inicio";
import Bienvenido from "./components/Bienvenida/Bienvenido";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Bienvenido />} />
        <Route path="/inicio" element={<Inicio />} />
        {/* <Route path="/dogs/:id" element={<Dog />} />
        <Route path="/dogs/add" element={<Form />} /> */}
      </Routes>
    </div>
  );
}

export default App;
