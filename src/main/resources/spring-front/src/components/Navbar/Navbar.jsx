import style from "./Navbar.module.css";
import { useLocation, Link } from "react-router-dom";

const Navbar = () => {
  const location = useLocation()
  
  return (
    <div className={style.menu} >
                    
          <div className="{style.homePage}" >
              <Link href="/inicio">
                {/* <img src={homePage} alt={homePage} /> */}
                Contactos
              </Link>
          </div>
          
          <div className="{style.homePage}" >
              <Link href="/inicio">
                Tareas
              </Link>
          </div>

          <div className="{style.crearDog}" >
              <Link href="/inicio">
                comentarios
              </Link>
              {/* <Link to="/dogs/add">Create Dog</Link> */}
          </div>
    </div>
  );
};

export default Navbar;
