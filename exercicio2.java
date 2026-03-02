import java.util.Scanner;

void main (){
//        //ATIVIDADE 1
//        /*Faça um programa para ler dois valores inteiros, e depois mostrar
//        na tela a soma desses números com uma mensagem explicativa,
//        conforme exemplos*/
//
//        int n1 = 10;
//        int n2 = n1 + 30;
//        System.out.println("O resultado da soma é = " + n2);
//
//        int n3 = -30;
//        int n4 = n3 + 10;
//        System.out.println("O resultado da soma é = " + n4);
//
//        int n5 = 0;
//        int n6 = 0;
//        System.out.println("O resultado da soma é = " + n6);


        //ATIVIDADE 2
        /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar
        o valor da área deste círculo com quatro casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/

//        Scanner sc = new Scanner(System.in);
//        double valorDePi = 3.14159;
//
//        System.out.print("Digite o raio: ");
//
//        double raio = sc.nextDouble();
//        double area = valorDePi * (raio * raio);
//
//        System.out.printf("O valor da área é = %.4f%n", area);
//        System.out.println("Insira um valor válido");

        //ATIVIDADE 3 - Fazer um programa para ler quatro valores inteiros A, B, C e D.
        // A seguir, calcule e mostre a diferença do produto de A e B pelo produto
        // de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        int e = -7;
        int diferenca = a * b - c * d;
        int diferenca2 = a * b - e * d;

        System.out.println("DIFERENÇA = " + diferenca);
        System.out.println("DIFERENÇA = " + diferenca2);

}
