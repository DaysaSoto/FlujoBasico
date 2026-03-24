package maquinacafe.maquinacafe;

public class Cafetera {
    
    private int cantidadCafe;
    
    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
    
    public int getCantidadCafe() {
        return cantidadCafe;
    }
    
    public void setCantidadCafe(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
    
    public boolean hasCafe(int cantidad) {
        return this.cantidadCafe >= cantidad;
    }
    
    public void giveCafe(int cantidad) {
        this.cantidadCafe -= cantidad;
    }
}