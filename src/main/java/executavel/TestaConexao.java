package executavel;

import java.sql.SQLException;

import dao.ClienteDao;
import dao.ContaDao;
import dominio.Cliente;




public class TestaConexao {

	public static void main(String[] args) {
		
	try {
//		Connection con = ConnectionFactory.getConnection();
//		Statement comando = con.createStatement();
//		
//		comando.execute("select * from Conta");
//		
//		ResultSet resultado = comando.getResultSet();
//		
//		while(resultado.next()) {
//			
//			String numeroConta = resultado.getString("numeroConta");
//			System.out.println(numeroConta);
//		}
//						
//		con.close();
		
		//ContaDao contaDao = new ContaDao();
		
		Cliente cliente = new Cliente("Lara", "12345698745", "Laratfo");
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.save(cliente);
		
		//Conta conta = new Conta("25471","2323", 235 ,cliente);
		
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
