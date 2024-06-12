public class Atletismo extends Individual {
    //variables
    String oficialMayor;
    String juecesSalida[] = new String[2];
    String juecesNado[] = new String[3];
    String inspectoresVueltas[] = new String[2];
    //constructor sin param
    public Atletismo() {
    }
      
    //constructor con param
    public Atletismo(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador,
        String segundoLugar, String tercerLugar, String prueba, String tiempoGanador, String tiempo2doLugar,
        String tiempo3erLugar, String recordMundial, String recordPanamericano, String hits, String oficialMayor,
        String juecesSalida[], String juecesNado[], String inspectoresVueltas[]) {
        super(disciplina, rama, Categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar, prueba, tiempoGanador, 
        tiempo2doLugar, tiempo3erLugar, recordMundial, recordPanamericano, hits);
        this.oficialMayor = oficialMayor;
        this.juecesSalida = juecesSalida;
        this.juecesNado = juecesNado;
        this.inspectoresVueltas = inspectoresVueltas;
    }
    //set and get
    public String getOficialMayor() {
        return oficialMayor;
    }
    public void setOficialMayor(String oficialMayor) {
        this.oficialMayor = oficialMayor;
    }
    public String[] getJuecesSalida() {
        return juecesSalida;
    }
    public void setJuecesSalida(String[] juecesSalida) {
        this.juecesSalida = juecesSalida;
    }
    public String[] getJuecesNado() {
        return juecesNado;
    }
    public void setJuecesNado(String[] juecesNado) {
        this.juecesNado = juecesNado;
    }
    public String[] getInspectoresVueltas() {
        return inspectoresVueltas;
    }
    public void setInspectoresVueltas(String[] inspectoresVueltas) {
        this.inspectoresVueltas = inspectoresVueltas;
    }
    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }
    public String getPrueba() {
        return prueba;
    }

}
