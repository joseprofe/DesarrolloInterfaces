package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Common.ConstantsEv;

public class UsuarioDAO {

	public UsuarioDAO() {
		
	}
	
	protected Connection ConectarBD() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			try {
				con = DriverManager.getConnection(						
								ConstantsEv.conexionBD,
						"jose", "P@ssw0rd");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}

}
