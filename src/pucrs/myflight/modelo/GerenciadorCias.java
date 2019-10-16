package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<CiaAerea>();
	}

	public ArrayList<CiaAerea> listarTodas(){
		return empresas;
	}

	public CiaAerea buscarCodigo(String cod){
		for(CiaAerea c : empresas){
			if(c.getCodigo() == cod ){
				return c;
			}
		}
		return null;
	}
}
