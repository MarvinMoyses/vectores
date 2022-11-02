package arreglos;

import javax.swing.JOptionPane;

public class prueba {
    public static void main(String[] args) {
        int elementos;

        ArregloCoche[] autos;

        elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de carros a insertar"));

        autos = new ArregloCoche[elementos];

        for (int i = 0; i < autos.length; i++) {
            JOptionPane.showMessageDialog(null, "Valores de auto" + (i + 1));
            autos[i] = sollicitarInformacion();
        }

        imprimir(autos);

    }

    public static ArregloCoche sollicitarInformacion() {
        String nombre = JOptionPane.showInputDialog("Modelo del coche");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("numero de cilindros"));

        double gas = Double.parseDouble(JOptionPane.showInputDialog("litros que le caben"));

        ArregloCoche obj = new ArregloCoche(nombre, numero, gas);

        return obj;
    }

    public static void imprimir(ArregloCoche[] arrg) {
        String cadena = "";
        for (ArregloCoche valor : arrg) {
            cadena += ("automovil= \n" + valor.toString() + "\n");
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
