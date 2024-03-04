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
		Ruta ruta = vuelo.getRuta();
		
		Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		
		return 0;
	}
	@Override
	public double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub

		
		return 0;
	}
	
	
}
