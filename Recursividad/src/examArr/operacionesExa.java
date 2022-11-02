package examArr;


import javax.swing.JOptionPane;

public class operacionesExa {
    private int tamanio;
    private int[] vector;

    public operacionesExa(int n) {
        vector = new int[n];
        this.tamanio = n;
    }

    public int ObtenerTamanio() {
        return tamanio;
    }

    public int[] getVector() {
        return vector;
    }

    public void llenarArreglo(int [] arg) {
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
    public void calcularMediana() {
        double suma = 0;
        for (int valor : vector) {
            suma = ((valor/2+valor/2+1)/2);
        }
        double t = suma;
        JOptionPane.showMessageDialog(null, "la mediana es : " + t);
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
        JOptionPane.showMessageDialog(null, "la modo es : " + moda);
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

   public String calcularPorcentaje() {
    int[] contar = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    String cadena = "";
    int uno = 1;
    for (int valor : vector) {
      if (valor == 1) {
        contar[0] += 1;
      }
      if (valor == 2) {
        contar[1] += 1;
      }
      if (valor == 3) {
        contar[2] += 1;
      }
      if (valor == 4) {
        contar[3] += 1;
      }
      if (valor == 5) {
        contar[4] += 1;
      }
      if (valor == 6) {
        contar[5] += 1;
      }
      if (valor == 7) {
        contar[6] += 1;
      }
      if (valor == 8) {
        contar[7] += 1;
      }
      if (valor == 9) {
        contar[8] += 1;
      }
      if (valor == 1) {
        contar[9] += 1;
      }
    }
    return cadena;
  }



    
    //========================================
}
