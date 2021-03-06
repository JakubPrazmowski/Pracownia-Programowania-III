import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    public StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        while (i<numberOfGrades){
            this.grades = Arrays.copyOf(srcArray, srcArray.length + 1);
            this.grades[this.grades.length-1]=random.nextInt(6);
        }
    }
    public StudentGrades(String name) {
        this.studentName = name;
        Scanner scan = new Scanner(System.in);
        this.grades = scan.nextLine();
    }
    public double Lowest(){
        double x=grades[0];
        for(int i =0; i<grades.length; i++){
            if(grades[i]<x){
                x=grades[i];
            }
        }
        return x;
    }
    public double Highest(){
        double x=grades[0];
        for(int i =0; i<grades.length; i++){
            if(grades[i]>x){
                x=grades[i];
            }
        }
        return x;
    }
    public int NumberOfGrades(){
        return grades.length;
    }
    public double Average(){
        int z=0;
        for (int i=0; i<=grades.length; i+=1){
            z+=grades[i];
        }
        return z/NumberOfGrades();
    }
    public void displayInfo(){
        System.out.println("Name: "+ studentName);
        System.out.println("Grades: "+ grades);
        System.out.println("Number of grades: "+ NumberOfGrades());
        System.out.println("Lowest grade: "+ Lowest());
        System.out.println("Highest grade: "+ Highest());
        System.out.println("Grade point average: "+ Average());
    }
    public static void main(String[] args) {
    StudentGrades student1 = new StudentGrades("Amanda", new double[]{3.5,4.5,4.0,2.0,5.0,3.5,3.5});
    StudentGrades student2 = new StudentGrades("James", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});
  }
}

