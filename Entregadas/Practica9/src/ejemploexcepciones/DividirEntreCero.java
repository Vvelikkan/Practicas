package ejemploexcepciones;

import javax.swing.JOptionPane;

public class DividirEntreCero {
    public static void main(String[] args) {
        int a, b, resultado;
        while (true) {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog("Teclea el denominador"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numerador"));
                
                resultado = b / a; // Aquí podría lanzarse una excepción
                
                JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
                JOptionPane.showMessageDialog(null, "Programa Terminado");
                System.exit(0);
            } catch (ArithmeticException e) {
                // Atrapamos y corregimos el problema en caso de división por cero
                JOptionPane.showMessageDialog(null, "Intento de dividir entre cero, teclea nuevamente los valores");
            } catch (NumberFormatException e) {
                // Atrapamos y corregimos el problema en caso de entrada inválida
                JOptionPane.showMessageDialog(null, "Entrada no válida, por favor ingresa solo números enteros.");
            }
        }
    }
}
