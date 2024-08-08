package arreglo;

/**
 *
 * @author Leonidas Ruiz Perez
 */
public class Arreglo {

    
    public static void main(String[] args) {
     
        //definimos el arreglo
        int[] numeros= new int[10];
      
      //Asignar valores a nuesttro arreglo
      numeros[0]=1;
      numeros[2]=2;
      numeros[3]=3;
      numeros[4]=4;
      numeros[5]=5;
      numeros[6]=6;
      numeros[7]=7;
      numeros[8]=8;
      numeros[9]=9;
      numeros[10]=10;
      
      //imprimir los arreglos por consola
      for(int i=0; i<=10; i++){
          System.out.println(numeros[i]);
          
      }
    }
    
}
