package Instrumentos;

import bpc.daw.musica.Cancion;
import bpc.daw.musica.NotaMusical;

public class Canciones {

    public static Cancion getCancion2(){
        Cancion cancion2 = new Cancion("Cancion 2");
        NotaMusical nota1 = new NotaMusical(0,2);
        NotaMusical nota2 = new NotaMusical(1, 2);
        NotaMusical nota3 = new NotaMusical(2, 2);
        NotaMusical nota4 = new NotaMusical(3, 2);
        NotaMusical nota5 = new NotaMusical(4, 2);
        NotaMusical nota6 = new NotaMusical(5, 2);
        NotaMusical nota7 = new NotaMusical(6, 2);
        //añadimos las notas
        cancion2.añadir(nota1);
        cancion2.añadir(nota2);
        cancion2.añadir(nota3);
        cancion2.añadir(nota4);
        cancion2.añadir(nota5);
        cancion2.añadir(nota6);
        cancion2.añadir(nota7);
        return cancion2;
    }
}
