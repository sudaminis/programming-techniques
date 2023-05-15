package techniques.stacksqueues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {
    public static void main(String...args) {
        // Arrays.sort(contests, (a, b) -> Integer.compare(a[0],b[0]); //increasing order
        int[][] intervals = new int[][]{
                {15,20}, {0, 30}, {5, 10}
        };
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        System.out.println("sorted intervals");
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();

        int rooms = 0;
        for (int[] interval : intervals) {
            int meetingEndTime = interval[1];
            System.out.println("Looking to book a room for a meeting ending at " + meetingEndTime);
            if (endTimes.isEmpty()) {
                ++rooms;
                System.out.println("Adding to endTimes = " + meetingEndTime);
                endTimes.add(interval[1]);
            } else {
                if (endTimes.peek() <= interval[1]) {
                    endTimes.poll();
                } else {
                    ++rooms;
                }
            }
            endTimes.add(interval[1]);
        }
        return rooms;

    }
}
