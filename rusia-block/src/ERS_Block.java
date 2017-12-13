
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class ERS_Block extends Frame {
	public static boolean isPlay=false;
	public static int level=1,score=0;
	public static TextField scoreField,levelField;
	public static MyTimer timer;   //线程
	GameCanvas gameScr;
	public static void main(String[] argus){
		
		ERS_Block ers=new ERS_Block("Java俄罗斯方块");
		WindowListener win_listener=new WinListener();  //窗体监听器
		ers.addWindowListener(win_listener);
		
	}
	//俄罗斯方块类的构造方法
	ERS_Block(String title){
		super(title);   //窗体标题
		setSize(640,480);      //设置面板的大小
		setLayout(new GridLayout(1,2));     //分为一行两列
		
		gameScr=new GameCanvas();
		gameScr.addKeyListener(gameScr);
		
		timer=new MyTimer(gameScr);
		timer.setDaemon(true);
		timer.start();
		timer.suspend();
		
		add(gameScr);
		
		Panel rightScr=new Panel();
		rightScr.setLayout(new GridLayout(2,1,0,30));   //网格布局，两行一列，水平间隔为0，垂直为30
		rightScr.setSize(120,500);                      //宽度120，高500
		add(rightScr);
		
		//右边信息窗体的布局
		MyPanel infoScr=new MyPanel();
		infoScr.setLayout(new GridLayout(4,1,0,5));        //标签和文本之间的垂直间隔为5
		infoScr.setSize(120,300);                           //设置面为宽度120，高度300
		rightScr.add(infoScr);
		
		//定义标签和初始值
		Label scorep=new Label("分数:",Label.LEFT);
		Label levelp=new Label("级数:",Label.LEFT);
		
		//定义文本域的大小
		scoreField=new TextField(8);
		levelField=new TextField(8);
		//文本域设置为无法编辑（只读）
		scoreField.setEditable(false);
		levelField.setEditable(false);
		//添加到面板上
		infoScr.add(scorep);
		infoScr.add(scoreField);
		infoScr.add(levelp);
		infoScr.add(levelField);
		//java自带的方法Dimension（）获取面板的宽和高
		scorep.setSize(new Dimension(20,60));
		scoreField.setSize(new Dimension(20,60));
		levelp.setSize(new Dimension(20,60));
		levelField.setSize(new Dimension(20,60));
		scoreField.setText("0");
		levelField.setText("1");
		
		//右边控制按钮窗体的布局
		MyPanel controlScr=new MyPanel();
		controlScr.setLayout(new GridLayout(5,1,0,5));  //五行一列，垂直间隔为5
		rightScr.add(controlScr);
		
		//定义按钮play
		Button play_b=new Button("开始游戏");
		play_b.setSize(new Dimension(50,200));// 设置button的大小
		play_b.addActionListener(new Command(Command.button_play,gameScr));//设置点击事件
		
		//定义按钮level up
		Button level_up_b=new Button("提高级数");
		level_up_b.setSize(new Dimension(50,200));
		level_up_b.addActionListener(new Command(Command.button_levelup,gameScr));
		
		//定义按钮Level Down
		Button level_down_b=new Button("降低级数");
		level_down_b.setSize(new Dimension(50,200));
		level_down_b.addActionListener(new Command(Command.button_leveldown,gameScr));
		
		//定义按钮level Pause
		Button pause_b=new Button("游戏暂停/继续");
		pause_b.setSize(new Dimension(50,200));
		pause_b.addActionListener(new Command(Command.button_pause,gameScr));
		
		
		//定义按钮 Quit
		Button quit_b=new Button("退出游戏");
		quit_b.setSize(new Dimension(50,200));
		quit_b.addActionListener(new Command(Command.button_quit,gameScr));
		//将所有按钮添加到面板上
		controlScr.add(play_b);
		controlScr.add(level_up_b);
		controlScr.add(level_down_b);
		controlScr.add(pause_b);
		controlScr.add(quit_b);
		setVisible(true);//显示可视性
		gameScr.requestFocus();  //获取焦点， 把焦点设置在游戏面板上
		
				
	}
	
	
	
}
	
