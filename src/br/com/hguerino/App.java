package br.com.hguerino;
//SWING
//usado pra criar janelas pequenas no JAVA, lembra bastante o Oracle
//q usei
//DAO = DATA ACESS OBJECT

import br.com.hguerino.dao.ClienteMapDAO;
import br.com.hguerino.dao.IClienteDAO;
import br.com.hguerino.domain.Cliente;
import br.com.hguerino.screens.TelaPrincipal;

import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));

        if(cliente != null){
            JOptionPane.showMessageDialog(null, "Cliente encontrado:" +
                            cliente.toString(),
                    "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado",
                    "Consulta", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao) {
        return "2".equals(opcao);
    }

    private static void cadastrar(String dados) {
        String[] dadosSeprados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeprados[0], dadosSeprados[1], dadosSeprados[2], dadosSeprados[3],
                dadosSeprados[4], dadosSeprados[5], dadosSeprados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);

        if(isCadastrado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente ja se encontra cadastrado", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isOpcaoSair(String opcao) {
        return "5".equals(opcao);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Ate logo",
                "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        String[] opcoesValidas = {"1", "2", "3", "4", "5"};

        for(String o : opcoesValidas){
            if(o.equals(opcao)){
                return true;
            }
        }

        return false;
    }

    private static boolean isOpcaoCadastro(String opcao) {
        return "1".equals(opcao);
    }
}