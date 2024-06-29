import axios from 'axios';
const API_URL = import.meta.env.VITE_API_URL;

export const postRegister = async (data) => {
  try {
    let response = await axios.post(`${API_URL}/register`, data);
    return response.data;
  } catch (error) {
    throw new Error(`Failed to save data ${error.message}`);
  }
};
