public class Magazin {
    public static void main(String[] args) {
        BoxaPortabila boxe[] = new BoxaPortabila[10];
        boxe[0] = new BoxaPortabila("JBL Flip 5", 299.99, "JBL", 4.5, 20, 20, "Stereo", true, "IPX7", 12.0);
        boxe[1] = new BoxaPortabila("Sony SRS-XB12", 149.99, "Sony", 4.3, 15, 10, "Mono", false, "IP67", 16.0);
        boxe[2] = new BoxaPortabila("Bose SoundLink Revolve", 499.99, "Bose", 4.7, 10, 30, "360°", true, "IPX4", 12.0);
        boxe[3] = new BoxaPortabila("Ultimate Ears WONDERBOOM 2", 199.99, "UE", 4.6, 25, 15, "360°", true, "IP67", 13.0);
        boxe[4] = new BoxaPortabila("Anker Soundcore 2", 129.99, "Anker", 4.4, 30, 12, "Stereo", false, "IPX7", 24.0);
        boxe[5] = new BoxaPortabila("JBL Charge 4", 399.99, "JBL", 4.5, 18, 30, "Stereo", true, "IPX7", 20.0);
        boxe[6] = new BoxaPortabila("Sony SRS-XB23", 249.99, "Sony", 4.4, 22, 20, "Stereo", true, "IP67", 12.0);
        boxe[7] = new BoxaPortabila("Bose SoundLink Micro", 179.99, "Bose", 4.3, 28, 6, "Mono", false, "IPX7", 6.0);
        boxe[8] = new BoxaPortabila("Ultimate Ears BOOM 3", 299.99, "UE", 4.6, 16, 15, "360°", true, "IP67", 15.0);
        boxe[9] = new BoxaPortabila("Anker Soundcore Flare 2", 179.99, "Anker", 4.5, 24, 16, "360°", true, "IPX7", 12.0);

        for (int i = 0; i < boxe.length; i++) {
            System.out.println("Boxa Portabila " + (i + 1) + ":\n" + boxe[i].toString() + "\n");
        }
        System.out.println("\n");

        Casti casti[] = new Casti[10];
        casti[0] = new Casti("Sony WH-1000XM4", 999.99, "Sony", 4.8, 15, "Wireless", true, 254.0, "Over-Ear", "Plastic");
        casti[1] = new Casti("Bose QuietComfort 35 II", 899.99, "Bose", 4.7, 10, "Wireless", true, 235.0, "Over-Ear", "Metal");
        casti[2] = new Casti("Apple AirPods Pro", 799.99, "Apple", 4.6, 20, "Wireless", true, 56.0, "In-Ear", "Plastic");
        casti[3] = new Casti("Sennheiser HD 450BT", 499.99, "Sennheiser", 4.5, 18, "Wireless", true, 238.0, "Over-Ear", "Plastic");
        casti[4] = new Casti("Jabra Elite 75t", 599.99, "Jabra", 4.4, 25, "Wireless", false, 65.0, "In-Ear", "Plastic");
        casti[5] = new Casti("Beats Solo Pro", 699.99, "Beats", 4.3, 12, "Wireless", true, 215.0, "On-Ear", "Plastic");
        casti[6] = new Casti("AKG N60NC", 549.99, "AKG", 4.2, 14, "Wireless", true, 195.0, "On-Ear", "Metal");
        casti[7] = new Casti("Skullcandy Crusher ANC", 649.99, "Skullcandy", 4.1, 16, "Wireless", true, 260.0, "Over-Ear", "Plastic");
        casti[8] = new Casti("Marshall Major III", 399.99, "Marshall", 4.0, 30, "Wired", false, 174.0, "On-Ear", "Metal");
        casti[9] = new Casti("Philips SHB3075", 299.99, "Philips", 3.9, 28, "Wireless", false, 180.0, "On-Ear", "Plastic");

        for (int i = 0; i < casti.length; i++) {
            System.out.println("Casti " + (i + 1) + ":\n" + casti[i].toString() + "\n");
        }
        System.out.println("\n");
    }
}

