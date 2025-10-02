package aeds0210;

import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila v = new Fila();
        int x = sc.nextInt();
        v.criaFilaVazia(x);
        int y;
        do{
            y = sc.nextInt();
            v.enfileira(y);
            

 
        }while(y != x);
        v.imprime();
        
        
                
    }
}
