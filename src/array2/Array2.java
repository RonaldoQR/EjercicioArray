/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

/**
 *
 * @author earth
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] listaNumeros = {11,4,7,8,9,16,19,3};
        //System.err.println("NUMEROS PARES");
        int cp=0;
        int ci=0;
        int sp=0;
        int si=0;        
        int cont=0;      
        int mp=0;
        int menorimpar=0;
        menorimpar=listaNumeros[0];
        mp=listaNumeros[0];
        
        for (int i=0; i<listaNumeros.length; i++){
            //System.out.println("Número "+listaNumeros[i]);                      
                if(listaNumeros[i]%2==0){
                    //NRepetido=true;  
                    cp= cp+1;
                    sp= sp+listaNumeros[i];
                    //System.out.println("El número "+listaNumeros[i]+ " es par.");                                    
                }
                else{
                    ci= ci+1;
                    si= si+listaNumeros[i];
                    //System.out.println("El número "+listaNumeros[i]+ " es impar.");
                }             
        }
        
        System.out.println("Cantidad de números pares: "+cp);
        System.out.println("Cantidad de números impares: "+ci);
        System.out.println("Suma de números pares: "+sp);
        System.out.println("Suma de números impares: "+si);
        
        //PAR MAYOR
        for(int i=0; i<listaNumeros.length; i++){
//          System.out.println(nombres[i] + " " + sueldos[i]);
            if(listaNumeros[i]>mp && listaNumeros[i]%2==0){ // 
                mp = listaNumeros[i];                
            }
            else if(listaNumeros[i]<menorimpar && listaNumeros[i]%2!=0){
                menorimpar=listaNumeros[i];
            }
        }
        
        
        //PRIMOS
        for (int i=0; i<listaNumeros.length; i++){
            if(numPrimo(listaNumeros[i])){              
                cont++;
            }       
        }  
        //Rpta CANT. NUMEROS PRIMOS
        System.out.printf("Cantidad de números primos: "+ cont+"\n");
        //Rpta MAYOR PAR Y MENOR IMPAR
        System.out.println("El mayor número par es: "+mp);
        System.out.println("El menor número impar es: "+menorimpar);
    }
    
    
    //PRIMOS
    private static boolean numPrimo(int num){
        boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<=Math.sqrt(num)){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
}
