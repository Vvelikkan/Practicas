package contactos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Agenda {
    public static void main(String[] args) {
        CrearArchivo ca = new CrearArchivo();
        AgregarContactos ac = new AgregarContactos(); 
        
        while (true) {
            int op = 0;
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("Menu de Opciones\n"
                + "1. Crear Archivo\n"
                + "2. Agregar Contactos\n"
                + "3. Desplegar Contactos\n"
                + "4. Salir\n"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número.");
                continue;
            }
        
            switch (op) {
                case 1:
                    ca.crearArchivo();
                    break;
                
                case 2:
                    ac.agregarContactos();
                    break;

                case 3:
                    try (BufferedReader fd = new BufferedReader(new FileReader("agenda.dat"))) {
                        String linea;
                        while ((linea = fd.readLine()) != null) {
                            JOptionPane.showMessageDialog(null, linea);
                        }
                    } catch (FileNotFoundException e) {
                        JOptionPane.showMessageDialog(null, "No pude abrir el archivo agenda.dat");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error al leer el archivo agenda.dat");
                    }
                    break;

                case 4:
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, elija una opción del 1 al 4.");
                    break;
            }
        }
    }
}
