import java.util.*;
public class Editor {
    public static void main(String[] args)
    {
        int so[] = new int[10];
        Scanner s = new Scanner(System.in);  
       
        for(int i=0;i<10;i++)
        {
             so[i]= s.nextInt();
       }
       for(int i=0;i<10;i++)
       {
       System.out.printf("the output:%d",so[i]);
       }
    }
}
