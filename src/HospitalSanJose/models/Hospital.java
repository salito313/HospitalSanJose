/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author salom
 */
     
    public class Hospital {
    private String nombre;
    private double presupuesto;
    private EstadoHospital estado;
    private Gerente gerente;
    private Localizacion localizacion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private InventarioMedicamentos inventario = new InventarioMedicamentos();

    public Hospital(String nombre, double presupuesto, Gerente gerente, Localizacion localizacion) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.estado = EstadoHospital.ACTIVO;
    }

    public void procesarNomina() {
        double total = empleados.stream()
            .mapToDouble(Empleado::calcularSalario)
            .sum();
        
        if (presupuesto - total < 0) {
            estado = EstadoHospital.QUIEBRA;
            throw new PresupuestoInsuficienteException("¡Hospital en quiebra!");
        }
        presupuesto -= total;
    }

    public void registrarPatrocinio(double monto) {
        presupuesto += monto;
        if (presupuesto >= 0 && estado == EstadoHospital.QUIEBRA) {
            estado = EstadoHospital.ACTIVO;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public EstadoHospital getEstado() {
        return estado;
    }

    public void setEstado(EstadoHospital estado) {
        this.estado = estado;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public InventarioMedicamentos getInventario() {
        return inventario;
    }

    public void setInventario(InventarioMedicamentos inventario) {
        this.inventario = inventario;
    }
    }
    
