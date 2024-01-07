package replit;
//Music Player System: Create a class MusicPlayer with methods like play(), pause(), stop(), and fields such as currentTrack and volume.
// Implement subclasses for different types of music players, like MP3Player, CDPlayer, and StreamingPlayer,
// each with their unique implementations of the play() method (e.g., streaming from the internet, playing from a CD).
public abstract class MusicPlayer {
    private String currentTrack;
    private String volume;
    public MusicPlayer(String currentTrack, String volume) {
        this.currentTrack = currentTrack;
        this.volume = volume;
    }
    void printInfo(){
        System.out.println("Current Music :"+currentTrack+" which volume: "+volume);
    }
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
class Mp3player extends MusicPlayer{
    public Mp3player(String currentTrack, String volume) {
        super(currentTrack, volume);}

    @Override
    public void play() {
        System.out.println("play Music from Mp3");

    }
    @Override
    public void pause() {
        System.out.println("pause Music for MP3");

    }
    @Override
    public void stop() {
        System.out.println("Stop Music MP3");

    }
}
class CDplayer extends MusicPlayer{

    public CDplayer(String currentTrack, String volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("Play Music from CD");

    }

    @Override
    public void pause() {
        System.out.println("PAUSE from CD");

    }

    @Override
    public void stop() {
        System.out.println("STOP FROM CD");

    }
}
class StreamingPlayer extends MusicPlayer{

    public StreamingPlayer(String currentTrack, String volume) {
        super(currentTrack, volume);
    }

    @Override
    public void play() {
        System.out.println("Play Music from internet");

    }

    @Override
    public void pause() {
        System.out.println("Pause Music from internet");

    }

    @Override
    public void stop() {
        System.out.println("Stop Music from internet");

    }
}
class MusicPlayerTester{
    public static void main(String[] args) {
        MusicPlayer[] arr={new Mp3player("shakira","high"),
                           new CDplayer("rihana","low"),
                           new StreamingPlayer("adel","Med")};

        for (MusicPlayer player : arr) {
            player.printInfo();
            player.play();
            player.stop();
            player.pause();
            System.out.println("********************************");
        }

    }

}
