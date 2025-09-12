package aeds0509;

import java.util.Scanner;

public class ListaDeStrings {

    public static void main(String[] args) {
        String v[] = new String[5]; // 0,1,2,3,4
        int contaPessoas = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Dê o nome: ");
        String convidado = in.nextLine();
        if (inserirConvidado(v, convidado, contaPessoas)) {
            contaPessoas++;
        } else {
            System.out.println("Lista cheia! ");

        }
        imprimir(v, contaPessoas);
        
        System.out.println("Digite o nome do convidado a ser pesquisado: ");
        String c = in.nextLine();
        pesquisar(v, c);
        
//        Scanner in2 = new Scanner(System.in);
//        while (true) {
//            System.out.print("Dê o nome: ");
//            v[contaPessoas] = in.nextLine();
//
//            if (contaPessoas >= v.length) {
//                String aux[] = new String[v.length * 2];
//                for (int i = 0; i < contaPessoas; i++) {
//                    aux[i] = v[i];
//                }
//                v = aux;
//            }
//            System.out.println("Deseja parar?(S/N) ");
//            char resposta = in2.next().toUpperCase().charAt(0);
//            if (resposta == 'S') {
//                break;
//            }
//        }
//        System.out.println("Lista de Convidados ");
//        for (int i = 0; i < contaPessoas; i++) {
//            System.out.println(i + "- " + v[i]);
//        }
//
//        System.out.print("Pesquisa: ");
//        convidado = in.nextLine();
//        boolean achou = false;
//        for (int i = 0; i < contaPessoas; i++) {
//            if (convidado.equalsIgnoreCase(v[i])) {
//                achou = true;
//            }
//        }
//        if (!achou) {
//            System.out.println(convidado + " nao convidado!");
//        } else {
//            System.out.println(convidado + " esta na lista");
//        }
    }

    public static boolean inserirConvidado(String[] c, String elemento, int ultimo) {
        if (!(ultimo >= c.length)) {
            c[ultimo] = elemento;
            return true;
        } else {
            return false;
        }

    }
    
    public static void imprimir(String[] lista, int pos){
        for(int i = 0; i < pos; i++){
            System.out.println(lista[i]);
        }
    }
    
    public static String pesquisar(String lista[], String elemento){
        for(int i = 0; i < lista.length; i++){
        if(lista[i].equals(elemento)){
            System.out.println(elemento + " esta convidado.");
            return elemento;
        } else {
            System.out.println("Nao esta na lista.");
            return null;
        }
        }
        return elemento;
    }
}
