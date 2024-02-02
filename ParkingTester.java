public class ParkingTester
{
    public static void main(String[] args)
    {
        ParkingLot parkingLot = new ParkingLot();
        System.out.println(parkingLot);

        Car infinitiA = new Car( "Infiniti","A", true);
        int infinitiIndex = parkingLot.parkCar(infinitiA);
        System.out.println(parkingLot);
        
        Car cadiliacB = new Car("Cadillac", "B", false);
        int cadiliacIndex = parkingLot.parkCar(cadiliacB);
        System.out.println(parkingLot);
        
        Car yeetedCar = parkingLot.removeCar(infinitiIndex);
        System.out.println(parkingLot);
        
        

    }
   
}
