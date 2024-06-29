import './PetsList.css';
import PetsContext from '../../Context/PetsContext/PetsContext';
import { useContext } from 'react';
import PetCard from '../Card/PetCard';
import './PetsList.css';

const PetsList = ({filteredPets}) => {
  const { setUpdate, pets } = useContext(PetsContext);
  return (
    <>
      <div className='pets-list'>
        {filteredPets.map((pet) => (
          <PetCard key={pet.id} pet={pet} setUpdate={setUpdate} />
        ))}
      </div>
    </>
  );
};

export default PetsList;
