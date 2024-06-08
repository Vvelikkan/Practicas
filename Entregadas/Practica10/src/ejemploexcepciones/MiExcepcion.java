package Practica10.src.ejemploexcepciones;

public class MiExcepcion extends Exception {
    // Constructor con parámetro
    public MiExcepcion(String cadena) {
        super(cadena); // Llama al constructor de Exception con un mensaje
    }
}
