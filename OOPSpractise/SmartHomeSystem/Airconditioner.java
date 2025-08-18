package OOPSpractise.SmartHomeSystem;

public class Airconditioner implements Devices{
    boolean isOn = false;
    int temp = 24;
    @Override
    public void turnon() {
        System.out.println("Ac is turned On!");
        isOn = true;
        temp = 24;
    }

    @Override
    public void turnoff() {
        System.out.println("AC is turned Off!");
        isOn = false;
    }

    public void increasetemp(){
        if(isOn == true){
            if(temp < 28 && temp > 18){
                temp += 1;
                System.out.println("Temperature is set to "+temp);
            }else{
                System.out.println("Cannot increase the temperature.");
            }
        }else{
            System.out.println("AC is Off.");
        }
    }

    public void decreasetemp(){
        if(isOn == true){
            if(temp < 28 && temp > 18){
                temp -= 1;
                System.out.println("Temperature is set to "+temp);
            }else{
                System.out.println("Cannot increase the temperature.");
            }
        }else{
            System.out.println("AC is Off.");
        }
    }
}
