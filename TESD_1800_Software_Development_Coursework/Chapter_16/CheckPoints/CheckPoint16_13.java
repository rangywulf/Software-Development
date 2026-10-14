public class CheckPoint16_13 {
    /* 16.13.1
    How do you create a Media from a URL?
    - private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/sample.mp4";
    - Media media = new Media(MEDIA_URL);
    How do you create a MediaPlayer?
    - MediaPlayer mediaPlayer = new MediaPlayer(media);
    How do you create a MediaView?
    - MediaView mediaView = new MediaView(mediaPlayer);
    */

    /* 16.13.2
    If the URL is types without http:// in front of it, will it work?
    - no
    */

    /* 16.13.3
    Can you place a Media in multiple MediaPlayers?
    - yes
    Can you place a MediaPlayer in multiple MediaViews?
    - yes
    Can you place a MediaView in multiple panes?
    - No. a JavaFX node can have only one parent at a time.
    */
}
