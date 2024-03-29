package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.*;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.*;

public class CalculadorasTarifasTemporadaBaja extends CalculadoraTarifas {
	protected final int COSTO_POR_KM_NATURAL = 600 ;
	protected final int COSTO_POR_KM_CORPORATIVO = 900;
	protected final double DESCUENTO_PEQ = 0.02;
	protected final double DESCUENTOS_MEDIANAS = 0.1;
	protected final double DESCUENTOS_GRANDES = 0.2;
	
	@Override
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		int costoBase = 0;
		Ruta ruta = vuelo.getRuta();
		
		int distancia = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		
		if (cliente.getTipoCliente()=="Corporativo"){
			costoBase = distancia * this.COSTO_POR_KM_CORPORATIVO;
		}
		
		else {
			costoBase = distancia * this.COSTO_POR_KM_NATURAL;
		}
		
		return costoBase;
	}
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		
		if (cliente.getTipoCliente()=="Corporativo") {
			String identificador = cliente.getIdentificador();
			String[] parts = identificador.split("-");
			String TAMAÑO = parts[3];
			
			if (TAMAÑO == "GRANDE"){
				return this.DESCUENTOS_GRANDES;
			}
			
			else if (TAMAÑO == "MEDIANA") {
				return this.DESCUENTOS_MEDIANAS;
			}
			
			else {
				return this.DESCUENTO_PEQ;
			}
		}
		
		return 0;
	}
	
	
}
