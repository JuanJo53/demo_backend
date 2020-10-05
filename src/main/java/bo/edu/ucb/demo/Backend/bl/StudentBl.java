package bo.edu.ucb.demo.Backend.bl;

import bo.edu.ucb.demo.Backend.dao.ContactRepository;
import bo.edu.ucb.demo.Backend.dao.StudentRepository;
import bo.edu.ucb.demo.Backend.model.Contact;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class StudentBl {
    private StudentRepository studentRepository;

    @Autowired
    public StudentBl(StudentRepository cr) {
        this.studentRepository = cr;
    }

    public Student createStudent(Student student) {
        Student result = this.studentRepository.save(student);
        return result;
    }

    public Student updateStudent(Student student) {
        Student result = this.studentRepository.save(student);
        return result;
    }

    public Student findStudentByPk(Integer studentId) {
        Optional<Student> result = this.studentRepository.findById(studentId);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("No existe un estudiante para la llave primaria: " + studentId);
        }
    }

    public void deleteStudent(Integer studentId) {
        Optional<Student> result = this.studentRepository.findById(studentId);
        if (result.isPresent()) {
            this.studentRepository.delete(result.get());
            throw new RuntimeException("Datos borrados con exito");
        } else {
            throw new RuntimeException("No existe un estudiante para la llave primaria: " + studentId);
        }
    }
}