import { useState } from "react";
import style from "./Option.module.css";
import { useLocation, Link } from "react-router-dom";

const Option = ({contacto}) => {
  
  const location = useLocation()
  

  return (
        <div className={style.menu} >      
        <div className="{style.homePage}" >
            <Link to="/editar">
              {/* <img src={homePage} alt={homePage} /> */}
              <>Llamada telefonica</>
              <>Icon</>
            </Link>
        </div>
        
        <div className="{style.homePage}" >
            <Link to="">
              <>Mensaje de texto</>
              <>Icon</>
            </Link>
        </div>
        
        <div className="{style.crearDog}" >
            <Link to="">
              <>Llamada por whatsapp</>
              <>Icon</>
            </Link>
            {/* <Link to="/dogs/add">Create Dog</Link> */}
        </div>
        
        <div className="{style.crearDog}" >
            <Link to="">
              <>Mensaje por whatsapp</>
              <>Icon</>
            </Link>
            {/* <Link to="/dogs/add">Create Dog</Link> */}
        </div>
      </div>
  );
};

export default Option;
