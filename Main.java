public class Main {

    public static void main(String[] args) {
        //height and radii values for each of the 12 cylindrical water towers
        float h1=72.0f; float r1=11.0f;
        float h2=19.0f; float r2=9.0f;
        float h3=50.0f; float r3=6.5f;
        float h4=67.0f; float r4=8.0f;
        float h5=16.0f; float r5=7.0f;
        float h6=53.0f; float r6=11.5f;
        float h7=69.0f; float r7=11.0f;
        float h8=30.0f; float r8=11.0f;
        float h9=52.0f; float r9=11.5f;
        float h10=40.0f; float r10=8.0f;
        float h11=31.0f; float r11=9.0f;
        float h12=75.0f; float r12=11.5f;

        //round pi to 3.14 to simplify these calculations
        float pi=3.14f;

        //volume values for each of the water towers
        float v1=pi*r1*r1*h1;
        float v2=pi*r2*r2*h2;
        float v3=pi*r3*r3*h3;
        float v4=pi*r4*r4*h4;
        float v5=pi*r5*r5*h5;
        float v6=pi*r6*r6*h6;
        float v7=pi*r7*r1*h7;
        float v8=pi*r8*r8*h8;
        float v9=pi*r9*r9*h9;
        float v10=pi*r10*r10*h10;
        float v11=pi*r11*r11*h11;
        float v12=pi*r12*r12*h12;

        //totalCap is determined by adding all of the volume values together
        float totalCap=v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12;
        System.out.println("There is a total of " + totalCap + " cubic meters of water available in the water towers in the town.");

        int pop=37640;
        float avWaterConsumPerDayPerPerson=0.246f;
        //avWaterConsumPerDayPerPerson is given in cubic meters. This is equivalent to 65 gallons
        float avUsagePerDay=pop*avWaterConsumPerDayPerPerson*28;
        System.out.println("The citizens of the town would use an average of " + avUsagePerDay + " cubic meters of water in 28 days.");

        float waterDifference=avUsagePerDay-totalCap;
        float waterSavedMet=(waterDifference/28)/pop;
        System.out.println("Each person will need to save " + waterSavedMet + " cubic meters of water per day.");

        //waterSavedMet is in cubic meters, while waterSavedGal is in gallons
        double waterSavedGal=(waterSavedMet*264.172);
        System.out.println("This is equivalent to " + waterSavedGal+ " gallons of water per day.");
    }
}
