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
    public class InventarioMedicamentos {
    private List<Medicamento> medicamentos = new ArrayList<>();

    public void agregarMedicamento(Medicamento medicamento, Hospital hospital) {
        if (hospital.getPresupuesto() < medicamento.getCosto()) {
            throw new PresupuestoInsuficienteException("Presupuesto insuficiente");
        }
        medicamentos.add(medicamento);
        hospital.setPresupuesto(hospital.getPresupuesto() - medicamento.getCosto());
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    }
