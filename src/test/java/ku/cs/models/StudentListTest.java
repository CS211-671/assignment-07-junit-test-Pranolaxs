package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void checkIfAddStudents()
    {
        StudentList list = new StudentList();
        list.addNewStudent("6610","Karapuk");
        list.addNewStudent("6611","Chakkra");
        list.addNewStudent("6612","Chaiyong");


    }


}