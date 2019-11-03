package pucrs.myflight.modelo;

import java.util.ArrayList;
public class GerenciadorRotas {
    private ArrayList<Rota> rotas;
    
    public GerenciadorRotas(){
        rotas = new ArrayList<Rota>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodas(){
        return rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem){
        ArrayList<Rota> retorno = new ArrayList<Rota>();
        for (Rota r : rotas) {
            if(r.getOrigem() == origem) retorno.add(r);
        }
        return retorno;
    }
    
    
}
