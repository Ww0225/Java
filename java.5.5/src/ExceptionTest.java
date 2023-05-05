/**
 * 自定义一个异常类NoSoundException和Player类，在Player的play方法中使用自定义异常，具体要求如下：
 *（1）、NoSoundException类继承了Exception类，
 * 类中有一个接收String类型参数的构造方法，
 * 构造方法中使用super关键字调用父类的构造方法。
 *（2）、Player类中定义一个play(int index)方法，
 * 方法接收一个int类型的参数，表示播放歌曲的索引，
 * 当index>10时，play()方法用throw关键字抛出NoSoundException异常，
 * 创建异常对象时，调用有参的构造方法，传入“你播放的歌曲不存在”。
 *（3）、在测试类中创建Player对象，
 * 并调用play()方法测试自定义的NoSoundException异常，
 * 使用try.....catch语句捕获异常，应用NoSoundException的getMessage（）方法打印出异常信息。
 *
 * @author 28953
 * @create 2023-05-05 18:49
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Player player = new Player();
        try {
            player.play(6);
        } catch (NoSoundException e) {
            e.printStackTrace();
        }
        try {
            player.play(11);
        } catch (NoSoundException e) {
            e.printStackTrace();
        }
    }
}
class NoSoundException extends Exception{
    public NoSoundException(String message) {
        super(message);
    }
}
class Player{
    public void play(int index) throws NoSoundException {
        if(index>10){
            throw new NoSoundException("你播放的歌曲不存在");
        }else{
            System.out.println("播放歌曲中...");
        }
    }
}
