import React, { Component } from 'react';
import './App.css';
import Validation from './Validation/Validation';
import Char from './Char/Char';

class App extends Component {

  state = {
    userInput: ''
  }

  inputHandler = (event) => {
   this.setState({userInput: event.target.value});
 }

  deleteChar = (index) => {
    const text = this.state.userInput.split('');
    text.splice(index, 1);
    const updatedText = text.join('');
    this.setState({userInput: updatedText});
  }


 render() {


   const array = (<div>
    {this.state.userInput.split('').map((ch,index) => {

      return <Char arr={ch} key="index" clickme={() => this.deleteChar(index)} />
    })}
    </div>
    );

   return (
    <div>
    <input type="text" onChange={this.inputHandler} value={this.state.userInput}  />
    <p>{this.state.userInput}</p>
    <Validation length={this.state.userInput.length} />
    {array}
    </div>
    );
 }
}

export default App;
