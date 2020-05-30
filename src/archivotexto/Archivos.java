package archivotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Mateo
 */
public class Archivos {
public void grabar(String cadena){
    try{
    FileWriter archivo=new FileWriter("Datos.txt", true);
    try(BufferedWriter almacen = new BufferedWriter(archivo)){
    almacen.write(cadena+"\n");
    almacen.close();
    }
    archivo.close();
    }catch(Exception ex){
        
    }
    }    
public ArrayList leer(){
    ArrayList<String> datos = new ArrayList<>();
    try{
        FileReader archivo = FileReader("Datos.txt"); 
        BufferedReader lectura = new BufferedReader (archivo);
        String cadena;
        while((cadena = lectura.readLine())!=null){
            datos.add(cadena);
        }
    }catch(Exception ex){
        return datos;
    }
    
}
}
