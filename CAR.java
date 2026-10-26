public class CAR{
    String model, color;
    int year=2020;
    double mileage;

    public CAR() {
        model = "Lamborghini";
        color = "pink";
        year = 2026;
        mileage = 70.10;
    }

    public static double getMileage(int year, double mileage) {
        if (year>=2000){
            mileage = mileage*0.5;
        }else{
            mileage = mileage*0.2;
        }

        return mileage;
    }
    public static void main(String[] args) {

        CAR dreamCar = new CAR();
        System.out.println("Mileage: " + getMileage(1987, 3000));


    }
}