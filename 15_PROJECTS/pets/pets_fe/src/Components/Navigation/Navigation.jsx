import { NavLink } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';
import { toast } from 'react-toastify';

import './Navigation.css';

const Navigation = () => {
  const navigate = useNavigate();
  const isLoggedIn = !!localStorage.getItem('token');

  const logoutHandler = () => {
    localStorage.removeItem('token');
    localStorage.removeItem('user');
    localStorage.removeItem('role');
    toast.success('Logged out!');
    navigate('/login', { replace: true });
  };

  return (
    <nav>
      {!isLoggedIn && (
        <>
          <NavLink
            className={({ isActive }) => (isActive ? 'nav-link active' : 'nav-link')}
            to='/login'
          >
            Login
          </NavLink>
          <NavLink
            className={({ isActive }) => (isActive ? 'nav-link active' : 'nav-link')}
            to='/register'
          >
            Register
          </NavLink>
        </>
      )}
      {isLoggedIn && (
        <>
          <NavLink
            className={({ isActive }) => (isActive ? 'nav-link active' : 'nav-link')}
            to='/pets'
          >
            Pets
          </NavLink>
          <button className='logout' onClick={logoutHandler}>
            Logout
          </button>
        </>
      )}
    </nav>
  );
};

export default Navigation;
