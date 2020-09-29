package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Usuario;

public class UsuarioDAO extends AbstractDAO{

	public UsuarioDAO() {
		super();
	}

	public boolean Login(Usuario u) {
		Statement stmt;
		try {
			stmt = this.con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from usuarios "
											+ "where username='"+u.getUsername()
											+ "' and password='"+u.getPassword()
											+ "';");
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	

}
