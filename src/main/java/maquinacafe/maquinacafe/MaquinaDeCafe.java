package maquinacafe.maquinacafe;

public class MaquinaDeCafe {
    
    private Cafetera cafe;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    private Azucarero azucar;
    
    public Cafetera getCafetera() { return cafe; }
    public void setCafetera(Cafetera cafe) { this.cafe = cafe; }
    
    public Vaso getVasosPequeno() { return vasosPequeno; }
    public void setVasosPequeno(Vaso vasosPequeno) { this.vasosPequeno = vasosPequeno; }
    
    public Vaso getVasosMediano() { return vasosMediano; }
    public void setVasosMediano(Vaso vasosMediano) { this.vasosMediano = vasosMediano; }
    
    public Vaso getVasosGrande() { return vasosGrande; }
    public void setVasosGrande(Vaso vasosGrande) { this.vasosGrande = vasosGrande; }
    
    public Azucarero getAzucarero() { return azucar; }
    public void setAzucarero(Azucarero azucar) { this.azucar = azucar; }
    
    public Vaso getTipoDeVaso(String tipo) {
        if (tipo.equals("pequeno")) return vasosPequeno;
        else if (tipo.equals("mediano")) return vasosMediano;
        else return vasosGrande;
    }
    
    public String getVasoDeCafe(Vaso vaso, int cantidadVasos, int cantidadAzucar) {
        if (!vaso.hasVasos(cantidadVasos)) return "No hay Vasos";
        if (!cafe.hasCafe(vaso.getContenido())) return "No hay Cafe";
        if (!azucar.hasAzucar(cantidadAzucar)) return "No hay Azucar";
        
        vaso.giveVasos(cantidadVasos);
        cafe.giveCafe(vaso.getContenido());
        azucar.giveAzucar(cantidadAzucar);
        
        return "Completado";
    }
}