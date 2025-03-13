import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
    SoftAssert softAssert = new SoftAssert();
    @Test
     public void testTrainingProgram(){
        System.out.println("learn java");
        System.out.println("do java certification");
        boolean passedOCA = false;
        System.out.println("pause training till you pass certification");
        softAssert.assertTrue(passedOCA, "Student has not passed certification");
        System.out.println("Complete automation testing syllabus");
        System.out.println("Prepare CV");
        System.out.println("get some work experience in relevant field");
        System.out.println("gradually grow up in the company");
        softAssert.assertAll();
    }
}
