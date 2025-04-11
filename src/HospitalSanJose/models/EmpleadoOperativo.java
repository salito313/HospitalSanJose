/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class EmpleadoOperativo extends Empleado {
    public String area;

    public EmpleadoOperativo(String area, String nombre, String documento, int edad, double salarioBase) {
        super(nombre, documento, edad, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
