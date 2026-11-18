import bpc.patrones.factory.boladragon.BolaDragon;
import bpc.patrones.factory.boladragon.BolaDragonFactory;

public class Factory {
    public static void main(String[] args) {
        BolaDragon b1 = BolaDragonFactory.getBolaDragon(1);
        BolaDragon b2 = BolaDragonFactory.getBolaDragon(2);
        BolaDragon b3 = BolaDragonFactory.getBolaDragon(3);
        BolaDragon b4 = BolaDragonFactory.getBolaDragon(4);
        BolaDragon b5 = BolaDragonFactory.getBolaDragon(5);
        BolaDragon b6 = BolaDragonFactory.getBolaDragon(6);
        BolaDragon b7 = BolaDragonFactory.getBolaDragon(7);
        //BolaDragon b8 = BolaDragonFactory.getBolaDragon(8);
        BolaDragon b9 = BolaDragonFactory.getBolaDragon(3);
    }

}
