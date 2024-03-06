package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;


public abstract class CalculadoraTarifas{
	
	public final double IMPUESTO = 0.28; 
	
	public int calcularTarifa (Vuelo vuelo, Cliente cliente) {
		int tarifa = 0;
		int costoBase=calcularCostoBase(vuelo, cliente);
		int impuestos = calcularValorImpuestos(costoBase);
		double descuentos = calcularPorcentajeDescuento(cliente);
		tarifa = (int) (costoBase*descuentos)+impuestos;
		return tarifa;
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		
		Aeropuerto origen = ruta.getOrigen();
		Aeropuerto destino = ruta.getDestino();
		
		int distancia = Aeropuerto.calcularDistancia(origen, destino);
		
		return distancia;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return (int) (costoBase * IMPUESTO);
	}
}
