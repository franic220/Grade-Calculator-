import java.text.DecimalFormat;
import java.util.Scanner;
/*********
 * 
 * @author Jephte Francois
 * CST8101 19S
 * Lab 5
 * Calculate the final grade for CST8101
 *
 */
public class GradeCalculator {
	Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    private double test, hybrid, lab, finalExam, theory, practical, midterm, finalGrade;

  public GradeCalculator(double test, double hybrid, double lab, double finalExam, double theory, double practical, double finalGrade)  {
     this.test = test;
     this.hybrid = hybrid;
     this.lab = lab;
     this.finalExam = finalExam;
     this.theory = theory;
     this.practical = practical; 
     this.midterm = midterm;
     this.finalGrade = finalGrade; 
  }
  
  
  public GradeCalculator()  {
	     System.out.println("Welcome to the CST8101 Final Mark Calculator\n");
  }
  
  public void getMarks() {
	     System.out.print("Enter your Lab mark out of 10: ");
	     lab = input.nextDouble();
	     System.out.print("Enter your Quiz/Test mark out of 10: ");
	     test = input.nextDouble();
	     System.out.print("Enter your Hybrid Activities / Assignment mark out of 20: ");
	     hybrid = input.nextDouble();
	     System.out.print("Enter your midterm mark out of 20 :");
	     midterm = input.nextDouble();
	     System.out.print("Enter your final Assessment (Exam) mark out of 40: ");
	     finalExam = input.nextDouble(); 
	     input.close();
  }
  
  public void calculateGrades() {
	    theory = (test+finalExam+midterm) *100/70;
	    practical = (hybrid+lab) *100/30;
	    //conditional grade calculations 
	    if (theory<50 || practical<50) {
	    	if (theory<practical) {
	    		finalGrade=theory;
	    	} else {finalGrade=practical;}
	    } else {
	    finalGrade = test+finalExam+hybrid+lab+midterm; }
	    }
  
  public void displayGrades() {
	    System.out.println("\nTheory grade: "+df.format(theory) +"%");
	    System.out.println("Practical grade: "+df.format(practical) + "%");
	    System.out.println("Final grade: "+df.format(finalGrade) +"%");
	    
	    
	    //A+ conditions 
	    if 
		  (finalGrade >= 90)
	    	System.out.print("Grade Letter: " + " A+");
	    
	    
	    // A conditions 
	    if
	      (finalGrade >= 85 && finalGrade<= 89)
	    	System.out.print("Grade Letter: " + " A");
	    
	    
	    // A- conditions 
	    if
	      (finalGrade >= 80 && finalGrade<= 84)
	    	System.out.print("Grade Letter: " + " A-");
	    
	    // B+ conditions
	    if
	      (finalGrade >= 77 && finalGrade<= 79)
	    	System.out.print("Grade Letter: " + " B+");
	    
	    
	    // B conditions 
	    if
	      (finalGrade >= 73 && finalGrade<= 76)
	    	System.out.print("Grade Letter: " + " B");
	  
	    
	    // B- conditions
	    if
	      (finalGrade >= 70 && finalGrade<= 72)
	    	System.out.print("Grade Letter: " + " B-");
	  
	   
	    // C+ conditions
	    if
	      (finalGrade >= 67 && finalGrade<= 69)
	    	System.out.print("Grade Letter: " + " C+");
	   
	    
	   // C grade conditions 
	    if
	      (finalGrade >= 63 && finalGrade<= 66)
	    	System.out.print("Grade Letter: " + " C");
	   
	    
	    // C- conditions
	    if
	      (finalGrade >= 60 && finalGrade<= 62)
	    	System.out.print("Grade Letter: " + " C-");
	    
	    
	    // F Grade conditions 
	    if
	      (finalGrade <= 59)
	    	System.out.print("Grade Letter: " + " F");
	    	
		  

	}
  
      
  
  public static void main(String[] args) {
	  GradeCalculator lab5 = new GradeCalculator();
	  lab5.getMarks();
	  lab5.calculateGrades();
	  lab5.displayGrades();
	  
  }

}
