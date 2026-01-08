package Week4;

interface Playable{
    default void Play(){
        System.out.println("Playing Starts");
    }
    default void Pause(){
        System.out.println("Pausing Starts");
    }
}
class AudioPlayer implements Playable{
    @Override
    public void Play(){
        Playable.super.Play();
        System.out.println("Playing Audio");
    }
    @Override
    public void Pause(){
        Playable.super.Pause();
        System.out.println("Pausing Audio");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void Play(){
        Playable.super.Play();
        System.out.println("Playing Video");
    }
    @Override
    public void Pause(){
        Playable.super.Pause();
        System.out.println("Pausing Video");
    }
}

public class PlayableMedia {
    public static void main(String[] args) {
        Playable a1 = new AudioPlayer();
        Playable v1 = new VideoPlayer();
        a1.Play();
        a1.Pause();
        v1.Play();
        v1.Pause();
    }
}
