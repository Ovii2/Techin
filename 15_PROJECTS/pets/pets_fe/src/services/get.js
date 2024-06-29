import axios from 'axios';

const API_URL = import.meta.env.VITE_API_URL;

export const getAllData = async () => {
  try {
    const token = localStorage.getItem('token');
    if (!token) {
      throw new Error('No token found');
    }
    const response = await axios.get(`${API_URL}/pets`, {
      headers: {
        Authorization: `Bearer ${token}`,
      },
    });
    return response.data;
  } catch (error) {
    if (error.response) {
      throw new Error(
        `Error fetching all data: ${error.response.status} - ${error.response.data.message}`
      );
    } else if (error.request) {
      throw new Error('Error fetching all data: No response from server');
    } else {
      throw new Error(`Error fetching all data: ${error.message}`);
    }
  }
};

// export const getAllData = async () => {
//   try {
//     const token = localStorage.getItem('token');
//     const resp = await axios.get(`${API_URL}/pets`, {
//       headers: {
//         Authorization: 'Bearer ' + token,
//       },
//     });
//     return resp.data;
//   } catch (error) {
//     throw new Error(`Error fetching all data: ${error.message}`);
//   }
// };

// export const getAllData = async () => {
//   try {
//     const resp = await axios.get(`${API_URL}/pets`);
//     return resp.data;
//   } catch (error) {
//     throw new Error(`Error fetching all data: ${error.message}`);
//   }
// };

export const getOne = async (id) => {
  try {
    const resp = await axios.get(`${API_URL}/${id}`);
    return resp.data;
  } catch (error) {
    console.error(`Error fetching data for ID ${id}: ${error.message}`);
  }
};
