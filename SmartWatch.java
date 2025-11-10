public class SmartWatch extends  Electronice {
    private boolean areGPS;
    private boolean areSim;
    private int durataBaterie;
    private boolean monitorSomn;
    private boolean incarcareWireless;
    public SmartWatch(){
        this.areGPS=false;
        this.areSim=false;
        this.durataBaterie=0;
        this.monitorSomn=false;
        this.incarcareWireless=false;
        super();
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
    public String toString(){
        return super.toString() + "Are GPS: " + areGPS+"\nAre Sim: " + areSim + "\nDurata Baterie: "
                 + durataBaterie + "\nMonitor Somn: " + monitorSomn + "\nIncarcare Wireless: " + incarcareWireless ;
    }

}
