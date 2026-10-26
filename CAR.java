public class CAR{
    String model, color;
    int year=2020;
    double mileage;
    public static void main(String[] args) {
        CAR dreamCar = new CAR(); 

        System.out.println("Model: " + dreamCar.model);
        System.out.println("Color: " + dreamCar.color);
        System.out.println("Year: " + dreamCar.year);
        System.out.println("Mileage: " + dreamCar.mileage);
    }

    public CAR() {
        model = "Lamborghini";
        color = "pink";
        year = 2026;
        mileage = 70.10;
    }
}