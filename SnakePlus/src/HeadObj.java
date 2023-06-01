import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

/**
 * @author 28953
 * @create 2023-05-31 11:07
 */
public class HeadObj extends GameObj {
    private Direction direction = Direction.RIGHT;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public HeadObj(Image img, int x, int y, MainFrame frame) {
        super(img, x, y, frame);
        //键盘监听事件
        this.frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                changeDirection(e);
            }
        });
    }
    public void paintSelf(Graphics g){
        super.paintSelf(g);
        //食物
        FoodObject food = this.frame.foodObject;
        if(this.x==food.x&&this.y==food.y){
            this.frame.foodObject=food.getFood();
        }
        //蛇身最后一节的坐标
        Integer newX = null;
        Integer newY=null;
        if(this.x==food.x&&this.y==food.y){
            this.frame.foodObject=food.getFood();
            //获取蛇身的最后一个元素
            BodyObj lastBody = this.frame.bodyObjList.get(this.frame.bodyObjList.size()-1);
            newX = lastBody.x;
            newY = lastBody.y;
            //分数+1
            this.frame.score++;
        }
        //通关判断
        if(this.frame.score>=this.frame.passScore){
            MainFrame.isGaming=4;
            this.frame.passScore+=5;
        }
        move();
        if(newX!=null&&newY!=null){
            this.frame.bodyObjList.add(new BodyObj(SnakeUtils.bodyImag,newX,newY,this.frame));
        }
        //越界处理
        if(x<0||y<0||x>=600||y>=600){
            isLiving=false;
            MainFrame.isGaming=3;
        }
    }
    //控制移动方向
    public void changeDirection(KeyEvent e){
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                if(this.getDirection()!=Direction.DOWN){
                    direction = Direction.UP;
                    img=SnakeUtils.upImag;
                }
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                if(this.getDirection()!=Direction.UP){
                    direction = Direction.DOWN;
                    img=SnakeUtils.downImag;
                }
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                if(this.getDirection()!=Direction.RIGHT){
                    direction = Direction.LEFT;
                    img=SnakeUtils.leftImag;
                }
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                if(this.getDirection()!=Direction.LEFT){
                    direction = Direction.RIGHT;
                    img=SnakeUtils.rightImag;
                }
                break;
        }
    }
    //蛇的移动
    public void move(){
        if(isLiving){
            List<BodyObj> bodyObjList = this.frame.bodyObjList;
            for(int i = bodyObjList.size()-1;i>=1;i--){
                bodyObjList.get(i).x=bodyObjList.get(i-1).x;
                bodyObjList.get(i).y=bodyObjList.get(i-1).y;
                //蛇头与身体的碰撞
                if(this.x==bodyObjList.get(i).x&&this.y==bodyObjList.get(i).y){
                    MainFrame.isGaming=3;
                    isLiving=false;
                }
            }
            bodyObjList.get(0).x=this.x;
            bodyObjList.get(0).y=this.y;
            switch (direction){
                case UP:
                    y-=height;
                    break;
                case DOWN:
                    y+=height;
                    break;
                case LEFT:
                    x-=width;
                    break;
                case  RIGHT:
                    x+=width;
                    break;
            }
        }
    }
}
