
package recorrido_matriz_espiral;


public class Recorrido_Matriz_Espiral {

    private static int i;
    private static int j;

  
    public static void main(String[] args) {
      int [][]M = new int [3][3];
        int t=0;
      
      for (i=0;i<3;i++){
          for  (j=0;j<3;j++){
              t++;
              M[i][j]=t;
          }
          
      }
      
      for (i=0;i<3;i++){
          
          for  (j=0;j<3;j++){
              System.out.print(M[i][j] + " ");
              
          }
          System.out.println(" ");
          
      
      }
      
      
      //RECORRIDO
      for (j=0;j<3;j++){
        i=0;
            System.out.print(M[i][j] + " ");
      }
      for (i=1;i<3;i++){
          j=2;
            System.out.print(M[i][j]+ " ");
           
}
      for (j=1;j>=0;j--){
        i=2;
            System.out.print(M[i][j]+ " ");
      }
      for (i=1;i>0;i--){
          j=0;
            System.out.print(M[i][j]+ " ");
      
    }
      for (j=1;j<2;j++){
        i=1;
            System.out.print(M[i][j]+ " ");
      
    
      }
    }
}

