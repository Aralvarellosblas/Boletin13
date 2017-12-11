package ejercicio13_1;

import javax.swing.JOptionPane;

/**
 * @author Arturo
 */
public class Ejercicio13_1 {

    public static void main(String[] args) {
        ConversorTemperaturas conv=new ConversorTemperaturas();
        float grados=conv.pedirTemperatura();
        try{
            conv.centigradosAFahrenheit(grados);
        }catch(TemperatureException e){
            e.printStackTrace();
        }
        conv.centigradosAReamur(grados);
        JOptionPane.showMessageDialog(null, conv.toString());
    }

}
