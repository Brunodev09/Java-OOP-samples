import React from 'react';

const stringLength = (props) => {
	if (props.length < 5) return <p>Text too short</p>
		else return <p>Text is right</p>
};

export default stringLength;