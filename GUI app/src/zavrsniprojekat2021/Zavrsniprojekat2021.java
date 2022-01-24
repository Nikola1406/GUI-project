package zavrsniprojekat2021;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Zavrsniprojekat2021 {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        int a = JOptionPane.showConfirmDialog(null, "Do you want to learn how to make geometric shapes ?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.NO_OPTION == a) {
            JOptionPane.showMessageDialog(null, "This game is not for you \n come back when you are interested \n in how geometric shapes are made", null, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        Thread.sleep(2000);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("First level");
        f.setSize(500, 400);
        f.setLocation(50, 20);
        f.setVisible(true);
        f.add(new Prvinivooblik());
        Thread.sleep(3000);
        f.dispose();

        Thread.sleep(2000);

        JFrame f1 = new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("Second level");
        f1.setSize(500, 400);
        f1.setLocation(850, 20);
        f1.setVisible(true);
        f1.add(new Druginivooblik());

        Thread.sleep(3000);
        f1.dispose();
        Thread.sleep(2000);

        JFrame f2 = new JFrame();
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setTitle("Third level");
        f2.setSize(500, 400);
        f2.setLocation(50, 400);
        f2.setVisible(true);

        Thread.sleep(3000);
        f2.dispose();
        Thread.sleep(2000);

        JFrame f3 = new JFrame();
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setTitle("Fourth level");
        f3.setSize(500, 400);
        f3.setLocation(850, 400);
        f3.setVisible(true);
        f3.add(new Trecinivooblik());

        Thread.sleep(3000);
        f3.dispose();
        Thread.sleep(2000);

        JFrame f4 = new JFrame();
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f4.setTitle("Fifth level");
        f4.setSize(500, 400);
        f4.setLocation(500, 250);
        f4.setVisible(true);
        f4.add(new Cetvrtinivooblik());

        Thread.sleep(3000);
        f4.dispose();
        
        System.out.println("Get ready, because the test starts in  :");
        System.out.println("3");
        System.out.println(".\n.");
        Thread.sleep(1000);
        System.out.println("2");
        System.out.println(".\n.");
        Thread.sleep(1000);
        System.out.println("1");
        System.out.println(".\n.");
        Thread.sleep(1000);

        System.out.println("On which frame is the triangle  ?");
        int i=0;
       int b = s.nextInt();
        if(b==4){
            i++;
        }
        System.out.println("On which frame is the empty square ?");
       int c=s.nextInt();
        if(c==1){
            i++;
        }
        System.out.println("On which frame is the ellipse  ?");
       int d=s.nextInt();
        if(d==2){
            i++;
        }
        System.out.println("On which frame is a full square  ?");
       int e=s.nextInt();
        if(e==5){
            i++;
        }
        if(i==0){ 
            System.out.println("Your knowledge of geometric shapes is insufficient to pass this test ");
        }
        if(i==1){
            System.out.println("Enough for passing the test, but you still have to work hard on this area  ");
        FileWriter fw1 = new FileWriter("Geometrijski oblik.txt");
        fw1.write("You passed, but you have to learn geometric shapes better ");
        fw1.close();
        }
        if(i==2){
            System.out.println(" It's okay, but it can be a lot better  ");
        FileWriter fw2 = new FileWriter("Geometrijski oblik2.txt");
        fw2.write("You are not bad at making geometric shapes ");
        fw2.close();
        }
        if(i==3){
            System.out.println("You are very good");
        FileWriter fw3 = new FileWriter("Geometrijski oblik3.txt");
        fw3.write("You are very good at making geometric shapes ");
        fw3.close();
        }
        if(i==4){
            System.out.println("Your knowledge is excellent");
        FileWriter fw = new FileWriter("Geometrijski oblik4.txt");
        fw.write("You are excellent at making geometric shapes");
        fw.close();
        }
        
    

    }
}
