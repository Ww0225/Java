import java.util.LinkedList;

/**
 * @author 28953
 * @create 2023-05-29 19:55
 */
public class Snake {
    //蛇的身体
    private LinkedList<Node> body;
    //蛇的运动方向，默认向左
    private Direction direction = Direction.LEFT;
    //蛇是否活着
    private boolean isLiving = true;
    public Direction getDirection(){
        return direction;
    }
    public void setDirection(Direction direction){
        this.direction = direction;
    }
    public LinkedList<Node> getBody(){
        return body;
    }
    //初始化蛇的身体
    public Snake(){
        initSnake();
    }
    private void initSnake(){
        body = new LinkedList<>();
        body.add(new Node(20,20));
        body.add(new Node(20,21));
        body.add(new Node(20,22));
        body.add(new Node(20,23));
    }
    public void move(){
        if(isLiving){
            //获取蛇头的节点
            Node head = body.getFirst();
            switch (direction){
                case LEFT:
                    body.addFirst(new Node(head.getX()-1,head.getY()));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(),head.getY()+1));
                    break;
                case UP:
                    body.addFirst(new Node(head.getX(),head.getY()-1));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX()+1,head.getY()));
                    break;
            }
            //删除最后的节点
            body.removeLast();

            //判断蛇是否撞墙
            head = body.getFirst();
            if(head.getX()<0||head.getY()<0||head.getX()>=60||head.getY()>=60){
                isLiving = false;
            }
            //判断蛇是否碰到自己的身体
            for(int i =1;i<body.size();i++){
                Node node = body.get(i);
                if(head.getX()==node.getX()&&head.getY()==node.getY()){
                    isLiving = false;
                }
            }
        }

    }
    //吃食物：沿着蛇头的移动方向添加一个节点
    public void eat(){
        //获取蛇头
        Node head = body.getFirst();
        if(head.getX()==MainFrame.food.getX()&&head.getY()==MainFrame.food.getY()){
            switch (direction){
                case UP:
                    body.addFirst(new Node(head.getX(),head.getY()-1));
                    break;
                case DOWN:
                    body.addFirst(new Node(head.getX(),head.getY()+1));
                    break;
                case LEFT:
                    body.addFirst(new Node(head.getX()-1,head.getY()));
                    break;
                case RIGHT:
                    body.addFirst(new Node(head.getX()+1,head.getY()));
                    break;
            }
            MainFrame.food.reset();
        }

    }
}
