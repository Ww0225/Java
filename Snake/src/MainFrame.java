import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.TimerTask;
import java.util.Timer;

/**
 * @author 28953
 * @create 2023-05-29 19:39
 */
public class MainFrame extends JFrame {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    private JPanel jPanel;//棋盘
    private Timer timer;//计时器
    private Snake snake;//蛇
    public static Node food = new Food();

    public MainFrame() throws HeadlessException{
        //创建一个窗体
        initFrame();
        //在窗体里画网格线
        initPaintPanel();
        //初始化蛇
        initSnake();
        //初始化定时器
        initTimer();
        //能让蛇转换方向运动
        setKeyListener();
    }

    private void initTimer() {
        //创建定时器对象
        timer = new Timer();
        //初始化定时任务
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                snake.move();
                jPanel.repaint();
                snake.eat();
            }
        };
        timer.scheduleAtFixedRate(timerTask,0,100);
    }

    private void initSnake() {
        snake = new Snake();
    }

    private void setKeyListener(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        if(snake.getDirection()!=Direction.DOWN){
                            snake.setDirection(Direction.UP);
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if(snake.getDirection()!=Direction.UP){
                            snake.setDirection(Direction.DOWN);
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if(snake.getDirection()!=Direction.RIGHT){
                            snake.setDirection(Direction.LEFT);
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if(snake.getDirection()!=Direction.LEFT){
                            snake.setDirection(Direction.RIGHT);
                        }
                        break;
                }
            }
        });
    }
    private void initFrame(){
        //设置窗体宽高
        this.setSize(640,640);
        //设置窗体位置
        this.setLocation(630,330);
        //设置窗体名字
        this.setTitle("贪吃蛇");
        //设置关闭按钮的作用（退出程序）
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体大小不可变
        setResizable(false);
    }
    private void initPaintPanel(){
        jPanel = new JPanel(){
            public void paint(Graphics g){
                //清空棋盘
                g.clearRect(0,0,800,800);
                g.setColor(Color.ORANGE);
                for(int i = 0;i<=40;i++){
                    //绘制40条横线
                    g.drawLine(0,i*15,600,i*15);
                }
                for(int i = 0;i<=40;i++){
                    //绘制40条竖线
                    g.drawLine(i*15,0,i*15,600);
                }
                //绘制蛇到网格上
                LinkedList<Node> body = snake.getBody();
                for(Node node : body){
                    g.fillRect(node.getX()*15,node.getY()*15,15,15);
                }
                //绘制食物
                g.fillRect(food.getX()*15,food.getY()*15,15,15);
            }
        };
        add(jPanel);
    }
}
