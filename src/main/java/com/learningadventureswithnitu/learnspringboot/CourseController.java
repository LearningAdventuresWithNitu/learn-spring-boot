package com.learningadventureswithnitu.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {

        return Arrays.asList(
            new Course(1, "Learn Java", "LearningAdventuresWithNitu"),
            new Course(2, "Learn Spring Boot", "LearningAdventuresWithNitu")
        );
    }
    
}
