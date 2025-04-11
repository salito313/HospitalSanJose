/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
    public class MedicamentoGenerico extends Medicamento {
    public MedicamentoGenerico(String nombre, String descripcion, double costo) {
        super(nombre, descripcion, costo);
    }

    @Override
    public void calcularPrecio() {
        setPrecioVenta(getCosto() * 1.10);
    }
}
      
