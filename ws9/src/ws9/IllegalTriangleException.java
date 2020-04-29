
package ws9;
public class IllegalTriangleException extends Exception{
    String message;

    public IllegalTriangleException(String message) {
        this.message = message;
    }

    public IllegalTriangleException() {
    }
    public void printMessage1(){
        System.out.println(message);
    }
}
