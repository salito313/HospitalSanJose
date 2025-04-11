/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class MedicamentoMarca extends Medicamento {
    private String fabricante;

    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }

    @Override
    public void calcularPrecio() {
        setPrecioVenta(getCosto() * 1.25);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
}
