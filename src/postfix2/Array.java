//clase para ejecutar con arrays
package postfix2;
import java.util.Vector;
/**
 *
 * @author Luis
 */

public class Array<T> {
    private Vector vector1; 

 public Array(int tamaño) {
     vector1= new Vector(tamaño);
    }
 public void agregar(T valor, int puntero){
    vector1.insertElementAt(valor,puntero);
}
public T getValor(int puntero){
    return (T) vector1.elementAt(puntero);
}
    

}
