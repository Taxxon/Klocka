/**
 * Created by emka15 on 2017-11-22.
 */
public class Clock {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    public Clock(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        hours.setValue(0);
        minutes.setValue(0);
        updateDisplay();
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
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
