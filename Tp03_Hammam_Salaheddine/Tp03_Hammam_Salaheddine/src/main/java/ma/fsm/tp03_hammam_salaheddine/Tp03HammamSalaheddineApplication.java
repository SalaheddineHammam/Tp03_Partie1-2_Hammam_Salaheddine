package ma.fsm.tp03_hammam_salaheddine;

import ma.fsm.tp03_hammam_salaheddine.entities.Patient;
import ma.fsm.tp03_hammam_salaheddine.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp03HammamSalaheddineApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(Tp03HammamSalaheddineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Patient patient = new Patient();
//        patient.setId(null);
//        patient.setNom("Mohamed");
//        patient.setDateNaissance(new Date());
//        patient.setMalade(false);
//        patient.setScore(23);
//
//        Patient patient2 = new Patient(null,"Yassine",new Date(),false,123);
//
//        Patient patient3 = Patient.builder()
//                .nom("Imane")
//                .dateNaissance(new Date())
//                .score(56)
//                .malade(false)
//                .build();
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,134));
        patientRepository.save(new Patient(null,"Hanane",new Date(),false,4321));
        patientRepository.save(new Patient(null,"Imane",new Date(),true,134));

    }
}
