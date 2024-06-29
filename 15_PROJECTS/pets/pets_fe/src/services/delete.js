import axios from 'axios';
const API_URL = import.meta.env.VITE_API_URL;

export const deleteData = async (id) => {
  try {
    const token = localStorage.getItem('token');
    if (!token) {
      throw new Error('No token found');
    }
    const response = await axios.delete(`${API_URL}/pets/${id}`, {
      headers: {
        Authorization: `Bearer ${token}`,
      },
    });
    return response.data;
  } catch (error) {
    throw new Error(`Error deleting data ${error.message}`);
  }
};
