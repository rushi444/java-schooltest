package com.lambdaschool.school.service;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.view.CountStudentsInCourses;

import java.util.ArrayList;

public interface CourseService
{
    ArrayList<Course> findAll();

    Course findCourseById(long id);

    ArrayList<CountStudentsInCourses> getCountStudentsInCourse();

    void delete(long id);
}
