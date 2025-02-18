import java.util.*;

class Patient {
    private String name;
    private int age;
    private String id;
    
    public Patient(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
}

class Doctor {
    private String name;
    private String specialty;
    
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSpecialty() {
        return specialty;
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    
    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }
    
    public void displayAppointment() {
        System.out.println("Appointment Details:");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
        System.out.println("Date: " + date);
    }
}

public class HealthcareSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        
        Patient patient = new Patient(patientName, patientAge, patientId);
        
        System.out.print("Enter Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.print("Enter Doctor Specialty: ");
        String doctorSpecialty = scanner.nextLine();
        
        Doctor doctor = new Doctor(doctorName, doctorSpecialty);
        
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String appointmentDate = scanner.nextLine();
        
        Appointment appointment = new Appointment(patient, doctor, appointmentDate);
        
        System.out.println("\nAppointment Scheduled Successfully!\n");
        appointment.displayAppointment();
        
        scanner.close();
    }
}
