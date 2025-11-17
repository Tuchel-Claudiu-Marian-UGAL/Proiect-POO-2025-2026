import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Laptop> laptopuri = new ArrayList<>();
    static ArrayList<Desktop> desktopuri = new ArrayList<>();

    public static void afisReviewPret(ArrayList<Desktop> desktopuri, double pretMin,double pretMax,double reviewMin){
        for (Desktop d : desktopuri) {
            if (d.getPret() >= pretMin && d.getPret() <= pretMax && d.getReview() >= reviewMin) {
                System.out.println(d + "\n");
            }
        }
    }

    public static void afisBrandProcesor(ArrayList<Laptop> laptopuri, String brand, String procesor) {
        for (Laptop l : laptopuri) {
            if (l.getBrand().equalsIgnoreCase(brand) && l.getProcesor().equalsIgnoreCase(procesor)) {
                System.out.println(l + "\n");
            }
        }
    }

    public static void main(String[] args) {

        laptopuri.add(new Laptop("Inspiron 15 3520", 2799.99, "Dell", 4.3, 12,
                "Gri", "Intel i5", 4.4, 15.6,
                16, 512, true, true));

        laptopuri.add(new Laptop("Legion 5", 5499.50, "Lenovo", 4.7, 5,
                "Negru", "AMD Ryzen 7", 4.4, 15.6,
                16, 1024, false, true));

        laptopuri.add(new Laptop("VivoBook 14", 2499.00, "Asus", 4.2, 20,
                "Albastru", "Intel i3", 4.1, 14.0,
                8, 256, true, true));

        laptopuri.add(new Laptop("MacBook Air M1", 4999.99, "Apple", 4.8, 8,
                "Silver", "Apple M1", 3.2, 13.3,
                8, 256, false, true));

        laptopuri.add(new Laptop("HP Pavilion 16", 3899.00, "HP", 4.4, 10,
                "Negru", "Intel i7", 4.7, 16.1,
                16, 512, false, true));

        laptopuri.add(new Laptop("Acer Aspire 3", 1899.50, "Acer", 4.1, 30,
                "Argintiu", "AMD Ryzen 5", 4.0, 15.6,
                8, 512, true, true));

        laptopuri.add(new Laptop("ROG Strix G15", 6999.99, "Asus", 4.9, 4,
                "Negru/ROG", "AMD Ryzen 9", 4.6, 15.6,
                32, 1024, false, false));

        laptopuri.add(new Laptop("ThinkPad T14", 6299.00, "Lenovo", 4.6, 7,
                "Negru", "Intel i7", 4.7, 14.0,
                16, 512, true, true));

        laptopuri.add(new Laptop("Galaxy Book2", 3599.00, "Samsung", 4.3, 14,
                "Gri", "Intel i5", 4.4, 15.6,
                16, 512, true, true));

        laptopuri.add(new Laptop("Surface Laptop 4", 5799.00, "Microsoft", 4.5, 6,
                "Platinum", "AMD Ryzen 5", 4.0, 13.5,
                16, 256, true, true));

        desktopuri.add(new Desktop(
                "Predator Orion 3000", 4999.99, "Acer", 4.6, 6,
                "Negru", "Intel i7", 16, 1024,
                "NVIDIA RTX 3060"
        ));

        desktopuri.add(new Desktop(
                "OMEN 25L", 5799.50, "HP", 4.7, 4,
                "Negru", "AMD Ryzen 7", 16, 1024,
                "NVIDIA RTX 3070"
        ));

        desktopuri.add(new Desktop(
                "ThinkCentre M720", 2599.00, "Lenovo", 4.3, 12,
                "Gri", "Intel i5", 8, 512,
                "Integrată Intel UHD 630"
        ));

        desktopuri.add(new Desktop(
                "ROG Strix G15DK", 6999.90, "Asus", 4.8, 3,
                "Negru", "AMD Ryzen 9", 32, 1024,
                "NVIDIA RTX 3080"
        ));

        desktopuri.add(new Desktop(
                "Dell XPS Tower", 4299.99, "Dell", 4.5, 8,
                "Gri", "Intel i7", 16, 512,
                "NVIDIA GTX 1660 Super"
        ));

        desktopuri.add(new Desktop(
                "Mac Mini M2", 3999.00, "Apple", 4.9, 10,
                "Silver", "Apple M2", 16, 512,
                "Integrată M2 GPU"
        ));

        desktopuri.add(new Desktop(
                "Acer Aspire TC", 1999.00, "Acer", 4.2, 15,
                "Negru", "Intel i3", 8, 512,
                "Integrată Intel UHD"
        ));

        desktopuri.add(new Desktop(
                "HP Pavilion Gaming", 3499.50, "HP", 4.4, 9,
                "Negru-Verde", "AMD Ryzen 5", 16, 512,
                "NVIDIA GTX 1650"
        ));

        desktopuri.add(new Desktop(
                "Lenovo Legion T5", 6399.00, "Lenovo", 4.7, 5,
                "Negru", "Intel i7", 16, 1024,
                "NVIDIA RTX 3070 Ti"
        ));

        desktopuri.add(new Desktop(
                "Asus ProArt Station PD5", 7499.00, "Asus", 4.8, 2,
                "Negru", "Intel i9", 32, 2048,
                "NVIDIA RTX 3060 Ti"
        ));

        double pretMin,pretMax,reviewMin;
        String brand,procesor;

        System.out.print("Introdu pret minim: ");
        pretMin=input.nextDouble();
        System.out.print("Introdu pret maxim: ");
        pretMax=input.nextDouble();
        System.out.print("Introdu review minim: ");
        reviewMin = input.nextDouble();
        input.nextLine();
        System.out.print("Introdu brand-ul dorit: ");
        brand=input.nextLine();
        System.out.print("Introdu procesor-ul dorit: ");
        procesor=input.nextLine();

        afisReviewPret(desktopuri,pretMin,pretMax,reviewMin);
        afisBrandProcesor(laptopuri,brand,procesor);




    }
}

