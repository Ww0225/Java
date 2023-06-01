import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 28953
 * @create 2023-05-31 8:41
 */
public class MainFrame extends JFrame {
    //通过分数要求
    public int passScore = 5;
    //定义双缓存图片
    Image offScreenImage = null;
    //游戏状态 0-未开始  1-游戏中  2-暂停  3-失败  4-通过  5-失败后重启  6-下一关
    public static int isGaming = 0;
    //音乐状态 0-没吃到  1-吃到了，播放音乐
    public static int isMusic=0;
    //分数
    public int score = 0;
    //计分面板窗高
    int scoreWidth = 800;
    int scoreHeight = 610;
    //食物
    FoodObject foodObject = new FoodObject().getFood();
    //蛇头对象
    HeadObj headObj = new HeadObj(SnakeUtils.rightImag,200,200,this);
    //蛇身集合
    public List<BodyObj> bodyObjList = new ArrayList<>();

    //创建initFrame方法设置窗口信息
    public void initFrame(){
        //设置窗口是否可见
        this.setVisible(true);
        //设置窗口的大小
        this.setSize(scoreWidth,scoreHeight);
        //设置窗口的在屏幕中的位置
        this.setLocationRelativeTo(null);
        //设置窗口的标题
        this.setTitle("ww的贪吃蛇游戏");
        //蛇身初始化
        bodyObjList.add(new BodyObj(SnakeUtils.bodyImag,175,200,this));
        bodyObjList.add(new BodyObj(SnakeUtils.bodyImag,150,200,this));
        //键盘事件
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    switch (isGaming){
                        case 0:
                            isGaming=1;
                            break;
                        case 1:
                            isGaming=2;
                            repaint();
                            break;
                        case 2:
                            isGaming=1;
                            break;
                        case 3:
                            isGaming=5;
                            break;
                        case 4:
                            isGaming=6;
                            break;
                    }
                }
            }
        });
        while(true){
            if(isGaming==1){
                repaint();
            }
            if(isGaming==5){
                isGaming=0;
                resetGame();
            }
            if(isGaming==6){
                isGaming=1;
                SnakeUtils.level++;
                resetGame();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //界面设计
    @Override
    public void paint(Graphics g) {
        //初始化双缓存图片
        if(offScreenImage==null){
            offScreenImage=this.createImage(scoreWidth,scoreHeight);
        }
        Graphics gImage = offScreenImage.getGraphics();
        //背景
        gImage.setColor(Color.WHITE);
        gImage.fillRect(0,0,scoreWidth,scoreHeight);
        //网格线
        gImage.setColor(Color.BLACK);
        //横
        for(int i =0;i<=24;i++){
            gImage.drawLine(0,25*i,600,25*i);
        }
        //竖
        for(int i =0;i<=24;i++){
            gImage.drawLine(25*i,0,25*i,600);
        }
        //绘制蛇的身体
        for(int i = bodyObjList.size()-1;i>=0;i--){
            bodyObjList.get(i).paintSelf(gImage);
        }
        //绘制蛇头
        headObj.paintSelf(gImage);
        //绘制食物
        foodObject.paintSelf(gImage);
        //绘制分数
        //关卡
        SnakeUtils.drawWrod(gImage,"第"+SnakeUtils.level+"关",Color.magenta,40,650,260);
        SnakeUtils.drawWrod(gImage,score+" 分",Color.CYAN,50,650,330);
        //绘制提示语
        gImage.setColor(Color.LIGHT_GRAY);
        prompt(gImage);
        g.drawImage(offScreenImage,0,0,null);

    }
    //绘制提示语
    void prompt(Graphics g){
        //未开始
        if(isGaming==0){
            g.fillRect(125,250,400,70);
            SnakeUtils.drawWrod(g,"按下空格键开始游戏",Color.red,35,150,290);
        }
        if(isGaming==2){
            g.fillRect(125,250,400,70);
            SnakeUtils.drawWrod(g,"按下空格继续游戏",Color.green,35,150,290);
        }
        if(isGaming==3){
            g.fillRect(125,250,400,70);
            SnakeUtils.drawWrod(g,"菜就多练！按空格",Color.RED,35,150,290);
        }
        if(isGaming==4){
            g.fillRect(125,250,400,70);
            SnakeUtils.drawWrod(g,"通关了！空格下一关",Color.green,35,150,290);
        }
    }
    //游戏重置
    void resetGame(){
        //关闭当前窗口
        this.dispose();
        //开启新窗口
        String[] args = {};
        main(args);
    }
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.initFrame();

    }
}
