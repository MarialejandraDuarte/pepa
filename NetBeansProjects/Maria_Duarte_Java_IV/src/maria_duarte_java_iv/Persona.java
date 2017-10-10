/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maria_duarte_java_iv;

/**
 *
 * @author pc
 */
public class Persona extends Thread{
    private String Nombre;
    private String Mensaje;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
//Constructor
    public Persona(String Nombre, String Mensaje) {
        this.Nombre = Nombre;
        this.Mensaje = Mensaje;
    }
    
    public void Imprimir(){
        System.out.println("La persona "+ Nombre+" dice "+ Mensaje);
    }
    @Override
   public void run(){
   Imprimir();
   }
    
}
