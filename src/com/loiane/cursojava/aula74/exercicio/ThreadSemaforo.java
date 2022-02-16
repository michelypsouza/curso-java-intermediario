package com.loiane.cursojava.aula74.exercicio;

public class ThreadSemaforo implements Runnable {

    private Cor cor;
    private boolean estaParado;
    private boolean corAlterada;

    public ThreadSemaforo() {
        this.cor = Cor.VERMELHO;
        this.estaParado = false;
        this.corAlterada = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!estaParado) {
            try {
                //System.out.println("Executando semaforo "+this.cor.name());
                Thread.sleep(this.cor.getTempoEsperaSegundos());
                //System.out.println("Alterando cor semaforo "+this.cor.name());
                alterarCor();
                //System.out.println("Cor alterada do semaforo para "+this.cor.name());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void alterarCor() {
        switch (this.cor) {
            case VERMELHO:
                this.cor = Cor.VERDE;
                break;
            case AMARELO:
                this.cor = Cor.VERMELHO;
                break;
            case VERDE:
                this.cor = Cor.AMARELO;
                break;
            default:
                break;
        }
        this.corAlterada = true;
        notify();
    }

    public synchronized void aguardarAlteracaoDeCor() {
        while (!this.corAlterada) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.corAlterada = false;
    }

    public synchronized void parar() {
        this.estaParado = true;
    }

    public Cor getCor() {
        return cor;
    }
}
