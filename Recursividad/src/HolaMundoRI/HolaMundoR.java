package HolaMundoRI;

public class HolaMundoR {
    private int n;

    public HolaMundoR(int n) {
        setN(n);
    }

    public void setN(int n){
        this.n = n<0?1:n;
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public String HolaMuI(){
        String imp="";
        for (int i = 0; i < n; i++) {
            imp+="Hola Mundo\n";
        }
        return imp;
    }

    // MODO RECURSIVO
    public void HolaMuR(){
        HolaMuR(n);
    }

    private void  HolaMuR(int n){
        if (n>0) {
            System.out.println("Hola mundo");
            HolaMuR(n-1);
        }
    }
}
