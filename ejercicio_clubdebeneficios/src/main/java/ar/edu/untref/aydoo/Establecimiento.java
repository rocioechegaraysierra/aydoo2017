package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Establecimiento {
	
	
	private List<Sucursal> sucursales;
	protected String nombre;


	public Establecimiento(){
		this.sucursales = new ArrayList<Sucursal>();
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}


	public int getCantidadTotalDeVentasDelEstablecimiento() {
		int cantidadTotal = 0;
		Iterator<Sucursal> itSucursal = this.sucursales.iterator();
		while (itSucursal.hasNext()) {
			Sucursal sucursal = itSucursal.next();
			cantidadTotal += sucursal.getCantidadDeVentas();
		}
		return cantidadTotal;
	}


	public void agregarSucursal (Sucursal sucursal) {
		this.sucursales.add(sucursal);
	}


	public Sucursal sucursalConMasVentas(){
		Sucursal sucursalConMasVentas = null;
		int cantidadDeVentas = 0;
		Iterator<Sucursal> itSucursal = this.sucursales.iterator();
		while (itSucursal.hasNext()) {
			Sucursal sucursal = itSucursal.next();
			if (sucursal.getCantidadDeVentas() > cantidadDeVentas ) {
				sucursalConMasVentas = sucursal;
				cantidadDeVentas = sucursal.getCantidadDeVentas();
			}
		}
		return sucursalConMasVentas;
	}
}
