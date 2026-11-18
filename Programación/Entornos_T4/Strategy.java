import bpc.patrones.strategy.*;

public class Strategy {
    public static void main(String[] args) {
        Jungla j = new Jungla();
        Mono marroqui = new Mono(120,90);
        Comida kebab = new Comida(290,360);
        j.añadirMono(marroqui);
        j.añadirComida(kebab);
        marroqui.setBusquedaComidaStrategy(new BusquedaEspiralStrategy());
        marroqui.buscarComida(kebab);
        j.visualizar();
    }
}
