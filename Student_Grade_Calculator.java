import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        int subjects;
        Scanner sc = new Scanner(System.in);   //to take input 
        System.out.println("**********Sakshi Grade Calculator**********");
    while(true){   // run loop again after invalid input
        try{
        System.out.print("Enter The Number of Subject: ");
        subjects = Integer.parseInt(sc.nextLine());  // protect from buffer leak 
    //sc.nextline()-> "89"  --> Integer.parseInt(89)-->89 in integer 
        
        if(subjects <= 0){
            System.out.println("Invalid! Please Enter Number of Subjects  Greater than 0.");
        }
        break;
    }catch(NumberFormatException e){  //if subjects enter in the form of text and other than integer 
        System.out.println("Invalid! Please Enter a integer value.");
        } 
    }  

        int totalMarks = 0; 
        //Accumulator loop for different subjects marks 
    for(int i=1; i<=subjects; i++){
        int marks;
        // for input validation + exception handling for invalud marks 
    while(true){
        try{    // handle invalid input for marks
            System.out.print("Enter marks of subject " +i+ "(0-100): ");
            marks = Integer.parseInt(sc.nextLine());

            if(marks < 0 || marks > 100){
                System.out.println("Enter the marks In B/t (0-100) ");
            }
            break;
        }catch(NumberFormatException e){  // if marks enter in the form of  text 
            System.out.println("invalid! enter integers value only");
        }
    }  
    totalMarks += marks;
    }
    // type casting to get percentage  in decimal rather than to get 0 in some cases like->199/2 = 99.5.   
    double percentage = (double)totalMarks / subjects;

    //Main logic-->
    String Grade;
    if( percentage >=90){
        Grade = "A";
    }
    else if( percentage >=80){
        Grade = "B";
    }
    else if( percentage >=70){
        Grade = "C";
    }
    else if( percentage >=60){
        Grade = "D";
    }
    else{
        Grade = "F";
    }
    System.out.println("#____FinalResult board of sakshi: ");
    System.out.println("Total Marks of Sakshi = " + totalMarks);
    //%.2f-> decimal value upto 2  decimal places , %% -> sign of percenatge and %n-> newline 
    System.out.printf("percentage of sakshi : %.2f%%%n " ,percentage);
    System.out.println("Grade Of Sakshi = " +Grade);

    System.out.println(" Thank you :) ");
    }
}
