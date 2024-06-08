package contactos;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CrearArchivo {
    public void crearArchivo() {
        try (FileOutputStream f = new FileOutputStream("agenda.dat")) {
            // Crear el archivo vacío
            JOptionPane.showMessageDialog(null, "Archivo creado exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo");
        }
    }
}
