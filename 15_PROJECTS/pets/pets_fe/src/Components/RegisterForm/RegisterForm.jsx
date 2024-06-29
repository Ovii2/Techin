import { useForm } from 'react-hook-form';
import './RegisterForm.css';
import { useState, useEffect, useRef, useContext } from 'react';
import { postRegister } from '../../services/postRegister';
import { updateData } from '../../services/update';
import { NavLink, useNavigate } from 'react-router-dom';
import { toast } from 'react-toastify';
import UserContext from '../../Context/UserContext/UserContext';

const RegisterForm = () => {
  const [error, setError] = useState('');
  const { setUpdate } = useContext(UserContext);

  const {
    register,
    handleSubmit,
    reset,
    formState: { errors },
    watch,
  } = useForm({
    defaultValues: {
      userName: '',
      userEmail: '',
      password: '',
      repeatPassword: '',
    },
  });

  const password = useRef({});
  password.current = watch('password', '');
  const navigate = useNavigate();

  const formSubmitHandler = async (data) => {
    try {
      const dataCopy = { ...data };
      delete dataCopy['repeatPassword'];
      await postRegister(dataCopy);
      setUpdate((updates) => updates + 1);
      reset();
      toast.success('User created successfully!');
      navigate('/login');
    } catch (error) {
      setError(error.message);
    }
  };

  // useEffect(() => {
  //   if (user) {
  //     setValue('userName', user.userName, { shouldValidate: true });
  //     setValue('userEmail', user.userEmail, { shouldValidate: true });
  //     setValue('password', user.password, { shouldValidate: true });
  //   }
  // }, []);

  return (
    <form onSubmit={handleSubmit(formSubmitHandler)} noValidate className='register-form'>
      <input
        type='text'
        id='userName'
        {...register('userName', {
          required: 'User name is required',
          validate: (value) => value.trim() !== '' || 'User name cannot be empty',
        })}
        placeholder='Enter user name'
      />
      {errors.userName && <div className='error'>{errors.userName.message}</div>}
      <input
        type='text'
        id='email'
        {...register('email', {
          required: 'Email is required',
          validate: (value) => value.trim() !== '' || 'Email cannot be empty',
          pattern: {
            value: /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i,
            message: 'Invalid email address format',
          },
        })}
        placeholder='Enter email'
      />
      {errors.email && <div className='error'>{errors.email.message}</div>}

      <input
        type='password'
        id='password'
        {...register('password', {
          required: 'Password is required',
          // validate: (value) => {
          //   return value.length < 8 && 'Password must have at least 8 characters';
          // },
        })}
        placeholder='Enter password'
      />
      {errors.password && <div className='error'>{errors.password.message}</div>}

      <input
        type='password'
        id='repeatPassword'
        {...register('repeatPassword', {
          required: 'Repeat your password',
          // validate: (value) => {
          //   return value != password.current
          //     ? 'Passwords do not match'
          //     : value.length < 8
          //     ? "Password must have at least 8 characters'"
          //     : undefined;
          // },
        })}
        placeholder='Repeat password'
      />
      {errors.repeatPassword && <div className='error'>{errors.repeatPassword.message}</div>}

      <input className='submit-btn' type='submit' value='Submit' />
      <div className='already'>
        <span>
          Already have an account? <NavLink to='/login'>Login!</NavLink>
        </span>
      </div>
    </form>
  );
};

export default RegisterForm;
