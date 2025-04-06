package br.edu.aurus;

public class Temperatura {


    public int obterTemperaturaAtual() throws InterruptedException {
        Arduino arduino = new Arduino();
        return arduino.obterInformacaoRequisitada(0);
    }
}
