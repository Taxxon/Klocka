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
        if (value > 0){
            if (value >= 0 & value < limit) {
                this.value = value;
            }
        }
    }

    public String getDisplayValue(){
        if (value < 10){
            return ("0" + value);
        }else {
            return ("" + value);
        }
    }

    public void increment(){
        if ((value+1) == limit){
            value = (limit - (value + 1));
        }else {
            value = value + 1;
        }
    }
}
