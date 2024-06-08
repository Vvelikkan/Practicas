package competencia;

public class Atletismo extends Individual {
    // Atributos específicos
    private String prueba;
    private String juezArbitro;
    private String juezArbitroSalida;
    private String juezLlegada;
    private String[] juecesAuxiliares;
    private String[] cronometrajes;
    private int hits;

    // Constructor
    public Atletismo(String sede, String rama, String categoria, String etapa, String fecha, String hora, 
                     String recordMundial, String recordPanamericano, String ganador, 
                     String segundoLugar, String tercerLugar, String observaciones, String prueba, 
                     String juezArbitro, String juezArbitroSalida, String juezLlegada, 
                     String[] juecesAuxiliares, String[] cronometrajes, int hits) {
        super(sede, rama, categoria, etapa, fecha, hora, recordMundial, recordPanamericano, ganador, 
              segundoLugar, tercerLugar, observaciones);
        this.prueba = prueba;
        this.juezArbitro = juezArbitro;
        this.juezArbitroSalida = juezArbitroSalida;
        this.juezLlegada = juezLlegada;
        this.juecesAuxiliares = juecesAuxiliares;
        this.cronometrajes = cronometrajes;
        this.hits = hits;
    }

    // Métodos específicos
    public void setDatosPrueba() {
        // Implementación específica para Atletismo
    }

    public void getResultadosFinales() {
        // Implementación específica para Atletismo
    }

    // Getters y Setters específicos
    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getJuezArbitro() {
        return juezArbitro;
    }

    public void setJuezArbitro(String juezArbitro) {
        this.juezArbitro = juezArbitro;
    }

    public String getJuezArbitroSalida() {
        return juezArbitroSalida;
    }

    public void setJuezArbitroSalida(String juezArbitroSalida) {
        this.juezArbitroSalida = juezArbitroSalida;
    }

    public String getJuezLlegada() {
        return juezLlegada;
    }

    public void setJuezLlegada(String juezLlegada) {
        this.juezLlegada = juezLlegada;
    }

    public String[] getJuecesAuxiliares() {
        return juecesAuxiliares;
    }

    public void setJuecesAuxiliares(String[] juecesAuxiliares) {
        this.juecesAuxiliares = juecesAuxiliares;
    }

    public String[] getCronometrajes() {
        return cronometrajes;
    }

    public void setCronometrajes(String[] cronometrajes) {
        this.cronometrajes = cronometrajes;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}
