package br.com.maratonajava.introducao;

public class aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        // idade < 15 categoria infantil;
        // idade >= 15 && idade < 18 categoria juvenil;
        // idade >= 18 categoria adulto;

        int idade = 27;

        if (idade < 15) {

            System.out.println("Categoria infantil");

        } else if (idade >= 15 && idade < 18) {

            System.out.println("Categoria Juvenil");

        } else if (idade >= 18 && idade < 60) {

            System.out.println("Categoria Adulto");
        } else {
            System.out.println("Categoria Idoso");
        }



    }
}
