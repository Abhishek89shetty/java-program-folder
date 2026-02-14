import java.util.Scanner;
class Add3number
{
    public static void main(String[] args)
    {
        //adding the 3 numbers
        int a,b,c;
        int sum;
        Scanner d = new Scanner(System.in);
        System.out.println("enter the three numbers:");
        a = d.nextInt();
        b = d.nextInt();
        c = d.nextInt();
        sum = a+b+c;
        System.out.println("total sum:" + sum);
        }
}