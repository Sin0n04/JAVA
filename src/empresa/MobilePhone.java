package empresa;

public class MobilePhone {
    private String number;
    private int battery;


    public MobilePhone(String number, int battery){
        this.battery = battery;
        this.number = number;
    }

    public void use(){
        if(battery > 0 ){
            battery -= 1;
        }
        else{
            System.out.println("Phone is dead, Please charge....");
        }
    }

    public String getNumber() {
        return number;
    }

    public int getBattery() {
        return battery;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
