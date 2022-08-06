class RunnerInfo {
    private int timeRun;
    private double distRun;
 
    private void setTime(int timeRunSecs) {     // Time run in seconds
       timeRun = timeRunSecs;                   // timeRun refers to the field
    }
 
    public void setDist(double distRunMiles) {  // Distance run in miles
       distRun = distRunMiles;
    }
 
    public double getSpeedMph() {               // Speed in miles/hour
       return distRun / (timeRun / 3600.0);     // miles / (secs / (secs / hour))
    }
 }
