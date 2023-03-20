public class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int seatHeight){
        this.seatHeight = seatHeight;
    }
    @Override
    public String toString(){
        return super.toString() + ", seatHeight:" + seatHeight;
    }

}
