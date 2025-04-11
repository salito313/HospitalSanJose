/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class MedicamentoGenerico extends Medicamento{
    
    public MedicamentoGenerico(String nombre, String descripcion, double costo, double precioVenta) {
        super(nombre, descripcion, costo, precioVenta);
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

    /**
     *
     * @return
     */
    @Override
    public double getCosto() {
        return costo;
    }

    /**
     *
     * @param costo
     */
    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     *
     * @param precioVenta
     */
    @Override
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
      
}
