package desafio1.entities;

import desafio1.entities.Funcionario;
import desafio1.entities.PessoaFisica;
import desafio1.entities.PessoaJuridica;

public class Main {

    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica("Jorge Dos Santos", 1231231231);
        PessoaFisica pf = new PessoaFisica("Odair Barbosa", 321321321);
        Funcionario funcionario1 = new Funcionario("Brian Zavala", 717285881, 637702);

        System.out.println(pj);
        System.out.println(pf);
        System.out.println(funcionario1);
    }
}
