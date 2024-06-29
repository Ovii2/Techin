import { useEffect, useState } from 'react';
import axios from 'axios';
import EditIcon from '@mui/icons-material/Edit';
import CheckIcon from '@mui/icons-material/Check';
import CloseIcon from '@mui/icons-material/Close';
import './PetCard.css';
import Delete from '../CardComponents/Delete';
import { useForm } from 'react-hook-form';
import { getUserRoleFromToken } from '../../utils/jwt';
import { toast } from 'react-toastify';

const API_URL = import.meta.env.VITE_API_URL;

const PetCard = ({ pet, setUpdate }) => {
  const { petName, ownerName, date, time, notes, status } = pet;

  const [isAdminApproved, setIsAdminApproved] = useState(pet.status);
  const [userRole, setUserRole] = useState('');
  const { setValue } = useForm();

  const [editDate, setEditDate] = useState(false);
  const [editTime, setEditTime] = useState(false);
  const [editNotes, setEditNotes] = useState(false);
  const [newNotes, setNewNotes] = useState(notes);

  const token = localStorage.getItem('token');
  const role = getUserRoleFromToken(token);

  const handleAdminApproval = async () => {
    try {
      const token = localStorage.getItem('token');
      await axios.patch(
        `${API_URL}/pets/status/${pet.id}`,
        {},
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      setIsAdminApproved(() => 'APPROVED');
      setUpdate((prev) => !prev);
    } catch (error) {
      console.error('Error approving pet:', error.message);
    }
  };

  const handleDateChange = async (e) => {
    try {
      const token = localStorage.getItem('token');
      const newDate = e.target.value;

      await axios.patch(
        `${API_URL}/pets/${pet.id}`,
        { date: newDate },
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );

      setUpdate((prev) => !prev);
      setEditDate(false);
    } catch (error) {
      console.error('Error updating date:', error.message);
    }
  };

  const handleTimeChange = async (e) => {
    try {
      const token = localStorage.getItem('token');
      const newTime = e.target.value;

      if (newTime < '08:00' || newTime > '18:00') {
        toast.error('Please select a time between 08:00 and 18:00.');
        return;
      }

      await axios.patch(
        `${API_URL}/pets/${pet.id}`,
        { time: newTime },
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );

      setUpdate((prev) => !prev);
      setEditTime(false);
    } catch (error) {
      console.error('Error updating time:', error.message);
    }
  };

  const handleNotesChange = (e) => {
    setNewNotes(e.target.value);
  };

  const saveNotes = async () => {
    try {
      const token = localStorage.getItem('token');

      await axios.patch(
        `${API_URL}/pets/${pet.id}`,
        { notes: newNotes },
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      setUpdate((prev) => !prev);
      setEditNotes(false);
    } catch (error) {
      console.error('Error updating notes:', error.message);
    }
  };

  useEffect(() => {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.data && user.data.role) {
      setUserRole(user.data.role);
    }

    if (pet) {
      setValue('date', pet.date);
      setValue('time', pet.time);
      setValue('notes', pet.notes);
    }
  }, [pet, setValue]);

  return (
    <div className='pet-card'>
      <Delete className='delete-btn' pet={pet} />
      <div className='pet-info'>
        <div className='pet-name-date'>
          <h3 className='pet-name'>{petName}</h3>
          <div className='pet-date'>
            {editDate ? (
              <div>
                <input type='date' value={date} onChange={handleDateChange} />
              </div>
            ) : (
              <div className='edit-date'>
                <p>{date}</p>
                <EditIcon
                  className='edit-icon'
                  onClick={() => setEditDate(true)}
                  sx={{ cursor: 'pointer', padding: '0.1rem' }}
                />
              </div>
            )}
            {editTime ? (
              <div>
                <input
                  type='time'
                  value={time}
                  onChange={handleTimeChange}
                  min={'08:00'}
                  max={'19:00'}
                />
              </div>
            ) : (
              <div className='edit-time'>
                <p>
                  {time.split(':')[0]}:{time.split(':')[1]}
                </p>
                <EditIcon
                  className='edit-icon'
                  onClick={() => setEditTime(true)}
                  sx={{ cursor: 'pointer', padding: '0.1rem' }}
                />
              </div>
            )}
          </div>
        </div>
        <p className='pet-owner'>
          <span className='owner-name'>Owner:</span> {ownerName}
        </p>
        {editNotes ? (
          <div className='edit-notes-container'>
            <textarea
              className='edit-notes-textarea'
              value={newNotes}
              onChange={handleNotesChange}
            />
            <div className='edit-notes-icons'>
              <CheckIcon className='check-icon' onClick={saveNotes} sx={{ cursor: 'pointer' }} />
              <CloseIcon
                className='close-icon'
                onClick={() => {
                  setNewNotes(notes);
                  setEditNotes(false);
                }}
                sx={{ cursor: 'pointer', padding: '0.1rem' }}
              />
            </div>
          </div>
        ) : (
          <div className='pet-notes'>
            <p>{notes}</p>
            <EditIcon
              className='edit-icon'
              onClick={() => setEditNotes(true)}
              sx={{ cursor: 'pointer' }}
            />
          </div>
        )}

        <div className={`pet-status-container`}>
          {role === 'ADMIN' && (
            <button className='approve-btn' onClick={handleAdminApproval}>
              Approve
            </button>
          )}
          <p className={status === 'APPROVED' ? 'approved' : 'pending'}>{status}</p>
        </div>
      </div>
    </div>
  );
};

export default PetCard;
