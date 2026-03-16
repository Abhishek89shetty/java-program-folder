import java.util.Scanner;
class C4
{
    public static void main(String[] agrs)
    {
        Scanner s  =new Scanner(System.in);
        
        int s1,s2,s3,s4,s5,s6;
        float per;
        System.out.println("eneter your subject marks one  by one");
        System.out.println("kannda:");
        s1=s.nextInt();
        System.out.println("english");
        s2=s.nextInt();
        System.out.println("mathematics");
        s3=s.nextInt();
        System.out.println("social studies");
        s4=s.nextInt();
        System.out.println("science");
        s5=s.nextInt();
        System.out.println("sanskrit");
        s6=s.nextInt();
       per = ((float)(s1+s2+s3+s4+s5+s6)/600)*100;
       System.out.print("your percentage is:" + per);
       System.out.println(per);
           }
}