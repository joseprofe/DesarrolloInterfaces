import java.util.function.Predicate;

public class LibroUtils {
	public static Predicate<Libro> filtroGenero(String genero) {
		return (Libro l) -> l.getGenero().equals(genero);
	}
}