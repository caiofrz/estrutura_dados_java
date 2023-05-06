package Teste;
import arrays.VetorObjetos;

public class VetorObjetosTeste {
    public static void main(String[] args) {
        
        VetorObjetos vetorObjetos = new VetorObjetos(3);
    
        vetorObjetos.adiciona(3);
        vetorObjetos.adiciona("Caio");
        vetorObjetos.adiciona(3.4);
    
        System.out.println(vetorObjetos.toString());
        // System.out.println(vetorObjetos.busca("Caio")); 
    }
}

