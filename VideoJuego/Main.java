import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al juego. Escriba 1, si desea iniciar ahora");
        Scanner scanner = new Scanner(System.in);
        int eleccion = scanner.nextInt();
        while (eleccion == 1) {
            System.out.println("Presione 1 para crear un personaje");
            System.out.println("Presione 2 para cerrar el programa");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                crearPersonaje();
            } else if (opcion == 2) {
                eleccion = 2;
            }
        }
    }

    public static void crearPersonaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué nombre deseas que tenga tu personaje?");
        String nombre = scanner.next();
        System.out.println("¿Qué raza deseas que sea tu personaje?");
        String raza = scanner.next();
        System.out.println("¿Qué clase deseas que sea tu personaje?");
        String clase = scanner.next();
        Personaje personaje = null;
        if (raza.equals("elfo") && clase.equals("guerrero")) {
            personaje = new ElfoGuerrero(nombre);
        } else if (raza.equals("orco") && clase.equals("guerrero")) {
            personaje = new OrcoGuerrero(nombre);
        } else {
            System.out.println("No se pudo crear un personaje.");
        }

        System.out.println(personaje);
    }
}