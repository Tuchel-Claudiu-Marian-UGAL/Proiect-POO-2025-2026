public class BoxaPortabila extends Electronice {
    private Integer putere;
    private String tipSunet;
    private Boolean NFC;
    private String rezistentaApa;
    private Double baterie;

    public BoxaPortabila() {
        putere = 0;
        tipSunet = null;
        NFC = null;
        rezistentaApa = null;
        baterie = 0.0;
    }
    public BoxaPortabila(Integer putere, String tipSunet, Boolean NFC, String rezistentaApa, Double baterie) {
        this.putere = putere;
        this.tipSunet = tipSunet;
        this.NFC = NFC;
        this.rezistentaApa = rezistentaApa;
        this.baterie = baterie;
    }
    public BoxaPortabila(BoxaPortabila boxaPortabila) {
        this.putere = boxaPortabila.putere;
        this.tipSunet = boxaPortabila.tipSunet;
        this.NFC = boxaPortabila.NFC;
        this.rezistentaApa = boxaPortabila.rezistentaApa;
        this.baterie = boxaPortabila.baterie;
    }

    @Override
    public String toString() {
        return "Putere: " + putere + "\nTip sunet: " + tipSunet + "\nConectivitate NFC: " + NFC
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
}
