
package maria_duarte_java_iii;


abstract class Legislador extends Persona{
    private String ProvinciaQueRepresenta;
    private String CamaraTrabajo;

    public Legislador(String nombre,String apellido, int edad, String ProvinciaQueRepresenta, String CamaraTrabajo) {
        super.Persona(nombre,apellido,edad);
        this.ProvinciaQueRepresenta = ProvinciaQueRepresenta;
        this.CamaraTrabajo = CamaraTrabajo;
        
    }

    public String getProvinciaQueRepresenta() {
        return ProvinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String ProvinciaQueRepresenta) {
        this.ProvinciaQueRepresenta = ProvinciaQueRepresenta;
    }

    public String getCamaraTrabajo() {
        return CamaraTrabajo;
    }

    public void setCamaraTrabajo(String CamaraTrabajo) {
        this.CamaraTrabajo = CamaraTrabajo;
    }
    
   public abstract void getCamaraEnQueTrabaja();
   public abstract void mProvinciaRepresenta();
   
    
    
    
    
    
}
