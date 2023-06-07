import { ERROR } from "./actions";
import {
  CONTACTOS,
  CONTACTO,
  USUARIO,
  USUARIOS,
  FILTER,
  ORDEN,
} from "./actions-types";

const inicialState = {
  contactos: [],
  contacto: [],
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
    case CONTACTO:
      return {
        ...state,
        contacto: action.payload,
      };
    case FILTER:
      if (action.payload !== "") {
        var filter = state.contactos.filter(
          (element) =>
            element["nombres"]?.toLowerCase().includes(action.payload) ||
            element["apellidos"]?.toLowerCase().includes(action.payload)
        );
        return {
          ...state,
          contactos: filter,
        };
      }
    case ORDEN:
      switch (action.payload) {
        case "ascendente":
          const temp = state.contactos.sort(
            (a, b) =>
              a.nombres.localeCompare(b.nombres) ||
              a.apellidos.localeCompare(b.apellidos)
          );
          return {
            ...state,
            contactos: temp,
          };
        case "descendente":
          const temp2 = state.contactos.sort(
            (a, b) =>
              b.nombres.localeCompare(a.nombres) ||
              b.apellidos.localeCompare(a.apellidos)
          );
          return {
            ...state,
            contactos: temp2,
          };
      }

    default:
      return { ...state };
  }
};

export default reducer;
