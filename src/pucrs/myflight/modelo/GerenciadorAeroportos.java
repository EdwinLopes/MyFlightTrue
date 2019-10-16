package pucrs.myflight.modelo;
import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<Aeroporto>();    
    }

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod){
        for (Aeroporto a : aeroportos) {
            if(a.getCodigo() == cod) return a;
        }
        return null;
        }

}
