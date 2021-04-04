public class Engine extends TrainCar {

    public Engine(TrainCar nextCar) {
        super(nextCar);
    }

    @Override
    public void advance(double howFar) {
        itsDistanceFromHome += 10;
        super.itsDistanceFromHome += itsDistanceFromHome;
    }

    @Override
    public Boolean isMemberOfValidTrain() {
        return itsNextConnectedCar.equals(super.itsNextConnectedCar);
    }
}
