
package postfix2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author Adolfo
 */
public class DataManager {
    private int[] arregloEnteros;
    
//Declaro e instancio un arreglo de tipo entero
    ArrayList<Integer> numeros = new ArrayList<Integer>();
   
    public DataManager() {
    }
    
    //Método encargado de generar números de manera aleatoria para llenar el arreglo
    //Se generarán 2000 números aleatorios
    public  void generarDatos() throws FileNotFoundException{
        /*Se declara e instancia un objeto de tipo PrintWriter quien tiene como objetivo
          el crear un archivo de extensión .txt que nosotros definimos.
          Que tiene como fin almacenar 2000 números creados aleatoriamente */
        PrintWriter writer = new PrintWriter("Datos.txt");
        
        /*Ciclo encargado de generar los numeros aleatorios que los mete al arraylist */
        for(int i = 0; i < 2000; i++){
            Random random = new Random();
            int num = random.nextInt(1999) + 1;
            numeros.add(num); 
         }
        
        /*Ciclo que lee cada posición del arrayList que es un número, y automáticamente 
          lo va metiendo al archivo de texto y separa un número del otro con un espacio*/
        for(int i=0; i<numeros.size();i++){
            writer.print(numeros.get(i));
            writer.print(" ");

        }
        
        /*Termino de editar el archivo de texto y cierro el PrintWriter*/
        writer.close();
    }
    
    public int[] generarArregloEnteros(String path){
        //declaro un arregloList que me sirve para generar un arreglo de enteros
        ArrayList<Integer> arregloArchivo = new ArrayList<Integer>();
        //Variables que llevan el control de la lectura de archivo
        String arregloS = null;
        String linea = null;
        
        //fr es mi objeto que abre el archivo en donde están los números
        FileReader fr;
        BufferedReader br;
        
        try{
            //Abro el archivo en la ruta seleccionada
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
            //todo lo que está en el archivo .txt lo coloco en un String
            while((arregloS = br.readLine()) != null){
                linea = arregloS;
            }
            
        }catch(Exception e){
            System.out.println("Error en lectura de archivo");
            System.exit(0);
        }
        
        //Voy a separar los números por cada espacio vacío que encuentre
        StringTokenizer tokens = new StringTokenizer(linea, " ");
        
        //Comienzo a crear mi ArrayList con los números leídos
        while(tokens.hasMoreTokens()){
            String token = tokens.nextToken();
            arregloArchivo.add(Integer.parseInt(token));
        }
        
        System.out.println("El arreglo es de tamanho: " + arregloArchivo.size());
        
        //instancio el array de enteros del mismo tamaño que el arrayList
        arregloEnteros = new int[arregloArchivo.size()];
        
        //Paso todo lo del arrayList a mi arreglo de enteros
        for(int i = 0; i < arregloArchivo.size(); i++){
            arregloEnteros[i] = arregloArchivo.get(i);
        }
        //devuelvo el arreglo de números aleatorios
        return arregloEnteros;
    }

    public int[] getArregloEnteros() {
        return arregloEnteros;
    }
    
}
