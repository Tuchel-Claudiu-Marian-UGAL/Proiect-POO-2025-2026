public class Telefon extends Electronice {
    String rezolutie_telefon;
    Integer RAM_telefon;
    Integer memorie_telefon;
    String SO_telefon;
    boolean g5_telefon;
    String conectivitate_telefon;
    Integer diagonala_telefon;
    String TipDisplay_telefon;
    public Telefon()
    {
        super();
        this.RAM_telefon=6;
        this.SO_telefon="Android";
        this.memorie_telefon=128;
        this.g5_telefon=false;
        this.conectivitate_telefon="SIM";
        this.rezolutie_telefon="1920 X 1200";
        this.diagonala_telefon=10;
        this.TipDisplay_telefon="Oled";
    
    }
    public Telefon(String model,Double pret,String brand,Double review,Integer stoc,String rezolutie_telefon,Integer RAM_telefon,Integer memorie_telefon,String SO_telefon,boolean g5_telefon,String conectivitate_telefon,Integer diagonala_telefon,String TipDisplay_telefon){
        super(model,pret,brand,review,stoc);
        this.RAM_telefon=RAM_telefon;
        this.SO_telefon=SO_telefon;
        this.memorie_telefon=memorie_telefon;
        this.g5_telefon=g5_telefon;
        this.conectivitate_telefon=conectivitate_telefon;
        this.rezolutie_telefon=rezolutie_telefon;
        this.diagonala_telefon=diagonala_telefon;
        this.TipDisplay_telefon=TipDisplay_telefon;
    }
    public Telefon(Telefon telefon){
        super(telefon);
        this.RAM_telefon=RAM_telefon;
        this.SO_telefon=SO_telefon;
        this.memorie_telefon=memorie_telefon;
        this.g5_telefon=g5_telefon;
        this.conectivitate_telefon=conectivitate_telefon;
        this.rezolutie_telefon=rezolutie_telefon;
        this.diagonala_telefon=diagonala_telefon;
        this.TipDisplay_telefon=TipDisplay_telefon;
    
    }
    @Override
    public String toString(){
        return super.toString()+ "\nConectivitate: " + conectivitate_telefon + "\nRAM: " + RAM_telefon + "\nmemorie: " + memorie_telefon + "\nSO: " + SO_telefon + "\n5G: " + g5_telefon + "\nrezolutie " + rezolutie_telefon + "\ndiagonala " + diagonala_telefon + "\n Tip Display " + TipDisplay_telefon;
    }
    public String getRezolutie() {
        return rezolutie_telefon;
    }

    public Integer getRAM() {
        return RAM_telefon;
    }

    public Integer getMemorie() {
        return memorie_telefon;
    }

    public String getSO() {
        return SO_telefon;
    }

    public boolean isG5() {   
        return g5_telefon;
    }

    public String getConectivitate() {
        return conectivitate_telefon;
    }
    public String getTipDisplay() {
        return TipDisplay_telefon;
    }

    public Integer getDiagonala() {
        return diagonala_telefon;
    }

    
    public void setRezolutie(String rezolutie) {
        this.rezolutie_telefon = rezolutie_telefon;
    }

    public void setRAM(Integer RAM) {
        this.RAM_telefon = RAM_telefon;
    }

    public void setMemorie(Integer memorie) {
        this.memorie_telefon = memorie_telefon;
    }

    public void setSO(String SO) {
        this.SO_telefon = SO_telefon;
    }

    public void setG5(boolean g5) {
        this.g5_telefon = g5_telefon;
    }

    public void setConectivitate(String conectivitate) {
        this.conectivitate_telefon = conectivitate_telefon;
    }

    public void setDiagonala(Integer diagonala) {
        this.diagonala_telefon = diagonala_telefon;
    }
    public void setTipDisplay(String TipDisplay) {
        this.TipDisplay_telefon = TipDisplay_telefon;
    }

}
