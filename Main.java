public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        if(bus1.car_num.equals(bus2.car_num)) System.out.println("번호가 같습니다.");
        else{
            System.out.println("번호가 다릅니다.");
            System.out.println("bus1: " + bus1.car_num);
            System.out.println("bus2: " + bus2.car_num);
        }
        System.out.println();
        bus1.ride(2);
        System.out.println("a. 탑승 승객 수 = "+bus1.cur_passenger+"\nb.잔여 승객 수 = "+(bus1.max_passenger- bus1.cur_passenger)
         + "\nc. 요금 확인 = "+(bus1.cur_passenger*bus1.fare));
        System.out.println();
        bus1.set_fuel(-50);
        System.out.println("a. 주유량 = "+bus1.fuel);
        System.out.println();
        bus1.stop();
        bus1.set_fuel(10);
        System.out.println("a. 상태 = "+bus1.state);
        System.out.println("b. 주유량 = "+bus1.fuel);
        System.out.println();
        bus1.state_change("운행");
        bus1.ride(45);
        bus1.ride(5);
        System.out.println("a. 탑승 승객 수 = "+bus1.cur_passenger+"\nb.잔여 승객 수 = "+(bus1.max_passenger- bus1.cur_passenger)
                + "\nc. 요금 확인 = "+(bus1.cur_passenger*bus1.fare));
        System.out.println();
        bus1.set_fuel(-55);
        System.out.println("a. 주유량 = "+bus1.fuel);
        System.out.println("b. 상태 = "+bus1.state);
        System.out.println();


        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

        if(taxi1.car_num.equals(taxi2.car_num)) System.out.println("번호가 같습니다.");
        else{
            System.out.println("a. 번호가 다릅니다.");
            System.out.println("taxi1: " + taxi1.car_num);
            System.out.println("taxi2: " + taxi2.car_num);
        }
        System.out.println("b. 주유량 = "+taxi1.fuel);
        System.out.println("c. 상태 = "+taxi1.state);
        System.out.println();

        taxi1.ride(2);
        taxi1.set_destination("서울역",2);

        System.out.println("a. 탑승 승객 수 = "+taxi1.cur_passenger);
        System.out.println("b. 잔여 승객 수 = "+ (taxi1.max_passenger - taxi1.cur_passenger));
        System.out.println("c. 기본 요금 확인 = "+taxi1.basic_fare);
        System.out.println("d. 목적지 = "+taxi1.destination);
        System.out.println("e. 목적지까지 거리 = "+ taxi1.distance + "km");
        System.out.println("f. 지불할 요금 = "+taxi1.now_fare());
        System.out.println("g. 상태 = "+taxi1.state);
        System.out.println();

        taxi1.set_fuel(-80);
        System.out.println("a. 주유량 = "+ taxi1.fuel);
        System.out.println("b. 누적 요금 = "+taxi1.pay());
        System.out.println();

        taxi1.ride(5);

        taxi1.ride(3);
        taxi1.set_destination("구로디지털단지역",12);

        System.out.println("a. 탑승 승객 수 = "+taxi1.cur_passenger);
        System.out.println("b. 잔여 승객 수 = "+ (taxi1.max_passenger - taxi1.cur_passenger));
        System.out.println("c. 기본 요금 확인 = "+taxi1.basic_fare);
        System.out.println("d. 목적지 = "+taxi1.destination);
        System.out.println("e. 목적지까지 거리 = "+ taxi1.distance + "km");
        System.out.println("f. 지불할 요금 = "+taxi1.now_fare());
        System.out.println();

        taxi1.set_fuel(-20);
        System.out.println("a. 주유량 = "+ taxi1.fuel);
        System.out.println("b. 상태 = "+ taxi1.state);
        System.out.println("c. 누적 요금 = "+taxi1.pay());
        System.out.println();



    }
}
