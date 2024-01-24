package main.dao;

import main.Pessoa;

public class ContratoDAO implements IContratoDAO {
    @Override
    public boolean salvar() {
        return false;
    }

    @Override
    public boolean atualizar(Pessoa pessoa) {
        return false;
    }

    @Override
    public boolean excluir(String nome) {
        throw new RuntimeException();
    }

    @Override
    public Pessoa buscar(String nome) {
//        Pessoa p = new Pessoa("Nome1", "M");
        throw new RuntimeException();
    }
}
