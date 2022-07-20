public class Taxi extends Public_Transport{
    String destination;
    int distance;
    int basic_dis;
    int basic_fare;
    int dis_fare;

    int cur_passenger;

    public Taxi(){
        super();
        max_passenger = 4;
        basic_fare=3000;
        dis_fare=1000;
        basic_dis=1;
        fuel=100;
        state="일반";
        speed=0;
        cur_passenger = 0;
    }


    public void start(){
        if(fuel<10) {
            System.out.println("주유 필요");
            state = "운행불가";
        }
        else state = "일반";
    }

    public void set_fuel(int n){
        fuel += n;
        if(fuel < 10) {
            System.out.println("주유 필요");
            state_change("운행불가");
        }
    }

    public void ride(int n){
        if(state.equals("운행 중")) System.out.println("탑승불가");
        else{
            if(passenger_boarding(n)) {
                state = "운행중";
                cur_passenger+=n;
            }
        }
    }

    public void set_speed(int n){
        speed_change(speed+n);
    }

    public int ex_fare(){
        if(distance > basic_dis) return distance - basic_dis;
        else return 0;
    }

    public int now_fare(){
        return basic_fare + ex_fare()*dis_fare;
    }

    public int pay(){
        cur_passenger = 0;
        return now_fare();
    }

    public void set_destination(String des, int dis){
        destination = des;
        distance = dis;
    }
}
