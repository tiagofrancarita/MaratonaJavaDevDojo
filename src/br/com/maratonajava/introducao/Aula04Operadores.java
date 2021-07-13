package br.com.maratonajava.introducao;

public class Aula04Operadores {

    public static  void main (String[] args){

        // Operadores aritimeticos "+", "-", "*", "/",

        int numero1 = 20;
        int numero2 = 30;

        System.out.println("A soma entre os numeros é: " + (numero1 + numero2));
        System.out.println("A subtração entre os numeros é:" + (numero2 - numero1));
        System.out.println("A multiplicação entre os numeros é:"  + (numero1*numero2));
        System.out.println("A divisão entre os numeros é:"  + (numero1/ (double) numero2));

        // % -->  Operador de resto da divisão:

        int  resto = 20 % 2;
        System.out.println("Resto:" + resto);


        //Operadores logicos sempre vão ter um retorno booleano (True / false);
        //< - menor que, > - maior que, <= - menor igual, >= maior igual, != diferente;

        boolean compara = 10 > 20;
        boolean compara1 = 10 < 20;
        boolean compara2 = 10 == 20;
        boolean compara3 = 10 == 10;
        boolean compara4 = 10 != 5;

        System.out.println("10 maior que 20 ?:" + compara);
        System.out.println("10 menor que 20 ?:" + compara1);
        System.out.println("10 igual que 20 ?:" + compara2);
        System.out.println("10 igual que 10 ?:" + compara3);
        System.out.println("10 diferente de 5 ?:" + compara4);

        // And = "&&", OR "||" , NOT "!";

        int idade = 29;
        float salario = 3500F;
        boolean dentroDaLeiMaior30 = idade >= 30 && salario >= 4612;
        boolean dentroDaLeiMenor30 = idade < 30 && salario >= 3381;

        System.out.println("Dentro da Lei maior que 30:"  + dentroDaLeiMaior30);
        System.out.println("Dentro da lei menor que 30:"  + dentroDaLeiMenor30);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPS5Compravel = 5000f;

        boolean Ps5Compravel = valorContaCorrente > valorPS5Compravel || valorContaPoupanca > valorContaCorrente;

        System.out.println("Compra ps5 ? "  + Ps5Compravel);

        //Operadores de atribuição
        // "=", "+=", "-=", "*=", "/=", "%="

        double bonus = 1800;

        // bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //Operadores Unários;
        //++ --;

        int contador = 0;
        contador += 1;
        contador++ ;
        contador--;

        ++contador;
        --contador;

    }

}
