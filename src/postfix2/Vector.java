//clase para ejecutar operacion con vector
package postfix2;

/**
 *
 * @author Luis
 */
public class Vector<T> {
   private Object [] vector;

public Vector( int  tamaño) {
    vector= new Object [tamaño];
}
public void agregar(T valor, int puntero){
    vector[puntero]=valor;
}
public T getValor(int puntero){
    return (T) vector[puntero];
}
}
   