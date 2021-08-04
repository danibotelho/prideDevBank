package executavel;

import java.sql.SQLException;

import dao.ContaDao;
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
		Conta conta = new Conta("25471","2323");
		contaDao.save(conta);
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
