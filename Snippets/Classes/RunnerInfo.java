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
 public class RaceResults {
    public static void main(String[] args) {
       RunnerInfo runner1 = new RunnerInfo();          // User-created object of class type RunnerInfo
       RunnerInfo runner2 = new RunnerInfo(); // A second object
 
       runner1.setTime(360);
       runner1.setDist(1.2);
       runner2.setTime(200);
       runner2.setDist(0.5);
 
       System.out.println("Runner1's speed in MPH: " + runner1.getSpeedMph();
       System.out.println("Runner2's speed in MPH: " + runner2.getSpeedMph();
    }
 }