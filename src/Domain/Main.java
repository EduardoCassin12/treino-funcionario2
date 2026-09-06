package Domain;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Company");

        Funcionario funcionario1 =
                new Funcionario(1, "Eduardo", "Desenvolvedor", 3500);

        Funcionario funcionario2 =
                new Funcionario(2, "João", "Analista", 3000);

        Funcionario funcionario3 =
                new Funcionario(3, "Maria", "Gerente", 5000);

        Funcionario funcionario4 =
                new Funcionario(4, "Carlos", "Suporte", 2500);

        Funcionario funcionario5 =
                new Funcionario(5, "Ana", "Desenvolvedora", 4000);


        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.adicionarFuncionario(funcionario4);
        empresa.adicionarFuncionario(funcionario5);


        System.out.println("=== FUNCIONÁRIOS ===");

        empresa.listarFuncionarios();


        System.out.println("=== BUSCANDO FUNCIONÁRIO ===");

        Funcionario funcionarioEncontrado =
                empresa.buscarFuncionario(3);

        if (funcionarioEncontrado != null) {
            funcionarioEncontrado.exibirInformacoes();
        }


        System.out.println("=== AUMENTANDO SALÁRIO ===");

        funcionarioEncontrado.aumentarSalario(20);

        funcionarioEncontrado.exibirInformacoes();


        System.out.println("=== REMOVENDO FUNCIONÁRIO ===");

        empresa.removerFuncionario(4);


        System.out.println("=== FUNCIONÁRIOS ATUAIS ===");

        empresa.listarFuncionarios();


        System.out.println("=== FOLHA SALARIAL ===");

        double total = empresa.calcularFolhaSalarial();

        System.out.println("Total: R$ " + total);
    }
}