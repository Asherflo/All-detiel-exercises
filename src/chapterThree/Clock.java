package chapterThree;

import java.time.LocalDateTime;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    private boolean isEmpty;


    public Clock(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;

    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setHour(int hour) {
        this.hour=hour;

    }

    public int getHour() {
        if(hour > 23  ){
            System.out.println("invalid Number,enter between 0 and 23");
        }
        return hour;
    }

    public void setMinutes(int minutes) {
        this.minute = minutes;

    }

    public int getMinutes() {
        if(minute > 59  ){
            System.out.println("invalid Number,enter between 0 and 59");
        }
        return minute;
    }

    public void setSeconds(int seconds) {
        this.seconds= seconds;
    }

    public int getSeconds() {
        if(seconds > 59  ){
            System.out.println("invalid Number,enter between 0 and 59");
        }
        return seconds;
    }
}
