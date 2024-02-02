public class ParkingLot
{
    public ParkingSpot[] parkingSpots;
    
    // implements a constructor that creates the array mentioned above
    public ParkingLot()
    {
        parkingSpots = new ParkingSpot[10];
        
        for (int i = 0; i < 10; i++)    
        {
            if (i <= 1)
            {
                this.parkingSpots[i] = new ParkingSpot(true);
            }
            else 
            {
                this.parkingSpots[i] = new ParkingSpot(false);
            }
        }
    }
    // implements a method that takes a Car and parks it in the appropriate available parking spot
        // this method should return an int representing the chosen index of the chosen parking spot in the array
    public int parkCar(Car car)
    {
        for (int i = 0; i < parkingSpots.length; i++)
        {
            if (parkingSpots[i].parkedCar == null && (!parkingSpots[i].isHandicap || car.isHandicap))
            {
                parkingSpots[i].parkedCar = car;
                return i;
            }
        }

        return -1;
    }

    public Car removeCar(int index)
    {
        if(index < 0 || index >= parkingSpots.length)
        {
            return null;
        }
        Car car = parkingSpots[index].parkedCar;
        parkingSpots[index].parkedCar = null;

        return car;
    }

    public String toString()
    {
        int handicapParking = 0;
        int standardParking = 0;

        for (int i = 0; i < parkingSpots.length; i++)
        {
            if(parkingSpots[i].isHandicap && parkingSpots[i].parkedCar == null)
            {
                handicapParking++;
            }
            else if (parkingSpots[i].parkedCar == null)
            {
                standardParking++;
            }
        }
        return (handicapParking + " " + standardParking);
    }

    
    
   
     

}
