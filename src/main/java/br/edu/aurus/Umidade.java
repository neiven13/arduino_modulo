package br.edu.aurus;

public class Umidade {


    public int obterUmidadeAtual() throws InterruptedException {
        Arduino arduino = new Arduino();
        return arduino.obterInformacaoRequisitada(2);
    }

}
