public class Electronice {
    private String model;
    private Double pret;
    private String brand;
    private Double review;
    private Integer stoc;

    public Electronice(){
        this.model=null;
        this.pret=0.0;
        this.brand=null;
        this.review=0.0;
        this.stoc=0;
    }
    public Electronice(String model,Double pret,String brand,Double review,Integer stoc){
        this.model=model;
        this.pret=pret;
        this.brand=brand;
        this.review=review;
        this.stoc=stoc;
    }
    public Electronice(Electronice electronice){
        this.model=electronice.model;
        this.pret=electronice.pret;
        this.brand=electronice.brand;
        this.review=electronice.review;
        this.stoc=electronice.stoc;
    }

    @Override
    public String toString(){
        return "Model: " + model+"\nPret: "+pret+"\nBrand: "+brand+"\nReview: "+review+"\nStoc: "+stoc;
    }
}