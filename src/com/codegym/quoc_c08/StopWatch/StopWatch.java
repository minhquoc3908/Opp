package com.codegym.quoc_c08.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    public void stopWatch(long startTime,long endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }
    public void stopWatch(){
    }
public long getStartTime(){
        return startTime;
}

public long getEndTime(){
        return endTime;
}
public void start(){
        startTime=System.currentTimeMillis();
}
public void stop(){
        endTime=System.currentTimeMillis();
}
public long getElapsedTime(){
        return endTime-startTime;
}
}