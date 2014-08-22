
package postfix2;
import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Postfix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion2 =0, cont =0;
        //pedimos expresion 
        String archivo = JOptionPane.showInputDialog ("Ingrese la expresion POSTFIX");
        
        //nuevo objeto factory para hacer seleccion
        Factory f1 = new Factory ();
        boolean salir = false;
        
        while (salir == false){
            //primer menu, tipo de ejecucion
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "*****CALCULADORA POSTFIX*****" + "\n"
                    +"Seleccione mettodo:" + "\n"
                    +"1) ArrayLists" + "\n" 
                    +"2) Vectores" + "\n" 
                    +"3) Listas" + "\n" 
                    +"4) Salir del programa" + "\n"
                    +"Ingrese el numero de opcion:"));
            //mientras no elija salir o listras
            if (opcion != 4 && opcion != 3){
                //ejecutamos factory
                f1.seleccionTipo(archivo, opcion);
            }
            //si eligio salir mostramos segundo menu, tipo de lista a utilizar
            if (opcion != 4 && opcion == 3){
             opcion2 = Integer.parseInt (JOptionPane.showInputDialog (
                     "Elija tipo de lista a utilizar" + "\n"
                     +"1) Simplemente Encadenada" + "\n"
                     +"2) Doblemente Encadenada" + "\n"
                     +"3) Circula"));
            }
            if (opcion2 < 3 && opcion2 > 1) {
              //ejecutamos factory
              f1.seleccionTipoLista(archivo, opcion2);
            }
            //si elije salir
            else{
                salir =true;
            }
        }
    }//fin de main
}//fin de clase
    
