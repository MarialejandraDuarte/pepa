

package maria_duarte_java_iii;


public class Maria_Duarte_JAVA_III {

   
    public static void main(String[] args) {
     
        Diputado d1= new Diputado("Jose", "Parra", 24  , "Valencia ", "Secretario");
        Diputado d2= new Diputado("Vanessa ", "Cruz", 23  , "Valencia ", "Presidente");
        Diputado d3= new Diputado("Ander", "Montero", 26  , "Maracay ", "Segundo Vicepresidente");
        Senador s1= new Senador("Junior", "Garcia", 24  , "Maracaibo ", "Senador");
        Senador s2= new Senador("Hector", "Cese", 27  , "Caracas ", "Senador");
        Senador s3= new Senador("Rafael", "Peña", 24  , "Merida ", "Senador");
        d1.getCamaraEnQueTrabaja();
        d1.mProvinciaRepresenta();
        d2.getCamaraEnQueTrabaja();
        d2.mProvinciaRepresenta();
        d3.getCamaraEnQueTrabaja();
        d3.mProvinciaRepresenta();
        s1.getCamaraEnQueTrabaja();
        s1.mProvinciaRepresenta();
        s2.getCamaraEnQueTrabaja();
        s2.mProvinciaRepresenta();
        s3.getCamaraEnQueTrabaja();
        s3.mProvinciaRepresenta();
    
        
    
    }
    
}
