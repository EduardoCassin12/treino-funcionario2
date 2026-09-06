package Domain;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id) {

        Funcionario funcionario = buscarFuncionario(id);

        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println("Funcionário removido.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public Funcionario buscarFuncionario(int id) {

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getId() == id) {
                return funcionario;
            }
        }

        return null;
    }

    public void listarFuncionarios() {

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInformacoes();
        }
    }

    public double calcularFolhaSalarial() {

        double total = 0;

        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }

        return total;
    }
}