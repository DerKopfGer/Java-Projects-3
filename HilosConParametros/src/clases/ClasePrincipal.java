package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Procesos hilouno = new Procesos("Hilo 1");
        Procesos hilodos = new Procesos("Hilo 2");
        Procesos hilotres = new Procesos("Hilo 3");
        
        hilouno.ValorDeLaCondicion(5);
        hilodos.ValorDeLaCondicion(10);
        hilotres.ValorDeLaCondicion(5);
        
        hilouno.start();
        hilodos.start();
    }
}
