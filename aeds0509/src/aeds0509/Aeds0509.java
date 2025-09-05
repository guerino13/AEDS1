package aeds0509;

import java.util.Scanner;

public class Aeds0509 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int add;
        System.out.println("Defina o numero de convidados: ");
        add = sc.nextInt();
        String[] lista = new String[add];
        String nome;
        String op = "S";
        while(op != "N"){
            for (int i = 0; i < add; i++) {
                System.out.println("Digite o nome do convidado: ");
                nome = sc.next();
                lista[i] = nome;
            }
            System.out.println("Deseja adicionar mais convidados? (Digite 'S' ou 'N')");
            op = sc.next();
            if(op.equals("S")){
                String[] lista2 = new String[add * 2];
                for (int i = 0; i < lista2.length; i++) {
                System.out.println("Digite o nome do convidado: ");
                nome = sc.next();
                lista[i] = nome;
              }
            }else{
                op = "N";
            }
            System.out.println("Digite o nome do convidado a ser verificado: ");
            nome = sc.next();
            for(int i = 0; i < lista.length; i++){
                if(nome.equals(lista[i])){
                    System.out.println("Convidado."); 
                }else 
                    for( i = 0; i < lista2.length; i++){
                        
                    }
            }
        }
    }
    
}
