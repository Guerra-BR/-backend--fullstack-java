public class Main {
    public static void main(String[] args) {
        Pessoa pf = criarPessoaFisica(12312312312l, "Pessoa Fisica 1", 18);

        Pessoa pj = criarPessoaJuridica(123412341324l, "Pessoa Juridica 1", 20);
    }

    private static Pessoa criarPessoaJuridica(Long cnpj, String nome, Integer idade) {
        Pessoa pj = new PessoaJuridica(cnpj);
        pj.setNome(nome);
        pj.setIdade(idade);
        return pj;
    }

    private static Pessoa criarPessoaFisica(Long cpf, String nome, Integer idade) {
        Pessoa pf = new PessoaFisica(cpf);
        pf.setNome(nome);
        pf.setIdade(idade);
        return pf;
    }
}