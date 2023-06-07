import style from "./Tarea.module.css";
import { useLocation, Link } from "react-router-dom";

const Tarea = () => {
  const location = useLocation()
  
  return (
    <div className="{style.menu}" >
          <h1>Este es vista tarea</h1>
          <Link to="/inicio" >Ir Atras</Link>
    </div>
  );
};

export default Tarea;
