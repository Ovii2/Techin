import AppointmentForm from '../../Components/AppointmentForm/AppointmentForm';
import { useState, useEffect, useContext } from 'react';
import { toast } from 'react-toastify';
import PetsList from '../../Components/CardList/PetsList';
import { getAllData } from '../../services/get';
import './PetsPage.css';
import PetsContext from '../../Context/PetsContext/PetsContext';
import { ClipLoader } from 'react-spinners';
import SearchBar from '../../SearchBar/SearchBar';

const PetsPage = () => {
  const [isLoading, setIsloading] = useState(true);
  const [filteredPets, setFilteredPets] = useState([]);
  const { update, setUpdate, pets, setPets } = useContext(PetsContext);

  const fetchData = async () => {
    setIsloading(true);
    try {
      const data = await getAllData();
      setPets(data);
      setFilteredPets(pets);
    } catch (error) {
      toast.error(error.message);
    } finally {
      setIsloading(false);
    }
  };

  useEffect(() => {
    fetchData();
  }, [update]);

  return (
    <div className='pets-page'>
      <AppointmentForm />
      <SearchBar setFilteredPets={setFilteredPets} />
      {isLoading ? (
        <div className='loader'>
          <ClipLoader />
          <p>Loading...</p>
        </div>
      ) : filteredPets.length > 0 ? (
        <PetsList filteredPets={filteredPets} />
      ) : (
        <p className='appointments-msg'>No pet appointments available.</p>
      )}
    </div>
  );
};

export default PetsPage;
