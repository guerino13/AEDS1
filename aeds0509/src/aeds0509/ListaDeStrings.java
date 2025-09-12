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

        Scanner in2 = new Scanner(System.in);
        while (true) {
            System.out.print("Dê o nome: ");
            v[contaPessoas] = in.nextLine();

            if (contaPessoas >= v.length) {
                String aux[] = new String[v.length * 2];
                for (int i = 0; i < contaPessoas; i++) {
                    aux[i] = v[i];
                }
                v = aux;
            }
            System.out.println("Deseja parar?(S/N) ");
            char resposta = in2.next().toUpperCase().charAt(0);
            if (resposta == 'S') {
                break;
            }
        }
        System.out.println("Lista de Convidados ");
        for (int i = 0; i < contaPessoas; i++) {
            System.out.println(i + "- " + v[i]);
        }

        System.out.print("Pesquisa: ");
        convidado = in.nextLine();
        boolean achou = false;
        for (int i = 0; i < contaPessoas; i++) {
            if (convidado.equalsIgnoreCase(v[i])) {
                achou = true;
            }
        }
        if (!achou) {
            System.out.println(convidado + " nao convidado!");
        } else {
            System.out.println(convidado + " esta na lista");
        }
    }

    public static boolean inserirConvidado(String[] c, String elemento, int pos) {
        if (!(pos >= c.length)) {
            c[pos] = elemento;
            return true;
        } else {
            return false;
        }

    }

}
