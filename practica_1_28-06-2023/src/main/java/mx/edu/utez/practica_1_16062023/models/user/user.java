package mx.edu.utez.practica_1_16062023.models.user;

public class user {
    private  long id;
    private  String nme;
    private String surname;
    private  String birthday;
    private String username;
    private  String status;

    public user() {
    }

    public user(long id, String nme, String surname, String birthday, String username, String status) {
        this.id = id;
        this.nme = nme;
        this.surname = surname;
        this.birthday = birthday;
        this.username = username;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNme() {
        return nme;
    }

    public void setNme(String nme) {
        this.nme = nme;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
