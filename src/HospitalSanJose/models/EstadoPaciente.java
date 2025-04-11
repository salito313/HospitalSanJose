/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

/**
 *
 * @author salom
 */
public class EstadoPaciente {
    
    private String saludable;
    private String critico;

    public EstadoPaciente(String saludable, String critico) {
        this.saludable = saludable;
        this.critico = critico;
    }
    

    public String getSaludable() {
        return saludable;
    }

    public void setSaludable(String saludable) {
        this.saludable = saludable;
    }

    public String getCritico() {
        return critico;
    }

    public void setCritico(String critico) {
        this.critico = critico;
    }

   
}
