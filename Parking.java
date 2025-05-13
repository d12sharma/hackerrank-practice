public class Parking {
    class ParkingSystem {
        public int[] space;

        public ParkingSystem(int big, int medium, int small) {
            space = new int[4];
            space[1] = big;
            space[2]=medium;
            space[3]=small;
        }

        public boolean addCar(int carType) {
            if(space[carType]>0){
                space[carType]--;
                return true;
            }
            return false;
        }
    }

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
}
