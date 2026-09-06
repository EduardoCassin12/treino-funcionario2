package Dominio;

public class Funcionario {

    private String id;
    private String nome;
    private String cargo;
    private double salario;
    private double salarioAnual;
    private int diasDeServico;


    public double calcularSalarioAnual(int meses) {
        salarioAnual = salario * meses;
        return salarioAnual;
    }

    public double aumentarSalario(double percentual) {
        if(diasDeServico > 365 && percentual > 0) {
            salario += salario * (percentual / 100);
        } else {
            System.out.println("O funcionário não tem direito a aumento de salário.");
        }
        return salario;
    }

    public double aumentarSalario(double valor, boolean valorFixo) {
        if (valorFixo == true) {
            salario += valor;
        } else {
            System.out.println("Valor inválido! O aumento deve ser um valor fixo.");
        }
        return salario;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int getDiasDeServico() {
        return diasDeServico;
    }

    public void setDiasDeServico(int diasDeServico) {
        this.diasDeServico = diasDeServico;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Dias de Serviço: " + diasDeServico);
        System.out.println("Salário Anual: " + salarioAnual);
    }
}

