public class string {
    public static void main(String[] args) {
        //Text String 
        String str1 = "CS1301";
        //Get the length of the string. We need to declared to a int for length function because of value is a whole number 
        int str1Length = str1.length();
        System.out.println(str1Length);
        //Get the character at a specific index
        System.out.println(str1.charAt(0));
        char ch = str1.charAt(5);
        System.out.println(ch);
        //Get the index of a specific character
        System.out.println(str1.indexOf('S'));
        //Boolean method to check if equeal to other string
        String str2 = "Hello";
        String str3 = "Hello";
        System.out.println(str2.equals(str3));
        //Boolean method to check if equal to other string ignoring case
        String str4 = "Evelyn";
        System.out.println(str2.equalsIgnoreCase(str4));
        //Concatenate two strings
        String str5 = str2.concat(str4);
        System.out.println(str5);
        

    }
}
