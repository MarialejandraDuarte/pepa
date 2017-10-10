
package maria_duarte_java_i;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Maria_Duarte_Java_I {

    public static void main(String[] args) {
        String Nombre, Apellido;
        int Edad;
        boolean b =true;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
        System.out.println("Introduzca su Nombre");
        Nombre=sc.next();
        System.out.println("Introduzca su Apellido");
        Apellido=sc.next();
        System.out.println("Introduzca su Edad");
        Edad=sc.nextInt();
        
        Imprimir_Datos(Nombre,Apellido,Edad,b);
           
        }  
    }


    public static void Imprimir_Datos(String nombre, String apellido, int edad,boolean b){
    File Personas= null;
    FileWriter fp = null;
    PrintWriter br= null;
    

    try {
        
        Personas= new File("Maria_Duarte_Java_I.txt");
        fp = new FileWriter(Personas, true);
        br = new PrintWriter(fp);
                
    
        br.println(nombre+" "+apellido+" "+edad+"\n");
        
    }   catch (IOException ex) {               
            Logger.getLogger(Maria_Duarte_Java_I.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (fp != null) {
                fp.close();
            }
            
        } catch (Exception e) {
        }
    }
}

