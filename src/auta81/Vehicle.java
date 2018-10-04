package auta81;

public class Vehicle {

    private String nazwa;
    private int pojemnoscBaku;
    private double avrSpalanie;

    public Vehicle(String nazwa, int pojemnoscBaku, double avrSpalanie) {
        this.nazwa = nazwa;
        this.pojemnoscBaku = pojemnoscBaku;
        this.avrSpalanie = avrSpalanie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public double getAvrSpalanie() {
        return avrSpalanie;
    }

    public void setAvrSpalanie(double avrSpalanie) {
        this.avrSpalanie = avrSpalanie;
    }


    double zasieg() {
        return pojemnoscBaku / avgSpalanieUpdate() * 100;
    }

    double avgSpalanieUpdate() {
        return getAvrSpalanie();
    }
}


