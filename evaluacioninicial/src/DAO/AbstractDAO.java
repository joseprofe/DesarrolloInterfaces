package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Common.ConstantsEv;

public abstract class AbstractDAO {
	protected Connection con;
	
	public AbstractDAO() {
		ConectarBD();
	}
	
	private void ConectarBD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				this.con = DriverManager.getConnection(ConstantsEv.conexionBD, ConstantsEv.userBD,
						ConstantsEv.passwordBD);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
