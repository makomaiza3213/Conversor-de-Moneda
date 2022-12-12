import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Opciones opciones = new Opciones();

        int seleccion;
        boolean ok = true;
        while (ok) {
            String conversorTipo = (JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión", "Menu",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moneda"
                            , "Conversor de Temperatura"}, "Seleccion")).toString();

            switch (conversorTipo) {
                case "Conversor de Moneda": {
                    String valor = JOptionPane.showInputDialog(null,
                            "Ingresa la cantidad de dinero que deseas convertir");
                    boolean esNumero = valor.chars().allMatch(Character::isDigit);
                    if (esNumero) {
                        double valorIngresado = Double.parseDouble(valor);
                        opciones.convertirMonedas(valorIngresado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no válido", "Mesage", 1);
                    }

                    seleccion = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                    if (seleccion == JOptionPane.NO_OPTION || seleccion == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        ok = false;
                    }
                    break;
                }
                case "Conversor de Temperatura": {
                    String valor = JOptionPane.showInputDialog(null,
                            "Ingresa la temperatura a convertir");
                    break;
                }
            }
        }
    }
}