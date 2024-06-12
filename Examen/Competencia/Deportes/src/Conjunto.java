public class Conjunto extends Competencia{
    public Conjunto(){

    }
    public Conjunto(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador,
     String segundoLugar, String tercerLugar){
        super(disciplina, rama, Categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar);
        //esta clase y la que heredan de esta  simplemente los atributos de la clase competencia por lo tanto contienen los mismos metodos
}
}