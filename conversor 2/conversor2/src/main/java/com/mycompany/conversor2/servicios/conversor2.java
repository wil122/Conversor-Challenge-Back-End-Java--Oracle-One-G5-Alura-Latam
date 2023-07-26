/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor2.servicios;

import java.awt.event.ActionEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.json.JSONObject;

/**
 *
 * @author wilde
 */
public class conversor2 {
    
    // consumiendo de la api de cambio
    public Double ObtenerTasaCambio(String origen, String destino) {
        Double tasaCambio = 0.0;
        try {
            URL url = new URL("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + origen + "/"
                    + destino + ".json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responsecode = con.getResponseCode();
            if (responsecode != 200) {
                System.out.println("Error" + responsecode);
            } else {
                StringBuilder informationstring = new StringBuilder();
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    informationstring.append(sc.nextLine());
                }
                sc.close();
                JSONObject dataObject = new JSONObject(String.valueOf(informationstring));
                System.out.println(dataObject.get(destino).toString());
                tasaCambio = Double.parseDouble(dataObject.get(destino).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return tasaCambio;
    }

     
       public void validarDouble(java.awt.event.KeyEvent evt, JTextField texto) {

        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            JOptionPane.showMessageDialog(null,"Solo se permiten números");
            evt.consume();
        }
        if (c == '.' && texto.getText().contains(".")) {
            
            evt.consume();
        }
    }


    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }

    public String calcularTemperatura(int opcion, Double cantidad) {
        // Double calculos = 0.0;
        String resultado = "";
        switch (opcion) {
            case 0:
                resultado = formatearDecimales((cantidad * 1.8) + 32, 2).toString() + " °F";
                break;
            case 1:
                resultado = formatearDecimales(cantidad + 273.15, 2).toString() + " K";
                break;
            case 3:
                resultado = formatearDecimales((cantidad - 32) * 0.555, 2).toString() + " °C";
                break;
            case 4:
                resultado = formatearDecimales(0.555 * (cantidad - 32) + 273.15, 2).toString() + " K";
                break;
            case 6:
                resultado = formatearDecimales(cantidad - 273.15, 2).toString() + " °C";
                break;
            case 7:
                resultado = formatearDecimales((cantidad - 273.15) * 1.8 + 32, 2).toString() + " °F";
                break;
            default:
                throw new AssertionError();
        }

        return resultado;

    }

    public String calcularCambio(int opcion, Double cantidad) {

        String resultado = "";
        String origen = "";
        String destino = "";
        switch (opcion) {
            case 0:
                // cambio de peso colombiano a dolar
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "cop", destino = "usd") * cantidad, 4)
                        .toString() + " Usd";
                break;
            case 1:
                // cambio de pesos colombiano a euros
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "cop", destino = "eur") * cantidad, 4)
                        .toString() + " Euros";
                break;
            case 2:
                // cambio de pesos colombiano a libras esterlinas
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "cop", destino = "gbp") * cantidad, 4)
                        .toString() + " Libras";
                break;
            case 3:
                // cambio de pesos chilenos a yen japones
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "cop", destino = "jpy") * cantidad, 4)
                        .toString() + " Yen";

                break;
            case 4:
                // cambio de pesos colombianos a won sur-coreano
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "cop", destino = "krw") * cantidad, 4)
                        .toString() + " Won";

                break;
            case 6:
                // cambio de dolares a pesos colombianos
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "usd", destino = "cop") * cantidad, 4)
                        .toString() + " Cop";

                break;
            case 7:
                // cambio de euros a pesos colombianos
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "eur", destino = "cop") * cantidad, 4)
                        .toString() + " Cop";

                break;
            case 8:
                // cambio de libras a pesos colombianos
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "gbp", destino = "clp") * cantidad, 4)
                        .toString() + " Cop";

                break;
            case 9:
                // cambio de yen a pesos colombianos
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "jpy", destino = "cop") * cantidad, 4)
                        .toString() + " Cop";

                break;
            case 10:
                // cambio de won surcoreano a pesos colombianos
                resultado = formatearDecimales(ObtenerTasaCambio(origen = "krw", destino = "cop") * cantidad, 4)
                        .toString() + " Cop";

                break;
            default:
                throw new AssertionError();
        }

        return resultado;

    }

    public String calcularLongitud(String origen, String destino, Double cantidad) {
        Double calculos = 0.0;
        String resultado = "";
        // cuando la seleccion es la misma
        if (origen.equals(destino)) {
            calculos = cantidad * 1;
            calculos = formatearDecimales(calculos, 2);
            if (origen.equals("Kilómetro")) {
                return calculos.toString() + " km";
            }
            if (origen.equals("Metro")) {
                return calculos.toString() + " m";
            }
            if (origen.equals("Centímetro")) {
                return calculos.toString() + " cm";
            }
            if (origen.equals("Milímetro")) {
                return calculos.toString() + " mm";
            }

        }
        // kilometros a....
        if (origen.equals("Kilómetro") && destino.equals("Metro")) {
            calculos = cantidad * 1000;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " m";
        }
        if (origen.equals("Kilómetro") && destino.equals("Centímetro")) {
            calculos = cantidad * 100000;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " cm";
        }
        if (origen.equals("Kilómetro") && destino.equals("Milímetro")) {
            calculos = cantidad * 1000000;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " mm";
        }
        // Metros a...
        if (origen.equals("Metro") && destino.equals("Kilómetro")) {
            calculos = cantidad / 1000;
            calculos = formatearDecimales(calculos, 3);
            return calculos.toString() + " km";
        }
        if (origen.equals("Metro") && destino.equals("Centímetro")) {
            calculos = cantidad * 100;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " cm";
        }
        if (origen.equals("Metro") && destino.equals("Milímetro")) {
            calculos = cantidad * 1000;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " mm";
        }
        // Centímetro a......
        if (origen.equals("Centímetro") && destino.equals("Kilómetro")) {
            calculos = cantidad / 100000;
            calculos = formatearDecimales(calculos, 5);
            return calculos.toString() + " km";
        }
        if (origen.equals("Centímetro") && destino.equals("Metro")) {
            calculos = cantidad / 100;
            calculos = formatearDecimales(calculos, 3);
            return calculos.toString() + " m";
        }
        if (origen.equals("Centímetro") && destino.equals("Milímetro")) {
            calculos = cantidad * 10;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " mm";
        }
        // Milímetro a
        if (origen.equals("Milímetro") && destino.equals("Kilómetro")) {
            calculos = cantidad / 1000000;
            calculos = formatearDecimales(calculos, 6);
            return calculos.toString() + " km";
        }
        if (origen.equals("Milímetro") && destino.equals("Metro")) {
            calculos = cantidad / 1000;
            calculos = formatearDecimales(calculos, 3);
            return calculos.toString() + " m";
        }
        if (origen.equals("Milímetro") && destino.equals("Centímetro")) {
            calculos = cantidad / 10;
            calculos = formatearDecimales(calculos, 2);
            return calculos.toString() + " cm";
        }
        return resultado;
    }

}