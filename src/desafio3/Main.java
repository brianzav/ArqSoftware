package desafio3;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Brian", 3000.00);
        Gerente gerente = null;

        funcionario.setSalario(gerente,500);
        System.out.println(funcionario.getSalario());
    }
}
