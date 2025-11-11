public class FitnessBand extends Electronice implements ConectareBT{
    private boolean monitorRitmCardiac;
    private boolean rezistentaApa;
    private int pasiPeZi;
    private boolean notificariTelefon;
    private boolean modSportMultiplu;
    private boolean conexiuneBT;

    public FitnessBand(){
        super();
        this.monitorRitmCardiac=false;
        this.rezistentaApa=false;
        this.pasiPeZi=0;
        this.notificariTelefon=false;
        this.modSportMultiplu=false;
    }

    public FitnessBand (boolean monitorRitmCardiac,boolean rezistentaApa,int pasiPeZi,boolean notificariTelefon,
                        boolean modSportMultiplu, String model,Double pret,String brand,Double review,Integer stoc){
        super(model,pret,brand,review,stoc);
        this.monitorRitmCardiac=monitorRitmCardiac;
        this.rezistentaApa=rezistentaApa;
        this.pasiPeZi=pasiPeZi;
        this.notificariTelefon=notificariTelefon;
        this.modSportMultiplu=modSportMultiplu;
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
    public void ConectatBT(){
        System.out.println("Fitnessband conectat");
        conexiuneBT=true;
    }

    @Override
    public void DeconectatBT(){
        System.out.println("Fitnessband deconectat");
        conexiuneBT=false;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMonitor Ritm Cardiac: " + monitorRitmCardiac + "\nRezistenta Apa: " + rezistentaApa+"\nPasi Pe Zi: "
                + pasiPeZi + "\nNotificari Telefon: " + notificariTelefon + "\nMod Sport Multiplu: " + modSportMultiplu;
    }

}
