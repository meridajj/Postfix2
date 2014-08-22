//clase para utilizar en opcion vector, pila para vector
package postfix2;

/**
 *
 * @author Luis
 */

public class PilaVector<T> extends Pila{
    private Vector vector;
    private Vector valores;
    private int puntero;
    private int tamaño;
    private int canIngresados=0,contador,resultado,resulfinal;
    private char momentaneo;


public PilaVector( int tamaño) {
    this.tamaño=tamaño;
    vector= new Vector(tamaño);
    valores= new Vector (tamaño);
}    

//toma el valor en puntero
public T pop(){
    T val=(T) vector.getValor(puntero);
    vector.agregar(null, puntero);
    puntero=puntero+1;
    canIngresados=canIngresados-1;
    return  val; 
}
//ingresa los valores
public void push(Object valor){
   puntero= (tamaño-1)-canIngresados;
    System.out.println(puntero);
   vector.agregar(valor, puntero);
   canIngresados=canIngresados+1;
}
//convertri
public String toString(){
    for (int i=0;i<tamaño;i++){
        System.out.println(vector.getValor(i));
    }
        return "";
}
public int char2int(char caracter){
    int auxiliar =0;
    auxiliar = caracter-48;
    return auxiliar;
} 
public char int2char(int caracter){
    char auxiliar =0;
    auxiliar = (char) (caracter+48);
    return auxiliar;
} 
 public int verificarOp (){
    contador=0;
    momentaneo= (char) (Object) pop();
    while((momentaneo!='*')&&(momentaneo!='-')&&(momentaneo!='+')&&(momentaneo!='/')){
        if(momentaneo!=' '){
            valores.agregar(char2int(momentaneo),contador);
            contador=contador+1;
            }
        momentaneo= (char) (Object) pop(); 
    }
    resulfinal=identificarOp(valores,momentaneo);
    push(int2char(resulfinal));
    return resulfinal;
     
 }
 //verifica que oprecacion se debe de llevara cabo
  public int identificarOp(Vector valores, char valor){
     if(valor=='*'){
          resultado=1;
          for (int i=0;i<contador; i++){
              resultado= resultado* (int)valores.getValor(i);
          }
     }
     if(valor=='+'){
          resultado=0;
          for (int i=0;i<contador; i++){
              resultado= resultado+(int)valores.getValor(i);
          }
     }
     if(valor=='-'){
          resultado=(int)valores.getValor(0);
          for (int i=1;i<contador; i++){
              resultado= resultado-(int)valores.getValor(i);
          }
     }
     if(valor=='/'){
          resultado=(int)valores.getValor(0);
          for (int i=1;i<contador; i++){
              resultado= ((resultado)/((int)valores.getValor(i)));
          }
     }
     return resultado;
 }
 public int realizarOp(){
     while(vector.getValor(tamaño-2)!=null){
       resulfinal=  verificarOp(); 
     }
     return resulfinal;
 }
}
    

