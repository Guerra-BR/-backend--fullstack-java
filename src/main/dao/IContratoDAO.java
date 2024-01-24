package main.dao;

import main.Pessoa;

public interface IContratoDAO {
    public boolean salvar();
    public boolean atualizar(Pessoa pessoa);
    public boolean excluir(String nome);
    public Pessoa buscar(String nome);
}
