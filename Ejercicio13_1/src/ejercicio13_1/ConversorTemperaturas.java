package ejercicio13_1;

import javax.swing.JOptionPane;

/**
 * @author Arturo
 */
public class ConversorTemperaturas{

    private static float t=80f;
    private String tempetatura;
    public float centigrados, fahrenheit=0, reamur=0;

    public ConversorTemperaturas(){
    }
    public float pedirTemperatura(){
        tempetatura=JOptionPane.showInputDialog(null, "Introduzca la temperatura en ºC");
        centigrados=Float.parseFloat(tempetatura);
        return centigrados;
    }
    public float centigradosAFahrenheit(float centigrados) throws TemperatureException{
        if(centigrados>t){
            fahrenheit=(float) (9.0/5.0*centigrados+32.4);
            return fahrenheit;
        }else{
            throw new TemperatureException("La Temperatura debe ser superior a 80ºC");
        }
    }

    public float centigradosAReamur(float centigrados){
        try{
            if(centigrados>t){
                reamur=(float) (4.0/5.0*centigrados);
            }else{
                throw new TemperatureException("La Temperatura debe ser superior a 80ºC");
            }
        }catch(TemperatureException e){
            e.printStackTrace();
        }finally{
            return reamur;
        }
    }

    @Override
    public String toString(){
        if(centigrados>t){
            return (centigrados+" ºC Son:\n"+fahrenheit+" ºF y "+reamur+" ºR");
        }else return("Error");
    }
}
