/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.magazin;

/**
 *
 * @author sc320
 */
public class Tableta extends Electronice {
    String rezolutie_tableta;
    Integer RAM_tableta;
    Integer memorie_tableta;
    String SO_tableta;
    boolean g5_tableta;
    String conectivitate_tableta;
    Integer diagonala_tableta;
    public Tableta()
    {
        super();
        this.RAM_tableta=6;
        this.SO_tableta="Android";
        this.memorie_tableta=128;
        this.g5_tableta=false;
        this.conectivitate_tableta="SIM";
        this.rezolutie_tableta="1920 X 1200";
        this.diagonala_tableta=10;
    
    }
    public Tableta(String model,Double pret,String brand,Double review,Integer stoc,String rezolutie_tableta,Integer RAM_tableta,Integer memorie_tableta,String SO_tableta,boolean g5_tableta,String conectivitate_tableta,Integer diagonala_tableta){
        super(model,pret,brand,review,stoc);
        this.RAM_tableta=RAM_tableta;
        this.SO_tableta=SO_tableta;
        this.memorie_tableta=memorie_tableta;
        this.g5_tableta=g5_tableta;
        this.conectivitate_tableta=conectivitate_tableta;
        this.rezolutie_tableta=rezolutie_tableta;
        this.diagonala_tableta=diagonala_tableta;
    
    }
     public Tableta(Tableta tableta){
        super(tableta);
        this.RAM_tableta=RAM_tableta;
        this.SO_tableta=SO_tableta;
        this.memorie_tableta=memorie_tableta;
        this.g5_tableta=g5_tableta;
        this.conectivitate_tableta=conectivitate_tableta;
        this.rezolutie_tableta=rezolutie_tableta;
        this.diagonala_tableta=diagonala_tableta;
    
    }
    @Override
    public String ToString(){
        return super.toString()+ "Conectivitate: " + conectivitate_tableta + "\nRAM: " + RAM_tableta + "\nmemorie: " + memorie_tableta + "\nSO: " + SO_tableta + "\n5G: " + g5_tableta + "\nrezolutie" + rezolutie_tableta + "\ndiagonala" + diagonala_tableta;
    }
    public String getRezolutie() {
        return rezolutie_tableta;
    }

    public Integer getRAM() {
        return RAM_tableta;
    }

    public Integer getMemorie() {
        return memorie_tableta;
    }

    public String getSO() {
        return SO_tableta;
    }

    public boolean isG5() {   
        return g5_tableta;
    }

    public String getConectivitate() {
        return conectivitate_tableta;
    }

    public Integer getDiagonala() {
        return diagonala_tableta;
    }

    
    public void setRezolutie(String rezolutie) {
        this.rezolutie_tableta = rezolutie_tableta;
    }

    public void setRAM(Integer RAM) {
        this.RAM_tableta = RAM_tableta;
    }

    public void setMemorie(Integer memorie) {
        this.memorie_tableta = memorie_tableta;
    }

    public void setSO(String SO) {
        this.SO_tableta = SO_tableta;
    }

    public void setG5(boolean g5) {
        this.g5_tableta = g5_tableta;
    }

    public void setConectivitate(String conectivitate) {
        this.conectivitate_tableta = conectivitate_tableta;
    }

    public void setDiagonala(Integer diagonala) {
        this.diagonala_tableta = diagonala_tableta;
    }

}
