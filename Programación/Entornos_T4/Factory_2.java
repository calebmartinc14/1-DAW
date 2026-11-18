import bpc.patrones.factory.streetfighter.EntradaMando;
import bpc.patrones.factory.streetfighter.Personaje;
import bpc.patrones.factory.streetfighter.PersonajeFactory;

import java.util.Scanner;

public class Factory_2 {
    public static void main(String[] args) {
        Personaje personaje = null;
        System.out.println("""
                Elige el personaje:
                1. Ryu
                2. Ken
                3. Guile
                4. Blanka
                """);
        int opcion = new Scanner(System.in).nextInt();
        Personaje player1 = PersonajeFactory.getPersonaje(opcion);
        player1.movimientoEspecial(EntradaMando.ABAJOx2_ARRIBA_PUÑO);
    }
}
