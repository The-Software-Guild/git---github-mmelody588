/*
 * @author: Martin Melody
 * email: mmelody588@gmail.com
 * date: 08/09/2021
 * purpose: Meeting DAO Interface for Complex JDBC Exercise
 */
package com.sg.jdbctcomplexexample.dao;

import com.sg.jdbctcomplexexample.entity.Employee;
import com.sg.jdbctcomplexexample.entity.Meeting;
import com.sg.jdbctcomplexexample.entity.Room;
import java.util.List;

public interface MeetingDao {
    List<Meeting> getAllMeetings();
    Meeting getMeetingByid(int id);
    Meeting addMeeting(Meeting meeting);
    void updateMeeting(Meeting meeting);
    void deleteMeetingById(int id);
    
    List<Meeting> getMeetingsForRoom(Room room);
    List<Meeting> getMeetingsForEmployee(Employee employee);
}
