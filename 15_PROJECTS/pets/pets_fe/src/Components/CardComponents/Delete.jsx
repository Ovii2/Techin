import { useState, useContext } from 'react';
import PetsContext from '../../Context/PetsContext/PetsContext';
import Button from '@mui/joy/Button';
import DialogContent from '@mui/joy/DialogContent';
import DialogActions from '@mui/joy/DialogActions';
import Modal from '@mui/joy/Modal';
import ModalDialog from '@mui/joy/ModalDialog';
import DeleteForever from '@mui/icons-material/DeleteForever';
import { deleteData } from '../../services/delete';
import { toast } from 'react-toastify';
import './Delete.css';

const Delete = ({ pet }) => {
  const { setUpdate, pets } = useContext(PetsContext);
  const [open, setOpen] = useState(false);
  const [error, setError] = useState(null);
  const { id } = pet;

  const handleDelete = async () => {
    try {
      console.log(id);
      await deleteData(id);
      setUpdate((update) => update + 1);
      setOpen(false);
    } catch (error) {
      toast.error('Error deleting appointment:', error);
      setError(error.message);
    }
  };
  // console.log('pet id === ' + pet.id);
  return (
    <>
      <Button
        className='delete-btn'
        variant='contained'
        color='danger'
        endDecorator={<DeleteForever />}
        onClick={() => setOpen(true)}
        sx={{ color: 'tomato', position: 'absolute' }}
      ></Button>
      <Modal open={open} onClose={() => setOpen(false)}>
        <ModalDialog variant='outlined' role='alertdialog'>
          <DialogContent>Are you sure you want to delete this appointment?</DialogContent>
          <DialogActions sx={{ display: 'flex', justifyContent: 'center' }}>
            <Button
              variant='outlined'
              color='neutral'
              onClick={() => setOpen(false)}
              sx={{ padding: '0.5rem 2rem' }}
            >
              Cancel
            </Button>
            <Button
              variant='solid'
              onClick={() => handleDelete(pet.id)}
              sx={{
                backgroundColor: '#713FFF',
                marginRight: '0.5rem',
                padding: '0.5rem 2rem',
                '&:hover': { backgroundColor: '#713FFF' },
              }}
            >
              Delete
            </Button>
          </DialogActions>
        </ModalDialog>
      </Modal>
    </>
  );
};

export default Delete;
