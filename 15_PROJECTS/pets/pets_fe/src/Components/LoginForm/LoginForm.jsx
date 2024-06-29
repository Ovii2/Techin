import { useState } from 'react';
import { useForm } from 'react-hook-form';
import { toast } from 'react-toastify';
import { useNavigate, NavLink } from 'react-router-dom';
import { loginPost } from '../../services/loginPost';

import './LoginForm.css';

const LoginForm = () => {
  const [error, setError] = useState('');

  const {
    register,
    handleSubmit,
    reset,
    formState: { errors },
  } = useForm({
    defaultValues: {
      email: '',
      password: '',
    },
  });

  const navigate = useNavigate();

  const formSubmitHandler = async (data) => {
    try {
      const response = await loginPost(data);
      localStorage.setItem('token', response.token);
      localStorage.setItem('user', JSON.stringify(response));
      reset();
      navigate('/pets');
      toast.success('Login successfull!');
    } catch (error) {
      setError(error.message);
      toast.error('Invalid email or password');
    }
  };

  return (
    <form className='login-form' onSubmit={handleSubmit(formSubmitHandler)}>
      <input
        {...register('email', {
          required: 'Email is required',
          pattern: {
            value: /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i,
            message: 'Invalid email address format',
          },
        })}
        placeholder='Email'
      />
      {errors.email && <div className='error'>{errors.email.message}</div>}

      <input
        {...register('password', {
          required: 'Password is required',
          validate: (value) => value.length < 8 || 'Password must have at least 8 characters',
        })}
        placeholder='Password'
        type='password'
      />
      {errors.password && <div className='error'>{errors.password.message}</div>}

      <input className='login-btn' type='submit' value='Login' />
      <div className='new-user'>
        <span>
          New user?
          <NavLink to='/register'> Create an account!</NavLink>
        </span>
      </div>
    </form>
  );
};

export default LoginForm;
