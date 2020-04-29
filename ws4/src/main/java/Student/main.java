package Student;

import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("huy");
        st.setAddress("hue");
        st.setMajor("ID");
        st.setStudentId("DE140306");
        st.setbirthDate(2000, Calendar.JULY, 1);
        System.out.println(st);
    }
}
