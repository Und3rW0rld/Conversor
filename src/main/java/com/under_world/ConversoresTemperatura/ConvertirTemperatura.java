package com.under_world.ConversoresTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
    public static void elegirTemperatura(Double numero) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch (opcion) {
            case "Grados Celcius a Grados Farenheit" -> CambiarUnidadesTemperatura(numero,
                    (numero*9/5)+32, "Grados Celcius son","Grados Farenheit");
            case "Grados Celcius a Kelvin" -> CambiarUnidadesTemperatura(numero,
                    numero+273.15, "Grados Celcius son","Grados Kelvin");
            case "Grados Farenheit a Grados Celcius" -> CambiarUnidadesTemperatura(numero,
                    ((numero-32)*5/9), "Grados Farenheit son", "Grados Celcius");
            case "Kelvin a Grados Celcius" -> CambiarUnidadesTemperatura(numero,
                    numero-273.15, "Grados Kelvin son", "Grados Celcius");
            case "Kelvin a Grados Farenheit" -> CambiarUnidadesTemperatura(numero,
                    (numero-273.15) * 9/5 + 32, "Grados Kelvin son", "Grados Farenheit");
        }
    }
    public static void CambiarUnidadesTemperatura(Double numero, Double conversion, String text1, String text2){
        JOptionPane.showMessageDialog(null,
                numero+" "+text1+" "+(conversion)+" "+text2);
    }
}