/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

import java.time.LocalDate;
import java.util.List;


/**
 *
 * @author salom
 */
public class Hospital {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///Atributos
    public String nombre;
    public String direccion;
    public String telefono;
    public double presupuesto;
    public double metasVentasAnual;
    public LocalDate fechaDeFundacion;
    public EstadoHospital estado;
    public Localizacion localizacion;
    public Gerente gerente;
    public List<Empleado> empleados;
    public List<Paciente> pacientes;
    public List<cita> citas;
    public inventarioMedicamentos InvetarioMedicamento;
    
    /////////////////////////////////////////////////////////////////////////
    //Metodos 
    
    
           
}
