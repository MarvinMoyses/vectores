package ArreglosEjem.vectores;

import javax.swing.JOptionPane;

public class operacionesMatrices {
    private int[][] matriz;

    public operacionesMatrices(int n) {
        matriz = new int[n][n];
    }

    public operacionesMatrices(int fila, int columna) {
        matriz = new int[fila][columna];
    }

    public void llenarMatriz(int[][] matriz) {

        for (int fila = 0; fila < matriz.length; fila++) {
            int columna = 0;
            while (columna < matriz.length) {
                this.matriz[fila][columna] = matriz[fila][columna];
                columna++;
            }
        }
    }
    public void ObtenerTamanio() {
      int b =matriz.length * matriz[0].length;
      JOptionPane.showMessageDialog(null, b);
  }

    public void ImprimirMatriz() {
        int fila = 0;
        String cadena = "";
        do {
            int columna = 0;
            while (columna < matriz.length) {
                cadena += matriz[fila][columna] + " | ";
                columna++;
            }
            cadena += "\n";
            fila++;
        } while (fila < matriz.length);
        JOptionPane.showMessageDialog(null, "cadena es \n" + cadena);
    }

    public void OrdernarBurbuja() {
        int arr[]= convertirAVector();
        int aux = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
        do {
            j = 0;
            while (j < n - 1) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                j++;
            }
            i++;
        } while (i < n);
        convertirMatriz(arr);
    }

    public void OrdernarBurbuja2() {
      int arr[]= convertirAVector();
      int aux = 0;
      int i = 0;
      int j = 0;
      int n = arr.length;
      do {
          j = 0;
          while (j < n - 1) {
              if (arr[j] < arr[j + 1]) {
                  aux = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = aux;
              }
              j++;
          }
          i++;
      } while (i < n);
      convertirMatriz(arr);
  }

    private int[] convertirAVector() {
        int tam = matriz.length * matriz[0].length;
        int arr[] = new int[tam];
        int aux=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                arr[aux]=matriz[i][j];
                aux++;
            }
        }
        return arr;
    }

    private void convertirMatriz(int[] arr){
        int aux=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = arr[aux];
                aux++;
            }
        }
    }
////////////////////////////////////////////////////////
    public int secuencialM (int valor){
      int arr[]= convertirAVector();
      for(int i =0 ; i<arr.length; i++){
        
        if (valor==arr[i]){
        return i;
          }
        }
        convertirMatriz(arr);
        return -1;
        }


        public void sumarMatriz() {
            int suma = 0;
            int arr[] = convertirAVector();
            for (int valor : arr) {
              suma += valor;
            }
      
            JOptionPane.showMessageDialog(null, "Valor suma de la matriz: " + suma);
          }
      
          public int obtenerMaximoMatriz() {
          int arr[] = convertirAVector();
            int max = arr[0];
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
              max = arr[i];
            }
          }
          return max;
        }
      
        public int obtenerMinimoMatriz() {
          int arr[] = convertirAVector();
          int min = arr[0];
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
              min = arr[i];
            }
          }
          return min;
        }
      
        public void obtenerMediaMatriz() {
          int arr[] = convertirAVector();
          double media = 0;
          for (int valor : arr) {
            media += valor;
          }
          media /= arr.length;
      
          JOptionPane.showMessageDialog(null, "Valor media de la matriz es: " + media);
        }
      
        public void obtenerModaMatriz() {
          int arr[] = convertirAVector();
          int maximoNumRepeticiones = 0;
          int moda = 0;
      
          for (int i = 0; i < arr.length; i++) {
            int numRepeticiones = 0;
            for (int j = 0; j < arr.length; j++) {
              if (arr[i] == arr[j]) {
                numRepeticiones++;
              } //fin if
              if (numRepeticiones > maximoNumRepeticiones) {
                moda = arr[i];
                maximoNumRepeticiones = numRepeticiones;
              } //fin if
            }
          } //fin for
          JOptionPane.showMessageDialog(null, "Número que más se repite: " + moda);
        }


        ////////////
        
    public void ordenarSeleccion() {
      int arr[] = convertirAVector();
      int n = arr.length;
      int aux = n;
      for (int i = 0; i <n- 1; i++) {
          int minimo = i;
          for (int j = i + 1; j < n ; j++) {
              if (arr[j] < arr[minimo]) {
                  minimo = j;
              }
          }
          aux = arr[i];
          arr[i] = arr[minimo];
          arr[minimo] = aux;
      }

      convertirMatriz(arr);
  }

  public void ordenarInsercion() {
    int arr[] = convertirAVector();
      int n = arr.length;
      int aux = n;
      for (int i = 1; i < n; i++) {          aux = arr[i];
          for (int j = i - 1; j >= 0 && arr[j] > aux; j--) {
              arr[j + 1] = arr[j];
              arr[j] = aux;
          }
      }
      convertirMatriz(arr);
  }

  public void ordenarShell() {
    int arr[] = convertirAVector();
      int n = arr.length;
      int aux;
      int salto = arr.length / 2;
      int j, k;

      while (salto > 0) {
          for (int i = salto; i < n; i++) {
              j = i - salto;
              while (j >= 0) {
                  k = j + salto;
                  if (arr[j] <= arr[k]) {
                      j = -1;
                  } else {
                      aux = arr[j];
                      arr[j] = arr[k];
                      arr[k] = aux;
                      j -= salto;
                  }
              }
          }
          salto = salto / 2;
      }
      convertirMatriz(arr);
  }

  public void ordenarQuicksort(int izq, int der) {
    int arr[] = convertirAVector();
      int i, j, pivote, aux;
      i = izq;
      j = der;

      pivote = arr[(izq + der) / 2];
      do {
          while (arr[i] < pivote) {
        
              i++;
              
          }
          while (arr[j] > pivote) {
           
              j--;
          }
          
          if (i <= j) {
              aux = arr[i];
              arr[i] = arr[j];
              arr[j] = aux;
              i++;
              j--;
              
          }
         
          convertirMatriz(arr);
      } while (i <= j);
      if (izq < j) {
          ordenarQuicksort(izq, j);
      }
      if (i < der) {
          ordenarQuicksort(i, der);
      }
       convertirMatriz(arr);
      
  }

  public int busquedaBinaria(int valor) {
    int arr[] = convertirAVector();
      int n = arr.length;
      int centro, primero = 0, ultimo = n - 1;
      while (primero <= ultimo) {
          centro = (ultimo + primero) / 2;
          if (arr[centro] == valor){
              return centro;
          }  
          else if (valor < arr[centro]) {
              ultimo = centro - 1;
          } else {
              primero = centro + 1;
          }
          convertirMatriz(arr);
      }
      convertirMatriz(arr);
      return -1;
      
  }
 

}