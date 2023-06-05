import style from "./Detalles.module.css"
import { Link } from "react-router-dom";

const detallesContacto = (props) => {
   return (
      <div className="{style.container}">
         <Link to={`/`} >
         <h4>{props.nombres + " " + props.apellidos}</h4>
         </Link>
         
         <h4>{props.telefono}</h4>
         
         <Link to={`/`} >
         <h4>{props.nombres + " " + props.apellidos}</h4>
         </Link>
         <Link to={`/`} >
         <h4>{props.nombres + " " + props.apellidos}</h4>
         </Link>
         <Link to={`/`} >
         <h4>{props.nombres + " " + props.apellidos}</h4>
         </Link>
      </div>
    );
}

 export default detallesContacto