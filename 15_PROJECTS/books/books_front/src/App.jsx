import { useState } from 'react';
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Header from './Components/Header/Header';
import Footer from './Components/Footer/Footer';
import UserContext from './Context/UserContext/UserContext';
import { CategoriesProvider } from './Context/CategoriesContext/CategoriesContext';
import { BooksProvider } from './Context/BooksContext/BooksContext';
import { CommentsProvider } from './Context/CommentsContext/CommentContext';
import { Routes, Route, Navigate } from 'react-router-dom';
import LoginPage from './pages/LoginPage/LoginPage';
import RegisterPage from './pages/RegisterPage/RegisterPage';
import CategoriesPage from './pages/CategoriesPage/CategoriesPage';
import NotFoundPage from './pages/NotFoundPage/NotFoundPage';
import BooksPage from './pages/BooksPage/BooksPage';
import ProtectedRoute from './Components/ProtectedRoute/ProtectedRoute';
import BookDetailsPage from './pages/BookDetailsPage/BookDetailsPage';

function App() {
  const [user, setUser] = useState({});
  const [update, setUpdate] = useState(0);

  return (
    <>
      <ToastContainer autoClose={800} position='top-center' />
      <Header />
      <CommentsProvider>
        <BooksProvider>
          <CategoriesProvider>
            <UserContext.Provider value={{ user, setUpdate }}>
              <Routes>
                <Route path='/' element={<Navigate to='/register' />} />
                <Route path='/register' element={<RegisterPage />} />
                <Route path='/login' element={<LoginPage />} />
                <Route
                  path='/categories'
                  element={
                    <ProtectedRoute adminOnly={true}>
                      <CategoriesPage />
                    </ProtectedRoute>
                  }
                />
                <Route
                  path='/books'
                  element={
                    <ProtectedRoute>
                      <BooksPage />
                    </ProtectedRoute>
                  }
                />
                <Route
                  path='/books/:id'
                  element={
                    <ProtectedRoute>
                      <BookDetailsPage />
                    </ProtectedRoute>
                  }
                />
                <Route path='*' element={<NotFoundPage />} />
              </Routes>
            </UserContext.Provider>
          </CategoriesProvider>
        </BooksProvider>
      </CommentsProvider>
      <Footer />
    </>
  );
}

export default App;
