package intro;

public class Main {

    // main javada baslangic noktasidir
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("Hello World");

        String ortaMetin = "Ilginizi cekebilir";
        String altMetin = "Vade süresi";

        System.out.println(ortaMetin);

        //ctrl + shift + f  : eclipsde kodlari hizalar

        int vade = 12;

        double dolarDun = 18.15;
        double dolarBugün = 18.10;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugün < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugün > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        //array
        String[] krediler = {"Hizli Kredi", "Maasin Halkbanktan", "Mutlu Emekli"};
//        System.out.println(krediler[0]);
//        System.out.println(krediler[1]);
//        System.out.println(krediler[2]);

        for (int i=0; i<krediler.length;i++){
            System.out.println(krediler[i]);
        }
    }
}
