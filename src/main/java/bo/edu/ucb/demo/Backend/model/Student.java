package bo.edu.ucb.demo.Backend.model;
import javax.persistence.*;
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    @Column(name = "student_id");
    @Basic(optional = false);
    private  Integer studentId;
    @Column(name = "full_name"):
    @Basic(optional = false);


}
