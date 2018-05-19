package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.agenda.ConnectionFactory;
import br.com.caelum.agenda.exception.DaoException;
import br.com.caelum.agenda.modelo.Funcionario;

public class FuncionarioDao {
	
	private Connection connection;
	
	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionario "
				+ "(senha) "
				+ "values (?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getSenha());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

}
