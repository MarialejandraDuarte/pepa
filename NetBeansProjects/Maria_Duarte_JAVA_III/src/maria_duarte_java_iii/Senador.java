/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maria_duarte_java_iii;

/**
 *
 * @author pc
 */
public class Senador extends Legislador{
    
    public Senador(String nombre, String apellido, int edad, String ProvinciaQueRepresenta, String CamaraTrabajo) {
        super(nombre, apellido, edad, ProvinciaQueRepresenta, CamaraTrabajo);
    }
    @Override
    public void getCamaraEnQueTrabaja() {
        System.out.println("El Senador "+ Nombre + " " + Apellido + " trabaja en la camara de " + getCamaraTrabajo());
        
    }

    @Override
    public void mProvinciaRepresenta() {
         System.out.println("El Senador "+ Nombre + " " + Apellido + " representa la provincia de " + getProvinciaQueRepresenta());
    }
    
    
}
