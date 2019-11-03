package pucrs.myflight.modelo;

public class VooEscalas extends Voo{
    private Rota rotaFinal;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
       super(rota, datahora, duracao);
       this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() { return rotaFinal; }

    @Override
    public String toString() {
       return super.toString() +rotaFinal;
    }
}
