package pucrs.myflight.modelo;

public class VooVariasEscalas extends Voo{
    private ArrayList<Rota> escalas;

    // Construtor
    public VooVariasEscalas(Rota rota, ArrayList<Rota> escalas, LocalDateTime datahora, Duration duracao) {
       super(rota, datahora, duracao);
       this.escalas = escalas;
    }

    public Rota getRotaFinal() { return rotaFinal; }

    @Override
    public String toString() {
       return super.toString() +rotaFinal;
    }
}