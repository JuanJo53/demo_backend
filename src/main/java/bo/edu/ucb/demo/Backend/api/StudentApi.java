package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.bl.StudentBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentApi {
    private StudentBl studentBl;

    public StudentApi(StudentBl studentBl) {
        this.studentBl = studentBl;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return studentBl.createStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student obtener(@RequestParam Integer studentId) {
        return studentBl.findStudentByPk(studentId);
    }

    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student poner(@RequestBody Student student) {
        return studentBl.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@RequestParam Integer studentId) {
        studentBl.deleteStudent(studentId);
    }
    public Student find(@RequestParam Integer student) {
        return studentBl.findStudentByPk(student);
    }

}
