package auta81;

public class Truck extends Car {
    private double weightOfCargo;


    public Truck(String nazwa, int pojemnoscBaku, double avrSpalanie, boolean climaOnOff, double weightOfCargo) {
        super(nazwa, pojemnoscBaku, avrSpalanie, climaOnOff);
        this.weightOfCargo = weightOfCargo;
    }


    public double getWeightOfCargo() {
        return weightOfCargo;
    }

    public void setWeightOfCargo(double weightOfCargo) {
        this.weightOfCargo = weightOfCargo;
    }


    double avgSpalanieUpdate() {
        if (isClimaOnOff()) {
            return getAvrSpalanie() + 1.6 + (weightOfCargo / 100 * 0.5);
        } else {
            return getAvrSpalanie() + (weightOfCargo / 100 * 0.5);
        }
    }
}
