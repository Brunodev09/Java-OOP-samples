import React from 'react';
import './Test.css';
import Radium from 'radium';

//This is a component
//props are objects containing attributes from <Test> tag
const test = (props) => {
	const style = {
		'@media (min-width: 500px)':{
			width: '450px'
		}
	};
	return (
		<div className="Test" style={style}>
			<p onClick={props.clickme}>I am {props.name} and my age is {props.age}.</p>
			<p >{props.children}</p>
			<input type="text" onChange={props.change} value={props.name}/>
		</div>
		); //.children are the content inside <Test> tags wrapped in an object
};

export default Radium(test);