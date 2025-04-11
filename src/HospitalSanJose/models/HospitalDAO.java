/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HospitalSanJose.models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author salom
 */
public class HospitalDAO {
    private static final String FILE_PATH = "data/hospital.json";

    public void guardarHospital(Hospital hospital) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(hospital, writer);
        }
    }

    public Hospital cargarHospital() throws FileNotFoundException, IOException {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(FILE_PATH)) {
            return gson.fromJson(reader, Hospital.class);
        }
    }
}

