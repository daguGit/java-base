package cn.edu.bjut.nlp.gui._04Event;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Random;

public class Snake {
	
	//地图的宽(列数)
	public static final int WIDTH = 35;
	
	//地图高（行数）
	public static final int HEIGHT = 9;	
	
	
	//地图
	private char[][] background = new char[HEIGHT][WIDTH];
	
	//使用集合保存蛇节点的所有信息
	LinkedList<Point>  snake = new LinkedList<Point>(); 
	
	
	//食物
	Point	food;
	
	
	//向上移动
	public void moveUp(){
		//获取原来蛇头 
		Point head = snake.getFirst();
		//添加新的蛇头
		snake.addFirst(new Point(head.x,head.y-1));
		//删除蛇尾
		snake.removeLast();
	}
	
	//向下走
	public void moveDown(){
		//获取到原来的蛇头
		Point  head = snake.getFirst();
		//添加新的蛇头
		snake.addFirst(new  Point(head.x,head.y+1));
		//删除蛇尾
		snake.removeLast();
	}
	
	
	//向左走
	public void moveLeft(){
		//获取到原来的蛇头
		Point  head = snake.getFirst();
		//添加新的蛇头
		snake.addFirst(new  Point(head.x-1,head.y));
		//删除蛇尾
		snake.removeLast();
	}
	
		
		
	//向右走
	public void moveRight(){
		//获取到原来的蛇头
		Point  head = snake.getFirst();
		//添加新的蛇头
		snake.addFirst(new  Point(head.x+1,head.y));
		//删除蛇尾
		snake.removeLast();
	}

	
	
	//生成食物 
	public void createFood(){
		//创建一个随机数对象
		Random random = new Random();
		while(true){
			int x = random.nextInt(WIDTH); 
			int y = random.nextInt(HEIGHT);
			if(background[y][x]!='*'){
				food = new Point(x,y);
				break;
			}
		}
	}
	
	//显示食物
	public void showFood(){
		background[food.y][food.x] ='@';
	}
	

	
	//初始化蛇
	public void initSnake(){
		int x = WIDTH/2;
		int y = HEIGHT/2;
		snake.addFirst(new Point(x-1,y));
		snake.addFirst(new Point(x,y));
		snake.addFirst(new Point(x+1,y));
	}
	
	
	//显示蛇--->实际上就是将蛇节点 的坐标信息反馈到地图上，在地图上画上对应的字符而已
	public void showSnake(){
		//取出蛇头
		Point head = snake.getFirst();
		background[head.y][head.x] = '$';
		//画蛇身
		for(int i =1; i<snake.size() ; i++ ){
			Point body = snake.get(i);
			background[body.y][body.x] = '#';
			
		}
		
	}
	
	
	
	
	//初始化地图
	public void initBackground(){
		for(int rows = 0 ; rows<background.length ; rows++){
			for(int cols = 0  ; cols<background[rows].length ; cols++ ){
				if(rows==0||rows==(HEIGHT-1)||cols==0||cols==(WIDTH-1)){  //第一行、最后一行、 第一列与最后一列
					background[rows][cols] = '*';
				}else{
					background[rows][cols] = ' ';
				}
			}
		}
	}


	//显示地图的
	public void showBackground() {
		//打印二维数组
		for(int rows = 0 ; rows<background.length ; rows++){ // rows =0 
			for(int cols = 0  ; cols<background[rows].length ; cols++ ){
				System.out.print(background[rows][cols]);
			}
			System.out.println(); //换行
		}
	}
	
	//刷新游戏 的状态 
	public void refrash(){
		//清空游戏之前的所有状态信息
		initBackground();
		//把蛇最新的状态反馈到地图上
		showSnake();
		//把食物的信息反馈到地图婚丧。
		showFood();
		//显示当前地图的信息
		showBackground();
		
	}
	
	

	
	public static void main(String[] args) throws Exception {
		Snake snake = new Snake();
		//初始化地图
		snake.initBackground();
		//初始化蛇
		snake.initSnake(); 
		//把蛇的信息反馈到地图上
		snake.showSnake();
		
		//初始化事物
		snake.createFood();
		//显示食物
		snake.showFood();
		snake.showBackground();
		
		//向上三步
		for(int i = 0;  i < 3; i++){
			snake.moveUp();
			snake.refrash();
			Thread.sleep(500);
		}
		
		//向下三步
		for(int i = 0;  i < 3; i++){
			snake.moveDown();
			snake.refrash();
			Thread.sleep(500);
		}
		
		

		//向右三步
		for(int i = 0;  i < 3; i++){
			snake.moveRight();
			snake.refrash();
			Thread.sleep(500);
		}
		
		//向左三步
		for(int i = 0;  i < 3; i++){
			snake.moveLeft();
			snake.refrash();
			Thread.sleep(500);
		}
		
		

		
		
	}

}
