package Quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Quiz q=new Quiz();
        q.logic();
     
    }

}

class Quiz{
    Scanner sc=new Scanner(System.in);
    int correctAnsCount=0;
    int wrongAnsCount=0;
  
    public void logic(){
     
    	System.out.println("START YOUR QUIZ");	
        System.out.println("Enter your Name:");
       
        Character ans=sc.next().charAt(0);
        
        Questions q1 = new Questions("Q) Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        Questions q2 = new Questions("Q)What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
        Questions q3 = new Questions("Q)Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        Questions q4 = new Questions("Q)Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Q)Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword","D. none of the mentioned");
        Questions q6 = new Questions("Q)Number of primitive data types in Java are?","A.6","B.7","C.8","D.9");
        Questions q7 = new Questions("Q)Which of the following is not an OOPS concept in Java?","A.Polymorphism","B.Inheritance" ,"C.Compilation","D.Encapsulation");
        Questions q8 = new Questions("Q)Which of these are selection statements in Java?","A. break","B. continue","C.for()","D.if()");
        Questions q9 = new Questions("Q)JDK stands for","A.Java development kit","B.Java deployment kit","C.JavaScript deployment kit","D.None of these");
        Questions q10 = new Questions("Q)Which class in Java is used to take input from the user?","A.Scanner","B.Input","C.Applier","None");
        
        Map<Questions,Character> hmap=new HashMap<>();
        
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');
        hmap.put(q6,'C');
        hmap.put(q7,'C');
        hmap.put(q8,'D');
        hmap.put(q9,'A');
        hmap.put(q10,'A');
        
        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
                      
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter Your Answer: ");
            Character ans1=sc.next().charAt(0);

            
            int cans=Character.compare(ans1,map.getValue());
            
            if(cans==0){
                System.out.println("Correct");
                correctAnsCount++;
            }
            else{
                System.out.println("Wrong");
                wrongAnsCount++;
            }

        }
        
        System.out.println();
        System.out.println("--------RESULTS---------");
        System.out.println("Total Questions: "+hmap.size());
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
        int percentage=(100*correctAnsCount)/hmap.size();
        System.out.println("Your Percentage : "+percentage);
        if(percentage>=90){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<50){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


    }
}
