package java.intvs.vymo;

import java.util.*;
import java.lang.*;
// 10 - 11
// 10:30 - 11:30
// 12 - 1
// 12:30 - 1:30
// 13 - 14

public class Vymo1 {

    public static void main(String[] args) {
        String[][] meetings = new String[][]{{"10:00","11:00"}, {"10:30","11:30"}, {"12:00","01:00"}, {"12:30","01:30"},{"13:00","14:00"}};
        //sort.
        int totalNumberOfMeetingRooms = 0;
        Set<Integer> meetingRoomEndTimes = new HashSet<>();
        for(String[] meet: meetings) {
            // int startTime = Integer.parseInt(meet[0]);
            // int endTime = Integer.parseInt(meet[1]);
            if(!isMeetingRoomAvailable(meetingRoomEndTimes, meet[0], meet[1])) {
                totalNumberOfMeetingRooms++;
                meetingRoomEndTimes.add(Integer.parseInt(meet[1].split(":")[0]));
            }
        }
        System.out.println("Total number of Meeting Rooms are required is: "+ totalNumberOfMeetingRooms);
    }

    public static boolean isMeetingRoomAvailable(Set<Integer> meetingRoomEndTimes, String startTime, String endTime) {
        Iterator itr = meetingRoomEndTimes.iterator();

        while(itr.hasNext()) {
            String endTimeOfMeetingRoom  =  (String) itr.next();
//            Integer meetingEndTime = endTimeOfMeetingRoom.split(":")[0];
//            Integer startTimeHour = startTime.split(":")[0];
//            if(meetingEndTime >= startTimeHour) {
//                // have to remove a meeting end time and have to add new end time.
//                //meetingRoomEndTimes.remove();
//                meetingRoomEndTimes.add(endTime.split(":")[0]);
//                return true;
//            }
        }
        return false;
    }


}
