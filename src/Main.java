import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escreva as pessoas, separando-as por ';' e separando" +
                " seu sexo(M ou F) por ','");
        Scanner str = new Scanner(System.in);
        List<Pessoa> mulheres = new ArrayList<>();
        String sss = str.next();
        List<String> pessoaStringList = List.of(sss.split(";"));

        pessoaStringList.forEach(string -> {
            String[] pp = string.split(",");
            if (pp[1].equals("F")){
                Pessoa p = new Pessoa(pp[0], pp[1]);
                mulheres.add(p);
            }
        });





        mulheres.forEach(pessoa -> {
            System.out.println(pessoa.toString());
        });
    }
}