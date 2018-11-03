import React, { Component } from 'react';
import './App.css';
import Test from './Test/Test';
import Radium, {StyleRoot} from 'radium';

class App extends Component {
  state = {
    people: [{id: 'dsadsa', name: 'Bruno', age:21}, {id: '123', name:'Maysa', age:22}, {id: '1234', name:'Pai', age:104}],
    otherValue: 'Something else',
    showName: false

  }// State is a special property only valid if class is extending Component. ONLY STATES AND PROPS CAN TRIGGER RENDERING THE DOM REALTIME.

  switchNameHandler = (newName) => {
    // DONT DO THIS: this.state.people[0].name = "bruno2". Use setState to actually trigger a re-render
    this.setState({people: [{name: newName, age:21}, {name:'Maysa', age:22}]}); //This will NOT touch otherValue.
  }

  nameChangeHandler = (event, id) => {
    const peopleIndex = this.state.people.findIndex(p => {
      return p.id === id; //Will return true/false if condition is met or not
    });
    const people = {...this.state.people[peopleIndex]}; //Spread operator here will copy all of the properties from the state into the new object

    people.name = event.target.value;

    const updatedPeople = [...this.state.people];
    updatedPeople[peopleIndex] = people;

    this.setState({people: updatedPeople});
  }

  showNameHandler = (event) => {
    const doesShow = this.state.showName;
    this.setState({showName: !doesShow});
  }

  deleteHandler = (myindex) => {
    //const deleted = this.state.people.slice(); This also works
    const deleted = [...this.state.people];
    deleted.splice(myindex, 1);
    this.setState({people: deleted});
  } 

  render() {

    const style = {
      backgroundColor: 'green',
      font: 'inherit',
      border: '1px solid blue',
      cursor: 'pointer',
      ':hover': { // This only works using Radium (addon for more CSS functions, like :hover)
        backgroundColor: 'lightgreen',
        color: 'black'
      }
    };

    let people = null;

    if (this.state.showName) {
      people = (
        <div>
            {this.state.people.map((ppl, index) => {
              return <Test id={ppl.id} name={ppl.name} age={ppl.age} clickme={() => this.deleteHandler(index)} change={(event) => this.nameChangeHandler(event, ppl.id)}  />
            })}
        </div>
        );
      style.backgroundColor = 'red';
      style[':hover'] = {
        backgroundColor: 'salmon',
        color: 'black'
      }
    }

   // let classes = ['red', 'bold'].join(' ');//'red bold'
      let classes = [];

      if (this.state.people.length <= 2) classes.push('red');
      if (this.state.people.length <= 1) classes.push('bold');

    return (
    <StyleRoot>
      <div className="App">
      <h1>React App</h1>
      <p className={classes.join(' ')}>Testing CSS classes</p>
      {/*<button style={style} onClick={() => this.switchNameHandler('Lulu')}> Switch Name! </button>*/}
      <button style={style} onClick={this.showNameHandler}> Show or hide! </button>


      {people}

      </div>
      </StyleRoot>
      );
    //Use create-react-app <name> to create new React app with no configuration. Use npm start to run the build
    //This is JSX code that compiles into the code below. className must be used instead of class, because class is reserved for JS
    //return React.createElement('div', {className: 'App'}, React.createElement('h1', null, 'I\'m a React app!')); JSX is compiled into this JS code that imports React

    //Passing this.switchNameHandler is a reference only. So this way the function doesn't get executed immediately  
    //.bind is a way to pass parameters up to parent file (Test.js). The other way is to trigger an anonymous arrow function with the parameter inserted. Left both ways
    //Use => functions because when we create a function with a listener, .this keyword no longer refers to a class but to the listener. With arrow functions .this is still atributed to the class!
    //render() is always executed to change states or props
    //You can parse JSX inside JS objects. For example people = (<div><p>Hello!</p></div>);
    //id is a way to let React identify proper objects that are being deleted or rendered. It must be unique, usually DB's will supply that, like MongoDB does
  }
}

export default Radium(App);
