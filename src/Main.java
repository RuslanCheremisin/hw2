public class Main {
    public static void main(String[] args) {
        int carWeightCapacity=50;
        int usedWeight = 20;
        int unusedWeight=carWeightCapacity-usedWeight;
        System.out.println(unusedWeight+" kg can be utilized in car");

        int orangesWeight=3;
        int applesWeight = 2;
        int fruitsWeight=orangesWeight+applesWeight;
        System.out.println("fruits weigh "+fruitsWeight+" kg");
        int meatWeight=4;
        int tomatoesWeight=2;
        int cucumbersWeight=2;
        int pepperWeight=2;
        int waterWeight =5;
        int zukiniWeight=2;
        int foodWeight=fruitsWeight+meatWeight+cucumbersWeight+pepperWeight+waterWeight+zukiniWeight+tomatoesWeight;

        System.out.println("Total food weight is "+foodWeight);

        int leftWeight=unusedWeight-foodWeight;
        System.out.println("There's free "+leftWeight+" kg in the car");
        foodWeight*=2;
        System.out.println(foodWeight);
        leftWeight=unusedWeight-foodWeight;
        System.out.println("we are short of "+leftWeight*-1+" kg");
        int overload=(foodWeight+usedWeight)%carWeightCapacity;
        System.out.println("overload is "+overload);
        int productsPerCar=(foodWeight)/2;
        System.out.println("One car can take "+productsPerCar);

    }
}