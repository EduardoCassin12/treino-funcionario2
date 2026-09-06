package Teste;

import Dominio.Funcionario;


    public class FuncionarioTest01 {
        public static void main(String[] args) {

            Funcionario funcionario1 = new Funcionario();
            funcionario1.setId("001");
            funcionario1.setNome("João");
            funcionario1.setCargo("Desenvolvedor");
            funcionario1.setSalario(5000.00);
            funcionario1.setDiasDeServico(400);
            funcionario1.calcularSalarioAnual(12);

            Funcionario funcionario2 = new Funcionario();
            funcionario2.setId("002");
            funcionario2.setNome("Maria");
            funcionario2.setCargo("Analista");
            funcionario2.setSalario(4500.00);
            funcionario2.setDiasDeServico(365);
            funcionario2.calcularSalarioAnual(6);

            Funcionario funcionario3 = new Funcionario();
            funcionario3.setId("003");
            funcionario3.setNome("Pedro");
            funcionario3.setCargo("Gerente");
            funcionario3.setSalario(6000.00);
            funcionario3.setDiasDeServico(100);
            funcionario3.calcularSalarioAnual(4);

            Funcionario funcionario4 = new Funcionario();
            funcionario4.setId("004");
            funcionario4.setNome("Ana");
            funcionario4.setCargo("Assistente");
            funcionario4.setSalario(3500.00);
            funcionario4.setDiasDeServico(200);
            funcionario4.calcularSalarioAnual(12);

            System.out.println("Informações do Funcionário 1:");
            funcionario1.aumentarSalario(10);
            funcionario1.exibirInformacoes();
            System.out.println("\nInformações do Funcionário 2:");
            funcionario2.aumentarSalario(10);
            funcionario2.exibirInformacoes();
            System.out.println("\nInformações do Funcionário 3:");
            funcionario3.aumentarSalario(10);
            funcionario3.exibirInformacoes();
            System.out.println("\nInformações do Funcionário 4:");
            funcionario4.aumentarSalario(10);
            funcionario4.exibirInformacoes();

        }
    }

