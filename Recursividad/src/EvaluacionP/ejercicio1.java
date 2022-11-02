package EvaluacionP;

import ejemplo1.factorial;

public class ejercicio1 {
 
   
        private int n;
        private factorial objFact;
        private double e;
    
        
    
        public ejercicio1(int n) {
            setN(n);
            e=0;
            objFact = new factorial(n);
        }
    
        public void setN(int n) {
            this.n = (n >= 1) ? n : 1;
        }
    
        public int getN() {
            return n;
        }
        public double getE() {
            return e;
        }
    
        public void setE(double e) {
            this.e = e;
        }
       
    
        
        public double Calcular2() {
            double z = 0;
            for (double i = 1; i <= n; i++) {
                objFact.setX(i*2);
                z += i / objFact.FactIterativo();
            }
            return z;
        }
    
        // MODO RECURSIVO
        public double Division_R() {
            return suma(n);
        }
    
        private double suma(int n) {
            if (n == 1) {
                objFact.setX(n*2);
                e+=n/objFact.FactIterativo();
            } else {
                objFact.setX(n*2);
                 e+= n / (objFact.FactIterativo());
                 suma(n-1);
            }
            return e;
        }
    
    }

    
    
