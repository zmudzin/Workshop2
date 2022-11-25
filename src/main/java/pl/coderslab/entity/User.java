package pl.coderslab.entity;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public int getId(){return id;}
    public void setId(){this.id=id;}
    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id+ '\''+
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
