package ArreglosEjem.vectores;

import javax.swing.JOptionPane;

public class panel {
    public static void main(String[] args) {
        crearMenuPrincipal();

    }

    public static void crearMenuPrincipal() {
        // variables
        String menu;
        boolean sentinel = true;
        String opcion = "";

        menu = "Menu principal \n" +
                "1) Vectores\n" +
                "2) Matrices\n" +
                "3) salir\n" +
                "Selecciona una opcion valida:";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    crearMenuVectores();
                    break;
                case "2":
                    crearMenuMatrices();
                    break;
                case "3":
                    sentinel = false;
                    break;
                case "4":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        } while (sentinel);
    }

    public static void crearMenuVectores() {
        String n;
        String menu, opcion;
        boolean sentinel = true;
        int tamanio;
        operacionesVectores obj;

        do {
            n = JOptionPane.showInputDialog("introduce el tamaño del arreglo");
            if (validarN(n)) {
                tamanio = Integer.parseInt(n);
                if (tamanio > 0) {

                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "tamaño no puede ser cero o negativo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "el valor debe ser entero");
            }
        } while (true);

        obj = new operacionesVectores(tamanio);

        menu = "Menu Vectores\n" +
                "1)LLenar Vector\n" +
                "2)Imprimir valores\n" +
                "3)Sumar elementos\n" +
                "4)Valor maximo y minimo\n" +
                "5)Tamaño del Arreglo\n" +
                "6)media\n" +
                "7)moda\n" +
                "8)OrdenamientoBurbuja A\n" +
                "9)OrdenamientoBurbuja D\n" +
                "10)Busqueda Secuencial\n" +
                "11)Busqueda Binaria\n" +
                "12)ordenar Seleccion\n" + //mas pequeño
                "13)ordenar Insercion\n" + //comparacion de mayor
                "14)ordenar Shell\n" + //se divide los numero entre 2
                "15)ordenar Quicksort\n" + //recursividad
                "16)Regresar\n";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    obj.llenarArreglo(solicitarvalores(tamanio));
                    break;
                case "2":
                    obj.Imprimir();
                    break;
                case "3":
                    obj.sumarVector();
                    break;
                case "4":
                    obj.obtenerValorMaximo();
                    obj.obtenerValorMinimo();
                    break;
                case "5":
                    obj.tamaño();
                    break;
                case "6":
                    obj.calcularMedia();
                    break;
                case "7":
                    obj.calcularModa();
                    break;
                case "8":
                    obj.ordenarBurbujaAsc();
                    JOptionPane.showMessageDialog(null, "Ordenado muestra ahora imprimir");
                    break;
                case "9":
                    obj.ordenarBurbujaDesendente();
                    JOptionPane.showMessageDialog(null, "Ordenado desendiente muestra ahora imprimir");
                    break;
                case "10":
                    String valor = "";
                    do {
                        valor = JOptionPane.showInputDialog("Ingrese el numero que quiere buscar: ");
                    } while (!validarN(valor));
                    int p = obj.secuencial(Integer.parseInt(valor));
                    if (p == -1) {
                        JOptionPane.showMessageDialog(null, "La busqueda secuencial no encontró el valor solicitado");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "La busqueda secuencial encontro el valor solicitado en la posicion "
                                        + obj.secuencial(Integer.parseInt(valor)));
                    }
                    break;
                case "11":
                    valor = "";
                    do {
                        valor = JOptionPane.showInputDialog("Introduce el numero a buscar: ");
                    } while (!validarN(valor));
                    p = obj.busquedaBinaria(Integer.parseInt(valor));
                    if (p != -1) {
                        JOptionPane.showMessageDialog(null, "La busqueda se encontro en la posicion: " + p);
                    } else {
                        JOptionPane.showMessageDialog(null, "La busqueda no se encontro");
                    }
                    
                    break;
                case "12":
                    obj.ordenarSeleccion();
                    JOptionPane.showMessageDialog(null, "Ordenado muestra ahora imprimir");
                    break;
                case "13":
                    obj.ordenarInsercion();
                    JOptionPane.showMessageDialog(null, "Ordenado muestra ahora imprimir");
                    break;
                case "14":
                    obj.ordenarShell();
                    JOptionPane.showMessageDialog(null, "Ordenado muestra ahora imprimir");
                    break;
                case "15":
                    obj.ordenarQuicksort(0, tamanio - 1);
                    break;
                case "16":
                    JOptionPane.showMessageDialog(null, "Camarara bb");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        } while (sentinel);
    }

    public static void crearMenuMatrices() {
        String n;
        String menu, opcion;
        boolean sentinel = true;
        int tamanio;
        operacionesMatrices obj2;

        do {
            n = JOptionPane.showInputDialog("introduce el tamaño de la matriz cuadrada");
            if (validarN(n)) {
                tamanio = Integer.parseInt(n);
                if (tamanio > 0) {

                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "tamaño no puede ser cero o negativo");
                }

            } else {
                JOptionPane.showMessageDialog(null, "el valor debe ser entero");
            }
        } while (true);

        obj2 = new operacionesMatrices(tamanio);

        menu = "Menu Matrices\n" +
        "1)LLenar Matriz\n" +
        "2)Imprimir valores\n" +
        "3)Sumar elementos\n" +
        "4)Valor maximo y minimo\n" +
        "5)Tamaño de la mayriz\n" +
        "6)media\n" +
        "7)moda\n" +
        "8)OrdenamientoBurbuja A\n" +
        "9)OrdenamientoBurbuja D\n" +
        "10)Busqueda Secuencial\n" +
        "11)Busqueda Binaria\n" +
        "12)ordenar Seleccion\n" + //mas pequeño
        "13)ordenar Insercion\n" + //comparacion de mayor
        "14)ordenar Shell\n" + //se divide los numero entre 2
        "15)ordenar Quicksort\n" + //recursividad
        "16)Regresar\n";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "1":
                    obj2.llenarMatriz(solicitarvaloresMatriz(tamanio));
                    break;
                case "2":
                    obj2.ImprimirMatriz();
                    break;
                case "3":
                    obj2.sumarMatriz();
                    break;
                case "4":
                    obj2.obtenerMaximoMatriz();
                    obj2.obtenerMinimoMatriz();
                    break;
                case "5":
                obj2.ObtenerTamanio();
                    break;
                case "6":
                    obj2.obtenerMediaMatriz();
                    break;
                case "7":
                    obj2.obtenerModaMatriz();
                    break;
                case "8":
                    obj2.OrdernarBurbuja();
                    break;
                case "9":
                    obj2.OrdernarBurbuja2();
                    break;
                case "10":
                    String valor = "";
                    do {
                        valor = JOptionPane.showInputDialog("Ingrese el numero que quiere buscar: ");
                    } while (!validarN(valor));
                    int p = obj2.secuencialM(Integer.parseInt(valor));
                    if (p == -1) {
                        JOptionPane.showMessageDialog(null, "La busqueda secuencial no encontró el valor solicitado");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "La busqueda secuencial encontro el valor solicitado en la posicion "
                                        + obj2.secuencialM(Integer.parseInt(valor)));
                    }
                    break;
                    case "11":
                    valor = "";
                    do {
                        valor = JOptionPane.showInputDialog("Introduce el numero a buscar: ");
                    } while (!validarN(valor));
                    p = obj2.busquedaBinaria(Integer.parseInt(valor));
                    if (p != -1) {
                        JOptionPane.showMessageDialog(null, "La busqueda se encontro en la posicion: " + p);
                    } else {
                        JOptionPane.showMessageDialog(null, "La busqueda no se encontro");
                    }
                    break;
                    case "12":
                    obj2.ordenarSeleccion();
                    obj2.ImprimirMatriz();
                    break;
                    case "13":
                    obj2.ordenarInsercion();
                    obj2.ImprimirMatriz();
                    break;
                    case "14":
                    obj2.ordenarShell();
                    obj2.ImprimirMatriz();
                    break;
                    case "15":
                    obj2.ordenarQuicksort(0, tamanio-1);
                    obj2.ImprimirMatriz();
                    break;

                case "16":
                    JOptionPane.showMessageDialog(null, "Camarara bb");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion No Valida");
            }
        } while (sentinel);
    }

    public static boolean validarN(String n) {

        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    // validar
    public static int[] solicitarvalores(int tam) {
        int arr[] = new int[tam];
        String valor;
        for (int i = 0; i < arr.length; i++) {
            do {
                valor = JOptionPane.showInputDialog("introduce el valor de la posicion [ " + i + " ]");
            } while (!validarN(valor));
            arr[i] = Integer.parseInt(valor);
        }
        return arr;
    }

    public static int[][] solicitarvaloresMatriz(int tam) {
        int arr[][] = new int[tam][tam];
        String valor;

        int fila = 0;
        while (fila < arr.length) {
            for (int columna = 0; columna < arr.length; columna++) {
                do {
                    valor = JOptionPane.showInputDialog(
                            "introduce el valor de la posicion [ " + fila + " ]" + "[ " + columna + " ]");
                } while (!validarN(valor));
                arr[fila][columna] = Integer.parseInt(valor);
            }
            fila++;
        }
        return arr;
    }
}
