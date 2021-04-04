public class Caboose extends TrainCar {
    protected double itsDistanceFromHome;
    protected Caboose caboose;

    public Caboose(TrainCar nextCar) {
        super(nextCar);
    }

    @Override
    public void advance(double howFar) {
        itsDistanceFromHome += 10;
        super.itsDistanceFromHome += itsDistanceFromHome;
    }

    @Override
    public Boolean isMemberOfValidTrain() {
        return this.itsNextConnectedCar.equals(super.itsNextConnectedCar);
    }
}
