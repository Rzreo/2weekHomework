import java.util.UUID;


public class Public_Transport {
    String car_num;
    int fuel;
    int speed;
    int max_passenger;

    String state;


    public Public_Transport(){
        car_num = UUID.randomUUID().toString();
        fuel = 100;
        speed = 0;
        max_passenger=0;
    }


    public void speed_change(int speed){
        this.speed = speed;
    }
    public void state_change(String state){
        this.state = state;
    }
    public boolean passenger_boarding(int men){
        if(max_passenger < men) {
            System.out.println("최대 승객 수 초과");
            return false;
        }
        return true;
    }
}

