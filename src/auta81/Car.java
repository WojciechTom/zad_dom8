package auta81;

public class Car extends Vehicle {
    private boolean climaOnOff;

    public Car(String nazwa, int pojemnoscBaku, double avrSpalanie, boolean climaOnOff) {
        super(nazwa, pojemnoscBaku, avrSpalanie);
        this.climaOnOff = climaOnOff;
    }

    public boolean isClimaOnOff() {
        return climaOnOff;
    }

    public void setClimaOnOff(boolean climaOnOff) {
        this.climaOnOff = climaOnOff;
    }


    double avgSpalanieUpdate() {
        if (isClimaOnOff()) {
            return getAvrSpalanie() + 0.8;
        } else {
            return getAvrSpalanie();
        }
    }
}