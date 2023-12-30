package main.finale.nextLeap.Blind_75;

import java.util.ArrayList;
import java.util.List;

public class My_Calendar_I {

    private List<int[]> cal;

    public My_Calendar_I() {
        this.cal = new ArrayList();
    }

    public boolean book(int start, int end) {
        for(int[] meet: cal) {
            if(meet[0] < end && start < meet[1]) {
                return false;
            }
        }
        cal.add(new int[]{start, end});
        return true;
    }
}
