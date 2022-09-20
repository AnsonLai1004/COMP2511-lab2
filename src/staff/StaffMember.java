package staff;

import java.time.LocalDateTime;


/**
 * A staff member
 * @author Robert Clifton-Everest
 *
 */
public class StaffMember {
    private String name;
    private int salary;
    private LocalDateTime hireDate;
    private LocalDateTime endDate;
    /**
     * Constructor for Staff Member 
     * @param name
     * @param salary
     * @param endDate
     */
    public StaffMember(String name, int salary, LocalDateTime endDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDateTime.now();
        this.endDate = endDate;
    }
    /**
     * Getters
     * @return
     */
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public LocalDateTime getHireDate() {
        return hireDate;
    }
    public LocalDateTime getEndDate() {
        return endDate;
    }
    /**
     * Setter for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Setter for salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    /**
     * Setter for endDate
     * @param endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + " Name = " + name + ", Salary = " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (this == obj) return true;
        else if (this.getClass() != obj.getClass()) return false;
        StaffMember other = (StaffMember) obj;
        if (name == other.getName() && salary == other.getSalary()) return true;
        return false;
    }
}

