package OOPSpractise.SmartHomeSystem;

public class SmartHome {

    public class Remotecontrol{
        Light light = new Light();
        Airconditioner ac = new Airconditioner();
        Fans fan = new Fans();

        public void turnOnall(){
            light.turnon();
            ac.turnon();
            fan.turnon();
        }

        public void turnOffall(){
            light.turnoff();
            ac.turnoff();
            fan.turnoff();
        }
    }

    public void  main(String args[]){
        Light light = new Light();
        light.turnon();
        light.Increase();
        light.Decrease();
        light.Decrease();
        light.Decrease();
        light.turnoff();

        Airconditioner ac = new Airconditioner();
        ac.turnon();
        ac.decreasetemp();
        ac.decreasetemp();
        ac.increasetemp();
        ac.increasetemp();
        ac.turnoff();

        Fans fan = new Fans();
        fan.turnon();
        fan.Increase();
        fan.Decrease();
        fan.Decrease();
        fan.Decrease();
        fan.Increase();
        fan.turnoff();

        SmartHome home = new SmartHome();
        SmartHome.Remotecontrol remote = home.new Remotecontrol();
        remote.turnOnall();
        remote.turnOffall();
    }
}
