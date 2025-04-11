/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
    public class EmpleadoSalud extends Empleado {
    private String especialidad;
    private int horasTrabajadas;

    public EmpleadoSalud(String nombre, String documento, int edad, 
                        double salarioBase, String especialidad) {
        super(nombre, documento, edad, salarioBase);
        this.especialidad = especialidad;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }

    public void setHorasTrabajadas(int horas) { 
        this.horasTrabajadas = horas; 
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     *
     * @param salarioBase
     */
    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    }

