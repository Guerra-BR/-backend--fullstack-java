package factory;

public class Cliente {
    private String gradeReq;
    private Boolean hasToyotaPreference;

    public Cliente(String gradeReq, Boolean hasToyotaPreference) {
        this.gradeReq = gradeReq;
        this.hasToyotaPreference = hasToyotaPreference;
    }

    public String getgradeReq() {
        return gradeReq;
    }

    public Boolean getHasToyotaPreference() {
        return hasToyotaPreference;
    }
}
