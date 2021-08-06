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
			
			comando.execute("insert into cliente (nome, cpf, nomeSocial) values(" 
			+"'" + cliente.getNome() +"'"
			+ ",'"+ cliente.getCPF()+"'"
			+ ",'"+ cliente.getNomeS()+ "'"
			+ ");" ); 
					
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	
						
	}

}
