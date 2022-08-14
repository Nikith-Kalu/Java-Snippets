public class Media implements MultiMedia, Song {
    int minutes;
    int seconds;
    String singer;
 
    public void setDuration(int setMinutes, int setSeconds) {
       minutes = setMinutes;
       seconds = setSeconds;
    }
 
    public void setSinger(String setSinger) {
       singer = setSinger;
    }
 
    @Override
    public void printDuration() {
       System.out.println(minutes + ":" + seconds);
    }
 
    @Override
    public void printSinger() {
       System.out.println("Singer: " + singer);
    }
 }