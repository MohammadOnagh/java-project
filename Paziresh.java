public class Paziresh {
    private String patientID;
    private String patientName;
    private String patientLastName;
    private String doctorsName;
    private String dateIn; // Masalan 3 Farvardin 1402
    private String drugsUse;

    public Paziresh(String patientID, String patientName, String patientLastName,String doctorsName,
                    String dateIn, String drugsUse) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientLastName = patientLastName;
        this.doctorsName = doctorsName;
        this.dateIn = dateIn;
        this.drugsUse = drugsUse;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public void setDoctorsName(String doctorsName) {
        this.doctorsName = doctorsName;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public void setDrugsUse(String drugsUse) {
        this.drugsUse = drugsUse;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public String getDoctorsName() {
        return doctorsName;
    }

    public String getDateIn() {
        return dateIn;
    }

    public String getDrugsUse() {
        return drugsUse;
    }
}


