import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 * @author 28953
 * @create 2023-06-01 11:11
 */
public class Music {
    private Clip clip;
    public Music(){
        //初始化音频
        try {
            AudioInputStream ais =
                    AudioSystem.getAudioInputStream
                            (Music.class.getResourceAsStream
                                    ("C:\\Users\\28953\\IdeaProjects\\SnakePlus\\eatFoodMusic.mp4"));
                    clip=AudioSystem.getClip();
                    clip.open(ais);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void playEatFoodMusic(){
        // 播放音频剪辑
        if (clip != null) {
            clip.setFramePosition(0); // 从音频剪辑的开头开始播放
            clip.start();
        }
    }
}
