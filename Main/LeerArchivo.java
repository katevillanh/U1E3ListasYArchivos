
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    
    
    public void Ordenar(){
        List <String> ListaOrdenada=new ArrayList<String>();
        ListaOrdenada.add("Las palabras del archivo estan ordenadas");
      String[] palabrasDeArchivo=null;
      String[] palabrasOriginales=null;
        
        //1 Código sacado de internet
     
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         File archivo= new File ("C:\\Users\\Kate Villanueva\\Desktop\\prueba.txt");
         FileReader fr = new FileReader (archivo);
         BufferedReader br = new BufferedReader(fr);
         //2 termina código de internet*/

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
            palabrasDeArchivo=linea.split(" "); ///acomodar en el codigo para que separe el archivo txt
         //System.out.println(palabrasDeArchivo);
         }
         
         for(String nombre:ListaOrdenada){
          palabrasOriginales=nombre.split(" ");
            // System.out.println(palabrasOriginales);
      }
         //mi codigo para imprimir bien la frase
         String[] Frase=new String[palabrasDeArchivo.length];
        // List <String> Frase=new ArrayList<String>();
         for(int i=0;i<palabrasOriginales.length;i++){
           for(int j=0;j<palabrasDeArchivo.length;j++){
             if(palabrasOriginales[i].equals(palabrasDeArchivo[j])){
                 //Frase.add(palabrasDeArchivo[j]);
                 Frase[i]=palabrasDeArchivo[j];
                 //System.out.println(Frase+" ");
             }else{
                // j++;
             }
         } 
         }for(int k=0;k<Frase.length;k++){
         System.out.print(Frase[k]+" ");
         } 
         
         //termina mi codigo para imprimir bien la frase
         
         /*/visualizar arreglos en consola
      for(int i=0;i<palabrasDeArchivo.length;i++){
          System.out.println(palabrasDeArchivo[i]);
      }
        System.out.println("**********");
        for(int i=0;i<palabrasOriginales.length;i++){
          System.out.println(palabrasOriginales[i]);
      }
      //Termina visualizar*/
         fr.close();
      }
      
     
      catch(Exception e){
          System.out.println(e);
      }
      
    }
}
