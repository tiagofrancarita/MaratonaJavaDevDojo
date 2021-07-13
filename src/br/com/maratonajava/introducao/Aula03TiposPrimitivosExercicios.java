package br.com.maratonajava.introducao;
/*
Criar variaveis para os campos descritos abaixo entre <> e imprimir a seguinte mensagem
Eu <nome>, morando no endereço <enderecço>,
confirmo que recebi o salario de <salario>, na data <data>.
*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Tiago";
        String endereco = "Av Pe. Guilherme Decaminada, 415";
        String data = "06/07/2021";
        float salario = (float) 3510.12;

        System.out.println("Eu," + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$: " + salario + ", na data" + data);
    }
}
