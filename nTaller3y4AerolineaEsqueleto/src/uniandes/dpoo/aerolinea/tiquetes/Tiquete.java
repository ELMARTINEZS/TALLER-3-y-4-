package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete (String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		
	}
	
	public Cliente getCliente() {
		return null;
	}
	
	public Vuelo getVuelo() {
		return null;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public int getTarifa() {
		return this.tarifa;
	}
	
	public void marcarComoUsado() {
		this.usado = true;
	}
	
	public boolean esUsado() {
		return this.usado;
	}
	
	
}
