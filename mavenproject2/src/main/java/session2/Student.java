package session2;
public class Student {
    private String name;
    private int semester;
    private boolean active;
    
    void login(){
        
    }
    void intro(){
        System.out.printf("%-20s%-10d\n",name,semester);
    }

    public Student(String name, int semester) {
        this.name = name;
        this.semester = semester;
    }
    public Student(){
        name ="";
        semester = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
}
