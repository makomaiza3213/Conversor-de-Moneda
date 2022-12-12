import javax.swing.*;

public class Opciones {
    public void convertirMonedas(double valorIngresado) {
        ConversorMonedas conversor = new ConversorMonedas();

        String moneda = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De pesos a Euro",
                        "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano",
                        "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
                        "De Yen a Pesos", "De Won Coreano a Pesos"}, "Seleccion")).toString();

        switch (moneda) {
            case "De Pesos a Dolar": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.dePesosADolar(valorIngresado) +
                                " Dólares", "Mensaje", 1);
                break;
            }
            case "De Pesos a Euro": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.dePesosAEuro(valorIngresado) +
                                " Euros", "Mensaje", 1);
                break;
            }
            case "De Pesos a Libras": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.dePesosALibras(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Pesos a Yen": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.dePesosAYen(valorIngresado) +
                                " Yenes", "Mensaje", 1);
                break;
            }
            case "De Pesos a Won Coreano": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.dePesosAWonCoreano(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Dolar a Pesos": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.deDolarAPesos(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Euro a Pesos": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.deEuroAPesos(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Libras a Pesos": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.deLibraAPesos(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Yen a Pesos": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.deYenAPesos(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
            case "De Won Coreano a Pesos": {
                JOptionPane.showMessageDialog(null,
                        "Tienes " + conversor.deWonCoreanoAPesos(valorIngresado) +
                                " Libras", "Mensaje", 1);
                break;
            }
        }
    }
}

