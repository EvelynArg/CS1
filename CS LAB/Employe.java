public class Employe {
    String name;
    double  hourlyRate, hoursWorked;

    public Employe(String name, double hourlyRate, double hoursWorked){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    static double getPay(double hourlyRate, double hoursWorked){
        double weekpay;
        if(hoursWorked > 40){
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * hourlyRate * 1.5;
            double regularPay = 40 * hourlyRate;
            return weekpay= regularPay + overtimePay;
        }else {
            return weekpay = hoursWorked * hourlyRate;
        }
    }

    public void printPaycheck(){
        System.out.println("Employee: " + this.name + ", Total Pay: $" + getPay(this.hourlyRate, this.hoursWorked));
    }

    public static void main(String[] args){
        Employe e1 = new Employe("Evelyn", 10.0, 45);
        Employe e2 = new Employe("Ivana", 10.0, 38);

        e1.printPaycheck();
        e2.printPaycheck();
    }
}
