/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main( String[] args) throws SQLException {
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/Loja_Virtual?Timezone=true&serverTimezone=UTC", "root", "1004");
		
		java.sql.Statement stm = con.createStatement();
		stm.execute( "SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
		}
		
		
		
			
		con.close();
			
	}
}
*/