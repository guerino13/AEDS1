package aula1809;

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
    
    public static void main(String[] args) {
        //String v[] = new String[5]; // 0,1,2,3,4
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
        
        String primeiroDaLista = excluirPrimeiro(v, contaPessoas);
        if(primeiroDaLista != null){
            System.out.println("\nExcluido: " + primeiroDaLista);
            contaPessoas--;
        } else {
            System.out.println("\nLista vazia");
        }
      
        System.out.println("\nLista de convidados");
        imprimir(v, contaPessoas);
        
//        Scanner in = new Scanner(System.in);
//        System.out.print("Dê o nome: ");
//        String convidado = in.nextLine();
//        boolean inseriu = insere(v, convidado, contaPessoas);
//        if(inseriu){
//            contaPessoas++;
//        }else{
//            System.out.println("Lista cheia!");
//        }
//
//        System.out.print("Dê o nome: ");
//        convidado = in.nextLine();
//        inseriu = insere(v, convidado, contaPessoas);
//        if(inseriu){
//            contaPessoas++;
//        }else{
//            System.out.println("Lista cheia!");
//        }
        
      
    }
    
    
}
