/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author Student
 */
public class Desktop extends Electronice implements ConectareWIFI {
    private String culoare;
    private String procesor;
    private String placaVideo;
    private Integer RAM;
    private Integer spatiuStocare;
    private boolean conectat=false;
    
    public Desktop(){
        this.culoare=null;
        this.procesor=null;
        this.RAM=0;
        this.spatiuStocare=0;
        this.placaVideo=null;
    }
    public Desktop(String model,Double pret,String brand,Double review,Integer stoc,
            String culoare,String procesor, Integer RAM,Integer spatiuStocare,
            String placaVideo){
        super(model,pret,brand,review,stoc);
        this.culoare=culoare;
        this.procesor=procesor;
        this.RAM=RAM;
        this.spatiuStocare=spatiuStocare;
        this.placaVideo=placaVideo;
    }
    public Desktop(Desktop desktop)
    {
        super(desktop);
        this.culoare=desktop.culoare;
        this.procesor=desktop.procesor;
        this.RAM=desktop.RAM;
        this.spatiuStocare=desktop.spatiuStocare;
        this.placaVideo=desktop.placaVideo;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nCuloare: "+this.culoare+"\nProcesor: "+this.procesor+"GHz"+"\nRAM: "+
                this.RAM+"\nSpatiu Stocare: "+this.spatiuStocare+"GB"+"\nPlaca video: "+this.placaVideo;
    }
    @Override
    public void conectat(){
        System.out.println("Desktopul este conectat la WIFI");
    }
    @Override
    public void deconectat(){
        System.out.println("Desktopul s-a deconectat la WIFI");
    }
    
    
     public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getSpatiuStocare() {
        return spatiuStocare;
    }

    public void setSpatiuStocare(Integer spatiuStocare) {
        this.spatiuStocare = spatiuStocare;
    }

}
