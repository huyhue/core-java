package atom;
public class main {

    private static int number;
     public static void main(String[] args) {
          Atom atom = new Atom();
          for (int i = 0; i < 10; i++) {
                atom.accept();
                if (number == 0) {
                  break;
              }
         }
          for (int i = 0; i < 10; i++) {
             atom.display();
         }
     }
}
