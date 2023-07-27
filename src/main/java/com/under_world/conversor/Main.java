package com.under_world.conversor;

import com.under_world.ConversoresTemperatura.ConvertirTemperatura;
import com.under_world.conversoresMonedas.ConvertirMonedas;

import javax.swing.JOptionPane;

public class Main {
    public static boolean ValidarNumero(String numero){
        try{
            Double.parseDouble(numero);
            return false;
        }catch(NumberFormatException e){
            return true;
        }
    }
    public static void main(String[] args) {
        while(true){
            String opciones = JOptionPane.showInputDialog(null, "Seleccione el conversor que deseas usar",
                    "Menu", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de Moneda", "Conversor de temperatura"}, "Seleccion").toString();
            System.out.println("Opcion seleccionada: "+opciones);
            String respuesta;
            double numero;
            switch (opciones) {
                case "Conversor de Moneda" -> {
                    respuesta = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que desas convertir");
                    while (ValidarNumero(respuesta)) {
                        respuesta = JOptionPane.showInputDialog("Revisa tu entrada!\nDebe ser un número");
                    }
                    numero = Double.parseDouble(respuesta);
                    ConvertirMonedas.elegirMonedas(numero);
                }
                case "Conversor de temperatura" -> {
                    respuesta = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
                    while (ValidarNumero(respuesta)) {
                        respuesta = JOptionPane.showInputDialog("Revisa tu entrada!\nDebe ser un número");
                    }
                    numero = Double.parseDouble(respuesta);
                    ConvertirTemperatura.elegirTemperatura(numero);
                }
            }
            int continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
            if(continuar != JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            }
        }
    }
}
