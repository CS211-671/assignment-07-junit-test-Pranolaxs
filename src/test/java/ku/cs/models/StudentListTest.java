package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void checkFindStudentById()
    {
        StudentList list = new StudentList();
        Student s = new Student("6613", "John Cena");
        list.addNewStudent("6613", "John Cena");
        list.addNewStudent("6610","Karapuk");
        list.addNewStudent("6611","Chakkra");
        list.addNewStudent("6612","Chaiyong",20);

        assertEquals(s.getId(),list.findStudentById("6613").getId());
        assertEquals(s.getName(),list.findStudentById("6613").getName());




    }

    @Test
    void checkGiveScoreToId()
    {
        StudentList list = new StudentList();
        Student s = new Student("6613", "John Cena",20);
        list.addNewStudent("6613", "John Cena");
        list.addNewStudent("6610","Karapuk");
        list.addNewStudent("6611","Chakkra");
        list.addNewStudent("6612","Chaiyong",20);

        list.giveScoreToId("6613",20);
        assertEquals(s.getScore(),list.findStudentById("6613").getScore());

    }

    @Test
    void chechViewGradeOfId()
    {
        StudentList list = new StudentList();
        Student s = new Student("6613", "John Cena",60);
        list.addNewStudent("6613", "John Cena",60);
        list.addNewStudent("6610","Karapuk");
        list.addNewStudent("6611","Chakkra");
        list.addNewStudent("6612","Chaiyong",20);

        assertEquals(s.grade(),list.viewGradeOfId("6613"));

    }

}