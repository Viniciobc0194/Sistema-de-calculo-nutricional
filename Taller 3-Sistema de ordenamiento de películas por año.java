// Autor: Vinicio Bombón
// Taller 3-Sistema de ordenamiento de películas por año

class Pelicula {
    String titulo;
    int anio;
    String genero;

    Pelicula(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return anio + " - " + titulo + " (" + genero + ")";
    }
}

public class OrdenarPeliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pelicula> lista = new ArrayList<>();

        System.out.print("¿Cuántas películas desea ingresar?: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nPelícula #" + (i + 1));
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Año de lanzamiento: ");
            int anio = sc.nextInt();
            sc.nextLine();
            System.out.print("Género: ");
            String genero = sc.nextLine();
            lista.add(new Pelicula(titulo, anio, genero));
        }

        lista.sort(Comparator.comparingInt(p -> p.anio));

        System.out.println("\n📽️ Lista de películas ordenadas por año:");
        for (Pelicula p : lista) {
            System.out.println(p);
        }

        sc.close();
    }
}
