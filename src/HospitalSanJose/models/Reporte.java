/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class Reporte {
    public String generarReporteEmpleados;
    public String generarReportePacientes;
    public String generarReporteVentas;

    public Reporte(String generarReporteEmpleados, String generarReportePacientes, String generarReporteVentas) {
        this.generarReporteEmpleados = generarReporteEmpleados;
        this.generarReportePacientes = generarReportePacientes;
        this.generarReporteVentas = generarReporteVentas;
    }

    public String getGenerarReporteEmpleados() {
        return generarReporteEmpleados;
    }

    public void setGenerarReporteEmpleados(String generarReporteEmpleados) {
        this.generarReporteEmpleados = generarReporteEmpleados;
    }

    public String getGenerarReportePacientes() {
        return generarReportePacientes;
    }

    public void setGenerarReportePacientes(String generarReportePacientes) {
        this.generarReportePacientes = generarReportePacientes;
    }

    public String getGenerarReporteVentas() {
        return generarReporteVentas;
    }

    public void setGenerarReporteVentas(String generarReporteVentas) {
        this.generarReporteVentas = generarReporteVentas;
    }
    
}
