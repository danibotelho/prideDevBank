package executavel;

import java.sql.SQLException;

import dao.ClienteDao;
import dao.ContaDao;
import dominio.Cliente;
import dominio.Conta;




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
		ContaDao contaDao = new ContaDao();
		ClienteDao clienteDao = new ClienteDao();
		
		Cliente cliente = new Cliente("Jimmy","96325874100","Jim");
		//clienteDao.save(cliente);

		cliente = clienteDao.findByCPF("96325874100");
		System.out.println(cliente.getId() + " " + cliente.getNome() );
				
		Conta conta = new Conta("25578","2323",250,cliente);
		contaDao.findByNumeroAgenciaAndNumeroConta("25578","2323");
		//contaDao.save(conta);
		
		//contaDao.delete(12);
		//clienteDao.delete(19);
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
