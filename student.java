import java.util.*;
public class student
{
    /*static long uniq=0,ind1=0,ind2=0;
    static int num=0,temp=0;
    static String grade=" ";
    static double engli=0.0,socia=0.0,scien=0.0,sum=0.0,percent=0.0;
    static String lan[]=new String[3];
    static String name1[]=new String[3];
    static String name2[]=new String[3];
    static char name3[]=new char[3];
    static long uni[]=new long[3];
    static long index[]=new long[3];
    static long indu[]=new long[3];
    static int eng1[]=new int[3];
    static int eng2[]=new int[3];
    static int lang[]=new int[3];
    static int math[]=new int[3];
    static int comp[]=new int[3];
    static int his[]=new int[3];
    static int geo[]=new int[3];
    static int phy[]=new int[3];
    static int chem[]=new int[3];
    static int bio[]=new int[3];*/
    static Variables variable = new Variables();
    static void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students : ");
        variable.nos=sc.nextInt();
for(int i=0;i<variable.nos;i++)
        {
System.out.println();
System.out.println();
System.out.println();
System.out.println("Enter your name : ");
            variable.name1[i]=sc.nextLine();
System.out.println("Enter your unique ID : ");
variable.uni[i]=sc.nextLong();
System.out.println("Enter your index no /'example 118695/' : ");
            variable.index[i]=sc.nextLong();
System.out.println("Enter your index no /'example 044/' : ");
variable.indu[i]=sc.nextLong();
System.out.println("Enter your marks in English Language : ");
            variable.eng1[i]=sc.nextInt();
System.out.println("Enter your marks in English Literature : ");
            variable.eng2[i]=sc.nextInt();
System.out.println("Enter your IIndlanguage : ");
variable.lan[i]=sc.next();
System.out.println("Enter your marks in "+variable.lan[i]+" : ");
variable.lang[i]=sc.nextInt();
System.out.println("Enter your marks in Mathematics : ");
            variable.math[i]=sc.nextInt();
System.out.println("Enter your marks in Computer Application : ");
            variable.comp[i]=sc.nextInt();
System.out.println("Enter your marks in History & Civics: ");
            variable.his[i]=sc.nextInt();
System.out.println("Enter your marks in Geography : ");
            variable.geo[i]=sc.nextInt();
System.out.println("Enter your marks in Physics : ");
variable.phy[i]=sc.nextInt();
System.out.println("Enter your marks in Chemistry : ");
            variable.chem[i]=sc.nextInt();
System.out.println("Enter your marks in Biology : "); 
            variable.bio[i]=sc.nextInt();
            System.out.print('\u000c');
        }
    }
    static void input()
    {
        Scanner sc =new Scanner(System.in);
System.out.println();
System.out.println();
System.out.println();
System.out.println("\t\t**********Enter the details of the student to be searched**********");
System.out.println();
System.out.println();
System.out.print(" Enter your unique ID                   : ");
variable.uniq=sc.nextLong();
System.out.print(" Enter your index no \'example 004\'    : ");
        variable.ind1=sc.nextLong();
System.out.print(" Enter your index no \'example 113278\' : ");
        variable.ind2=sc.nextLong();
        System.out.print('\u000c');
    }
    static void calc()
    {
for(int i=0;i<variable.nos;i++)
        {
            if(variable.uni[i]==variable.uniq&&variable.indu[i]==variable.ind1&&variable.index[i]==variable.ind2)
            {
                variable.temp=1;
variable.num=i;
variable.engli=(variable.eng1[variable.num]+variable.eng2[variable.num])/2;
variable.socia=(variable.his[variable.num]+variable.geo[variable.num])/2;
variable.scien=(variable.phy[variable.num]+variable.chem[variable.num]+variable.bio[variable.num])/3;
                break;
            }
            else if(i==3)
            variable.temp=2;
        }
        variable.sum=variable.engli+variable.socia+variable.scien+variable.math[variable.num]+variable.lang[variable.num]+variable.comp[variable.num];
        variable.percent=(variable.sum/600)*100;
        if(variable.percent<=50)
        variable.grade="Grade : Poor";
        else if(variable.percent>50&&variable.percent<=75)
        variable.grade="Grade : Average";
        else if(variable.percent>75&&variable.percent<=89)
        variable.grade="Grade : Good";
        else
        variable.grade="Grade : Excellent";
    }
    static void display()
    {
        if(variable.temp==1)
        {
System.out.println("Name      : "+variable.name1[variable.num]);
System.out.println("");
System.out.println("Unique ID : "+variable.uniq);
System.out.println("");
System.out.println("Index No  : "+variable.ind2+"/"+variable.ind1);
System.out.println("");
System.out.println("");
System.out.println("English \t\t\t\t: "+variable.engli);
System.out.println("");
System.out.println("English Language      : "+variable.eng1[variable.num]);
System.out.println("English Literature    : "+variable.eng2[variable.num]);
System.out.println("");
System.out.println(variable.lan[variable.num]+" \t\t\t\t\t        : "+variable.lang[variable.num]);
System.out.println("");
System.out.println(variable.lan[variable.num]+"               : "+variable.lang[variable.num]);
System.out.println("");
System.out.println("Mathematics \t\t\t\t: "+variable.math[variable.num]);
System.out.println("");
System.out.println("Mathematics           : "+variable.math[variable.num]);
System.out.println("");
System.out.println("Social Studies \t\t\t\t: "+variable.socia);
System.out.println("");
System.out.println("History&Civics  : "+variable.his[variable.num]);
System.out.println("Geography             : "+variable.geo[variable.num]);
System.out.println("");
System.out.println("Science \t\t\t\t: "+variable.scien);
System.out.println("");
System.out.println("Physics               : "+variable.phy[variable.num]);
System.out.println("Chemistry             : "+variable.chem[variable.num]);
System.out.println("Biology               : "+variable.bio[variable.num]);
System.out.println("");
System.out.println("Computer Applications \t\t       : "+variable.comp[variable.num]);
System.out.println("");
System.out.println("Computer Applications : "+variable.comp[variable.num]);
System.out.println();
System.out.println();
System.out.println("Total Marks = "+variable.sum+"/600");
System.out.println("Percentage = "+variable.percent);
System.out.println(variable.grade);
       }
       else
System.out.println("The entered unique ID and index numbers does not match any student");
    }
    public static void main(String[]args)
    {
        student ob=new student();  
        Scanner sc = new Scanner (System.in);
        int choice=0,temp=0;
        for(;;)
        {
        System.out.println("Enter your choice ");
        System.out.println("1 Enter data ");
        System.out.println("2 search data ");
        System.out.println("3 exit");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: student.accept();
            student.calc();
            temp=0;
            break;
            case 2 : student.input();
            student.display();
            temp=0;
            break;
            case 3 : System.out.println("YOU HAVE REACHED THE END OF THE PROGRAM");
            temp=1;
            break;
            default : System.out.println("WRONG INPUT");
            temp=0;
        }
        if(temp==1)
        break;
    }
    }
}