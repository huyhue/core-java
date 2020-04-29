package ws9;

import static java.lang.Math.sqrt;
public class RightTriangle {
    int a, b, c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException, IllegalRightTriangleException{
        
        this.a = a;
        this.b = b;
        this.c = c;
        
        if(a+b<=c || a+c<=b || b+c<=a){
            throw new IllegalTriangleException("This is not a triangle!");
        }
        
        if(sqrt(a+b)!=c || sqrt(a+c)!=b || sqrt(c+b)!=a){
            throw new IllegalRightTriangleException("This is not a right triangle");
        }

    }
}
