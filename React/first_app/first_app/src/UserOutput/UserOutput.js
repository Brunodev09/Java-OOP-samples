import React from 'react';
import './UserOutput.css';

const useroutput = (props) => {
	return (
	<div className="UserInput">
		<p>This is a test component</p>
		<p>This is my username: {props.username}</p>
	</div>
		);
};

export default useroutput;