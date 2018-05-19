package br.com.caelum.agenda.teste;

import br.com.caelum.agenda.dao.FuncionarioDao;
import br.com.caelum.agenda.modelo.Funcionario;

public class TestaInsereFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setSenha("pass");
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);
		
		System.out.println("Funcionario inserido!");
	}
}
