package staff;

import java.time.LocalDateTime;

public class Lecturer extends StaffMember {
    private String school;
    private String status;
    /**
     * Constructor for Lecturer
     * @param name
     * @param salary
     * @param endDate
     * @param school
     * @param status
     */
    public Lecturer(String name, int salary, LocalDateTime endDate, String school, String status) {
        super(name, salary, endDate);
        this.school = school;
        this.status = status;
    }
    /**
     * Getters
     * @return
     */
    public String getSchool() {
        return school;
    }
    public String getStatus() {
        return status;
    }
    /**
     * Setter for school
     * @param school
     */
    public void setSchool(String school) {
        this.school = school;
    }
    /**
     * Setter for status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public String toString() {
        return super.toString() + ", School = " + school + ", Status = " + status;
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Lecturer other = (Lecturer) obj;
        if (school == other.getSchool() && status == other.getStatus()) return true;
        return false;
    }
}
