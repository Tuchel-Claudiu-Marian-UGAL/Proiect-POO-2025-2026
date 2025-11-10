/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiectpoo;

/**
 *
 * @author Student
 */
public class Laptop extends Electronice{
    private String culoare;
    private String procesor;
    private Double frecventaMaxima;
    private Double diagonala;
    private Integer RAM;
    private Integer spatiuStocare;
    private boolean placaIntegrata;
    private boolean areOS;
    
    public Laptop(){
        this.culoare=null;
        this.procesor=null;
        this.frecventaMaxima=0.0;
        this.diagonala=0.0;
        this.RAM=0;
        this.spatiuStocare=0;
        this.placaIntegrata=false;
        this.areOS=false;
    }
    public Laptop(String model,Double pret,String brand,Double review,Integer stoc,
            String culoare,String procesor,Double frecventaMaxima,Double diagonala,
            Integer RAM,Integer spatiuStocare,boolean placaIntegrata,boolean areOS){
        super(model,pret,brand,review,stoc);
        this.culoare=culoare;
        this.procesor=procesor;
        this.frecventaMaxima=frecventaMaxima;
        this.diagonala=diagonala;
        this.RAM=RAM;
        this.spatiuStocare=spatiuStocare;
        this.placaIntegrata=placaIntegrata;
        this.areOS=areOS;
    }
    public Laptop(Laptop laptop)
    {
        super(laptop);
        this.culoare=laptop.culoare;
        this.procesor=laptop.procesor;
        this.frecventaMaxima=laptop.frecventaMaxima;
        this.diagonala=laptop.diagonala;
        this.RAM=laptop.RAM;
        this.spatiuStocare=laptop.spatiuStocare;
        this.placaIntegrata=laptop.placaIntegrata;
        this.areOS=laptop.areOS;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nCuloare: "+this.culoare+"\nProcesor: "+this.procesor+
                "\nFrecventa maxima: "+this.frecventaMaxima+"GHz"+"\nMarime diagonala: "+this.diagonala+"\nRAM: "+
                this.RAM+"\nSpatiu Stocare: "+this.spatiuStocare+"GB"+"\nPlaca integrata: "+this.placaIntegrata+"\nareOS: "+this.areOS;
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

    public Double getFrecventaMaxima() {
        return frecventaMaxima;
    }

    public void setFrecventaMaxima(Double frecventaMaxima) {
        this.frecventaMaxima = frecventaMaxima;
    }

    public Double getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(Double diagonala) {
        this.diagonala = diagonala;
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

    public boolean getPlacaIntegrata() {
        return placaIntegrata;
    }

    public void setPlacaIntegrata(boolean placaIntegrata) {
        this.placaIntegrata = placaIntegrata;
    }

    public boolean getAreOS() {
        return areOS;
    }

    public void setAreOS(boolean areOS) {
        this.areOS = areOS;
    }
}

