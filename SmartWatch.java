public class SmartWatch extends  Electronice {
    private boolean areGPS;
    private boolean areSim;
    private int durataBaterie;
    private boolean monitorSomn;
    private boolean incarcareWireless;

    public SmartWatch(){
        super();
        this.areGPS=false;
        this.areSim=false;
        this.durataBaterie=0;
        this.monitorSomn=false;
        this.incarcareWireless=false;
    }

    public SmartWatch (boolean areGPS,boolean areSim,int durataBaterie,boolean monitorSomn,boolean incarcareWireless,
                       String model,Double pret,String brand,Double review,Integer stoc){
        super(model,pret,brand,review,stoc);
        this.areGPS=areGPS;
        this.areSim=areSim;
        this.durataBaterie=durataBaterie;
        this.monitorSomn=monitorSomn;
        this.incarcareWireless=incarcareWireless;
    }

    public SmartWatch(SmartWatch smartWatch){
        super(smartWatch);
        this.areGPS=smartWatch.areGPS;
        this.areSim=smartWatch.areSim;
        this.durataBaterie=smartWatch.durataBaterie;
        this.monitorSomn=smartWatch.monitorSomn;
        this.incarcareWireless=smartWatch.incarcareWireless;}

    //setteri
    public void setAreGPS(boolean areGPS){
        this.areGPS=areGPS;
    }
    public void setAreSim(boolean areSim){
        this.areSim=areSim;
    }
    public void setDurataBaterie(int durataBaterie){
        this.durataBaterie=durataBaterie;
    }
    public void setMonitorSomn(boolean monitorSomn){
        this.monitorSomn=monitorSomn;
    }
    public void setIncarcareWireless(boolean incarcareWireless){
        this.incarcareWireless=incarcareWireless;
    }
    //getteri
    public boolean getAreGPS(){
        return areGPS;
    }
    public boolean getAreSim(){
        return areSim;
    }
    public int getDurataBaterie(){
        return durataBaterie;
    }
    public boolean getMonitorSomn(){
        return monitorSomn;
    }
    public boolean getIncarcareWireless(){
        return incarcareWireless;
    }

    @Override
    public String toString(){
        return super.toString() + "Are GPS: " + areGPS+"\nAre Sim: " + areSim + "\nDurata Baterie: "
                 + durataBaterie + "\nMonitor Somn: " + monitorSomn + "\nIncarcare Wireless: " + incarcareWireless ;
    }

}
