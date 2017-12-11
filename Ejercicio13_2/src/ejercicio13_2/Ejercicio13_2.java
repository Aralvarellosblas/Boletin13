package ejercicio13_2;

import javax.swing.JOptionPane;

/**
 * @author Arturo
 */
public class Ejercicio13_2 {

    public static void main(String[] args) {
        ConversorTemperaturas conv=new ConversorTemperaturas();
//        float grados=conv.pedirTemperatura();
        try{
            conv.centigradosAFahrenheit();
        }catch(TemperatureException e){
            e.printStackTrace();
        }
        conv.centigradosAReamur();
        JOptionPane.showMessageDialog(null, conv.toString());
    }

}
