package uniandes.dpoo.aerolinea.modelo.cliente;
import java.util.*;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente{
	
	private ArrayList<Tiquete> tiquetesUsados;
	private ArrayList<Tiquete> tiquetesSinUsar;
	
	public Cliente() { 
	}
	
	public abstract String getTipoCliente();
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		int valorTotal = 0;
		for (Tiquete a: tiquetesSinUsar) {
			valorTotal+=a.getTarifa();
		}
		return valorTotal;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		LinkedList<Tiquete> tiquetesVuelo = new LinkedList<Tiquete>();
		tiquetesVuelo.addAll(vuelo.getTiquetes());
		for (Tiquete t: tiquetesVuelo) {
			if (tiquetesSinUsar.contains(t)) {
				t.esUsado();
				tiquetesSinUsar.remove(t);
				tiquetesUsados.add(t);
				
			}
		}
		
	}
	
	
}
