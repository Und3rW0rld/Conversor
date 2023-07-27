package com.under_world.conversoresMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public static void elegirMonedas(Double numero) {
        String opcion = JOptionPane.showInputDialog(null,
                "Elije la moneada a la que deseas convertir tu dinero\nPara este ejemplo usamos el peso colombiano", "Monedas"
        ,JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Pesos a Dólar","De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, "Seleccion").toString();
        switch (opcion) {
            //Aproximamos el precio del dolar a 3900 pesos
            case "De Pesos a Dólar" -> ConvertirPesosAMoneda(numero, 3900D, "Dolares");
            //Aproximamos el precio del euro a 4300 pesos
            case "De Pesos a Euro" -> ConvertirPesosAMoneda(numero, 4300D, "Euros");
            //Aproximamos el precio de las libras a 5000 pesos
            case "De Pesos a Libras" -> ConvertirPesosAMoneda(numero, 5000D, "Libras");
            //Aproximamos el precio del Yen a 28 pesos
            case "De Pesos a Yen" -> ConvertirPesosAMoneda(numero, 28D, "Yenes");
            case "De Pesos a Won Coreano" -> ConvertirPesosAMoneda(numero, 3D, "Wones");
            case "De Dólar a Pesos" -> ConvertirMonedaAPesos(numero, 3900D,"Pesos" );
            case "De Euro a Pesos" -> ConvertirMonedaAPesos(numero, 4300D, "Pesos");
            case "De Libras a Pesos" -> ConvertirMonedaAPesos(numero, 5000D, "Libras");
            case "De Yen a Pesos" -> ConvertirMonedaAPesos(numero, 28D, "Yenes");
            case "De Won Coreano a Pesos" -> ConvertirMonedaAPesos(numero, 3D, "Wones");
        }
    }
    public static void ConvertirPesosAMoneda(Double numero, Double moneda, String nombre){
        double total = numero/moneda;
        JOptionPane.showMessageDialog(null, "Tienes $"+Math.round(total)+" "+nombre);
    }
    public static void ConvertirMonedaAPesos(Double numero, Double moneda,String nombre){
        JOptionPane.showMessageDialog(null, "Tienes $"+Math.round(numero*moneda)+" "+nombre);
    }
}
