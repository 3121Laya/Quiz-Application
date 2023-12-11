 package OnlineQuiz;

 import java.util.Scanner; 

 public class Main { 
	  private static String username;
      private static String password;
      public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the Quiz Application!");
      System.out.println("Please create a username:");
      username = scanner.nextLine();

      System.out.println("Please create a password:");
      password = scanner.nextLine();

      System.out.println("Registration successful!");

      System.out.println("Please enter your username:");
      String enteredUsername = scanner.nextLine();

      System.out.println("Please enter your password:");
      String enteredPassword = scanner.nextLine();

      if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
      System.out.println("Login successful!");
          
      Scanner input = new Scanner(System.in); 
      int score = 0; 
    

      System.out.println("Total number of questions 10");
      System.out.println("Each question carries one mark.");
      System.out.println("All the best!!");
      System.out.println("START YOUR QUIZ");
    
 
    // Question 1 
   
      System.out.println("1)Which statement is true about Java?"); 
      System.out.println("a) Java is a sequence-dependent programming language"); 
      System.out.println("B) Java is a code dependent programming language"); 
      System.out.println("C) Java is a platform-dependent programming language");
      System.out.println("D) Java is a platform-Independent programming language");
      String answer1 = input.nextLine(); 
      if (answer1.equals("D")) { 
    
      System.out.println("Correct!"); 
      score++; 
      } else { 
      System.out.println("Incorrect. The correct answer is D) Java is a platform-Independent programming language"); 
      } 
 
    // Question 2 
      System.out.println("2)What is the extension of java code files?"); 
      System.out.println("A) .js"); 
      System.out.println("B) .txt"); 
      System.out.println("C).class");
      System.out.println("D).java");
      String answer2 = input.nextLine(); 
      if (answer2.equals("D")) { 
      System.out.println("Correct!");  
      score++; 
      } else { 
      System.out.println("Incorrect. The correct answer is D).java."); 
      } 
 
    // Question 3 
      System.out.println("3)Who invented Java Programming?"); 
      System.out.println("A) Guido van Rossum"); 
      System.out.println("B) James Gosling"); 
      System.out.println("C) Dennis Ritchie");
      System.out.println("D) Bjarne Stroustrup");
      String answer3 = input.nextLine(); 
      if (answer3.equals("B")) { 
      System.out.println("Correct!"); 
      score++; 
      } else { 
      System.out.println("Incorrect. The correct answer is B.James Gosling"); 
      } 
    
      System.out.println("4)Which one of the following is not a Java feature?"); 
      System.out.println("A) Object-oriented"); 
      System.out.println("B) Use of pointers"); 
      System.out.println("C) Portable"); 
      System.out.println("D) Dynamic and Extensible"); 
    
      String answer4 = input.nextLine(); 
      if (answer4.equals("B")) { 
      System.out.println("Correct!"); 
      score++; 
      } else { 
      System.out.println("Incorrect. The correct answer is B)Use of pointers"); 
      } 
      System.out.println("5)Which of these cannot be used for a variable name in Java?"); 
      System.out.println("A) identifier"); 
      System.out.println("B) identifier & keyword"); 
      System.out.println("C) keyword"); 
      System.out.println("D) none of the mentioned"); 
      
      String answer5 = input.nextLine(); 
      if (answer5.equals("C")) { 
        System.out.println("Correct!"); 
        score++; 
      } else { 
        System.out.println("Incorrect. The correct answer is C)  keyword"); 
      } 
      System.out.println("6)Number of primitive data types in Java are?"); 
      System.out.println("A) 6"); 
      System.out.println("B) 7"); 
      System.out.println("C) 8"); 
      System.out.println("D) 9"); 
      
      String answer6 = input.nextLine(); 
      if (answer6.equals("C")) { 
        System.out.println("Correct!"); 
        score++; 
      } else { 
        System.out.println("Incorrect. The correct answer is C) 8"); 
      } 
      
      System.out.println("7)Which of the following is not an OOPS concept in Java?"); 
      System.out.println("A) Polymorphism"); 
      System.out.println("B) Inheritance"); 
      System.out.println("C) Compilation"); 
      System.out.println("D) Encapsulation"); 
      
      String answer7 = input.nextLine(); 
      if (answer7.equals("C")) { 
        System.out.println("Correct!"); 
        score++; 
      } else { 
        System.out.println("Incorrect. The correct answer is C)Compilation"); 
      } 
      
      System.out.println("8)Which of these are selection statements in Java?"); 
      System.out.println("A) break"); 
      System.out.println("B) continue"); 
      System.out.println("C) for()"); 
      System.out.println("D) if()"); 
      
      String answer8 = input.nextLine(); 
      if (answer8.equals("D")) { 
        System.out.println("Correct!"); 
      
      } else { 
        System.out.println("Incorrect. The correct answer is D) if()"); 
      } 
      
      System.out.println("9) JDK stands for"); 
      System.out.println("A) Java development kit"); 
      System.out.println("B) Java deployment kit"); 
      System.out.println("C) JavaScript deployment kit"); 
      System.out.println("D) None of these"); 
      
      String answer9 = input.nextLine(); 
      if (answer9.equals("A")) { 
        System.out.println("Correct!"); 
        score++; 
      } else { 
        System.out.println("Incorrect. The correct answer is A) Java development kit"); 
      } 
      
      System.out.println("10)Which class in Java is used to take input from the user?"); 
      System.out.println("A) Scanner"); 
      System.out.println("B) Input"); 
      System.out.println("C) .Applier"); 
      System.out.println("D) None"); 
      
      String answer10 = input.nextLine(); 
      if (answer10.equals("A")) { 
        System.out.println("Correct!"); 
        score++; 
      } else { 
        System.out.println("Incorrect. The correct answer is A)Scanner"); 
      } 
  	        

      // Display final score 
//      System.out.println();
      System.out.println("--------RESULTS---------");
  //  
      System.out.println("Your score : "+score);
      if(score>=9){
          System.out.println("Performance : Very Good");
      }
      else if(score<=5){
          System.out.println("Performance : Very Low");
      }
      else{
          System.out.println("Performance : Medium");
      
      }
      }
        else {
      System.out.println("Invalid username or password. Please try again.");
      }
      }
      }
    