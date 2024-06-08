package competencia;

public class Futbol extends Conjunto {
    private String juezArbitro;
    private String juezArbitroSalida;
    private String juezLlegada;
    private String[] juecesAuxiliares;
    private String[] cronometrajes;
    private int hits;

    // Constructor
    public Futbol(String sede, String rama, String categoria, String etapa, String fecha, String hora,
                  String ganador, String segundoLugar, String tercerLugar, String observaciones,
                  String juezArbitro, String juezArbitroSalida) {
        super(sede, rama, categoria, etapa, fecha, hora, ganador, segundoLugar, tercerLugar, observaciones);
        this.juezArbitro = juezArbitro;
        this.juezArbitroSalida = juezArbitroSalida;
    }

    // Implementación de los métodos abstractos
    @Override
    public void setDatosPrueba() {
        // Lógica para establecer los datos de la prueba
    }

    @Override
    public void getResultadosFinales() {
        // Lógica para obtener los resultados finales
    }

    // Getters y Setters específicos de Futbol
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
