package br.com.maratonajava.introducao;

public class aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

        //Sintaxe operador ternário;
        // String resultado = (condicao) ? valor se verdadeiro : valor se falso;

        double salario = 7600;
        String mensagem = "Vou doar.";
        String naoDoar = "Não vou doar";
        String resultado = (salario >= 6000) ? resultado = mensagem : naoDoar;

           /* if (salario >= 6000){

                resultado = mensagem;

            }else if (salario <6000)
            {
                resultado = naoDoar;

            }
            System.out.println(resultado);*/

        System.out.println(resultado);

    }
}
