package Triangle;

import java.util.Scanner;

public class Triangle {
    public  int side1;
    public  int side2;
    public  int side3;

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    
   
    public void enter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the first side");
        side1 = sc.nextInt();
        System.out.println("Length of the second side");
        side2 = sc.nextInt();
        System.out.println("Length of the three side");
        side3 = sc.nextInt();
    }
    @Override
    public String toString() {
        return "The side 1: " + getSide1() + ", The side 2: " + getSide2() + ", The side 3: " + getSide3();
    }
    public void check(){
        if((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)){
            System.out.println("This is a valid Triangle");
            int perimeter =  side1 + side2 +side3;
            System.out.println("The perimeter of the triangle:" + perimeter);
            float a =(float)perimeter/2;
            float area = (float) Math.sqrt(a*(a-side1)*(a-side2)-(a-side3));
            System.out.println("Compute the area of the triangle:" + area);
            type();
        }else{
            System.out.println("This is not a valid Triangle");
        }
    }
    public void type(){
        if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
	System.out.println("This is an isosceles triangle");
	} else if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
	System.out.println("This is an equilateral triangle");
	} else if ((side1 * side1 == side2 * side2 + side3 * side3) || (side2 * side2 == side1 * side1 + side3 * side3) || (side3 * side3 == side2 * side2 + side1 * side1)) {
		System.out.println("This is a right triangle");
	} else if (((side1 * side1 == side2 * side2 + side3 * side3) || (side2 * side2 == side1 * side1 + side3 * side3) || (side3 * side3 == side2 * side2 + side1 * side1))&&((side1 == side2) || (side2 == side3) || (side3 == side1))){
            System.out.println("This is an isosceles triangle");
        } else{
            System.out.println("This is the normal triangle");
        }
    }
    
    
  

}
