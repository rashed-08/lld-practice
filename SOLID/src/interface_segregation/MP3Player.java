package interface_segregation;

public class MP3Player implements AudioPlayer {
    @Override
    public void playAudio() {
        System.out.println("Play audio on MP3 Player");
    }
}
