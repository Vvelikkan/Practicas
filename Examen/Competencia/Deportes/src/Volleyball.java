public class Volleyball extends Conjunto {
    private String observaciones;

    // Constructor por defecto
    public Volleyball() {
        super();
    }

    // Constructor con parámetros
    public Volleyball(String observaciones, String disciplina, String rama, String categoria, String sede, String etapa, String fecha, String hora,
                      String ganador, String segundoLugar, String tercerLugar) {
        super(disciplina, rama, categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar);
        this.observaciones = observaciones;
    }

    // Getters y Setters para el atributo observaciones
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
