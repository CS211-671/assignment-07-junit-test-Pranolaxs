package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void init()
    {
        Student s1;
    }

    @Test
    void testAddScore()
    {
        Student s1 = new Student("66xxxxxx","Chakkra");
        s1.addScore(10.5);
        assertEquals(10.5,s1.getScore());
        s1.addScore(50);
        assertEquals(60.5,s1.getScore());
    }

    @Test
    void calculateGrade()
    {
        Student s1 = new Student("66xxxxxx","Chakkra",50);
        s1.addScore(20);
        assertEquals("B",s1.grade());
    }

}