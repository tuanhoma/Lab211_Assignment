package Model;

public class User {

    private String Username;
    private String Password;
    private String Name;
    private String Phone;
    private String Email;
    private String Address;
    private String DateOfBirth;

    public User() {
    }

    public User(String username, String password, String name, String phone, String email, String address, String dateOfBirth) {
        Username = username;
        Password = password;
        Name = name;
        Phone = phone;
        Email = email;
        Address = address;
        DateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Address='" + Address + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                '}';
    }
}
