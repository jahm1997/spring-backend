import style from "./Informacion.module.css";
import { useLocation, Link } from "react-router-dom";

const Informacion = () => {
  const location = useLocation()
  
  return (
    <div className="{style.menu}" >
          <h1>Esta vista muestra los comentarios de tareas</h1>
          <Link to="/inicio" >Ir Atras</Link>
    </div>
  );
};

export default Informacion;
