package main.dao;

import main.Pessoa;

public class ContratoDAOMock implements IContratoDAO{
    @Override
    public boolean salvar() {
        return true;
    }

    @Override
    public boolean atualizar(Pessoa pessoa) {
        return true;
    }

    @Override
    public boolean excluir(String nome) {
        return true;
    }

    @Override
    public Pessoa buscar(String nome) {
        Pessoa p = new Pessoa("Nome1", "M");
        return p;
    }
}
