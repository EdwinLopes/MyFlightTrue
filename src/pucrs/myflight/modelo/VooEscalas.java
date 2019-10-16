package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;
public class VooEscalas
{
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO }; 

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private Status status;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dh, Duration dur) {
       this.rota = rota;
       this.rotaFinal = rotaFinal;
        datahora = dh;
        duracao = dur;
    }

    // Gets, etc
    public Rota getRota(){return rota;}
    
    public Rota getRotaFinal(){return rotaFinal;}

    public LocalDateTime getDatahora(){return datahora;}
    
    public Duration getDuracao(){return duracao;}

    public Status getStatus(){return status;}

    @Override
    public String toString() {
       return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal;
    }

}
