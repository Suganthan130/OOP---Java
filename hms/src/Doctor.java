class Doctor extends User {
    String specialization;
    double consultationFees;

    // Constructor to initialize all attributes
    public Doctor(String name, String NIC, String contactNumber, String specialization, double consultationFees) {
        this.name = name;
        this.NIC = NIC;
        this.contactNumber = contactNumber;
        this.specialization = specialization;
        this.consultationFees = consultationFees;
    }

    // Method overriding for performRole()
    @Override
    public void performRole() {
        System.out.println("Doctor " + name + " (Specialization: " + specialization + ") is treating patients.");
    }

    // Additional method as per analysis
    public void viewAssignedPatients() {
        System.out.println("Viewing assigned patients for Dr. " + name);
    }
}
