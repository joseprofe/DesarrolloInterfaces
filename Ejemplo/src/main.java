
import java.util.Arrays;
import java.util.List;

public class main {
	public static void main(String[] args) {
		Libro l = new Libro("El señor de los anillos", "fantasia", 1100);
		Libro l2 = new Libro("El Juego de Ender", "ciencia ficcion", 500);
		Libro l3 = new Libro("La fundacion", "ciencia ficcion", 500);
		Libro l4 = new Libro("Los pilares de la tierra", "historica", 1200);
		List<Libro> lista = Arrays.asList(l, l2, l3, l4);

		lista.stream().filter(gengar -> gengar.getPaginas() > 1000)
			.map(pollo -> pollo.getTitulo())
			.forEach(System.out::println);
		
	}
}