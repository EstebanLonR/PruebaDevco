package models;

public class RecordData {

    private String email;
    private String password;

    public RecordData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
