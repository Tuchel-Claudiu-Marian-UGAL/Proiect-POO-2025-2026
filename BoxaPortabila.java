public class BoxaPortabila extends Electronice implements InterfataBoxaCasti {
    private Integer putere;
    private String tipSunet;
    private Boolean NFC;
    private String rezistentaApa;
    private Double baterie;

    public BoxaPortabila() {
        super();
        putere = 0;
        tipSunet = null;
        NFC = null;
        rezistentaApa = null;
        baterie = 0.0;
    }
    public BoxaPortabila(String model, Double pret, String brand, Double review, Integer stoc, Integer putere, String tipSunet, Boolean NFC, String rezistentaApa, Double baterie) {
        super(model, pret, brand, review, stoc);
        this.putere = putere;
        this.tipSunet = tipSunet;
        this.NFC = NFC;
        this.rezistentaApa = rezistentaApa;
        this.baterie = baterie;
    }
    public BoxaPortabila(BoxaPortabila boxaPortabila) {
        super(boxaPortabila);
        this.putere = boxaPortabila.putere;
        this.tipSunet = boxaPortabila.tipSunet;
        this.NFC = boxaPortabila.NFC;
        this.rezistentaApa = boxaPortabila.rezistentaApa;
        this.baterie = boxaPortabila.baterie;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPutere: " + putere + "\nTip sunet: " + tipSunet + "\nConectivitate NFC: " + NFC
                + "\nReistenta apa: " + rezistentaApa + "\nBaterie: " + baterie;
    }

    public void setPutere(Integer putere) {
        this.putere = putere;
    }
    public void setTipSunet(String tipSunet) {
        this.tipSunet = tipSunet;
    }
    public void setNFC(Boolean NFC) {
        this.NFC = NFC;
    }
    public void setRezistentaApa(String rezistentaApa) {
        this.rezistentaApa = rezistentaApa;
    }
    public void setBaterie(Double baterie) {
        this.baterie = baterie;
    }

    public Integer getPutere() {
        return putere;
    }
    public String getTipSunet() {
        return tipSunet;
    }
    public Boolean getNFC() {
        return NFC;
    }
    public String getRezistentaApa() {
        return rezistentaApa;
    }
    public Double getBaterie() {
        return baterie;
    }

    @Override
    public void porneste() {
        System.out.println("Boxa portabila a fost pornita.");
    }
    @Override
    public void conectareBluetooth() {
        System.out.println("Boxa portabila s-a conectat prin Bluetooth.");
    }
}
