package br.com.biancapiva.exercicio33;

public class ConversorTemperatura {

    private static double fahrenheit;

    public ConversorTemperatura() {
    }

    public ConversorTemperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public static double celciusParaFarenheint(double celcius){
        return fahrenheit = celcius * 1.8 + 32;
    }

}
