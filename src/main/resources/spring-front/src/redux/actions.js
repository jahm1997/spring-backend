import axios from "axios";
import { CONTACTOS, USUARIO, USUARIOS, FILTER, ORDEN } from "./actions-types";

export const ERROR = "error";

const endpoint = "http://localhost:8080";

export const obtenerUsuarios = () => async (dispatch) => {
  try {
    const response = await axios.get(`${endpoint}/usuarios`);
    return dispatch({ type: USUARIOS, payload: response.data });
  } catch (error) {
    return dispatch({ type: ERROR, payload: error });
  }
};

export const atraparUsuario = (usuario) => async (dispatch) => {
  try {
    const response = await axios.get(
      `${endpoint}/usuarios/detalles/${usuario}`
    );
    return dispatch({ type: USUARIO, payload: response.data });
  } catch (error) {
    return dispatch({ type: ERROR, payload: error });
  }
};

export const filterCards = (valor) => async (dispatch) => {
  return dispatch({ type: FILTER, payload: valor });
};

export const orderCards = (string) => (dispatch) => {
  return dispatch({ type: ORDEN, payload: string });
};

export const atraparContactos = () => async (dispatch) => {
  try {
    const response = await axios.get(`${endpoint}/contactos`);
    return dispatch({ type: CONTACTOS, payload: response.data });
  } catch (error) {
    return dispatch({ type: ERROR, payload: error });
  }
};

export const registrarUsuario = async (objeto) => {
  return await axios.post(`${endpoint}/usuarios/cargue`, objeto);
};

export const registrarContacto = async (objeto) => {
  return await axios.post(`${endpoint}/contactos/cargue`, objeto);
};
