import { useState, useEffect } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Header from './Components/Header/Header';
import RegisterPage from './pages/RegisterPage/RegisterPage';
import { Routes, Route, Navigate } from 'react-router-dom';
import LoginPage from './pages/LoginPage/LoginPage';
import UserContext from './Context/UserContext/UserContext';
import PetsPage from './pages/PetsPage/PetsPage';
import ProtectedRoute from './Components/ProtectedRoute/ProtectedRoute';
import PageNotFound from './pages/PageNotFound/PageNotFound';
import Footer from './Components/Footer/Footer';
import PetsContext from './Context/PetsContext/PetsContext';

function App() {
  const [user, setUser] = useState({});
  const [pets, setPets] = useState([]);
  const [update, setUpdate] = useState(0);

  return (
    <>
      <ToastContainer autoClose={800} position='top-center' />
      <Header />
      <PetsContext.Provider value={{ pets, setPets, setUpdate, update }}>
        <UserContext.Provider value={{ user, setUpdate }}>
          <Routes>
            <Route path='/' element={<Navigate to='/register' />} />
            <Route path='/register' element={<RegisterPage />} />
            <Route path='/login' element={<LoginPage />} />
            <Route
              path='/pets'
              element={
                <ProtectedRoute>
                  <PetsPage />
                </ProtectedRoute>
              }
            />
            <Route path='*' element={<PageNotFound />} />
          </Routes>
          <Footer />
        </UserContext.Provider>
      </PetsContext.Provider>
    </>
  );
}

export default App;
