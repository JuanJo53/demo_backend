package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.bl.StudentBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class StudentApi {
    private StudentBl studentBl;

    @Autowired
    public StudentApi(StudentBl studentBl){this.studentBl=studentBl;}

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return studentBl.createStudent(student);
    }

}
