package competencia;

public abstract class Conjunto extends Competencia {
    public Conjunto(String sede, String rama, String categoria, String etapa, String fecha, String hora,
                    String ganador, String segundoLugar, String tercerLugar, String observaciones) {
        super(sede, rama, categoria, etapa, fecha, hora, ganador, segundoLugar, tercerLugar, observaciones);
    }

    // Métodos específicos de competencias en conjunto pueden ser agregados aquí
}
