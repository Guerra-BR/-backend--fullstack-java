package main.service;

import main.Pessoa;
import main.dao.IContratoDAO;

public class ContratoService {
    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    public String salvar(){
        contratoDAO.salvar();
        return "Sucesso";
    }

    public String atualizar(){
        contratoDAO.atualizar(new Pessoa("nome", "M"));
        return "Sucesso";
    }

    public String excluir(String nome){
        return "Sucesso";
    }

    public Pessoa buscar(String nome){
        return contratoDAO.buscar(nome);
    }
}
