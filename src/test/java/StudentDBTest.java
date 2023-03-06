import model.Student;
import model.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StudentDBTest {

    @Test
    void getAllStudentsTestTrue() {
        //GIVEN
        Student[] studentenArray = new Student[5];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);
//        studentenArray[3] = new Student("Robin", "Security", 444);
//        studentenArray[4] = new Student();
        StudentDB neueStudentDB = new StudentDB(studentenArray);
        //WHEN
        Student[] result = neueStudentDB.getAllStudents();
        //THEN
        assertTrue(result.equals(studentenArray));
    }

    @Test
    void getAllStudentsTestFail() {
        //GIVEN
        Student[] studentenArray = new Student[5];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);

        StudentDB neueStudentDB = new StudentDB(studentenArray);

        Student[] studentenArray2 = new Student[5];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
        studentenArray[2] = new Student("Batman", "Security", 777);

        //WHEN
        Student[] result = neueStudentDB.getAllStudents();
        //THEN
        assertFalse(result.equals(studentenArray2));
    }

    @Test
    void toStringTrue1() {
        //GIVEN
        Student[] studentenArray = new Student[1];
        studentenArray[0] = new Student("Hasan", "Informatik", 123);
//        studentenArray[1] = new Student("Lias", "Kindergardening", 555);
//        studentenArray[2] = new Student("Batman", "Security", 777);
        StudentDB neueStudentDB = new StudentDB(studentenArray);

        String erwartung ="StudentDB{studentArray=[Hasan, Informatik, 123]}";
        //WHEN
        String result = neueStudentDB.toString();

        //THEN
        assertEquals(erwartung, result);


    }


}
