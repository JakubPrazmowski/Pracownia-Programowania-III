public class Student{
    private String name;
    private String surname;
    private String studentID;
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Student ID: " + studentID);
    }
    public Student(String name, String surname, String studentID){
        this.name=name;
        this.surname=surname;
        this.studentID=studentID;
    }
    public static void main(String[] args) {
        Student student1 = new Student("Jan","Kowalski","234986");
        student1.displayInfo();
    }
}
