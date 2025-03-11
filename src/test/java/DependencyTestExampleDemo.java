import org.testng.annotations.Test;

public class DependencyTestExampleDemo {

    @Test(dependsOnMethods = {"findTheRightMatchForTheBrideGroom", "bookBanquetHallForMarriage"})
    public void printMarriageInvitationCard(){
        System.out.println("Printing of marriage invitation ordered");
    }

    @Test(dependsOnMethods = {"findTheRightMatchForTheBrideGroom"})
    public void bookBanquetHallForMarriage(){
        System.out.println("Marriage hall booked to be printed on invitation card");
    }

    @Test
    public void findTheRightMatchForTheBrideGroom(){
        System.out.println("Found the right match for the bridegroom");
    }

    @Test(dependsOnMethods = {"findTheRightMatchForTheBrideGroom", "bookBanquetHallForMarriage", "printMarriageInvitationCard"})
    public void marriageAccomplished(){
        System.out.println("Marriage Accomplished");
    }
}
