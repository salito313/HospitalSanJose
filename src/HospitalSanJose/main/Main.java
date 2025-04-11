/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.main;

import HospitalSanJose.models.EmpleadoSalud;
import HospitalSanJose.models.Gerente;
import HospitalSanJose.models.Hospital;
import HospitalSanJose.models.HospitalDAO;
import HospitalSanJose.models.PresupuestoInsuficienteException;
import java.io.IOException;

/**
 *
 * @author salom
 */
    public class Main {
    public static void main(String[] args) {
        // Crear objetos iniciales
        Gerente gerente = new Gerente("Aaron Glassman", "84941564", 69, "Neurocirujano");
        Hospital hospital = new Hospital("Hospital San José", 1_000_000, gerente);

        // Contratar empleados
        EmpleadoSalud medico = new EmpleadoSalud(
            "Meredith Grey", "123456", 35, 3000, "Cirugía"
        );
        medico.setHorasTrabajadas(160);
        hospital.getEmpleados().add(medico);

        // Procesar nómina
        try {
            hospital.procesarNomina();
            System.out.println("Nómina procesada. Presupuesto restante: " + hospital.getPresupuesto());
        } catch (PresupuestoInsuficienteException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Guardar datos
        HospitalDAO dao = new HospitalDAO();
        try {
            dao.guardarHospital(hospital);
            System.out.println("Datos guardados exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

