import bpc.patrones.builder.Coche;
import bpc.patrones.builder.CocheBuilder;
import bpc.patrones.builder.TipoCarroceria;
import bpc.patrones.builder.TipoMotor;

import java.awt.*;

public class Patrones {
    public static void main(String[] args) {
        Coche cocheIbiza = new CocheBuilder("Seat", "Ibiza", Color.WHITE)
                .setNumeroPlazas(5)
                .setNumeroPuertas(5)
                .setTipoMotor(TipoMotor.GASOLINA)
                .setCarroceria(TipoCarroceria.TURISMO)
                .build();
    }
}
