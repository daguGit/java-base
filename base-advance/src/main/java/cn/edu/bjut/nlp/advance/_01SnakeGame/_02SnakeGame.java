package cn.edu.bjut.nlp.advance._01SnakeGame;

import cn.edu.bjut.nlp.cn.gui.util.FrameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;


/*
 分析里面的有几个事物：
 1. 地图
 2. 蛇
 3. 食物

 了解游戏规则： 
 1.蛇初始化的时候是三个节点，而且一开始蛇是出现在地图的中间位置。
 2. 蛇吃到东西会长长一节。 
 3. 蛇咬到自己会死，蛇撞墙也会死。
 4. 食物是随机生成的，食物不能长在石头上，食物可以长在蛇身上。
 */
public class _02SnakeGame {
	/*
	 * 给蛇加上方向； 允许蛇从左右两边穿墙而过
	 */

	public static final int WIDTH = 30;
	public static final int HEIGHT = 10;
	char[][] background = new char[HEIGHT][WIDTH];
	private LinkedList<Point> snakes = new LinkedList<Point>();
	private Point food;

	public static final int UP = 11;
	public static final int DOWN = 1;
	public static final int RIGHT = 2;
	public static final int  LEFT= -2;

	// 蛇当前的方向
	int currentDrection = 2; 

	public void initBackground() {
		for (int row = 0; row < HEIGHT; row++) {
			for (int col = 0; col < WIDTH; col++) {
				if (row == 0 || row == HEIGHT - 1) {
					background[row][col] = '*';
				} else {
					background[row][col] = ' ';
				}
			}
		}
	}

	public void printBackground() {
		for (int row = 0; row < HEIGHT; row++) {
			for (int col = 0; col < WIDTH; col++) {
				System.out.print(background[row][col]);
			}
			System.out.println();
		}
	}

	public void initSnake() {

		snakes.addFirst(new Point(WIDTH / 2 - 1, HEIGHT / 2));
		snakes.addFirst(new Point(WIDTH / 2, HEIGHT / 2));
		snakes.addFirst(new Point(WIDTH / 2 + 1, HEIGHT / 2));
	}

	public void printSnake() {
		Point pointFirst = snakes.getFirst();
		int x = pointFirst.x;
		int y = pointFirst.y;
		background[y][x] = '$';
		Iterator<Point> iterator = snakes.iterator();

		iterator.next();
		while (iterator.hasNext()) {
			Point tempPoint = iterator.next();
			background[tempPoint.y][tempPoint.x] = '#';
		}

	}

	// 初始化食物，并打印到背景数组
	public void initFood() {
		Random random = new Random();
		int x;
		int y;
		do {
			x = random.nextInt(WIDTH);
			y = random.nextInt(HEIGHT);

		} while (background[y][x] == '*');
		food = new Point(x, y);

	}

	public void printFood() {
		int x = food.x;
		int y = food.y;
		background[y][x] = '@';
	}

	// 改变当前方向的方法
	public void changeDirection(int newDirection) {
		// 判断新方向是否与当前方向是否是相反方向，才允许其改变
		if (newDirection + currentDrection != 0) {
			this.currentDrection = newDirection;
		}
	}

	public void move() {
		Point temp = snakes.getFirst();
		Point newPoint = null;
		switch (currentDrection) {
		case UP:
			newPoint = new Point(temp.x, temp.y - 1);
			break;
		case DOWN:
			newPoint = new Point(temp.x, temp.y + 1);
			break;
		case LEFT:
			if (temp.x == 0) {
				newPoint = new Point(WIDTH - 1, temp.y);
			} else {
				newPoint = new Point(temp.x - 1, temp.y);
			}
			break;
		case RIGHT:
			if (temp.x == (WIDTH - 1)) {
				newPoint = new Point(0, temp.y);
			} else {
				newPoint = new Point(temp.x + 1, temp.y);
			}
			break;
		default:
			break;
		}
		snakes.addFirst(newPoint);
		snakes.removeLast();
	}

