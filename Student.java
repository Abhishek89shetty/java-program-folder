<<<<<<< HEAD
public class Student
{
    int score=0;
    boolean punishment;

    private int viewScore()
    {
      return score;
     }
    public void checkPunishment()
    {
        if(score<=4)
        {
            punishment=true;
        }
        else{

            punishment=false;
        }
    }
    public void attendanceStatus()
    {
          
         if(punishment==true)
            {
             System.out.println("today ur not getting attendance because ur score is low!!!!!");
            }   
            else{
             System.out.println("keep it up good going>>>");
            }
    }
    public void endDay()
    {
        if(punishment==true)
        {
            punishment=false;
            score=5;
        }
    }
=======
public class Student
{
    int score;
    boolean punishment;

    private int viewScore()
    {
      return score;
     }
    public void checkPunishment()
    {
        if(score<=4)
        {
            punishment=true;
        }
        else{

            punishment=false;
        }
    }
    public void attendanceStatus()
    {
          
         if(punishment==true)
            {
                System.out.println("today ur not getting attendance because ur score is low!!!!!");
            }   
            else{
                System.out.println("keep it up good going>>>");
            }
    }
    public void endDay()
    {
        if(punishment==true)
        {
            punishment=false;
            score=5;
        }
    }
>>>>>>> 2b9db322098c4e68916bb396f5224a87614cbb60
}