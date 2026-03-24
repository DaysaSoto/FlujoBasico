package maquinacafe.maquinacafe;

public class Azucarero {
    
    private int cantidadDeAzucar;
    
    public Azucarero(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }
    
    public int getCantidadAzucar() {
        return cantidadDeAzucar;
    }
    
    public void setCantidadDeAzucar(int cantidadDeAzucar) {
        this.cantidadDeAzucar = cantidadDeAzucar;
    }
    
    public boolean hasAzucar(int cantidad) {
        return this.cantidadDeAzucar >= cantidad;
    }
    
    public void giveAzucar(int cantidad) {
        this.cantidadDeAzucar -= cantidad;
    }
}