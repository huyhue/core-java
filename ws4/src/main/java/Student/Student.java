package Student;

import java.util.Calendar;
import java.util.Date;

public class Student {
    
    private String name;
    private String studentId;
    private Date birthDate;
    private String address;
    private String major;

    
   public void setbirthDate(int iYear, int iMonth, int iDay) {
        Calendar cal = Calendar.getInstance();
        cal.set(iYear, iMonth, iDay);
        this.birthDate = cal.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getbirthDate() {
        return birthDate;
    }

//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student(String name, String studentId, Date birthDate, String address, String major) {
        super();
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student : " +  name + ", " + studentId + ", " + birthDate + ", " + address + ", " + major;
    }
    
    
}
