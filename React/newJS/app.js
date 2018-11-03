/*Use let to create actual variables that change over time*/
let x = 10;
/*Use const to create constants that never change*/
const WIDTH = 800;
const HEIGHT = 600;

/*Arrow functions:*/

function printName(name) {
	console.log(name);
}
printName('Bruno');

const myFunc = (name) => {
	console.log(name);
}

const multiply = (num) => num*2; //This is a return

/*Imports and exports*/
const person = {name:'Max'}

export default person;

/*------Another File--------*/
export const clean = () => {}
export const baseData = 10;
/*------Another File--------*/

/*------app.js File--------*/
import person from './person.js'
//or - because its a default export
import psrWhatever from './person.js'



//different syntax because we export 2 different things from the file, not just a default package
import {baseData} from './utility.js'
import {clean} from './utility.js'
//or
import * as bundled from './utility.js'//bundled.baseData, bundled.clean()
/*------app.js File--------*/


/*Classes*/

/*class Person {//object
	name = 'Max'; //Property
	call = () => {} //method
}*/

/*Usage*/
const myPerson = new Person();
myPerson.call();
console.log(myPerson.name);

//classes can also extend other classes and its properties and methods. class Person extends Master {}
//Practical example n2


class Human {
	constructor() {
		this.gender = 'male';
	}
	printGender() {
		console.log(this.gender);
	}
}
class Person2 extends Human {
	constructor() {
		super();//This executes the constructor in the Human class!
		this.name = 'Bruno';
	}
	printName() {
		console.log(this.name);
	}
}

const p = new Person2();
p.printName();
p.printGender();

//Spread and rest operator ...

//Spread - Split up array elements or objects properties
let oldArray = [1,2,3];
const newArray = [...oldArray, 4, 5]; //1,2,3,4,5
const newObject = {...oldObject, newProp: 5};

//Rest - used to merge a list of function arguments into an array
function splitArgs(...args) {
	return args.split();//Since args is stored in an array I can use array methods
}

const filter = (...args) => args.filter(el => el === 1); //on the .filter() method, the function is executed on each element of the given array


//Destructuring - Recover array elements and object properties and store them into variables
const array = [1,2,3];
[num1,num2] = array;//1,2
[num1, , num3] = array;//1,2,3


const obj = {name: 'Max', age:21};
{name} = {name: 'Max', age: 21}; //age -> undefined, because we are calling the {name} property only

//References and primitives
//Primitives
const a = 1;
const b = a;
//b is a perfect copy of a


//References
const person {
	name: 'Max'
};
const secondPerson = person;
person.name = 'Bruno';
console.log(secondPerson); //--> Bruno. That is because when you copy an array or an object you actually copy the pointer that is pointing to that var in memory. 
//Pay atention, for this can generate unexpected behavior
//To actually copy it like a primitive, use the spread operator! const secondPerson = {...person};