//游戏画布类
class GameCanvas extends Canvas implements KeyListener {
	final int unitSize = 30; // 小方块边长
	int rowNum; // 正方格的行数
	int columnNum; // 正方格的列数
	int maxAllowRowNum; // 允许有多少行未消
	int blockInitRow; // 新出现块的起始行坐标
	int blockInitCol; // 新出现块的起始列坐标
	int[][] scrArr; // 屏幕数组
	Block b; // 对方块的引用

	// 画布类的构造方法
	GameCanvas() {
		rowNum = 15;
		columnNum = 10;
		maxAllowRowNum = rowNum - 2;
		b = new Block(this);
		blockInitRow = rowNum - 1;
		blockInitCol = columnNum / 2 - 2;//使方块中间落下
		scrArr = new int[32][32];//这个数组就是用来记录方块的颜色的，其值有3种，0值表示黑色，1值表示蓝色，2值表粉红
	}

	// 初始化屏幕，并将屏幕数组清零的方法
	void initScr() {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++)
				scrArr[i][j] = 0;//初始为0表示没有任何方块
		b.reset();
		repaint();
	}

	// 重新刷新画布方法
	public void paint(Graphics g) {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++)
				drawUnit(i, j, scrArr[i][j]);
	}

	// 画方块的方法
	public void drawUnit(int row, int col, int type) {
		scrArr[row][col] = type;
		Graphics g = getGraphics();
		switch (type) { // 表示画方快的方法
		case 0:
			g.setColor(Color.gray);
			break; // 以背景为颜色画
		case 1:
			g.setColor(Color.yellow);
			break; // 画正在下落的方块
		case 2:
			g.setColor(Color.pink);
			break; // 画已经落下的方法
		}
		g.fill3DRect(col * unitSize, getSize().height - (row + 1) * unitSize,
				unitSize, unitSize, true);         //调用画图函数；在坐标（row，col）处画一个矩形
		g.dispose();                     //提交所有画图操作
	}

	public Block getBlock() {
		return b; // 返回block实例的引用
	}

	// 返回屏幕数组中(row,col)位置的属性值
	//不能超过屏幕边框
	public int getScrArrXY(int row, int col) {
		if (row < 0 || row >= rowNum || col < 0 || col >= columnNum)
			return (-1);
		else
			return (scrArr[row][col]);
	}

	// 得到新块的初始行坐标方法
	public int getInitRow() {
		return (blockInitRow);
	}

	// 得到新块的初始列坐标方法
	public int getInitCol() {
		return (blockInitCol); 
	}

	        // 满行删除方法   
	       //删除满行的思路是
          //无论当前第i行是不是满行都不做改变，只有当循环到第i+1行时才对第i行做处理。
         //若整个画板中所有行为满行，则k值为0,那么该if语句不会执行。同样！isfull也是判断是否有未满行
			//若K!=0，！isfull两个条件成立，则说明存在未满行，下面说k-1!=i这个条件
			//i表示的是第i+1行，因为数组的下标是从0开始的，所以当k-1==i时则说明前面i+1行都是未满行，当然不要进行操作。
			//当k-1!=i则说明，有满行存在，根据循环可知道，程序是从第1行开始遍历的，k值的变化是根据第i+1行是不是满行而改变，
			//如果k值加1则说明该行是满行。这行是应该被删除的，取代这行的值是下行的数值。
	void deleteFullLine() {
		int full_line_num = 0;//记录满行的行数
		int k = 0;
		for (int i = 0; i < rowNum; i++) {
			boolean isfull = true;//判断满行的标识符，值为true表示满行，false表示不满行

			 for (int j = 0; j < columnNum; j++)         //执行该行的列循环
				if (scrArr[i][j] == 0) {                             //判断该行中是否被方块填充完整
					k++;                                                  //记录没有填充完整的行数
					isfull = false;                                    //该行不是满行，所以将值改为false
					
					break ;                                           //跳出当前列循环
				}
			if (isfull)                                           //若该行是满行则full_line_num值加1
				full_line_num++;		
        
			if (k != 0 && k - 1 != i && !isfull)//
				for (int j = 0; j < columnNum; j++) {
					if (scrArr[i][j] == 0)
						drawUnit(k - 1, j, 0);//将该位置方块颜色显示成黑色表示没有填充的
					else
						drawUnit(k - 1, j, 2);//将该位置方块颜色显示成品红表示已经停靠的
					scrArr[k - 1][j] = scrArr[i][j];//
				}
		}
		//只保留没有满行的方块，其中(k - 1)<0?0:k-1表示的是如整个画板中所有行数都是满行时，k值0，而SRCArr数组下标只能从0开始，不能从-1开始
		for (int i = (k - 1)<0?0:k-1; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				drawUnit(i, j, 0);//将该位置方块颜色显示成黑色表示没有填充的
				scrArr[i][j] = 0;
			}
		}
		ERS_Block.score += full_line_num;
		ERS_Block.scoreField.setText("" + ERS_Block.score);
	}

	// 判断游戏是否结束方法
	boolean isGameEnd() {
		for (int col = 0; col < columnNum; col++) {
			if (scrArr[maxAllowRowNum][col] != 0)//如果未满行数达到上限值，则表示程序结束
				return true;
		}
		return false;
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	// 处理键盘输入的方法
	public void keyPressed(KeyEvent e) {
		if (!ERS_Block.isPlay)
			return;
		switch (e.getKeyCode()) {
		case KeyEvent.VK_DOWN://调用键盘向下键实现方块下移
			b.fallDown();
			break;
		case KeyEvent.VK_LEFT://调用键盘向左键实现方块左移
			b.leftMove();
			break;
		case KeyEvent.VK_RIGHT://调用键盘向右键实现方块右移
			b.rightMove();
			break;
		case KeyEvent.VK_UP://调用键盘向上键实现方块改变状态
			b.leftTurn();
			break;
		}
	}
}


