import React, { Component } from 'react';
import { View, Button } from 'react-native';
import NativeReactExample from './components';

const onButtonPress = () => {
  NativeReactExample.startIntelActivity('IntelActivity');
  console.log('Button pressed');
};

class App extends Component {

  // componentWillMount() {
  //   DeviceEventEmitter.addListener(
  //                      'myEventModule',
  //                      (event) => {
  //                        console.warn(event);
  //                      });
  //                      DeviceEventEmitter.addListener(
  //                                         'lifecycleEvent',
  //                                         (event) => {
  //                                           console.warn(event);
  //                                         });
  //                      console.log('componentWillMount');
  // }

  render() {
    return (
      <View>
      <Button
        onPress={onButtonPress}
        title="Learn More"
        color="#841584"
        accessibilityLabel="Learn more about this purple button"
      />
      </View>
    );
  }
}

export default App;
