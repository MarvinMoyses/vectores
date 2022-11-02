package examArr;

import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        crearMenuPrincipale();

    }

    public static void crearMenuPrincipale() {
        // variables
        String menues;
        boolean sentinel = true;
        String opcion = "";
        int tamanio = 30;
        operacionesExa obj;
        menues = "Menu principal \n" +
                "1) llenar \n" +
                "2) salir\n" +
                "Selecciona una opcion valida:";

        do {
            obj = new operacionesExa(tamanio);

            opcion = JOptionPane.showInputDialog(menues);

            switch (opcion) {
                case "1":

                    obj.llenarArreglo(solicitarValores(tamanio));
                    obj.Imprimir();
                    obj.obtenerValorMaximo();
                    obj.obtenerValorMinimo();
                    obj.calcularMedia();
                    obj.calcularModa();
                    obj.ordenarBurbujaAsc();
                    obj.Imprimir();
                    obj.calcularMediana();
                    break;
                case "2":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        } while (sentinel);
    }

    public static int[] solicitarValores(int max) {
        int[] arg = new int[max];
        int min = 1;
        int llenar = 0;

        for (int i = 0; i < arg.length; i++) {
            double numero = Math.random() * ((max - min) + 1) + min;
            llenar = (int) numero;
            arg[i] = llenar;
        }
        return arg;
    }

}
