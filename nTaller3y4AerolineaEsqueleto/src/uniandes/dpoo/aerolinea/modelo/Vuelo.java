package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.*;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private String fecha;
	private Avion avion;
	private Ruta ruta;
	private Map<String,Tiquete> tiquetes = new HashMap<String,Tiquete>();
	
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}
	
	public Ruta getRuta() {
		return this.ruta;
	}

	public String getFecha() {
		return this.fecha;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection <Tiquete> getTiquetes(){
		return this.tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException{
		if (cantidad < this.avion.getCapacidad()) {
			throw new VueloSobrevendidoException(this);
		}
		else {
			
			return 0;
		}
		
	}
	
	public boolean equals (Object obj) {
		return super.equals(obj);
	}
}
