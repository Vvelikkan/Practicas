public class Individual extends Competencia{
    //Variables
    String prueba;
    String tiempoGanador;
    String tiempo2doLugar;
    String tiempo3erLugar;
    String recordMundial;
    String recordPanamericano;
    String hits;

    //contructor sin parametros
    public Individual(){
        super();
    }

    //Constructor param
    public Individual(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador,
     String segundoLugar, String tercerLugar, String prueba, String tiempoGanador, String tiempo2doLugar, 
     String tiempo3erLugar, String recordMundial, String recordPanamericano, String hits){
        super(disciplina, rama, Categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar);
        this.prueba = prueba;
        this.tiempoGanador = tiempoGanador;
        this.tiempo2doLugar = tiempo2doLugar;
        this.tiempo3erLugar = tiempo3erLugar;
        this.recordMundial = recordMundial;
        this.recordPanamericano = recordPanamericano;
        this.hits = hits;
    }
    // set and get
    public String getPrueba(){
        return prueba;
    }   
    public void setPrueba(String prueba){
        this.prueba = prueba;
    }
    public String getTiempoGanador(){
        return tiempoGanador;
    }
    public void setTiempoGanador(String tiempoGanador){
        this.tiempoGanador = tiempoGanador;
    }
    public String getTiempo2doLugar(){
        return tiempo2doLugar;
    }
    public void setTiempo2doLugar(String tiempo2doLugar){
        this.tiempo2doLugar = tiempo2doLugar;
    }
    public String getTiempo3erLugar(){
        return tiempo3erLugar;
    }
    public void setTiempo3erLugar(String tiempo3erLugar){
        this.tiempo3erLugar = tiempo3erLugar;
    }
    public String getRecordMundial(){
        return recordMundial;
    }
    public void setRecordMundial(String recordMundial){
        this.recordMundial = recordMundial;
    }
    public String getRecordPanamericano(){
        return recordPanamericano;
    }
    public void setRecordPanamericano(String recordPanamericano){
        this.recordPanamericano = recordPanamericano;
    }
    public String getHits(){
        return hits;
    }
    public void setHits(String hits){
        this.hits = hits;
    }
    

    
}
