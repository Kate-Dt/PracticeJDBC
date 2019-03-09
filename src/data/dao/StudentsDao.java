package data.dao;

import data.entities.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}
