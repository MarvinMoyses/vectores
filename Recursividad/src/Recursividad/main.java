package Recursividad;

import javax.swing.JOptionPane;

import HolaMundoRI.HolaMundoR;
import HolaMundoRI.MCD;
import HolaMundoRI.divicion;
import HolaMundoRI.sobreN;
import HolaMundoRI.sucecion;

public class main {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Imprimir 'Hola mundo'"
                        + "\n2) Imprimir número (menor a mayor)"
                        + "\n3) Calcular 1 sobre n"
                        + "\n4) Calcular máximo común divisor"
                        + "\n5) Calcular n sobre factorial"));

        switch (opcion) {
            case 1:
                int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                        + "\n2) Modo Recursivo"));

                switch (opcion1) {
                    case 1:
                        HolaMundoR obj = new HolaMundoR(4);
                        
                        System.out.println(obj. HolaMuI());
                        break;

                    case 2:
                        HolaMundoR obj1 = new HolaMundoR(4);
                        obj1. HolaMuR();
                        break;

                    default:
                        break;
                }
                break;

            case 2:
                int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                        + "\n2) Modo Recursivo"));

                switch (opcion2) {
                    case 1:
                        sucecion obj2 = new sucecion(4);
                        System.out.println(obj2.SucI());
                        break;

                    case 2:
                        sucecion obj3 = new sucecion(4);
                        obj3.SucR();
                        break;

                    default:
                        break;
                }
                break;

            case 3:
                int opcion5 = Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                        + "\n2) Modo Recursivo"));

                switch (opcion5) {
                    case 1:
                        sobreN obj8 = new sobreN(4);
                       obj8.sobI();
                        break;
                    case 2:
                        sobreN obj9 = new sobreN(4);
                       System.out.println( obj9.sobRe(4));
                        break;

                    default:
                        break;
                }
                break;

            case 4:
                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
                        + "\n2) Modo Recursivo"));

                switch (opcion3) {
                    case 1:
                        MCD obj4 = new MCD(164, 72);
                        System.out.println(obj4.calcMCD_I());
                        break;

                    case 2:
                        MCD obj5 = new MCD(164, 72);
                        obj5.calcMCD_R();
                        break;

                    default:
                        break;
                }
                break;

            case 5:
                int opcion4 = Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo"
                        + "\n2) Modo Recursivo"));

                switch (opcion4) {
                    case 1:
                        divicion obj6 = new divicion(5);
                        System.out.println(obj6.Calcular2());
                        break;

                    case 2:
                        divicion obj7 = new divicion(5);
                        System.out.println(obj7.Division_R());
                        break;

                    default:
                        break;
                }

                break;
//h
            /*
             * case 6:
             * int opcion5 =
             * Integer.parseInt(JOptionPane.showInputDialog("1) Modo Iterativo>"
             * + "\n2) Modo Recursivo"));
             * 
             * switch (opcion5) {
             * case 1:
             * suma2 obj8 = new suma2(5);
             * System.out.println(obj8.suma_I());
             * break;
             * 
             * case 2:
             * suma2 obj9 = new suma2(5);
             * System.out.println(obj9.suma_R());
             * break;
             * 
             * default:
             * break;
             * }
             * break;
             */

            default:
                JOptionPane.showMessageDialog(null, "Opción no disponible");
                break;
        }
    }
}
