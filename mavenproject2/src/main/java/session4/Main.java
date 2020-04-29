package session4;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 1.2);
        System.out.println("bgColor = "+c.getBgColor());
        System.out.println("radiius = "+c.getRadius());
        
        double area = c.getArea();
        System.out.println("area = "+area);
        
        String rs = String.format("%.2f", area);
        System.out.println("area = "+ rs);
        
        String pattern = "##.####";
        DecimalFormat df = new DecimalFormat(pattern);
        System.out.println("area####"+df.format(area));
    }
}
