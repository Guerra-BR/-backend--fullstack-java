import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno");
        double nota1 = s.nextDouble();
        System.out.println("Insira a segunda nota do aluno");
        double nota2 = s.nextDouble();
        System.out.println("Insira a terceira nota do aluno");
        double nota3 = s.nextDouble();
        System.out.println("Insira a quarta nota do aluno");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aluno aprovado");
        } else if(media >= 5){
            System.out.println("Aluno retido para recuperação");
        } else{
            System.out.println("Aluno reprovado");
        }
    }
}