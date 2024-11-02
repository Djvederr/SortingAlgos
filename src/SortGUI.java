import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class SortGUI {
    static int[] arr=randomArray();
    static int x=0;
    static int y=0;;
    static boolean done=false;
    static int count=1;

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Arrays.toString(randomArray()));
        JFrame frame= new JFrame("Sort");
        frame.setSize(arr.length*10, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





        Sort obj=new Sort(arr, Sort.BUBBLE_SORT);
        while(!obj.checkSort(arr)){
            frame.setContentPane(new Panel());
            frame.setVisible(true);
            TimeUnit.MILLISECONDS.sleep(25);

            arr=obj.sort();
            //System.out.println(Arrays.toString(arr));
        }
        done=true;
        for(int i=1;i<=100;i++){
            TimeUnit.MILLISECONDS.sleep(15);
            frame.setContentPane(new Panel());
            frame.setVisible(true);
        }

    }

    public static int[] randomArray(){
        int ar[]=new int[100];
        for(int i=1;i<=100;i++){
            ar[i-1]=i;
        }
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }

        return ar;
    }
}
