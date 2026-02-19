public class Main {
    public static void main(String[] args) {
        // Create a Doctor object
        Doctor doc = new Doctor("John Doe", "123456789V", "0771234567", "Cardiologist", 5000.0);

        // Verify attributes
        System.out.println("Doctor Created: " + doc.name);
        System.out.println("NIC: " + doc.NIC);
        System.out.println("Contact: " + doc.contactNumber);
        System.out.println("Specialization: " + doc.specialization);
        System.out.println("Fees: " + doc.consultationFees);

        // Verify performRole
        doc.performRole();

        // Verify additional method
        doc.viewAssignedPatients();

        // Verify User role (polymorphism check)
        User userRef = doc;
        userRef.performRole();
    }
}
