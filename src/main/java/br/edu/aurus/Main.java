package br.edu.aurus;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Umidade umidade = new Umidade();
        Temperatura temperatura = new Temperatura();
        Luminosidade luminosidade = new Luminosidade();

        int valorSensor = 0;

        valorSensor = temperatura.obterTemperaturaAtual();
        System.out.println(valorSensor);

        valorSensor = luminosidade.obterLuminosidadeAtual();
        System.out.println(valorSensor);

        valorSensor = umidade.obterUmidadeAtual();
        System.out.println(valorSensor);
    }
}
