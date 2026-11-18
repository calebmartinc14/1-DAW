import bpc.patrones.decorator.mario.DisfrazMapache;
import bpc.patrones.decorator.mario.DisfrazRana;
import bpc.patrones.decorator.mario.Mario;

import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        System.out.println("""
                ¿Qué disfraz quieres ponerle a Mario?
                0. Sin Disfraz.
                1. Disfraz mapache.
                2. Disfraz de rana.
                """);
        int opcion = new Scanner(System.in).nextInt();
        Mario mario = new Mario();
        if(opcion==0){
            mario.avanzar(true);
            mario.retroceder(true);
            mario.saltar();
        } else if (opcion==1) {
            DisfrazMapache mapache = new DisfrazMapache(mario);
            mapache.golpear();
            mapache.getMario().saltar();
            mapache.getMario().avanzar(true);

        } else if (opcion==2) {
            DisfrazRana rana = new DisfrazRana(mario);
            rana.nadar();
            rana.superSalto();
            rana.getMario().avanzar(true);
            rana.getMario().saltar();
        }else{
            System.out.println("Opción incorrecta.");
        }
    }
}