//方块类
class Block {
	static int[][] pattern = {
			{ 0x0f00, 0x4444, 0x0f00, 0x4444 },// 用十六进至表示，本行表示长条四种状态
			{ 0x04e0, 0x0464, 0x00e4, 0x04c4 },
			{ 0x4620, 0x6c00, 0x4620, 0x6c00 },
			{ 0x2640, 0xc600, 0x2640, 0xc600 },
			{ 0x6220, 0x1700, 0x2230, 0x0740 },
			{ 0x6440, 0x0e20, 0x44c0, 0x8e00 },
			{ 0x0660, 0x0660, 0x0660, 0x0660 } };
	int blockType; // 块的模式号（0-6）
	int turnState; // 块的翻转状态（0-3）
	int blockState; // 快的下落状态
	int row, col; // 块在画布上的坐标
	GameCanvas scr;

	// 块类的构造方法
	Block(GameCanvas scr) {
		this.scr = scr;
		blockType = (int) (Math.random() * 1000) % 7;
		turnState = (int) (Math.random() * 1000) % 4;
		blockState = 1;
		row = scr.getInitRow();
		col = scr.getInitCol();
	}

	// 重新初始化块，并显示新块
	public void reset() {
		blockType = (int) (Math.random() * 1000) % 7;//表示有7中块的形状
		turnState = (int) (Math.random() * 1000) % 4;//只有4中翻转操作
		blockState = 1;
		row = scr.getInitRow();
		col = scr.getInitCol();
		dispBlock(1);
	}

	// 实现“块”翻转的方法
	public void leftTurn() {
		if (assertValid(blockType, (turnState + 1) % 4, row, col)) {
			dispBlock(0);
			turnState = (turnState + 1) % 4;
			dispBlock(1);
		}
	}

	// 实现“块”的左移的方法
	public void leftMove() {
		if (assertValid(blockType, turnState, row, col - 1)) {
			dispBlock(0);
			col--;
			dispBlock(1);
		}
	}

	// 实现块的右移
	public void rightMove() {
		if (assertValid(blockType, turnState, row, col + 1)) {
			dispBlock(0);
			col++;
			dispBlock(1);
		}
	}

