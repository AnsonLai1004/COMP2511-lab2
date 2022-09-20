package staff;

import java.time.LocalDateTime;
import staff.Lecturer;
import staff.StaffMember;

public class StaffTest {

    public void printStaffDetails(StaffMember staff) {
        System.out.println(staff.toString());
    }

    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2023, 1, 1, 1, 1);  
        StaffMember s1 = new StaffMember("s1", 10, datetime1);
        StaffMember s2 = new StaffMember("s2", 20, datetime1);

        Lecturer l1 = new Lecturer("l1", 10, datetime1, "CSE", "A");
        Lecturer l2 = new Lecturer("l2", 10, datetime1, "IT", "B");

        
        StaffTest test = new StaffTest();
        test.printStaffDetails(s1);
        test.printStaffDetails(l1);

        if (s1.equals(s2)) {
            System.out.println("s1 is equal to s2");
        } else {
            System.out.println("s1 is not equal to s2");
        }
        if (s1.equals(l1)) {
            System.out.println("s1 is equal to l1");
        } else {
            System.out.println("s1 is not equal to l1");
        }

        if (l1.equals(l2)) {
            System.out.println("l1 is equal to l2");
        } else {
            System.out.println("l1 is not equal to l2");
        }
        if (l1.equals(s1)) {
            System.out.println("l1 is equal to s1");
        } else {
            System.out.println("l1 is not equal to s1");
        }
        
        if (l1.equals(l1)) {
            System.out.println("l1 is equal to l1");
        } else {
            System.out.println("l1 is not equal to l1");
        }
        if (s1.equals(s1)) {
            System.out.println("s1 is equal to s1");
        } else {
            System.out.println("s1 is not equal to s1");
        }
       
        if (s1.equals(null)) {
            System.out.println("s1 is equal to null");
        } else {
            System.out.println("s1 is not equal to null");
        }
        
    }

}