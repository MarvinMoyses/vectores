package Asesorias;


public class Rasesorias {
    double x=0;
    void imprimir (int li){
        if (li == 1 ) {
            System.out.println(li);
        } else {
            x+=1/li;
            imprimir(li-1);
        }
    }


}


/* elabora un programa que utilice recursividad que muestre los numeros 
 * comprendidos entre 20 y 50 
 */

/* void imprimir (int li, int ls){
    if (li == ls ) {
        System.out.println(ls);
    } else {
        System.out.println(li);
        imprimir(li, ls);
    }
} */
//NOTAS 



/* siempre se nesesita un caso base que es el que permite 
para que la recursividad finalice */

/* Recursividad : consiste en crear uno o varios
metodos que se llaman asi mismos  */


/*  
 void mesaje (String msj){
    if (msj.equals ("")){
        System.out.exit(0);
    } else {
        system.out.printl(msj);
        msj.JOptionpane.showInputDialog("tecle otro mensaje")

        return mensaje (msj);
    }

 }
*/