package OOPSpractise.SmartHomeSystem;

public class Fans implements Devices, Level{
    boolean isOn = false;
    public int level = 5;

    @Override
    public void turnon() {
        System.out.println("Fans are turned On!");
        isOn = true;
        level = 5;
    }

    @Override
    public void turnoff() {
        System.out.println("Fans are turned Off!");
        isOn = false;
    }

    @Override
    public int Decrease() {
        if(isOn == true){
            if(level > 0){
                level -= 1;
                System.out.println("Fans are dimmed to "+level+"%.");
                return 0;
            }else{
                System.out.println("Fans are dimmed to lowest level.");
            }
        }else{
            System.out.println("Fans are off.");
        }
        return 0;
    }

    @Override
    public int Increase() {
        if(isOn == true){
            if(level < 5){
                level += 1;
                System.out.println("Fans are brightened to "+level+"%.");
                return 0;
            }else{
                System.out.println("Fans are brightened to maximum level.");
            }
        }else{
            System.out.println("Fans are off.");
        }
        return 0;
    }
}
