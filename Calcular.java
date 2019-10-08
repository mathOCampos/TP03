package tp03;

public class Calcular {

    public Calcular() {
        this.numero1 = null;
        this.numero2 = null;
        this.x  = null;
    }
    
    public Float numero1;
    public Float numero2;
    public String x;

    public Float getNumero1() {
        return numero1;
    }

    public void setNumero1(Float numero1) {
        this.numero1 = numero1;
    }

    public Float getNumero2() {
        return numero2;
    }

    public void setNumero2(Float numero2) {
        this.numero2 = numero2;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    

    public Calcular(String x) {
        this.x = x;
    }

    public Calcular(Float numero1) {
        this.numero1 = numero1;
    }
    
    public Calcular(Float numero1, Float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calcular(Float numero1, Float numero2, String x) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.x = x;
    }
    
    
    
    
    
}
