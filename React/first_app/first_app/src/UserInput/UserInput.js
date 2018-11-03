import React from 'react';
import './UserInput.css';

const userinput = (props) => {
	return (
		<div className="UserInput">
			<input type="text" onChange={props.handler} value={props.username}/>
		</div>
	);
};

export default userinput;