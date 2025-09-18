package aula1809;

import java.util.Scanner;

public class Aula1809 {

    public static boolean insere(String v[], String elemento, int ultimo){
      if(!(ultimo >= v.length)){
          v[ultimo] = elemento;
          return true;
        }else{
          return false;
        }  
    }
    
    public static void imprimir(String lista[], int ultimo){
        for(int i=0; i < ultimo; i++){
            System.out.println(lista[i]);
        }
    }
    
    public static String pesquisar(String lista[], 
                                            String elemento, int ultimo){ 
        for(int i=0; i < ultimo; i++){
              if (lista[i].equalsIgnoreCase(elemento)){
                  System.out.println("Posicao na lista: "+ i);
                  return lista[i];
              }
        }
        return null;
    }
    
    public static String excluirPrimeiro(String lista[], int ultimo) {
        if (ultimo == 0) {
            System.out.println("Lista vazia");
            return null;
        }
        String primeiro = lista[0];

        for (int i = 0; i < (ultimo - 1); i++) {
            lista[i] = lista[i + 1];
        }
       ultimo = ultimo - 1;
       return primeiro;
        
    }
    
    public static String excluirUltimo(String lista[], int last){
        if (last == 0) {
            System.out.println("Lista vazia");
            return null;
        }
        String ultimo = lista[2];
        for (int i = 0; i == last; i++) {
             lista[i] = lista[i - 1];
//lista[i] = null;
        }
       
       return ultimo;
        
    }
    
    public static String excluir(String lista[], int ind, int ultimo) {
       
       

        if (ind >= ultimo) {
            System.out.println("Lista vazia ou posicao invalida");
            return null;
        }
        String elemento = lista[ind];
        
         for (int i = ind; i < (ultimo - 1); i++){
             lista[i] = lista[i+1];
         }
        
        return elemento;
    }
    
    public static void main(String[] args) {
        //String v[] = new String[5]; // 0,1,2,3,4
        Scanner sc = new Scanner(System.in);
        String v[] = new String[10]; //{"Fulano da Silva", "Beltrano Amaro", "Sicrano F."}; 
        int contaPessoas = 0;
        boolean ok = insere(v, "Jose de Alencar", contaPessoas);
        if(ok){
            contaPessoas++;
        }
       ok = insere(v, "Graciliano Ramos", contaPessoas);
         if(ok){
            contaPessoas++;
        }
       ok = insere(v, "Guimaraes Rosa", contaPessoas);
        if(ok){
            contaPessoas++;
        }
        
        System.out.println("\nLista de convidados");
        imprimir(v, contaPessoas);
        pesquisar(v, "Guimaraes Rosa", contaPessoas);
        
        System.out.println("Informe o indice do convidado que voce quer excluir: ");
        int x = sc.nextInt();
        String excluido = excluir(v, x, contaPessoas);
        if(excluido != null){
            System.out.println("\nExcluido: " + excluido);
            contaPessoas--;
        } else {
            System.out.println("\nLista vazia");
        }
        System.out.println("\nLista de convidados");
        imprimir(v, contaPessoas);
//        String primeiroDaLista = excluirPrimeiro(v, contaPessoas);
//        if(primeiroDaLista != null){
//            System.out.println("\nExcluido: " + primeiroDaLista);
//            contaPessoas--;
//        } else {
//            System.out.println("\nLista vazia");
//        }
//      
//        System.out.println("\nLista de convidados");
//        imprimir(v, contaPessoas);
//        String ultimoDaLista = excluirUltimo(v, contaPessoas);
//        if(ultimoDaLista != null){
//            System.out.println("\nExcluido: " + ultimoDaLista);
//            contaPessoas--;
//        } else {
//            System.out.println("\nLista vazia");
//        }
//      
//        System.out.println("\nLista de convidados");
//        imprimir(v, contaPessoas);

    }
    
    
}
