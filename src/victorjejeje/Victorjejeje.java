/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorjejeje;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Victorjejeje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora IMC");
        //Paso.1Declaracion de varables (identificadores)
        double w, l, imc; 
        String eimc;
        //En la siguiente linea, le indico a Java que utilizzare un teclado
        Scanner keyboard =new Scanner (System.in);
        // Paso 2. Asignar valores a las variables.
        System.out.println("Introduce el peso");
        w=keyboard.nextDouble();
        System.out.println("Introduce la estartura");
        l=keyboard.nextDouble();
        //Paso 3. Resolver el problema.
        imc= w/ Math.pow(l,2);
        //3.1 Evaluamos IMC
        if(imc>25){
        eimc="Sobrepeso";
        }else if(imc<19){
                eimc="Desnutricion";
                }
        else {
          eimc="Normal";  
        }      
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso=" + w);
        System.out.println("Estatura=" + l);
        System.out.println("IMC="+imc);   
        System.out.println(eimc);
    
    
}
