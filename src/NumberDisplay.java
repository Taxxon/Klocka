/**
 * Created by Emil Käck on 2017-11-22.
 */
public class NumberDisplay {

    private int limit;
    private int value;

    public NumberDisplay(int maxLimit){
        this.limit = maxLimit;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 & value < 60) {
            this.value = value;
        }
    }

    public String getDisplayValue(){
        if (value < 10){
            return ("Värde: 0" + value);
        }else {
            return ("Värde: " + value);
        }
    }

    public void increment(){
        if (value == 59){
            value = 0;
        }else {
            value = value + 1;
        }
    }
}
