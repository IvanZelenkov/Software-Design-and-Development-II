package Lab2.Motorbike;

public class MotorbikeSold extends Motorbike {
    private double speed;
    private String licencePlate;

    public MotorbikeSold(String brand, String model, double maxSpeed, boolean antitheft, double speed, String licencePlate) {
        super(brand, model, maxSpeed, antitheft);
        this.speed = speed;
        this.licencePlate = licencePlate;
    }

    public MotorbikeSold(String brand, String model) {
        super(brand, model);
        this.speed = 0.0;
        this.licencePlate = "JohnDoe";
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    @Override
    public String toString() {
        return String.format("Motorbike %s %s %s", super.getBrand(), super.getModel(), this.speed);
    }
}
