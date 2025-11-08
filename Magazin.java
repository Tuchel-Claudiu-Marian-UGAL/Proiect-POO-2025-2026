public class Magazin {
    public static void main(String[] args) {
        BoxaPortabila boxa1 = new BoxaPortabila(20, "Stereo", true, "IPX7", 10.0);
        Electronice electronice1 = new Electronice("ModelX", 299.99, "BrandY", 4.5, 50) {
        };
        Casti casti1 = new Casti("Bluetooth", true, 0.25, "Over-ear", "Plastic");

        System.out.println("Detalii Boxa Portabila:");
        System.out.println(boxa1.toString());
        System.out.println("\nDetalii Electronice:");
        System.out.println(electronice1.ToString());
        System.out.println("\nDetalii Casti:");
        System.out.println(casti1.toString());
    }
}
