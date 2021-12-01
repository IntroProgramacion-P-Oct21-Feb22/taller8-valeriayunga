/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaFinal ="";
        String nombre; 
        String apellido;
        String salida;
        String alcanza_falta="";
        boolean bandera = true;
        double sueldo_semanal;
        int numero_hijos = 3;
        double gasto_hijo1;
        double gasto_hijo2;
        double gasto_hijo3;
        double acumulador = 0;
        
        do{
        System.out.println("Ingrese los nombres del padre de familia");
            nombre = entrada.nextLine();
        
         System.out.println("Ingrese los apellidos del padre de familia");
            apellido = entrada.nextLine();
        
        System.out.println("Ingrese el sueldo semanal del padre de "
                + "familia");
            sueldo_semanal = entrada.nextDouble();
            
        System.out.println("Ingrese los gastos semanales del primer hijo ");
            gasto_hijo1 = entrada.nextDouble();
         
        System.out.println("Ingrese los gastos semanales del segundo hijo ");
            gasto_hijo2 = entrada.nextDouble();
         
        System.out.println("Ingrese los gastos semanales del tercer hijo ");
            gasto_hijo3 = entrada.nextDouble();
         
        acumulador = acumulador + gasto_hijo1 + gasto_hijo2 + gasto_hijo3;
        
        if (acumulador < sueldo_semanal ){
            alcanza_falta = "le alcanza el dinero";
        }else{
            if (acumulador > sueldo_semanal ){
            alcanza_falta = "le fata el dinero";
                
            }
        }
        cadenaFinal = String.format("%sNombre de Padre de Familia: %s %s "
                + "Sueldo Semanal: %.2f Número de Hijos: %d\n\nReporte de "
                + "Gastos\n\n\tHijo 1, gasto semanal: %.2f\n\tHijo 2, gasto"
                + " semanal: %.2f\n\tHijo 1, gasto semanal: %.2f\n\nGasto "
                + "total en hijos: %.2f\n\nAl padre de familia %s %s %s \n\n"
                , cadenaFinal,apellido,nombre,sueldo_semanal,numero_hijos,
                gasto_hijo1,gasto_hijo2,gasto_hijo3, acumulador,apellido, 
                nombre, alcanza_falta);
        
        entrada.nextLine();
        System.out.println("Ingrese (s),(si),"
                    + " (yes)o (y) si desea salir del ciclo ");
            salida = entrada.nextLine();

            if (salida.equals("s")||salida.equals("si")||salida.equals("yes")
                    ||salida.equals("y"))
            {
                bandera = false;
            }
        
         } while (bandera); // (bandera==true)
       
        
        System.out.printf("\n\nReporte Gastos de Padres de Familia\n\n" +
         "%s", cadenaFinal);
        
        
        

    }
    
}
