
public class PersonajeFactory {

    public static Personaje crearPersonaje(String nombre, String raza, String clase) {
        Personaje personaje = null;

        switch (raza) {
            case "elfo":
                personaje = new ElfoGuerrero(nombre);
                break;
            case "orco":
                personaje = new OrcoGuerrero(nombre);
                break;
            case "dragon":
                personaje = new Dragon(nombre);
                break;
            case "demonio":
                personaje = new Demonio(nombre);
                break;
            case "grifo":
                personaje = new Grifo(nombre);
                break;
            case "duende":
                personaje = new Duende(nombre);
                break;
        }

        return personaje;
    }

    public static Personaje crearEnemigoAleatorio() {
        String[] razas = {"elfo", "orco", "dragon", "demonio", "grifo", "duende"};
        int indiceAleatorio = (int) (Math.random() * razas.length);

        if (indiceAleatorio >= 0 && indiceAleatorio < razas.length) {
            String razaAleatoria = razas[indiceAleatorio];
            try {
                return crearPersonaje("Enemigo", razaAleatoria, "guerrero");
            } catch (IllegalArgumentException e) {
                System.out.println("Error al crear un enemigo: " + e.getMessage());
                return null;
            }
        }

        System.out.println("Error al seleccionar la raza aleatoria o raza nula.");
        return crearPersonaje("Enemigo", "orco", "guerrero");
    }
}
