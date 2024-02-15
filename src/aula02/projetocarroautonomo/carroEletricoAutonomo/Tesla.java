package aula02.projetocarroautonomo.carroEletricoAutonomo;

public class Tesla implements CarroEletricoAutonomo {
    private int carga;
    private String partida;
    private String destino;
    private boolean modoAutonomo;

    public Tesla() {
    }

    public Tesla(int carga, String partida, String destino, boolean modoAutonomo) {
        this.carga = carga;
        this.partida = partida;
        this.destino = destino;
        this.modoAutonomo = modoAutonomo;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isModoAutonomo() {
        return modoAutonomo;
    }

    public void setModoAutonomo(boolean modoAutonomo) {
        this.modoAutonomo = modoAutonomo;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando...");
    }

    @Override
    public void monitorarBateria() {
        System.out.println("Carga: " + carga);
    }

    @Override
    public void definirRota(String partida, String destino) {
        System.out.println("Rota - partida: " + this.partida
                + "Destino: " + this.destino);
    }

    @Override
    public void ligarModoAutonomo() {
        modoAutonomo = true;
        System.out.println("Modo autonomo ligado.");
    }

    @Override
    public void desligarModoAutonomo() {
        modoAutonomo = false;
        System.out.println("Modo autonomo desligado.");
    }

    @Override
    public String toString() {
        return "Tesla " +
                "carga=" + carga +
                ", partida='" + partida + '\'' +
                ", destino='" + destino + '\'' +
                ", modoAutonomo=" + modoAutonomo;
    }
}
