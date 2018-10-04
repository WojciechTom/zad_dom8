package auta81;

public class AutoTest {
    public static void main(String[] args) {

        Car c1 = new Car("Ford", 75, 7.5, false);
        Car c2 = new Car("Peugeot", 60, 6, false);
        Truck t1 = new Truck("Skania", 400,30,false,2000);
        Truck t2 = new Truck("Iveko", 700, 30, false,3000);

        System.out.println("Klima OFF");

        System.out.println(c1.getNazwa()+ " ma zasięg " + c1.zasieg() + " km.");
        System.out.println(c2.getNazwa() + " ma zasięg " + c2.zasieg() + " km.");
        System.out.println(t1.getNazwa() + " ma zasięg " + t1.zasieg()+ " km.");
        System.out.println(t2.getNazwa()+ " ma zasięg " + t2.zasieg()+ " km.");

        c1.setClimaOnOff(true);
        c2.setClimaOnOff(true);
        t1.setClimaOnOff(true);
        t2.setClimaOnOff(true);

        System.out.println("Klima ON");
        System.out.println(c1.getNazwa()+ " ma zasięg " + c1.zasieg() + " km.");
        System.out.println(c2.getNazwa() + " ma zasięg " + c2.zasieg() + " km.");
        System.out.println(t1.getNazwa() + " ma zasięg " + t1.zasieg()+ " km.");
        System.out.println(t2.getNazwa()+ " ma zasięg " + t2.zasieg()+ " km.");

    }
}
