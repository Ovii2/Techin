import './Header.css';
import '../../../src/variables.css';
import Navigation from '../Navigation/Navigation';

const Header = () => {
  return (
    <div className='header'>
      <div></div>
      <h1 className='header-title'>Pets medicare</h1>
      <Navigation />
    </div>
  );
};

export default Header;
