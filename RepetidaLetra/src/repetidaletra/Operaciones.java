/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetidaletra;

import java.util.Scanner;

/**
 *
 * @author ivan camilo
 */
public class Operaciones {
   

    public Operaciones() {
        inicio();
        
    }
        private void inicio() {
      String oracion =ingresar();
        validar(oracion);
       
    }

    public String ingresar (){
        String oracion ;
        System.out.println("Diguite su frase ");
        Scanner entrada = new Scanner(System.in);
        oracion = entrada.nextLine();
        System.out.println("Su frase es:  "+oracion);  
        return  oracion;
}
    public void validar(String oracion){
     
        int contador=0;
        int [] guardarLetra=new int [oracion.length()];
        for(int i=0;i<oracion.length();i++){
            guardarLetra[i]=0;      
        }
        String sub;
        for (int i = 0; i<oracion.length(); ++i){
          sub=oracion.substring(0,(i+1));
            System.out.println("esta leyendo: "+sub.charAt(i));
          for(int j=0;j<sub.length();j++){
              for(int k=0;k<sub.length();k++){
                  if(sub.charAt(j)==sub.charAt(k)){
                     contador++; 
                  }
              }
             guardarLetra[j]= contador;
             contador=0;
          }
       validar2(i,guardarLetra,sub);
    }
}

    private void validar2(int i,int guardarLetra[],String sub) {
       boolean bandera= false;
          for(int l=0;l<=i;l++){
              if(guardarLetra[l]==1){
                  System.out.println("la que no se repite es: "+sub.charAt(l));
                  bandera=true; 
                  break;
              }
          }
          if(bandera==false){
              System.out.println("no hay ninguna que no se repita");
          }
    }

}
