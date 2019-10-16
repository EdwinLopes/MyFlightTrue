package pucrs.myflight.modelo;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalDateTime;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<Voo>();
    }

    public void adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDateTime data){
        ArrayList<Voo> retorno = new ArrayList<Voo>();
        for (Voo a : voos) {
            if(a.getDatahora() == data) retorno.add(a);
        }
        return retorno;
    }
}
