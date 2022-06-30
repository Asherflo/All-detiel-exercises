package chapterThree;

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
}
