package Practica10.src.ejemploexcepciones;

public class Lanzadora {
    void lanzaSiNegativo(int param) throws MiExcepcion {
        if (param < 0) {
            throw new MiExcepcion("Numero negativo");
        }
    }
}
