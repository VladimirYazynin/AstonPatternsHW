package adapter.pattern;

public class Solution {
    public static void main(String[] args) {
        RailwayCoIS railwayCoIS = new CoISTrack();
        Train train = new Train();
        RailwayEU railwayEU = new RailwayAdapter(railwayCoIS);
        train.moveOnRailway(railwayEU);
    }
}
