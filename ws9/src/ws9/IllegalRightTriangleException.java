package ws9;

public class IllegalRightTriangleException extends Exception{
    String message;

    public IllegalRightTriangleException(String message) {
        this.message = message;
    }

    public IllegalRightTriangleException() {
    }
    public void printMessage2(){
        System.out.println(message);
    }
}
