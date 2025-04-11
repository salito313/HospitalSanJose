/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class MedicamentoDuplicadoException extends RuntimeException {
    private String mensaje;

    public MedicamentoDuplicadoException(String mensaje) {
        super(mensaje);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
