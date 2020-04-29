
package ghuy;
public class bai7 {
    //hien thi len man hinh cac so fibonasi < 20
    public static void main(String[] args) {
        System.out.println("hien thi len man hinh cac so fibonacci < 20: "); 
        int i = 0;
        while(fibonacci(i) < 20){
            System.out.print(fibonacci(i) + " ");
            i++;
        }
    }
     
    /**
     * Tính số fibonacci thứ n
     */
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
        
    }
}
