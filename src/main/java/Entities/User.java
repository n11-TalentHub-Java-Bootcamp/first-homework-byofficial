package Entities;

import javax.persistence.*;

@Entity
@Table(name="\"user\"")
public class User implements IEntity{
    @SequenceGenerator(name = "generator", sequenceName = "USER_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    //Adı
    @Column(name = "NAME", length = 50)
    private String firstName;

    //Soyad
    @Column(name="LAST_NAME", length= 50)
    private String lastName;

    //Email
    @Column(name="EMAIL", length=50)
    private String email;

    //Telefon
    @Column(name = "PHONE", length= 15)
    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
