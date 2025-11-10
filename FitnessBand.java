public class FitnessBand extends Electronice {
    private boolean monitorRitmCardiac;
    private boolean rezistentaApa;
    private int pasiPeZi;
    private boolean notificariTelefon;
    private boolean modSportMultiplu;

    public FitnessBand(){
        this.monitorRitmCardiac=false;
        this.rezistentaApa=false;
        this.pasiPeZi=0;
        this.notificariTelefon=false;
        this.modSportMultiplu=false;
        super();
    }

    public FitnessBand (boolean monitorRitmCardiac,boolean rezistentaApa,int pasiPeZi,boolean notificariTelefon,
                        boolean modSportMultiplu, String model,Double pret,String brand,Double review,Integer stoc){
        this.monitorRitmCardiac=monitorRitmCardiac;
        this.rezistentaApa=rezistentaApa;
        this.pasiPeZi=pasiPeZi;
        this.notificariTelefon=notificariTelefon;
        this.modSportMultiplu=modSportMultiplu;
        super(model,pret,brand,review,stoc);

    }

    public FitnessBand(FitnessBand fitnessBand){
        super(fitnessBand);
        this.monitorRitmCardiac=fitnessBand.monitorRitmCardiac;
        this.rezistentaApa=fitnessBand.rezistentaApa;
        this.pasiPeZi=fitnessBand.pasiPeZi;
        this.notificariTelefon=fitnessBand.notificariTelefon;
        this.modSportMultiplu=fitnessBand.modSportMultiplu;
    }
    //setteri
    public void setMonitorRitmCardiac(boolean monitorRitmCardiac){
        this.monitorRitmCardiac=monitorRitmCardiac;
    }
    public void setRezistentaApa(boolean rezistentaApa){
        this.rezistentaApa=rezistentaApa;
    }
    public void setPasiPeZi(int pasiPeZi){
        this.pasiPeZi=pasiPeZi;
    }
    public void setNotificariTelefon(boolean notificariTelefon){
        this.notificariTelefon=notificariTelefon;
    }
    public void setModSportMultiplu(boolean modSportMultiplu){
        this.modSportMultiplu=modSportMultiplu;
    }
    //getteri
    public boolean getMonitorRitmCardiac(){
        return monitorRitmCardiac;
    }
    public boolean getRezistentaApa(){
        return rezistentaApa;
    }
    public int getPasiPeZi(){
        return pasiPeZi;
    }
    public boolean getNotificariTelefon(){
        return notificariTelefon;
    }
    public boolean getModSportMultiplu(){
        return modSportMultiplu;
    }

    @Override
    public String toString(){
        return super.toString() + "Monitor Ritm Cardiac: " + monitorRitmCardiac + "\nRezistenta Apa: " + rezistentaApa+"\nPasi Pe Zi: "
                + pasiPeZi + "\nNotificari Telefon: " + notificariTelefon + "\nMod Sport Multiplu: " + modSportMultiplu;
    }

}
