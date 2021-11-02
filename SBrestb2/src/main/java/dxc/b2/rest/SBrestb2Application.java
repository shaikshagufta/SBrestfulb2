package dxc.b2.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SBrestb2Application {

	@Autowired
	StudentService studentService;

	@RequestMapping("/students")
	public List<Student> getStudents(){

		return studentService.getStudents();

	}

	public static void main(String[] args) {
		SpringApplication.run(SBrestb2Application.class, args);
	}

}
