package Evaluacion;

import EvaluacionP.ejercicio1;
import EvaluacionP.ejercicio2;
import EvaluacionP.ejercicio3;

public class main {
  public static void main(String[] args) {
    ejercicio1 obj = new ejercicio1(3);
    ejercicio2 obj2 = new ejercicio2(37, 12);
    ejercicio3 obj3 = new ejercicio3(4);

    /* System.out.println(obj.Calcular2()); */// ya quedo forma iterativa
    System.out.println(obj.Division_R());

    /* System.out.println( obj2.calcI()); */
    /* System.out.println(obj2.si()); */

    /* obj3.sobI(); */
    /* System.out.println(obj3.sobRe(3)); */

  }
}