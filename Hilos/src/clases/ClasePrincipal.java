package clases;

public class ClasePrincipal {
    
    public static void main(String args[]) {
        
        ProcesoUno hilouno = new ProcesoUno();
        Thread hilodos = new Thread(new ProcesoDos());
        
        hilouno.start();
        hilodos.start();
        
        
    }
}

   

