package com.klh.runner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.klh.model.Student;
@Component
public class StudentRunner implements CommandLineRunner {
    private final Student student;
    public StudentRunner(Student student) {
        this.student = student;
    }

    @Override
    public void run(String... args) {
        student.display();
    }
}
