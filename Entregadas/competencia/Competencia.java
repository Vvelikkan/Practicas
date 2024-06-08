package competencia;

public abstract class Competencia {
    // Atributos comunes
    protected String sede;
    protected String rama;
    protected String categoria;
    protected String etapa;
    protected String fecha;
    protected String hora;
    protected String ganador;
    protected String segundoLugar;
    protected String tercerLugar;
    protected String observaciones;

    // Constructor
    public Competencia(String sede, String rama, String categoria, String etapa, String fecha, String hora, 
                       String ganador, String segundoLugar, String tercerLugar, String observaciones) {
        this.sede = sede;
        this.rama = rama;
        this.categoria = categoria;
        this.etapa = etapa;
        this.fecha = fecha;
        this.hora = hora;
        this.ganador = ganador;
        this.segundoLugar = segundoLugar;
        this.tercerLugar = tercerLugar;
        this.observaciones = observaciones;
    }

    // Métodos en común
    public abstract void setDatosPrueba();
    public abstract void getResultadosFinales();

    // Getters y Setters
    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getSegundoLugar() {
        return segundoLugar;
    }

    public void setSegundoLugar(String segundoLugar) {
        this.segundoLugar = segundoLugar;
    }

    public String getTercerLugar() {
        return tercerLugar;
    }

    public void setTercerLugar(String tercerLugar) {
        this.tercerLugar = tercerLugar;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}