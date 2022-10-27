package adapter.pattern;

public class RailwayAdapter implements RailwayEU {
    RailwayCoIS railwayCoIS;

    public RailwayAdapter(RailwayCoIS railwayCoIS) {
        this.railwayCoIS = railwayCoIS;
    }

    @Override
    public void getMove() {
        railwayCoIS.getMove();
    }
}
