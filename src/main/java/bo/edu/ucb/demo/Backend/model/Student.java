package bo.edu.ucb.demo.Backend.model;
// ORM: Mapeo Objeto Relacional
// POJO: Plain Old Java Object

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;
    @Column(name = "first_name")
    @Basic(optional = false)
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "carnet_identidad")
    private String carnetIdentidad;
    @Column(name = "carrera")
    private String carrera;
    @Column(name = "edad")
    private Integer edad;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", carnetIdentidad='" + carnetIdentidad + '\'' +
                ", carrera='" + carrera + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

}