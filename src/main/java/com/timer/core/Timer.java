package com.timer.core;

import java.util.concurrent.TimeUnit;

public class Timer {
    private int seconds;
    private int minutes;
    private int hours;

    private boolean isActive;

    public Timer(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.isActive = true;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public boolean isActive() {
        return isActive;
    }

    void countDown() throws InterruptedException {
        while (this.seconds != 0 || this.minutes != 0 || this.hours != 0) {

            if(this.seconds == 0){
                if(this.minutes == 0){
                    if(this.hours == 0){
                        this.isActive = false;
                    }

                    this.hours--;
                    this.minutes = 59;
                    //eventual sout
                }

                this.minutes--;
                this.seconds = 59;
                //eventual sout
            }else {

                TimeUnit.SECONDS.sleep(1);
                this.seconds--;
                //eventual sout
            }
        }
    }
}