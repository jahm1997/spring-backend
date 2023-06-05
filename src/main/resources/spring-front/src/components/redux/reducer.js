import { ERROR } from "./actions";
import { CONTACTOS, USUARIO, USUARIOS } from "./actions-types";

const inicialState = {
  contactos: [],
  usuarios: [],
  usuario: [],
};

const reducer = (state = inicialState, action) => {
  // por parametro en action recibimos un destructurin de {type, payload}
  // pero en esta ocacion usaremos las props y luego lo llamamos como propiedad

  switch (action.type) {
    case USUARIOS:
      console.log(action.payload);
      return {
        ...state,
        usuarios: action.payload,
      };
    case USUARIO:
      return {
        ...state,
        usuario: action.payload,
      };
    case CONTACTOS:
      return {
        ...state,
        contactos: action.payload,
      };
    default:
      return { ...state };
  }
};

export default reducer;
