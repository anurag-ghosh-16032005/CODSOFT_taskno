import java.util.*;
public class student_grade_calculator {
    public static void main (String args [])
    {
        try(Scanner sc = new Scanner (System.in)){
        System.out.println("Enter number of subjects");
        int n = sc.nextInt();
        int i;
        double s,sum=0.0D,avg=0.0D;
        for (i=1;i<=n;i++)
        {
            System.out.println("Enter marks obtained in subject"+i);
            s = sc.nextDouble();
            sum=sum+s;
        }
        System.out.println("Total Marks :"+sum);
        avg=sum/n;
        System.out.println("Average Percentage :"+avg);
        if(avg>=90)
        System.out.println("Grade Obtained : A");
        else if(avg<90&&avg>=80)
        System.out.println("Grade Obtained : B");
        else if(avg<80&&avg>=70)
        System.out.println("Grade Obtained : C");
        else if(avg<70&&avg>=60)
        System.out.println("Grade Obtained : D");
        else if(avg<60&&avg>=50)
        System.out.println("Grade Obtained : E");
        else if(avg<50)
        System.out.println("Grade Obtained : F");

    }
}
    
}
