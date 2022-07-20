public class Bus extends Public_Transport{
    int cur_passenger;
    int fare;

    public Bus(){
        super();
        state_change("운행");
        max_passenger = 30;
        fare = 1000;
    }
    public void set_fuel(int n){
        fuel += n;
        if(fuel < 10) {
            System.out.println("주유 필요");
            state_change("차고지행");
        }
    }
    public void stop(){
        this.state_change("차고지행");
        cur_passenger = 0;
    }
    public void ride(int n){
        if(state.equals("차고지행")) System.out.println("운행중이 아닙니다.");
        else{
            if(passenger_boarding(cur_passenger + n)) cur_passenger+=n;
        }
    }

    public void set_speed(int n){
        if(fuel < 10) System.out.println("주유량을 확인해 주세요");
        else{
            speed_change(speed+n);
        }
    }

    public void state_change(String state){
        if(state.equals("차고지행")) cur_passenger=0;
        this.state = state;
    }

}
