package bo.edu.ucb.demo.Backend.model;
// ORM: Mapeo Objeto Relacional
// POJO: Plain Old Java Object

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name = "contact_id")
    @Basic(optional = false)
    private Integer contactId;
    @Column(name = "first_name")
    @Basic(optional = false)
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "first_surname")
    @Basic(optional = false)
    private String firstSurname;
    @Column(name = "second_surname")
    private String secondSurname;
    @Column(name = "carnet_identidad")
    private String carnetIdentidad;
    @Column(name = "carrera")
    private String carrera;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "semestre")
    private Integer semestre;

    public Student() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", carnetIdentidad='" + carnetIdentidad + '\'' +
                ", carrera='" + carrera + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                '}';
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(String carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}