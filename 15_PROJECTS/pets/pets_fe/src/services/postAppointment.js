import axios from 'axios';
const API_URL = import.meta.env.VITE_API_URL;

export const postAppointment = async (data) => {
  try {
    const token = localStorage.getItem('token');
    const response = await axios.post(`${API_URL}/pets`, data, {
      headers: {
        Authorization: `Bearer ${token}`,
      },
    });
    return response.data;
  } catch (error) {
    throw new Error(`Failed to save appointment ${error.message}`);
  }
};
