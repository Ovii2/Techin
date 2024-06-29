import { useContext, useState } from 'react';
import { useForm } from 'react-hook-form';
import PetsContext from '../../Context/PetsContext/PetsContext';
import { postAppointment } from '../../services/postAppointment';
import './AppointmentForm.css';

const AppointmentForm = () => {
  const [isFormOpen, setIsFormOpen] = useState(false);
  const [error, setError] = useState(null);
  const { setUpdate } = useContext(PetsContext);

  const { register, handleSubmit, reset } = useForm({
    defaultValues: {
      petName: '',
      petOwner: '',
      date: '',
      time: '',
      notes: '',
    },
  });

  const formSubmitHandler = async (data) => {
    try {
      await postAppointment(data);
      setUpdate((update) => update + 1);
      setIsFormOpen(false);
      reset();
    } catch (error) {
      setError(error.message);
    }
  };

  return (
    <div className='appointment-form-container'>
      <button className='add-appointment-btn' onClick={() => setIsFormOpen(!isFormOpen)}>
        +Add Appointment
      </button>
      {isFormOpen && (
        <form className='form' onSubmit={handleSubmit(formSubmitHandler)}>
          <div className='card-body'>
            <div className='appointment-form-group'>
              <div className='form-group'>
                <label htmlFor='petName'>Pet Name</label>
                <input
                  id='petName'
                  className='form-control'
                  type='text'
                  name='petName'
                  placeholder="Pet's name"
                  required
                  {...register('petName')}
                />
              </div>
              <div className='form-group'>
                <label htmlFor='petOwner'>Pet Owner</label>
                <input
                  id='petOwner'
                  className='form-control'
                  type='text'
                  name='petOwner'
                  placeholder="Owner's name"
                  required
                  {...register('petOwner')}
                />
              </div>
              <div className='form-date-group'>
                <div className='form-date'>
                  <label htmlFor='date'>Date</label>
                  <input
                    id='date'
                    className='form-dates'
                    type='date'
                    name='date'
                    required
                    {...register('date')}
                  />
                </div>
                <div>
                  <div className='form-time'>
                    <label htmlFor='time'>Time</label>
                    <input
                      id='time'
                      className='form-dates'
                      type='time'
                      name='time'
                      min={'08:00'}
                      max={'19:00'}
                      required
                      {...register('time')}
                    />
                  </div>
                </div>
              </div>
              <div className='form-group'>
                <label htmlFor='notes'>Notes</label>
                <textarea
                  id='notes'
                  name='notes'
                  required
                  placeholder='Appointment Notes'
                  className='form-control'
                  {...register('notes')}
                />
              </div>
            </div>
            <div className='form-btn'>
              <button className='submit-appointment-btn' type='submit'>
                Add Appointment
              </button>
            </div>
          </div>
        </form>
      )}
    </div>
  );
};

export default AppointmentForm;
