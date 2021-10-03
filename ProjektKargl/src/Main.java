import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "WINDOWS-1250");

        System.out.println("Pro objednání produktu zadejte číslo produktu!");

        System.out.println("------------------------------------------------");

        System.out.println("Pokud nechcete daný výrobek koupit stačí zadat 0");

        System.out.println("------------------------------------------------");

        System.out.println();

        System.out.println("Televize: ");

        System.out.println("----------");

        System.out.println("Samsung(1) - 17 990,-");
        int tv1 = 1;
        System.out.println("LG(2) - 12 490,-");
        int tv2 = 2;
        System.out.println("Philips(3) - 15 990,-");
        int tv3 = 3;

        System.out.println("----------");

        System.out.println();

        System.out.println("Televizor objednejte zde: ");

        int obj1 = sc.nextInt();

        switch (obj1) {
            case 1:
                System.out.println("Televizor Samsung je v košíku");
                break;
            case 2:
                System.out.println("Televizor LG je v košíku");
                break;
            case 3:
                System.out.println("Televizor Philips je v košíku");
                break;
            default:
                break;
        }

        System.out.println("------------------------------");

        System.out.println();

        if (obj1 < 1 && obj1 > 3) {
            System.out.println();
        }

        System.out.println("Mobily: ");

        System.out.println("--------");

        System.out.println("Samsung(4) - 21 999,-");
        int mo1 = 4;
        System.out.println("iPhone(5) - 25 990,-");
        int mo2 = 5;
        System.out.println("Huawei(6) - 19 990,-");
        int mo3 = 6;
        System.out.println("Xiaomi(7) - 21 499,-");
        int mo4 = 7;
        System.out.println("OnePlus(8) - 23 990,-");
        int mo5 = 8;

        System.out.println("----------------------");

        System.out.println();

        System.out.println("Mobil objednejte zde: ");

        int obj2 = sc.nextInt();

        switch (obj2) {
            case 4:
                System.out.println("Mobil Samsung je v košíku");
                break;
            case 5:
                System.out.println("Mobil iPhone je v košíku");
                break;
            case 6:
                System.out.println("Mobil Huawei je v košíku");
                break;
            case 7:
                System.out.println("Mobil Xiaomi je v košíku");
                break;
            case 8:
                System.out.println("Mobil OnePlus je v košíku");
                break;
            default:
                break;
        }

        System.out.println("--------------------------");

        System.out.println();

        if (obj2 < 4 && obj2 > 8) {
            System.out.println();
        }

        System.out.println("Konzole: ");

        System.out.println("---------");

        System.out.println("PlayStation 5(9) - 13 490,-");
        int ko1 = 9;
        System.out.println("PlayStation 4(10) - 7 990,-");
        int ko2 = 10;
        System.out.println("Xbox Series X(11) - 13 490,-");
        int ko3 = 11;
        System.out.println("Nintendo Switch(12) - 7 799,-");
        int ko4 = 12;
        System.out.println("NVIDIA SHIELD TV PRO(13) - 5 299,-");
        int ko5 = 13;

        System.out.println("----------------------");

        System.out.println();

        System.out.println("Konzoli objednejte zde: ");

        int obj3 = sc.nextInt();

        switch (obj3) {
            case 9:
                System.out.println("Konzole PlayStation 5 je v košíku");
                break;
            case 10:
                System.out.println("Konzole PlayStation 4 je v košíku");
                break;
            case 11:
                System.out.println("Konzole Xbox Series X je v košíku");
                break;
            case 12:
                System.out.println("Nintendo Switch je v košíku");
                break;
            case 13:
                System.out.println("NVIDIA SHIELD TV PRO je v košíku");
                break;
            default:
                break;
        }

        System.out.println("--------------------------");

        System.out.println();

        if (obj3 < 9 && obj3 > 13) {
            System.out.println();
        }

        System.out.println("Notebooky: ");

        System.out.println("---------");

        System.out.println("MacBook(14) - 26 990,-");
        int no1 = 14;
        System.out.println("Acer(15) - 25 990,-");
        int no2 = 15;
        System.out.println("MSI(16) - 41 988,-");
        int no3 = 16;
        System.out.println("Dell(17) - 13 490,-");
        int no4 = 17;
        System.out.println("Asus(18) - 35 990,-");
        int no5 = 18;

        System.out.println("----------------------");

        System.out.println();

        System.out.println("Notebook objednejte zde: ");

        int obj4 = sc.nextInt();

        switch (obj4) {
            case 14:
                System.out.println("Notebook MacBook je v košíku");
                break;
            case 15:
                System.out.println("Notebook Acer je v košíku");
                break;
            case 16:
                System.out.println("Notebook MSI je v košíku");
                break;
            case 17:
                System.out.println("Notebook Dell je v košíku");
                break;
            case 18:
                System.out.println("Notebook Asus je v košíku");
                break;
            default:
                break;
        }

        System.out.println("--------------------------");

        System.out.println();

        if (obj4 < 14 && obj4 > 18) {
            System.out.println();
        }

        System.out.println("Přejete si dokončit objednávku?");

        String odpoved = "y/n";
        boolean yn;

        System.out.println("y/n");
        while (true) {
            odpoved = sc.nextLine().trim().toLowerCase();
            if (odpoved.equals("y")) {
                System.out.println("Objednávka dokončena!");
                yn = true;
                break;
            } else if (odpoved.equals("n")) {
                System.out.println("Objednávka byla zrušena!");
                yn = false;
                break;
            } else {
                System.out.println();
            }

        }

    }
}
