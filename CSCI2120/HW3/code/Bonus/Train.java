public class Train {

    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        TrainCar trainCar = null;
        Train train = new Train();

        TrainCar trainCar1 = new TrainCar(trainCar) {
            @Override
            public void advance(double howFar) {
                itsDistanceFromHome += 10;
                super.itsDistanceFromHome += itsDistanceFromHome;
            }

            @Override
            public Boolean isMemberOfValidTrain() {
                return itsNextConnectedCar.equals(super.itsNextConnectedCar);
            }
        };

        Engine en = new Engine(trainCar1);
        //train.setEngine(new Engine(trainCar1));
        train.setEngine(en);

        boolean var = train.engine.isMemberOfValidTrain();

        System.out.println(var);
    }
}
