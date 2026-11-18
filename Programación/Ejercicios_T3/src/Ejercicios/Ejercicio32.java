package Ejercicios;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio32 {
    public static void main(String[] args) {
        //creamos objeto canción
        ArchivoMP3 cancion = new ArchivoMP3("alexmorgan.mp3");
        //creamos objeto reproductor
        Reproductor reproductor = new Reproductor(cancion,false,true);
        reproductor.play();
        //ahora pedimos el título y autor de la canción.
        String tituloCancion = cancion.getTitulo();
        String autor = cancion.getAutor();
        Long duracion = cancion.getDuracion() / 1000;
        System.out.println("La canción es titulada: " + tituloCancion);
        System.out.println("El autor es; " + autor);
        System.out.println("La duración es de: " + duracion + "s");
    }
}
