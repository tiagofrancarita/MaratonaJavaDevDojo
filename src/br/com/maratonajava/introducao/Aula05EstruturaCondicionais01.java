package br.com.maratonajava.introducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;

        boolean autorizaCompraBebida = idade >= 18;

        //

        if (autorizaCompraBebida != false) {
            System.out.println("Pode comprar");

        }
        System.out.println("Não pode comprar");
    }
}
