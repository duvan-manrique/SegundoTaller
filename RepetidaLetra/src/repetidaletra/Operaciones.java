/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetidaletra;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ivan camilo
 */
public class Operaciones {
    int contador;

    public Operaciones() {
        ingresar();
        
    }
    
    public void ingresar (){
        String oracion ;
        System.out.println("Diguite su frase ");
        Scanner entrada = new Scanner(System.in);
        oracion = entrada.nextLine();
        System.out.println("Su frase es:  "+oracion);  
        Integer contador=0;
        boolean bandera= false;
        char [][] guardarLetra=new char [oracion.length()][2];
        for(int i=0;i<oracion.length();i++){
            guardarLetra[i][1]='0';
        }
        char[] aCaractere=oracion.toCharArray();
        String sub ="";
        for (int i = 0; i<oracion.length(); ++i){
          sub=oracion.substring(0,(i+1));
            System.out.println("esta leyendo: "+sub.charAt(i));
          for(int j=0;j<sub.length();j++){
              for(int k=0;k<sub.length();k++){
                  if(sub.charAt(j)==sub.charAt(k)){
                     contador++; 
                  }
              }
             
              guardarLetra[j][0]= sub.charAt(j);
              guardarLetra[j][1]= contador.toString().charAt(0);
               contador=0;
          }
          for(int l=0;l<=i;l++){
              if(guardarLetra[l][1]=='1'){
                  System.out.println("la que no se repite es: "+guardarLetra[l][0]);
                  bandera=true;
                  break;
              }
          }
          if(bandera==false){
              System.out.println("no hay ninguna que no se repita");
          }
        bandera= false;
        }

        
        
       
        
    }
    
}
