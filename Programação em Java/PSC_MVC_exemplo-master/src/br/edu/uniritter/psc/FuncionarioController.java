package br.edu.uniritter.psc;

public class FuncionarioController {

    FuncionarioDB db;
    FuncionarioView view;

    public FuncionarioController() {
        this.db = FuncionarioDB.getInstance();
        FuncionarioDB db1 = FuncionarioDB.getInstance();
        this.view = new FuncionarioView();
    }

    public void novoFuncionario() {
        Funcionario f = view.displayFormularioFuncionario(db.getCargos());
        db.incluir(f);
    }

    public void listarComSalario() {
        view.listarComSalario(db.getTodosFuncionarios());
    }
    public void listarSemSalario() {
        view.listarSemSalario(db.getTodosFuncionarios());
    }
}
