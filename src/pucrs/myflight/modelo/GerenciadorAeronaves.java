package pucrs.myflight.modelo;

import java.util.ArrayList;
public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public void addAirplane(Aeronave a){
        aeronaves.add(a);
    }

    public void removeByAirplane(Aeronave a){
        aeronaves.remove(a);
    }

    public void removeByIndex(int i){
        aeronaves.remove(i);
    }

    public int size(){
        return aeronaves.size();
    }

    public Aeronave getAirplane(int i){
        return aeronaves.get(i);
    }

    public Aeronave getAirplaneByCode(String c){
        for(int i = 0; i<aeronaves.size(); i++){
            if(c == aeronaves.get(i).getCodigo()) return aeronaves.get(i);
        }
        return null;
    }
}
