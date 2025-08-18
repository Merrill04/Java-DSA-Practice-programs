package OOPSpractise.SmartHomeSystem;

public class Light implements Devices, Level{
    public int level;
    boolean isOn = false;

    @Override
    public void turnon() {
        System.out.println("Lights are turned On!");
        isOn = true;
        level = 100;
    }

    @Override
    public void turnoff() {
        System.out.println("Lights are turned Off!");
        isOn = false;
    }

    @Override
    public int Decrease() {
        if(isOn == true){
            if(level > 0){
                level -= 20;
                System.out.println("Lights are dimmed to "+level+"%.");
                return 0;
            }else{
                System.out.println("Lights are dimmed to lowest level.");
            }
        }else{
            System.out.println("Lights are off.");
        }
        return 0;
    }

    @Override
    public int Increase() {
        if(isOn == true){
            if(level < 100){
                level += 20;
                System.out.println("Lights are brightened to "+level+"%.");
                return 0;
            }else{
                System.out.println("Lights are brightened to maximum level.");
            }
        }else{
            System.out.println("Lights are off.");
        }
        return 0;
    }
}
