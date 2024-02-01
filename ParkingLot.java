public class ParkingLot
{
    public ParkingSpot[] parkingSpots;
    
    public ParkingLot()
    {
        this.parkingSpots = new ParkingSpot[10];
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

    public String toString()
    {
        return "";
    }

    // implements a constructor that creates the array mentioned above
    // implements a method that takes a Car and parks it in the appropriate available parking spot
        // this method should return an int representing the chosen index of the chosen parking spot in the array
    // implements a method that takes an int and removes and returns the specified Car from the given ParkingSpot
    // implement toString() to return a string containing the number of handicap accessible
    // and standard parkinf spots available separated by a single space (X,Y)
     

}