	// 实现块落下的操作的方法
	public boolean fallDown() {
		if (blockState == 2)
			return (false);
		if (assertValid(blockType, turnState, row - 1, col)) {
			dispBlock(0);
			row--;
			dispBlock(1);
			return (true);
		} else {
			blockState = 2;
			dispBlock(2);
			return (false);
		}
	}

	// 判断方块是否可以变形
	boolean assertValid(int t, int s, int row, int col) {
		int k = 0x8000;         		//这是一个4*4的坐标格子，在操作的时候，不能超过边界
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if ((int) (pattern[t][s] & k) != 0) {
					int temp = scr.getScrArrXY(row - i, col + j);
					if (temp < 0 || temp == 2)
						return false;
				}
				k = k >> 1;
			}
		}
		return true;
	}

	// 显示方块的图形的方法
	public synchronized void dispBlock(int s) {
		int k = 0x8000;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (((int) pattern[blockType][turnState] & k) != 0) {
					scr.drawUnit(row - i, col + j, s);
				}
				k = k >> 1;
			}
		}
	}
}







//处理控制类
class Command implements ActionListener {
	static final int button_play=1;//给按钮 分配编号
	static final int button_levelup=2;
	static final int button_leveldown=3;
	static final int button_quit=4;
	static final int button_pause=5;
	static boolean pause_resume=true;
	
	int curButton; //当前按钮
	GameCanvas scr;
	
	//控制按钮类的构造方法
	Command(int button,GameCanvas scr){
		curButton=button;
		this.scr=scr;
	}
	//按钮执行的方法
	public void actionPerformed(ActionEvent e){
		switch (curButton) {
		case button_play:
			   if (!ERS_Block.isPlay) {
				   scr.initScr();
				   ERS_Block.isPlay=true;
				   ERS_Block.score=0;
				   ERS_Block.scoreField.setText("0");
				   ERS_Block.timer.resume();
			}
			   scr.requestFocus();
			break;
		case button_levelup:
			   if (ERS_Block.level<10) {
				   ERS_Block.level++;
				   ERS_Block.levelField.setText(""+ERS_Block.level);
				   ERS_Block.score=0;
				   ERS_Block.scoreField.setText(""+ERS_Block.score);
			}
			   scr.requestFocus();
			break;
		case button_leveldown:
			   if (ERS_Block.level>1) {
				     ERS_Block.level--;
				     ERS_Block.levelField.setText(""+ERS_Block.level);
				     ERS_Block.score=0;
				     ERS_Block.scoreField.setText(""+ERS_Block.score);
			}
			   scr.requestFocus();
			break;
		case button_pause:
			   if (pause_resume) {
				   ERS_Block.timer.suspend();
				   pause_resume=false;
			}
			   else{
				   ERS_Block.timer.resume();
				   pause_resume=true;
			   }
			break;

		case button_quit:
			int n=JOptionPane.showConfirmDialog(null, "确定退出吗？", "确定弹出框", JOptionPane.YES_NO_OPTION);
		    if (n==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			} else {

			}
		
		}
		
	}
	
	
}























//重写MyPanel类，使用panel的四周留下空间
class MyPanel extends Panel{
	public Insets getInsets(){
		return new Insets(30,50,30,50);
	}
}










//定时线程
class MyTimer extends Thread{
	GameCanvas scr;
	public MyTimer(GameCanvas scr){
		this.scr=scr;
	}
	public void run(){
		
		while (true) {
			try {
				sleep((10-ERS_Block.level+1)*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!scr.getBlock().fallDown()) {//默认调用下移操作
				scr.deleteFullLine();
				if (scr.isGameEnd()) {
					ERS_Block.isPlay=false;
					suspend();
					
			}else
				scr.getBlock().reset();//随机生成一种方块
			}
			
			
		}
	}
	
	
}


class WinListener extends WindowAdapter{
	public void windowClosing(WindowEvent l){
		System.exit(0);
	}
	
}


	
	
	
	

