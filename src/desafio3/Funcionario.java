package desafio3;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        System.out.println("PRECISA DE UM GERENTE!");
    }
    public void setSalario(Gerente gerente, double salario) {
        if(gerente != null)
        this.salario += salario;
        else{
            System.out.println("Funcionario inexistente!");
        }
    }
}
