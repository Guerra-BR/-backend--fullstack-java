package tests;


import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestRunner {
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
                Assert.assertEquals("F", pp[1]);
            }
        });





        mulheres.forEach(pessoa -> {
            Assert.assertEquals("F", pessoa.getSexo());
            System.out.println(pessoa);
        });
    }
}
