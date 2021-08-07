package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dominio.Cliente;
import dominio.Conta;
import factory.ConnectionFactory;

public class ContaDao {

	Connection conexao;

	public ContaDao() throws SQLException {
		this.conexao = ConnectionFactory.getConnection();
	}
	
	
	public void save(Conta conta) throws SQLException {
		Statement comando = conexao.createStatement();
		
		comando.execute(
		"insert into conta (numeroConta,numeroAgencia,saldo,id_cliente ) values("
		+ "'" + conta.getNumeroConta() +"'"
		+ ",'"+ conta.getNumeroAgencia()+"'"
		+ ",'"+ conta.getSaldo()+"'"
		+ ",'"+ conta.getCliente().getId()+ "'" 
		+ ");"); 
						
	}
	
	public Conta delete(int id) throws SQLException {
		
		try {
			Statement comando = this.conexao.createStatement();
			String delete = "DELETE FROM conta WHERE id = ' "+id +"';";
					
			comando.execute(delete);
				
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	
	}	
	
	public Conta findByNumeroAgenciaAndNumeroConta(String numeroConta, String numeroAgencia) throws SQLException {
		
		try {
			Statement comando = this.conexao.createStatement();
			
			String find = "select * from conta where numeroConta = '"+numeroConta+"' and numeroAgencia = '"+numeroAgencia+"';";
			comando.execute(find);
				
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return null;
	
	}
	
//	public void atualizar(Conta conta) throws SQLException {
//		Statement comando = conexao.createStatement();
//		
//	}

}
