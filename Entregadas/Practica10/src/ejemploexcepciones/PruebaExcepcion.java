package Practica10.src.ejemploexcepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PruebaExcepcion {
    public static void main(String[] args) {
        BufferedReader entrada = null;
        Lanzadora lanza = new Lanzadora();
        String linea;

        try {
            entrada = new BufferedReader(new FileReader("archivo.txt"));
            while ((linea = entrada.readLine()) != null) {
                int numero = Integer.parseInt(linea.trim());
                lanza.lanzaSiNegativo(numero);
            }
        } catch (MiExcepcion e) {
            System.out.println("Excepción presentada: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir el número: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Excepción presentada: " + e.getMessage());
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
}
