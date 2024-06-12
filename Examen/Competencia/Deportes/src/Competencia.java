public class Competencia{
    //atributos
    String disciplina;
    String rama;
    String Categoria;
    String sede;
    String etapa;
    String fecha;
    String hora;
    String ganador;
    String segundoLugar;
    String tercerLugar;


//metodos constructores
    public Competencia(){
      
    }   

   public Competencia(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador, 
   String segundoLugar, String tercerLugar){
        this.disciplina = disciplina;
        this.rama = rama;
        this.Categoria = Categoria;
        this.sede = sede;
        this.etapa = etapa;
        this.fecha = fecha;
        this.hora = hora;
        this.ganador = ganador;
        this.segundoLugar = segundoLugar;
        this.tercerLugar = tercerLugar;
//setter and getter
   }
    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getRama(){
        return rama;
    }
    public void setRama(String rama){
        this.rama = rama;
    }
    public String getCategoria(){
        return Categoria;
    }
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    public String getSede(){
        return sede;
    }
    public void setSede(String sede){
        this.sede = sede;
    }
    public String getEtapa(){
        return etapa;
    }
    public void setEtapa(String etapa){
        this.etapa = etapa;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getGanador(){
        return ganador;
    }
    public void setGanador(String ganador){
        this.ganador = ganador;
    }
    public String getSegundoLugar(){
        return segundoLugar;
    }

    public void setSegundoLugar(String segundoLugar){
        this.segundoLugar = segundoLugar;
    }
    public String getTercerLugar(){
        return tercerLugar;
    }
    public void setTercerLugar(String tercerLugar){
        this.tercerLugar = tercerLugar;
    }


}