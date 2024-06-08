package competencia;

public class Natacion extends Individual {
    // Atributos específicos para natación
    private String estilo;
    private int distancia;

    // Constructor
    public Natacion(String sede, String rama, String categoria, String etapa, String fecha, String hora,
                    String recordMundial, String recordPanamericano, String ganador, 
                    String segundoLugar, String tercerLugar, String observaciones, 
                    String estilo, int distancia) {
        super(sede, rama, categoria, etapa, fecha, hora, recordMundial, recordPanamericano, ganador, 
              segundoLugar, tercerLugar, observaciones);
        this.estilo = estilo;
        this.distancia = distancia;
    }
    public void setDatosPrueba() {
        
    }
    public void getResultadosFinales() {
        
    }

    // Getters y Setters para los atributos específicos de natación
    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
