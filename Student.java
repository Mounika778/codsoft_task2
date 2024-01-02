import java.util.*;
class Student
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int subjects = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=subjects; i++)
        {
            System.out.println("Enter the subjects"+"\t"+i+"\t"+"marks (out of 100): ");
            int marks = sc.nextInt();
            sum+=marks;
        }
        System.out.println("Your total marks are: "+sum);
        double Average = (double)sum/subjects;
        System.out.println("Your total average is:"+Average);
        if(Average==100)
        {
            System.out.println("You got S grade");
        }
        else if(Average>=85)
        {
            System.out.println("You got A grade");
        }
        else if(Average>=75)
        {
            System.out.println("You got B grade");
        }
        else if(Average>=65)
        {
            System.out.println("You got C grade");
        }
        else if(Average>=55)
        {
            System.out.println("You got D grade");
        }
        else if(Average>=44)
        {
            System.out.println("You got E grade");
        }
        else
        {
            System.out.println("You got F grade");
        }
    }
}