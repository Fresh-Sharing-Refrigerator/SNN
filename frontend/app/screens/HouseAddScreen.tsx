import React from 'react';
import { View, Text, Button } from 'react-native';
import BottomNavigator from "@/components/BottomNavigator";
import {styles} from "@/styles/styles";
import MyHouseModal from "@/components/MyHouseModal";


const HouseAddScreen = ({navigation}:any) => {
  return (
    <View style={styles.layout}>
      <MyHouseModal/>
      <Text>HouseAddScreen</Text>
      <BottomNavigator now=''/>
    </View>
  )
}

export default HouseAddScreen;
