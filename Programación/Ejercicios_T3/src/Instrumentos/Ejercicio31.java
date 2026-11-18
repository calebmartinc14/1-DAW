package Instrumentos;

import bpc.daw.musica.*;

import java.util.Scanner;

//Sonido: 0=DO 1=RE 2=MI 3=FA 4=SOL 5=LA 6=SI;
//Duracion: 0=Redonda 1=Blanca 2=Negra 3=Corchea 4=Semicorchea
public class Ejercicio31 {

    public static String menuCanciones(){
        System.out.println("""
                Elige la canción:
                1. Estrellita
                2. Canción 2
                """);
        String opcion2 = new Scanner(System.in).nextLine();
        return opcion2;
    }

    public static Cancion opcionCancion(String opcion){
        Cancion cancion = null;
        if(opcion.equals("1")){
            cancion = getEstrellita();
        }else if(opcion.equals("2")){
            cancion = Canciones.getCancion2();
        }
        return cancion;
    }


    public static Cancion getEstrellita(){
        Cancion cancion1 = new Cancion("Estrellita");

        NotaMusical notaDoNegra = new NotaMusical(0,2);
        NotaMusical notaSolNegra = new NotaMusical(4,2);
        NotaMusical notaLaNegra = new NotaMusical(5,2);
        NotaMusical notaSolBlanca = new NotaMusical(4,1);
        NotaMusical notaFaNegra = new NotaMusical(3,3);
        NotaMusical notaMiNegra = new NotaMusical(2,3);
        NotaMusical notaReNegra = new NotaMusical(1,4);
        NotaMusical notaMiNegra2 = new NotaMusical(1,4);
        NotaMusical notaFaNegra2 = new NotaMusical(3,4);

        cancion1.añadir(notaDoNegra);
        cancion1.añadir(notaDoNegra);
        cancion1.añadir(notaSolNegra);
        cancion1.añadir(notaSolNegra);
        cancion1.añadir(notaLaNegra);
        cancion1.añadir(notaLaNegra);
        cancion1.añadir(notaSolBlanca);
        cancion1.añadir(notaFaNegra);
        cancion1.añadir(notaFaNegra);
        cancion1.añadir(notaMiNegra);
        cancion1.añadir(notaReNegra);
        cancion1.añadir(notaMiNegra2);
        cancion1.añadir(notaFaNegra2);
        cancion1.añadir(notaReNegra);

        return cancion1;
    }

    public static String mostrarMenu(){
        System.out.println("""
                Elige el instrumento:
                1. Piano
                2. Guitarra
                3. Xilofono
                """);
        String opcion = new Scanner(System.in).nextLine();
        return opcion;
    }
    public static Instrumento opcionInstrumento(String opcion){
        Instrumento instrumento = null;
        if(opcion.equals("1")){
            instrumento = new Piano();
        }else if(opcion.equals("2")){
            instrumento = new Guitarra();
        }else if(opcion.equals("3")){
            instrumento = new Xilofono();
        }else{
            System.out.println("Opción incorrecta");
        }
        return instrumento;
    }

    public static void reproducir(Instrumento instrumento, Cancion cancion){
        if(instrumento==null || cancion==null){
            System.out.println("Opción incorrecta");
        }else{
            instrumento.reproducir(cancion);
        }
    }

    public static void main(String[] args) {
        //Cancion cancion1 = getEstrellita();
        String opcionCancion = menuCanciones();
        Cancion cancion = opcionCancion(opcionCancion);
        String opcion = mostrarMenu();
        Instrumento instrumento = opcionInstrumento(opcion);
        reproducir(instrumento,cancion);
    }
}
