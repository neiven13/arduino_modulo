package br.edu.aurus;

public class Luminosidade {

    public int obterLuminosidadeAtual() throws InterruptedException {
        Arduino arduino = new Arduino();
        return arduino.obterInformacaoRequisitada(1);
    }

}
