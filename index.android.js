/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    View,
    Image
} from 'react-native';

export default class AwesomeProject extends Component {
    constructor(props) {
        super(props);
        this.state = {shwText: true};

        // 每1000毫秒对showText状态做一次取反操作
        setInterval(() => {
            this.setState({showText: !this.state.showText});
        }, 1000);
    }

    render() {
        let pic = {
            uri: 'http://i0.hdslb.com/bfs/archive/b4ca1e5fc5df21c87888db705437c22baca279b3.jpg@320w_200h_75Q_1c_2e.webp'
        };

        let display = this.state.showText ? this.props.text : 'ccc ';

        return (
            <View style={styles.container}>
                <Text style={styles.welcome}>
                    Welcome to R发的舒服撒地方eact ccccccNative!
                </Text>
                <Text style={styles.instructions}>
                    {display}
                </Text>
                <Text style={styles.instructions}>
                    Double tap R on your keyboard to reload,{'\n'}
                    Shake or press menu button for dev menu
                </Text>

                <Image source={pic} style={{width: 300, height: 300,marginTop:12}}/>

            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: 'red',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});

var styles = StyleSheet.create({
  base: {
    width: 38,
    height: 38,
  },
  background: {
    backgroundColor: '#222222',
  },
  active: {
    borderWidth: 2,
    borderColor: '#00ff00',
  },
});

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);
