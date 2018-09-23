public class Main {

    public static void main(String[] args) {
        //distances on the X-axis
        double droneAX=5.0d;
        double droneBX=4.0d;
        double droneCX=-3.0d;

        //distances on the Y-axis
        double droneAY=2.0d;
        double droneBY=9.0d;
        double droneCY=2.0d;

        //distances on the Z-axis
        double droneAZ=-5.0d;
        double droneBZ=2.0d;
        double droneCZ=6.0d;

        //distance between drones A and B
        Math.pow(droneAX-droneBX,2);
        Math.pow(droneAY-droneBY,2);
        Math.pow(droneAZ-droneBZ,2);
        double AddAB=(Math.pow(droneAX-droneBX,2)+ Math.pow(droneAY-droneBY,2)+ Math.pow(droneAZ-droneBZ,2));
        Math.sqrt(AddAB);
        double distAB=Math.sqrt(AddAB);
        System.out.println("The distance between drones A and B is " + Math.sqrt(AddAB)+ " units.");

        // distance between drones B and C
        Math.pow(droneBX-droneCX,2);
        Math.pow(droneBY-droneCY,2);
        Math.pow(droneBZ-droneCZ,2);
        double AddBC=(Math.pow(droneBX-droneCX,2)+ Math.pow(droneBY-droneCY,2)+ Math.pow(droneBZ-droneCZ,2));
        Math.sqrt(AddBC);
        double distBC=Math.sqrt(AddBC);
        System.out.println("The distance between drones B and C is " + Math.sqrt(AddBC)+ " units.");

        //distance between drones A and C
        Math.pow(droneAX-droneCX,2);
        Math.pow(droneAY-droneCY,2);
        Math.pow(droneAZ-droneCZ,2);
        double AddAC=(Math.pow(droneAX-droneCX,2)+ Math.pow(droneAY-droneCY,2)+ Math.pow(droneAZ-droneCZ,2));
        Math.sqrt(AddAC);
        double distAC=Math.sqrt(AddAC);
        System.out.println("The distance between drones A and C is " + Math.sqrt(AddAC)+ " units.");

        //maximum and minimum distances
        Math.max(distAB,Math.max(distAC,distBC));
        Math.min(distAB,Math.max(distAC,distBC));
        double max=Math.max(distAB,Math.max(distAC,distBC));
        double min=Math.min(distAB,Math.max(distAC,distBC));
        System.out.println("The maximum distance between the drones is " + max + " units, and the minimum distance between the drones is " + min + " units.");
    }
}


