public class lab_2 {

    public static String getLetterGrade(double grade){
        String text;
        if (grade>=90){
            text="A";
        }else if (grade>=80){
            text="B";
        }else if (grade>=70){
            text="C";
        }else if (grade>=60){
            text="D";
        }else{
            text="F";
        } 
        return text;
    }
    public static void main(String[] args){
        
        System.out.println(getLetterGrade(95.5) + "\n" + getLetterGrade(82) + "\n" + getLetterGrade(47));    
    }
}
