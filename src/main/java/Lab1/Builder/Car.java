package Lab1.Builder;

public class Car {
    protected String brand;
    protected int productionYear;
    protected int enginePower;
    protected String fuelType;
    protected String chassisNo;
    protected Sound soundSystem;
    protected Navigation navigation;
    protected Air airConditioner;

    public Car() {}

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.productionYear = builder.productionYear;
        this.enginePower = builder.enginePower;
        this.fuelType = builder.fuelType;
        this.chassisNo = builder.chassisNo;
        this.soundSystem = builder.soundSystem;
        this.navigation = builder.navigation;
        this.airConditioner = builder.airConditioner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", productionYear=" + productionYear +
                ", enginePower=" + enginePower +
                ", fuelType='" + fuelType + '\'' +
                ", chassisNo='" + chassisNo + '\'' +
                ", soundSystem=" + soundSystem +
                ", navigation=" + navigation +
                ", airConditioner=" + airConditioner +
                '}';
    }

    static class Builder extends Car {
        public Builder(String brand, int productionYear, int enginePower, String fuelType, String chassisNo) {
            super();
            this.brand = brand;
            this.productionYear = productionYear;
            this.enginePower = enginePower;
            this.fuelType = fuelType;
            this.chassisNo = chassisNo;
            this.soundSystem = Sound.RadioCD;
            this.navigation = Navigation.None;
            this.airConditioner = Air.MANUAL;
        }

        public Builder sound(Sound sound) {
            this.soundSystem = sound;
            return this;
        }

        public Builder navigation(Navigation nav){
            this.navigation = nav;
            return this;
        }

        public Builder air(Air air) {
            this.airConditioner = air;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
