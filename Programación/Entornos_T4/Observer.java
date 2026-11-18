import bpc.patrones.observer.*;

public class Observer {
    public static void main(String[] args) {
        Ciudad c = new Ciudad();
        Ladron l1=c.añadirLadron(120,90, 5,3);
        Ladron l2=c.añadirLadron(580,700, -4,6);
        Camara c1=c.añadirCamara(300,500,400,400);
        Camara c2=c.añadirCamara(1500,800,400,400);
        Camara c3=c.añadirCamara(800,700,200,200);
        Policia p = c.añadirPolicia(800,20);
        Helicoptero h1=c.añadirHelicoptero(1200,60);
        Helicoptero h2=c.añadirHelicoptero(1400,60);
        Helicoptero h3=c.añadirHelicoptero(1600,60);
        Geo g1=c.añadirGeo(30,800);
        Geo g2=c.añadirGeo(30,1000);
        c1.encender();
        c2.encender();
        c3.encender();
        c1.suscribir(p);  // p se suscribe a c1
        c1.suscribir(g1); // g1 se suscribe a c1
        c2.suscribir(p);  // p se suscribe a c2
        c2.suscribir(h1); // h1 se suscribe a c2
        c2.suscribir(g1); // g1 se suscribe a c2
        c2.suscribir(g2); // g2 se suscribe a c2
        c.visualizar();
    }
}
