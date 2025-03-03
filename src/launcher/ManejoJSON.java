/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launcher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Sergio Tark
 */

   

public class ManejoJSON {

    // Ruta del archivo JSON
    private static final String JSON_FILE_PATH = "src/Launcher/contenido.json";

    // Método para leer el archivo JSON y convertirlo en un String
    public static StringBuilder LeerJSON() {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb;
        } catch (IOException e) {
            e.printStackTrace();
            return sb;
        }
    }

    // Método para obtener el nombre del escudo dado su índice
    public static String NombreEscudo(int indexEscudo) {
        try {
            JSONObject escudo = new JSONObject(LeerJSON().toString())
                                .getJSONArray("escudos")
                                .getJSONObject(indexEscudo);
            

            return escudo.getString("Nombre");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índice fuera de rango";
        }
    }

    // Método para obtener el título de un simulador dado el índice del escudo y el simulador
    public static String TituloSimulador(int indexEscudo, int indexSimulador) {
        try {
           JSONObject simulador = new JSONObject(LeerJSON().toString())
                                  .getJSONArray("escudos")
                                  .getJSONObject(indexEscudo)
                                  .getJSONArray("Simuladores")
                                  .getJSONObject(indexSimulador);
                   
           

            return simulador.getString("Titulo");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índices fuera de rango";
        }
    }

    // Método para obtener una imagen específica de un simulador
    public static String ImagenSimulador(int indexEscudo, int indexSimulador) {
        try {
            JSONObject imagenes = new JSONObject(LeerJSON().toString())
                                  .getJSONArray("escudos")
                                  .getJSONObject(indexEscudo)
                                  .getJSONArray("Simuladores")
                                  .getJSONObject(indexSimulador);
                                  
                                  
                                  

            return imagenes.getString("Imagen");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índices fuera de rango";
        }
    }
    
    //Metodo para obtner una miniautura especifica
    
    public static String MiniaturaSimulador(int indexEscudo, int indexSimulador ) {
        try {
            JSONObject miniatura = new JSONObject(LeerJSON().toString())
                                  .getJSONArray("escudos")
                                  .getJSONObject(indexEscudo)
                                  .getJSONArray("Simuladores")
                                  .getJSONObject(indexSimulador);
                                  
                                  
                                  

            return miniatura.getString("Miniautura");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índices fuera de rango";
        }
       
    }
    
    //Metodo para obtener el titulo del simulador
    public static String TituloGeneralSimulador (int indexEscudo, int indexSimulador){
        try {
            
            JSONObject simulador = new JSONObject(LeerJSON().toString())
                                   .getJSONArray("escudos")
                                   .getJSONObject(indexEscudo)
                                   .getJSONArray("Simuladores")
                                   .getJSONObject(indexSimulador);
               return simulador.getString("Titulo");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índices fuera de rango";
        }
        
        
        
        }
    //Metodo para obtener la descripcion del simulador 
     public static String DescripcionSimulador (int indexEscudo, int indexSimulador){
        try {
            
            JSONObject simulador = new JSONObject(LeerJSON().toString())
                                   .getJSONArray("escudos")
                                   .getJSONObject(indexEscudo)
                                   .getJSONArray("Simuladores")
                                   .getJSONObject(indexSimulador);
               return simulador.getString("Descripcion");
        } catch (JSONException e) {
            return "Error al leer el archivo JSON o índices fuera de rango";
        }
        
        
        
        }
    
    
    
    
    
    }
    
    
    
    
    
    
    
   
    
    
    



   

   
    
    

