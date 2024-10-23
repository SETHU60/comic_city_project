import axios from 'axios';

const API_URL = 'http://localhost:8080/comiccity/CustomerOrder'; // Adjust your API URL as necessary

export const createOrder = (orderData) => {
    return axios.post(`${API_URL}/create`, orderData)
        .then(response => {
            return response.data; // Return the response data if needed
        })
        .catch(error => {
            console.error('Error creating order:', error);
            throw error; // Re-throw the error to handle it in the calling function
        });
};