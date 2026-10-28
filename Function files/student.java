public class student{
    public static void main(String[] args) {
        String name="Evelyn",gpa="4.00",major="Enginering in Artificial Intelligence";
        student_data students = new student_data();

        System.out.println(students.displayInfo(name, gpa, major));
    }
    
}