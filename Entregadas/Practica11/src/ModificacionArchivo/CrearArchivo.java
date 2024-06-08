package ModificacionArchivo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class CrearArchivo {

    public void crearArchivo() {
        // Creación del Archivo
        try (FileOutputStream f = new FileOutputStream("archivo1.txt");
             DataOutputStream archivo = new DataOutputStream(f)) {
            // El archivo se crea y se cierra automáticamente
        } catch (IOException ex) {
            System.out.println("Existe un error: " + ex);
        }

        // Escritura en el Archivo
        try (FileWriter w = new FileWriter("archivo1.txt", true);
             PrintWriter wr = new PrintWriter(w)) {
            for (int x = 1; x <= 3; x++) {
                String nombre = JOptionPane.showInputDialog("Nombre: \n");
                String direccion = JOptionPane.showInputDialog("Dirección: \n");
                String telefono = JOptionPane.showInputDialog("Teléfono: \n");
                wr.println(nombre + " " + direccion + " " + telefono);
            }
        } catch (IOException ex) {
            System.out.println("Existe un error: " + ex);
        }
    }
}
