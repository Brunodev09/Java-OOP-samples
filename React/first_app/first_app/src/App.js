import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import UserInput from './UserInput/UserInput';
import UserOutput from './UserOutput/UserOutput';


class App extends Component {

  state = {
    user:'BrunoDev'
  }

  eventHandler = (event) => {
    this.setState({user:event.target.value});
  }

  render() {
    return (
      <div>
        <UserInput username={this.state.user} handler={this.eventHandler}></UserInput>

        <UserOutput username={this.state.user}>Test</UserOutput>
        <UserOutput username={this.state.user}>Test</UserOutput>
        <UserOutput username={this.state.user}>Test</UserOutput>
        <UserOutput username={this.state.user}>Test</UserOutput>
      </div>
    );
  }
}

export default App;
