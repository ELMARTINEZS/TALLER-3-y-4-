package uniandes.dpoo.aerolinea.modelo.cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente{
	
	public Cliente() { 
	}
	
	public abstract String getTipoCliente();
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		// Toca implementar la funcion, pero por ahora apenas estamos realizando la estructura!!!
	}
	
	public int calcularValorTotalTiquetes() {
		return 0;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
	}
	
	
}
