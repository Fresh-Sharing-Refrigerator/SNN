import React, {Component, useEffect, useState} from 'react'
import {Text, View} from 'react-native';
import {Calendar, CalendarList, Agenda} from 'react-native-calendars';
import {LocaleConfig} from 'react-native-calendars';
import {styles} from "@/styles/styles";
import {MAIN_COLOR} from "@/assets/colors/colors";

LocaleConfig.locales['fr'] = {
  monthNames: ['Janvier','Février','Mars','Avril','Mai','Juin','Juillet','Août','Septembre','Octobre','Novembre','Décembre'],
  monthNamesShort: ['Janv.','Févr.','Mars','Avril','Mai','Juin','Juil.','Août','Sept.','Oct.','Nov.','Déc.'],
  dayNames: ['일요일','월요일', '화요일','수요일','목요일','금요일','토요일'],
  dayNamesShort: ['일', '월','화','수','목','금','토'],
  today: 'Aujourd\'hui'
};
LocaleConfig.defaultLocale = 'fr';

interface props {
  selectedList: any;
  selectedDate: string;
  setSelectedDate: Function;
}

const CalendarComponent = ({selectedList, selectedDate, setSelectedDate}: props) => {
  const date = new Date();

  return (
    <View style={{}}>
      <Calendar
        current={date.toDateString()}
        onDayPress={(day) => {setSelectedDate(day.dateString)}}
        monthFormat={'yyyy MM'}
        firstDay={0}
        disableAllTouchEventsForDisabledDays={true}
        markingType='multi-dot'
        renderHeader={(date) => {
          const dateList = date.toLocaleString().split('. ');
          return <Text style={[styles.font, {fontSize: 20}]}>{dateList[0]}년 {dateList[1]}월</Text>
        }}
        markedDates={{
          [date.toDateString()]: {selected: true},
          ...selectedList,
          [selectedDate]: {
            selected: true,
            disableTouchEvent: true,
            selectedColor: MAIN_COLOR,
          },
        }}
      />
    </View>
  )
}

export default CalendarComponent;
