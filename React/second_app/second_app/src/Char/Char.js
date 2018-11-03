import React from 'react';

const styledDiv = (props) => {
	const style = {
		display:'inline-block',
		padding: '16px',
		textAlign: 'center',
		margin: '16px',
		border: '1px solid black'
	};

	return (
		<div onClick={props.clickme} style={style}>
		<p>{props.arr}</p>
		</div>);
}

export default styledDiv;