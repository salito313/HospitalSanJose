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
public class Paciente {
    public String nombre;
    public String documento;
    public int edad;
    public String correo;
    public String telefono;
    public estadoPaciente estado;
    public List<Enfermedad> enfermedades = new ArrayList<>();
    public List<Medicamento> medicamentos = new ArrayList<>();

    public Paciente(String nombre, String documento, int edad, String correo, String telefono, estadoPaciente estado) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public estadoPaciente getEstado() {
        return estado;
    }

    public void setEstado(estadoPaciente estado) {
        this.estado = estado;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    private static class estadoPaciente {

        public estadoPaciente() {
        }
    }
    

    
    
}
