package Activities;

public class Bicycle implements BicycleParts,BicycleOperations{
    public int gears,currentSpeed;
    public Bicycle(int gears,int currentSpeed)
    {
        this.gears=gears;
        this.currentSpeed=currentSpeed;
    }
    public void applyBrake(int decrement)
    {
        currentSpeed=currentSpeed-decrement;
        System.out.println("Current speed is "+currentSpeed);
    }
    public void speedUp(int increment){
        currentSpeed=currentSpeed+increment;
        System.out.println("Current speed is "+currentSpeed);
    }
    public String bicycleDesc()
    {
        return("Number of gears are "+gears+"\n"+ "Current Speed of Bicycle is "+currentSpeed);
    }
}
