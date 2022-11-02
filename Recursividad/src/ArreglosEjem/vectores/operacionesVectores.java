package ArreglosEjem.vectores;

import javax.swing.JOptionPane;

public class operacionesVectores {
    private int tamanio;
    private int[] vector;

    public operacionesVectores(int n) {
        vector = new int[n];
        this.tamanio = n;
    }

    public int ObtenerTamanio() {
        return tamanio;
    }

    public int[] getVector() {
        return vector;
    }

    public void llenarArreglo(int[] arg) {
        int i = 0;
        while (i < arg.length) {
            vector[i] = arg[i];
            i++;
        }
    }

    public void Imprimir() {
        String cadena = "";
        for (int valor : vector) {
            cadena += valor + " | ";
        }
        JOptionPane.showMessageDialog(null, cadena);
    }

    public void sumarVector() {
        int suma = 0;
        for (int valor : vector) {
            suma += valor;
        }
        JOptionPane.showMessageDialog(null, "la suma es : " + suma);
    }

    public void obtenerValorMaximo() {
        int b = -99999;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > b) {
                b = vector[i];
            }
        }
        JOptionPane.showMessageDialog(null, "mayor :" + b);
    }


    public void obtenerValorMinimo() {
        int b = 99999;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < b) {
                b = vector[i];
            }
        }

        JOptionPane.showMessageDialog(null, "menor :" + b);
    }

    public void calcularMedia() {
        double suma = 0;
        for (int valor : vector) {
            suma += valor;
        }
        double t = suma / tamanio;
        JOptionPane.showMessageDialog(null, "la media es : " + t);
    }

    public void calcularModa() {
        int maximoNumRepeticiones = 0;
        double moda = 0;

        for (int i = 0; i < vector.length; i++) {
            int numRepeticiones = 0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    numRepeticiones++;
                }
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = vector[i];
                    maximoNumRepeticiones = numRepeticiones;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "la medo es : " + moda);
    }

    public void tamaño() {
        JOptionPane.showMessageDialog(null, "el tamño es: " + tamanio);
    }

    public void ordenarBurbujaAsc() {
        int aux = 0;
        int i = 0;
        int j = 0;
        int n = vector.length;
        do {
            j = 0;
            while (j < n - 1) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
                j++;
            }
            i++;
        } while (i < n);
    }
    
    public int secuencial (int valor){
        for(int i =0 ; i<vector.length; i++){
        
        if (valor==vector[i]){
        return i;
          }
        }
        return -1;
        }

    public void ordenarBurbujaDesendente() {
        int aux = 0;
        int i = 0;
        int j = 0;
        int n = vector.length;
        do {
            j = 0;
            while (j < n - 1) {
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
                j++;
            }
            i++;
        } while (i < n);
    }

    ////////////////////////
    
    public void ordenarSeleccion() {

        int n = vector.length;
        int aux = n;
        for (int i = 0; i < n - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[minimo]) {
                    minimo = j;
                }
            }
            aux = vector[i];
            vector[i] = vector[minimo];
            vector[minimo] = aux;
        }
    }

    public void ordenarInsercion() {
        int n = vector.length;
        int aux = n;
        for (int i = 1; i < n; i++) {
            aux = vector[i];
            for (int j = i - 1; j >= 0 && vector[j] > aux; j--) {
                vector[j + 1] = vector[j];
                vector[j] = aux;
            }
        }
    }

    public void ordenarShell() {
        int n = vector.length;
        int aux;
        int salto = vector.length / 2;
        int j, k;

        while (salto > 0) {
            for (int i = salto; i < n; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (vector[j] <= vector[k]) {
                        j = -1;
                    } else {
                        aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
    }

    public void ordenarQuicksort(int izq, int der) {

        int i, j, pivote, aux;
        i = izq;
        j = der;

        pivote = vector[(izq + der) / 2];
        do {
            while (vector[i] < pivote) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i <= j) {
                aux = vector[i];
                vector[i] = vector[j];
                vector[j] = aux;
                i++;
                j--;
            }

        } while (i <= j);
        if (izq < j) {
            ordenarQuicksort(izq, j);
        }
        if (i < der) {
            ordenarQuicksort(i, der);
        }
    }

    public int busquedaBinaria(int valor) {
        int n = vector.length;
        int centro, primero = 0, ultimo = n - 1;
        while (primero <= ultimo) {
            centro = (ultimo + primero) / 2;
            if (vector[centro] == valor){
                return centro;
            }  
            else if (valor < vector[centro]) {
                ultimo = centro - 1;
            } else {
                primero = centro + 1;
            }
        }
        return -1;
    }


}
