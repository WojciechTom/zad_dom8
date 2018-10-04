package porownanie82;

import java.util.Scanner;

public class JachtTest {
    public static void main(String[] args) {
        boolean checkTekst;
        boolean check;
        String tekst;
        Jacht[] port = new Jacht[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Proszę podać nazwę i długosć jachtu w formacie   Nazwa/długość");

        int i = 0;
        do {

            //Sprawdzanie poprawności wpisanych słów
            checkTekst = false;
            do {
                tekst = scan.nextLine();
                if ((tekst.isEmpty() || !tekst.matches("(.*)(/)(\\d+)"))) {
                    System.out.println("Niepoprawnie wpisana nazwa - proszę zachować format Nazwa/długość ");
                } else {
                    checkTekst = true;
                }

            } while (!checkTekst);


            Jacht jacht = new Jacht(tekst.substring(0, tekst.indexOf("/")), (double) Double.parseDouble(tekst.substring(tekst.indexOf("/") + 1, tekst.length())));
            check = false;


            for (Jacht yacht : port) {
                if (jacht.equals(yacht)) {
                    System.out.println("Taki jacht już jest na liście. Prosze podać inny model");
                    check = true;
                } else ;
            }


            if (!check) {
                port[i] = jacht;
                i++;
                System.out.println("Jacht Dodany");
            }

        } while (i < port.length);



//Wyświetlanie tabeli
        for (int k = 0; k < port.length; k++) {
            System.out.println(port[k].toString());
        }
    }
}
