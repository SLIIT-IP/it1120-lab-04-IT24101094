public class It24102337Lab4Q2 {
   public static void main(String[] args) {
    Scanner Scanner=new Scanner (System.in);
    System.out.println("Enter exam marks (out of 100)");
    double examMarks = Scanner.nextDouble();
 if(examMarks<=0 || examMarks>=100){
         System.out.println("Invalid input for exam marks. Terminating program"); 
         return;
    }
    System.out.println("Enter the lab submission(out of 100)");
    double LabSubmission = Scanner.nextDouble();
    if(labsubmisson <= 0 || labsubmission>= 100){
        System.out.print("Invalid input for lab submission marks. Terminating program");
        return;
    }
    System.out.println("please enter the persentage given for the exam");
    double examPersantage = Scanner.nextDouble;
    System.out.println("Please enter the percentage given for the lab submission"); 
    double LabSub= Scanner.nextDouble();
    double marks = examMarks/100 *examPersantage;
    double labMarks = labSubmission/100*LabSub;
    double LastMarks = marks + labMarks;
    if(lastMarks<=100){
         System.out.println(lastMarks);
    }else {
        System.out.println("The percentages must add up to 100. Terminating program");
    }
   }
    
}

