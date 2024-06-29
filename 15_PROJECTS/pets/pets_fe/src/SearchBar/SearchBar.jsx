import { useState, useEffect, useContext } from 'react';
import PetsContext from '../Context/PetsContext/PetsContext';
import './SearchBar.css';

function SearchBar({ setFilteredPets }) {
  const { pets } = useContext(PetsContext);
  const [searchText, setSearchText] = useState('');
  const [sortOption, setSortOption] = useState('petName');
  const [sortOrder, setSortOrder] = useState('ASC');

  useEffect(() => {
    let filtered = pets.filter(
      (pet) =>
        pet.petName.toLowerCase().includes(searchText.toLowerCase()) ||
        pet.ownerName.toLowerCase().includes(searchText.toLowerCase())
    );

    if (sortOption && sortOrder) {
      filtered.sort((a, b) => {
        if (a[sortOption] < b[sortOption]) return sortOrder === 'ASC' ? -1 : 1;
        if (a[sortOption] > b[sortOption]) return sortOrder === 'ASC' ? 1 : -1;
        return 0;
      });
    }

    setFilteredPets(filtered);
  }, [searchText, sortOption, sortOrder, pets, setFilteredPets]);

  return (
    <div className='search-bar'>
      <input
        id='search'
        className='search-input'
        type='text'
        placeholder='Search...'
        value={searchText}
        onChange={(e) => setSearchText(e.target.value)}
      />
      <div className='sort-options'>
        <select
          className='select-btn'
          value={sortOption}
          onChange={(e) => setSortOption(e.target.value)}
        >
          <option value='petName'>Name</option>
          <option value='date'>Date</option>
          <option value='time'>Time</option>
          <option value='ownerName'>Owner</option>
          <option value='ASC' onChange={(e) => setSortOrder(e.target.value)}>
            ASC
          </option>
          <option value='DESC' onChange={(e) => setSortOrder(e.target.value)}>
            DESC
          </option>
        </select>
      </div>
    </div>
  );
}

export default SearchBar;
