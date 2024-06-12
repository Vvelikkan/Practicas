public class Natacion extends Individual {
    // Variables
    String juezarbitro;
    String juezarbitroSalida;
    String juezArbitroLlegada[] = new String[3];
    String juezAuxiliares[] = new String[2];
    String cronometradores[] = new String[2];
    String recordAnterior;

    // Constructores
    public Natacion() {
    }

    public Natacion(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador,
        String segundoLugar, String tercerLugar, String prueba, String tiempoGanador, String tiempo2doLugar,
        String tiempo3erLugar, String recordMundial, String recordPanamericano, String hits, String juezarbitro,
        String juezarbitroSalida, String juezArbitroLlegada[], String juezAuxiliares[], String cronometradores[], String recordAnterior) {
        super(disciplina, rama, Categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar, prueba, tiempoGanador, tiempo2doLugar, tiempo3erLugar, recordMundial, recordPanamericano, hits);
        this.juezarbitro = juezarbitro;
        this.juezarbitroSalida = juezarbitroSalida;
        this.juezArbitroLlegada = juezArbitroLlegada;
        this.juezAuxiliares = juezAuxiliares;
        this.cronometradores = cronometradores;
        this.recordAnterior = recordAnterior;
    }

    // Set and get methods
    public String getJuezarbitro() {
        return juezarbitro;
    }
    public void setJuezarbitro(String juezarbitro) {
        this.juezarbitro = juezarbitro;
    }
    public String getJuezarbitroSalida() {
        return juezarbitroSalida;
    }
    public void setJuezarbitroSalida(String juezarbitroSalida) {
        this.juezarbitroSalida = juezarbitroSalida;
    }
    public String[] getJuezArbitroLlegada() {
        return juezArbitroLlegada;
    }
    public void setJuezArbitroLlegada(String[] juezArbitroLlegada) {
        this.juezArbitroLlegada = juezArbitroLlegada;
    }
    public String[] getJuezAuxiliares() {
        return juezAuxiliares;
    }
    public void setJuezAuxiliares(String[] juezAuxiliares) {
        this.juezAuxiliares = juezAuxiliares;
    }
    public String[] getCronometradores() {
        return cronometradores;
    }
    public void setCronometradores(String[] cronometradores) {
        this.cronometradores = cronometradores;
    }

    public String getRecordAnterior() {
        return recordAnterior;
    }
    public void setRecordAnterior(String recordAnterior) {
        this.recordAnterior = recordAnterior;
    }

    // Método para actualizar y comparar el record panamericano
    public void actualizarRecordPanamericano() {
        if (Double.parseDouble(getTiempoGanador()) < Double.parseDouble(getRecordPanamericano())) {
            System.out.println("El ganador ha roto el record panamericano!");
            setRecordPanamericano(getTiempoGanador());
        } else {
            System.out.println("El ganador no ha roto el record panamericano.");
        }
    }
}

