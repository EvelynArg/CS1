public class plant {
    int height;
    String name;
    public static void main(String[] args){
    plant plant1 = new plant("Cactus", 0);
    plant plant2 = new plant("Fern", 0);

    plant1.water();
    plant1.water();
    plant1.water();
    plant2.water();

    System.out.println(plant1.name + " is " + plant1.height + " inches tall.");
    System.out.println(plant2.name + " is " + plant2.height + " inches tall.");

    }

    plant(String name, int height){
        this.name = name;
        this.height = height;
    }

    public void water(){
        this.height+=2;
    }

}
