
import java.util.Scanner;

public class JuegoFantasia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego. Escriba 1 para iniciar ahora");
        int eleccion = scanner.nextInt();

        while (eleccion == 1) {
            System.out.println("Presione 1 para crear un personaje");
            System.out.println("Presione 2 para cerrar el programa");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                crearPersonaje(scanner);
            } else if (opcion == 2) {
                eleccion = 2;
            }
        }
    }

    public static void crearPersonaje(Scanner scanner) {
        System.out.println("¿Qué nombre deseas que tenga tu personaje?");
        String nombre = scanner.next();

        System.out.println("¿Qué raza deseas que sea tu personaje? (elfo/orco)");
        String raza = scanner.next().toLowerCase();

        System.out.println("¿Qué clase deseas que sea tu personaje? (guerrero)");
        String clase = scanner.next().toLowerCase();

        Personaje personaje = PersonajeFactory.crearPersonaje(nombre, raza, clase);

        if (personaje != null) {
            System.out.println(personaje);
            pelea(personaje);
        } else {
            System.out.println("No se pudo crear un personaje.");
        }
    }

    public static void pelea(Personaje personaje) {
        System.out.println("¡Prepárate para la pelea!");
        Personaje enemigo = PersonajeFactory.crearEnemigoAleatorio();

        if (enemigo == null) {
            System.out.println("No se pudo crear un enemigo. La pelea no puede continuar.");
            return;
        }

        System.out.println("Enfrentando a:\n" + enemigo);

        int ataquesRealizados = 0;

        while (ataquesRealizados < 5) {
            personaje.atacar(enemigo);
            System.out.println(enemigo);

            if (!enemigo.estaVivo()) {
                System.out.println("¡Has derrotado al enemigo!");
                break;
            }

            enemigo.atacar(personaje);
            System.out.println(personaje);

            if (!personaje.estaVivo()) {
                System.out.println("¡Has sido derrotado!");
                break;
            }

            ataquesRealizados++;
        }

        if (personaje.getSalud() > enemigo.getSalud()) {
            System.out.println("¡Ganaste la pelea!");
        } else if (personaje.getSalud() < enemigo.getSalud()) {
            System.out.println("¡Perdiste la pelea!");
        } else {
            System.out.println("La pelea terminó en empate.");
        }
    }
}
