/**
 * Created by emka15 on 2017-11-22.
 */
public class Clock {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    private boolean s;

    public Clock(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hours.setValue(0);
        minutes.setValue(0);
        updateDisplay();
    }

    public Clock(boolean s){
        if (s = true) {
            this.s = s;
            hours = new NumberDisplay(24);
            minutes = new NumberDisplay(60);
            hours.setValue(0);
            minutes.setValue(0);
            updateDisplay();
        }
    }

    public Clock(int h, int m, boolean s){
        if (s = true) {
            this.s = s;
            hours = new NumberDisplay(24);
            minutes = new NumberDisplay(60);
            hours.setValue(h);
            minutes.setValue(m);
            updateDisplay();
        }
    }

    public Clock(int hour, int minute){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        updateDisplay();
    }

    public void timeTick(){
        if (minutes.getValue() == 59){
            hours.increment();
            minutes.increment();
        } else {
            minutes.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime(){
        return displayString;
    }

    private void updateDisplay(){
        if (s = true){
            switch (hours.getValue()) {
                case 13:
                    displayString = "01:" + minutes.getDisplayValue() + "PM";
                    break;
                case 14:
                    displayString = "02:" + minutes.getDisplayValue() + "PM";
                    break;
                case 15:
                    displayString = "03:" + minutes.getDisplayValue() + "PM";
                    break;
                case 16:
                    displayString = "04:" + minutes.getDisplayValue() + "PM";
                    break;
                case 17:
                    displayString = "05:" + minutes.getDisplayValue() + "PM";
                    break;
                case 18:
                    displayString = "06:" + minutes.getDisplayValue() + "PM";
                    break;
                case 19:
                    displayString = "07:" + minutes.getDisplayValue() + "PM";
                    break;
                case 20:
                    displayString = "08:" + minutes.getDisplayValue() + "PM";
                    break;
                case 21:
                    displayString = "09:" + minutes.getDisplayValue() + "PM";
                    break;
                case 22:
                    displayString = "10:" + minutes.getDisplayValue() + "PM";
                    break;
                case 23:
                    displayString = "11:" + minutes.getDisplayValue() + "PM";
                    break;
                case 24:
                    displayString = "12:" + minutes.getDisplayValue() + "PM";
                    break;
            }
            if (hours.getValue() <= 12) {
                displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "AM";
            }
        } else if (s = false) {
            displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
        }
    }

    public void switchFormat(){
        if (s){
            s = false;
        } else {
            s = true;
        }
        updateDisplay();
    }
}
