import { useContext } from 'react';
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
  const { isLoggedIn } = useContext(UserContext);

  return (
    <>
      <ToastContainer autoClose={1200} position='top-center' />
      <Header />
      <CommentsProvider>
        <BooksProvider>
          <CategoriesProvider>
            <Routes>
              <Route path='/' element={<Navigate to='/login' />} />
              {!isLoggedIn ? (
                <>
                  <Route path='/register' element={<RegisterPage />} />
                  <Route path='/login' element={<LoginPage />} />
                </>
              ) : (
                <>
                  <Route path='/register' element={<Navigate to='/books' />} />
                  <Route path='/login' element={<Navigate to='/books' />} />
                </>
              )}
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
          </CategoriesProvider>
        </BooksProvider>
      </CommentsProvider>
      <Footer />
    </>
  );
}

export default App;
