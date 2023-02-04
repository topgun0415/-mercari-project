/** @format */

import React from 'react';

import logo from '../Images/logo.svg';

const Header = () => {
  return (
    <div>
      <div>
        <img src={logo} className='w-32' />
      </div>
      <input type='text' />
    </div>
  );
};

export default Header;
