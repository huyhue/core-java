package QL_SVien_GVien;
public class Teacher extends Person{
    //Lop day : vd C1011L
    private String teachingClass;
    //luong 1 gio day
    private float salary;
    //so gio day trong thang
    private float hour;

    public Teacher() {
    }

    public Teacher(String teachingClass, float salary, float hour) {
        this.teachingClass = teachingClass;
        this.salary = salary;
        this.hour = hour;
    }

    public String getTeachingClass() {
        return teachingClass;
    }

    public void setTeachingClass(String teachingClass) {
        this.teachingClass = teachingClass;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }
    
    @Override
    public void inputInfo() {
		super.inputInfo();
		System.out.println("Moi ban nhap lop day: ");
		teachingClass = sc.nextLine();
		System.out.println("Moi ban nhap luong mot gio day: ");
		salary = Float.parseFloat(sc.nextLine());
		System.out.println("Moi ban nhap so gio day trong thang: ");
		hour = Float.parseFloat(sc.nextLine());
    }
	
    @Override
    public void showInfo() {
		super.showInfo();
		System.out.println("Lop day: "+teachingClass);
		System.out.println("Luong mot gio day: "+salary);
		System.out.println("So gio day trong thang: "+hour);
    }
    
    public double tinhLuong(){
        double luong = salary * hour;
        char c = teachingClass.charAt(5);
        if(Character.toString(c).equals("M") || Character.toString(c).equals("L")){
            luong += 200000;
        }
        return luong;
    }
}
