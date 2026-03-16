 import java.util.Scanner;
 class km {
    float k,miles;
    public static void main(String[] args)
    {
         km i = new km();
        Scanner ni = new Scanner(System.in);
        System.out.println("enter the kilometer:");
        i.k =ni.nextFloat();
         
        i.miles = i.k * 0.62137119f;
       
        System.out.println(i.k);
         System.out.println(i.miles);
    }
}
