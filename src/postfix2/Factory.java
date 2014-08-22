
package postfix2;
import javax.swing.*;
/**
 *
 * @author Javier
 */

public class Factory {
    int largo =0;
    public Factory (){
        
    }
    
    public void seleccionTipo (String  valor, int opcion ){
        //para arraylist
        if (opcion == 1){
            largo = valor.length()-1;
            PilaArray p1 = new PilaArray (valor.length());
            for (int i=largo; i>-1; i--){
                p1.push(valor.charAt(i));
            }
            JOptionPane.showMessageDialog (null,"Resultado "+p1.realizarOp());
        }
        //para verctor
        if (opcion == 2){
            largo = valor.length()-1;
            PilaVector v1 = new PilaVector (valor.length());
            for (int i = largo; i>-1; i--){
                v1.push(valor.charAt(i));
            }
            JOptionPane.showMessageDialog (null,"Resultado "+ v1.realizarOp());
            
        }
        
    }
    //para lista
    public void seleccionTipoLista (String  valor, int opcion2){
        //simple
        if (opcion2 == 1){
            
        }
        //doble
        if (opcion2 == 2){
            
        }
        //circular
        if (opcion2 == 3){
            
        }
    }
    
}//fin de la clase
