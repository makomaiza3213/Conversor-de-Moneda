import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ConversorMonedas {
    public double dePesosADolar(double valorIngresado) {
        valorIngresado = valorIngresado/312.0;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double dePesosAEuro (double valorIngresado) {
        valorIngresado = valorIngresado/180.60;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double dePesosALibras (double valorIngresado) {
        valorIngresado = valorIngresado/210.09;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double dePesosAYen (double valorIngresado) {
        valorIngresado = valorIngresado/1.24;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double dePesosAWonCoreano (double valorIngresado) {
        valorIngresado = valorIngresado/0.13;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double deDolarAPesos (double valorIngresado) {
        valorIngresado = valorIngresado*312.00;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double deEuroAPesos (double valorIngresado) {
        valorIngresado = valorIngresado*180.60;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double deLibraAPesos (double valorIngresado) {
        valorIngresado = valorIngresado*210.09;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double deYenAPesos (double valorIngresado) {
        valorIngresado = valorIngresado*1.24;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

    public double deWonCoreanoAPesos (double valorIngresado) {
        valorIngresado = valorIngresado*0.13;
        BigDecimal bigDecimal = new BigDecimal(valorIngresado).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }

}
