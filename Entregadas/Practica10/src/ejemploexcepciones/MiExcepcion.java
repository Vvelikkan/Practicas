package ejemploexcepciones;
public class MiExcepcion extends Exception {
// Creo una excepción personalizada
MiExcepcion(){
super(); // constructor por defecto de Exception
}
MiExcepcion( String cadena ){
super( cadena ); // constructor con parametro de Exception
}
}
