package br.edu.aurus;

import com.fazecast.jSerialComm.SerialPort;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Arduino {

    private SerialPort portaArduino;

    public Arduino() {
        portaArduino = SerialPort.getCommPort("COM5");
    }

    public int obterInformacaoRequisitada(int indice) throws InterruptedException {
        int informacaoRequisitada = 0;
        String[] dadosProcessados = new String[3];

        abrirPorta();

        TimeUnit.SECONDS.sleep(1);
        Scanner leitor = new Scanner(portaArduino.getInputStream());
        String linha = leitor.nextLine();
        dadosProcessados = linha.split(",");
        informacaoRequisitada = Integer.parseInt(dadosProcessados[indice]);

        fecharPorta();

        return informacaoRequisitada;
    }

    private void abrirPorta() {
        portaArduino.setBaudRate(9600);

        if (!portaArduino.openPort()) {
            throw new IllegalArgumentException("Não foi possível comunicar com a porta escolhida");
        }

        System.out.println("Porta aberta com sucesso!");

        portaArduino.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
    }

    private void fecharPorta() {
        portaArduino.closePort();
    }
}