public class Casti extends Electronice {
    private String conectivitate;
    private Boolean noiseCancellation;
    private Double greutate;
    private String tipCasti;
    private String material;

    public Casti() {
        conectivitate = null;
        noiseCancellation = null;
        greutate = 0.0;
        tipCasti = null;
        material = null;
    }
    public Casti(String conectivitate, Boolean noiseCancellation, Double greutate, String tipCasti, String material) {
        this.conectivitate = conectivitate;
        this.noiseCancellation = noiseCancellation;
        this.greutate = greutate;
        this.tipCasti = tipCasti;
        this.material = material;
    }
    public Casti(Casti casti) {
        this.conectivitate = casti.conectivitate;
        this.noiseCancellation = casti.noiseCancellation;
        this.greutate = casti.greutate;
        this.tipCasti = casti.tipCasti;
        this.material = casti.material;
    }
    @Override
    public String toString() {
        return "Conectivitate: " + conectivitate + "\nNoise Cancellation: " + noiseCancellation
                + "\nGreutate: " + greutate + "\nTip casti: " + tipCasti + "\nMaterial: " + material;
    }
    public void setConectivitate(String conectivitate) {
        this.conectivitate = conectivitate;
    }
    public void setNoiseCancellation(Boolean noiseCancellation) {
        this.noiseCancellation = noiseCancellation;
    }
    public void setGreutate(Double greutate) {
        this.greutate = greutate;
    }
    public void setTipCasti(String tipCasti) {
        this.tipCasti = tipCasti;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConectivitate() {
        return conectivitate;
    }
    public Boolean getNoiseCancellation() {
        return noiseCancellation;
    }
    public Double getGreutate() {
        return greutate;
    }
    public String getTipCasti() {
        return tipCasti;
    }
    public String getMaterial() {
        return material;
    }
}
