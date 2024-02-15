package aula02.projetocarroautonomo.carroEletricoAutonomo;

public interface CarroEletricoAutonomo extends Bateria, VeiculoAutonomo{
    void monitorarBateria();
    void definirRota(String partida, String destino);
}
