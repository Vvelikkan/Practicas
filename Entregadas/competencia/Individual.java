package competencia;

public abstract class Individual extends Competencia {
    // Atributos específicos para competencias individuales
    protected String recordMundial;
    protected String recordPanamericano;

    // Constructor
    public Individual(String sede, String rama, String categoria, String etapa, String fecha, String hora,
                      String ganador, String segundoLugar, String tercerLugar, String observaciones, 
                      String recordMundial, String recordPanamericano) {
        super(sede, rama, categoria, etapa, fecha, hora, ganador, segundoLugar, tercerLugar, observaciones);
        this.recordMundial = recordMundial;
        this.recordPanamericano = recordPanamericano;
    }

    // Getters y Setters específicos de Individual
    public String getRecordMundial() {
        return recordMundial;
    }

    public void setRecordMundial(String recordMundial) {
        this.recordMundial = recordMundial;
    }

    public String getRecordPanamericano() {
        return recordPanamericano;
    }

    public void setRecordPanamericano(String recordPanamericano) {
        this.recordPanamericano = recordPanamericano;
    }

    // Implementación de métodos abstractos de Competencia
    @Override
    public abstract void setDatosPrueba();

    @Override
    public abstract void getResultadosFinales();
}
