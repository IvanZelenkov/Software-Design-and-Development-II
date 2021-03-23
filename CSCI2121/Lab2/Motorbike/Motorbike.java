package Lab2.Motorbike;

public class Motorbike {
    private String brand;
    private String model;
    private double maxSpeed;
    private boolean antitheft;

    public Motorbike(String brand, String model, double maxSpeed, boolean antitheft) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = 200;
        this.antitheft = false;
    }

    public Motorbike(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isAntitheft() {
        return antitheft;
    }

    public void setAntitheft(boolean antitheft) {
        this.antitheft = antitheft;
    }

    @Override
    public String toString() {
        return String.format("Motorbike - %s %s", brand, model);
    }
}
