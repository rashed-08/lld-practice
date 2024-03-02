package interface_segregation;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new MP3Player();
        audioPlayer.playAudio();

        VideoPlayer videoPlayer = new VLCPlayer();
        videoPlayer.playVideo();
    }
}
