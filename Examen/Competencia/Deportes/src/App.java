public class App {
    public static void main(String[] args) throws Exception {

        Atletismo atletismo = new Atletismo("Atletismo", "Varonil", "Juvenil", "Estadio Olimpico",
                "Final", "01/01/2023", "09:00", "Carlos", "Miguel",
                "Jose", "100 metros planos", "11.00", "11.10", "11.20", "10.90", "10.80", "3", "Oficial Mayor", 
                new String[] {"Juez Carlos", "Juez Miguel"}, new String[] {"Juez 1", "Juez 2", "Juez 3"}, 
                new String[] {"Inspector 1", "Inspector 2"});

        Natacion natacion = new Natacion("Natacion", "Varonil", "Juvenil", "Alberca Olimpica", "Final", "01/01/2023", "09:00", 
                "Rafael", "Miguel", "Jose", "100 metros libres", "51.00", "51.10", "51.20", "50.90", "50.80", "3", "Juez Arbitro",
                "Juez Arbitro Salida", new String[] {"Juez 1", "Juez 2", "Juez 3"}, new String[] {"Juez 1", "Juez 2"}, 
                new String[] {"Cronometrador 1", "Cronometrador 2"}, "51.00");

        Gymnacia gymnacia = new Gymnacia("Gymnacia", "Varonil", "Juvenil", "Gimnasio Olimpico", "Final", "01/01/2023", "09:00",
                "Rafael", "Miguel", "Jose", "Salto de caballo", "9.50", "9.60", "9.70", "9.40", "9.30", "3");

        Futbol futbol = new Futbol("Dos faltas hizo el jugador 3", "Futbol", "Varonil", "Juvenil", "Estadio Nacional", "Final", 
                "02/01/2023", "18:00", "Equipo A", "Equipo B", "Equipo C");

        Volleyball volleyball = new Volleyball("no sé, no juego volley", "Volleyball", "Femenil (cambiable)", "Juvenil", "Gimnasio Nacional", 
                "Final", "03/01/2023", "15:00", "Equipo D", "Equipo E", "Equipo F");

        Beisbol beisbol = new Beisbol("Beisbol", "Varonil", "Juvenil", "Estadio de Beisbol", "Final", "04/01/2023", "20:00", 
                "Equipo G", "Equipo H", "Equipo I", "Prueba 1", "1:30:00", "1:35:00", "1:40:00", "1:25:00", "1:28:00", "15 hits");

        System.out.println(atletismo.juecesSalida[0]);
        System.out.println("La prueba es: " + natacion.getPrueba());
        System.out.println("El ganador de la prueba es " + natacion.getGanador());
        System.out.println("El tiempo del ganador de la prueba es " + natacion.getTiempoGanador());
        System.out.println("El segundo lugar de la prueba es " + natacion.getSegundoLugar());
        System.out.println("El tiempo del segundo lugar de la prueba es " + natacion.getTiempo2doLugar());
        System.out.println("El ganador del tercer lugar de la prueba es " + natacion.getTercerLugar());
        System.out.println("El tiempo del tercer lugar de la prueba es " + natacion.getTiempo3erLugar());
        System.out.println("El record panamericano anterior era: " + natacion.getRecordPanamericano());
        System.out.println("El record anterior es: " + natacion.getRecordAnterior());
        
        // Comparar y actualizar el record panamericano si es necesario
        natacion.actualizarRecordPanamericano();
        
        System.out.println("El nuevo record panamericano es: " + natacion.getRecordPanamericano());
    }
}
