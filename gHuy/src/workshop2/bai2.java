package workshop2;
public class bai2 {
    public static void main(String[] args){
        for (int i = 2; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("Cach khac: ");
        int j = 2;
        while(j <= 10){
            if(j % 2 == 0){
                System.out.println(j);
            }
            j++;
        }
        
    }
}
