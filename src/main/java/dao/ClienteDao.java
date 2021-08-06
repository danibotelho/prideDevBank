package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dominio.Cliente;
import factory.ConnectionFactory;

public class ClienteDao {
	
	 Connection conexao;

	public ClienteDao() throws SQLException {
		this.conexao = ConnectionFactory.getConnection();
	}
	
	
	public void save(Cliente cliente) throws SQLException {
		
		try {
			Statement comando = this.conexao.createStatement();
			
			String insert = "insert into cliente  values(nome, cpf, nomeSocial)"
			+"'" + cliente.getNome() +"'"
			+ ",'"+ cliente.getCPF()+"'"
			+ ",'"+ cliente.getNomeS()+ "'"
			+ ");" 
			;
			
			comando.execute(insert);
			
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	
						
	}

}
