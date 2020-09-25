package Common;

public class ConstantsEv {
	private static String serverBD = "localhost:3306";
	private static String database = "evaluacioninicial";
	public static String conexionBD = "jdbc:mysql://" + serverBD + "/" + database
			+ "?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

}