	/*
	 * // 向上移动 public void moveUp() { Point temp = snakes.getFirst(); Point
	 * newPoint = new Point(temp.x, temp.y - 1); snakes.addFirst(newPoint);
	 * snakes.removeLast(); }
	 * 
	 * 
	 * // 向上移动 public void moveDown() { Point temp = snakes.getFirst(); Point
	 * newPoint = new Point(temp.x, temp.y + 1); snakes.addFirst(newPoint);
	 * snakes.removeLast(); }
	 * 
	 * // 向上移动 public void moveLeft() { Point temp = snakes.getFirst(); Point
	 * newPoint = new Point(temp.x - 1, temp.y); snakes.addFirst(newPoint);
	 * snakes.removeLast(); }
	 * 
	 * // 向上移动 public void moveRight() { Point temp = snakes.getFirst(); Point
	 * newPoint = new Point(temp.x + 1, temp.y); snakes.addFirst(newPoint);
	 * snakes.removeLast(); }
	 */

	private boolean isOver() {
		boolean over = true;
		Point first = snakes.getFirst();
		int x = first.y;
		int y = first.x;

		/*
		 * if (background[x][y] != '*' && background[x][y] != '#' ) { over =
		 * false; }
		 */
		// 撞墙
		if (background[x][y] != '*') {
			over = false;
		}
		// 咬自己
		for (int i = 1; i < snakes.size(); i++) {
			if (first.equals(snakes.get(i))) {
				over = true;
				break;
			}
		}
		return over;
	}

	public void gameOver() {

		if (this.isOver()) {
			System.out.println("Game over");
			System.exit(0);
		}
	}

	// 刷新
	public void refresh() {
		addNode();
		gameOver();
		initBackground();
		printFood();
		printSnake();
		printBackground();
	}

	// 吃完食物，增加节点
	public void addNode() {
		int xFirst = (int) snakes.getFirst().getX();
		int yFirst = (int) snakes.getFirst().getY();
		int xFood = food.x;
		int yFood = food.y;
		Point pointLast = snakes.getLast();
		if (xFirst == xFood && yFirst == yFood) {
			Point point = new Point((int) pointLast.getX(),
					(int) pointLast.getY());
			snakes.addLast(point);
			initFood();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		final _02SnakeGame snakeGame = new _02SnakeGame();
		snakeGame.initBackground();
		snakeGame.initSnake();
		snakeGame.printSnake();
		snakeGame.initFood();
		snakeGame.printFood();
		snakeGame.printBackground();
		/*
		 * for (int i = 0; i < 2; i++) { snakeGame.initBackground();
		 * snakeGame.printFood(); snakeGame.moveUp(); snakeGame.gameOver();
		 * snakeGame.printSnake(); snakeGame.printBackground();
		 * 
		 * Thread.sleep(500); } for (int i = 0; i < 2; i++) {
		 * 
		 * snakeGame.moveLeft(); snakeGame.refresh();
		 * 
		 * Thread.sleep(500); }
		 */

		JFrame frame = new JFrame();
		frame.add(new JButton("向上"), BorderLayout.NORTH);
		frame.add(new JButton("向左"), BorderLayout.WEST);
		frame.add(new JButton("向下"), BorderLayout.SOUTH);
		frame.add(new JButton("向右"), BorderLayout.EAST);

		JButton button = new JButton("点击控制方向");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case KeyEvent.VK_UP:
					snakeGame.changeDirection(UP);
					break;
				case KeyEvent.VK_LEFT:
					snakeGame.changeDirection(LEFT);
					break;
				case KeyEvent.VK_DOWN:
					snakeGame.changeDirection(DOWN);
					break;
				case KeyEvent.VK_RIGHT:
					snakeGame.changeDirection(RIGHT);
					break;
				default:
					break;
				}
				snakeGame.move();
				snakeGame.refresh();
			}
		});
		frame.add(button);
		FrameUtil.initFrame(frame, 300, 300);
	}
}
