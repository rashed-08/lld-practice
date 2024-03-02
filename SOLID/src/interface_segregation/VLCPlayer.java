package interface_segregation;

public class VLCPlayer implements VideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("Play video on VLC Player");
    }
}
