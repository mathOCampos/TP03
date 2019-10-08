package tp03;

public class calcular {
    
    public Integer numero1;
    public Integer numero2;
    public String x;

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
    

    public calcular(String x) {
        this.x = x;
    }

    public calcular(Integer numero1) {
        this.numero1 = numero1;
    }
    
    public calcular(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public calcular(Integer numero1, Integer numero2, String x) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.x = x;
    }
    
    
    
    
    
}
