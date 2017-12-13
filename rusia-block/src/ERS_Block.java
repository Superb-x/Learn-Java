
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class ERS_Block extends Frame {
	public static boolean isPlay=false;
	public static int level=1,score=0;
	public static TextField scoreField,levelField;
	public static MyTimer timer;   //�߳�
	GameCanvas gameScr;
	public static void main(String[] argus){
		
		ERS_Block ers=new ERS_Block("Java����˹����");
		WindowListener win_listener=new WinListener();  //���������
		ers.addWindowListener(win_listener);
		
	}
	//����˹������Ĺ��췽��
	ERS_Block(String title){
		super(title);   //�������
		setSize(640,480);      //�������Ĵ�С
		setLayout(new GridLayout(1,2));     //��Ϊһ������
		
		gameScr=new GameCanvas();
		gameScr.addKeyListener(gameScr);
		
		timer=new MyTimer(gameScr);
		timer.setDaemon(true);
		timer.start();
		timer.suspend();
		
		add(gameScr);
		
		Panel rightScr=new Panel();
		rightScr.setLayout(new GridLayout(2,1,0,30));   //���񲼾֣�����һ�У�ˮƽ���Ϊ0����ֱΪ30
		rightScr.setSize(120,500);                      //���120����500
		add(rightScr);
		
		//�ұ���Ϣ����Ĳ���
		MyPanel infoScr=new MyPanel();
		infoScr.setLayout(new GridLayout(4,1,0,5));        //��ǩ���ı�֮��Ĵ�ֱ���Ϊ5
		infoScr.setSize(120,300);                           //������Ϊ���120���߶�300
		rightScr.add(infoScr);
		
		//�����ǩ�ͳ�ʼֵ
		Label scorep=new Label("����:",Label.LEFT);
		Label levelp=new Label("����:",Label.LEFT);
		
		//�����ı���Ĵ�С
		scoreField=new TextField(8);
		levelField=new TextField(8);
		//�ı�������Ϊ�޷��༭��ֻ����
		scoreField.setEditable(false);
		levelField.setEditable(false);
		//��ӵ������
		infoScr.add(scorep);
		infoScr.add(scoreField);
		infoScr.add(levelp);
		infoScr.add(levelField);
		//java�Դ��ķ���Dimension������ȡ���Ŀ�͸�
		scorep.setSize(new Dimension(20,60));
		scoreField.setSize(new Dimension(20,60));
		levelp.setSize(new Dimension(20,60));
		levelField.setSize(new Dimension(20,60));
		scoreField.setText("0");
		levelField.setText("1");
		
		//�ұ߿��ư�ť����Ĳ���
		MyPanel controlScr=new MyPanel();
		controlScr.setLayout(new GridLayout(5,1,0,5));  //����һ�У���ֱ���Ϊ5
		rightScr.add(controlScr);
		
		//���尴ťplay
		Button play_b=new Button("��ʼ��Ϸ");
		play_b.setSize(new Dimension(50,200));// ����button�Ĵ�С
		play_b.addActionListener(new Command(Command.button_play,gameScr));//���õ���¼�
		
		//���尴ťlevel up
		Button level_up_b=new Button("��߼���");
		level_up_b.setSize(new Dimension(50,200));
		level_up_b.addActionListener(new Command(Command.button_levelup,gameScr));
		
		//���尴ťLevel Down
		Button level_down_b=new Button("���ͼ���");
		level_down_b.setSize(new Dimension(50,200));
		level_down_b.addActionListener(new Command(Command.button_leveldown,gameScr));
		
		//���尴ťlevel Pause
		Button pause_b=new Button("��Ϸ��ͣ/����");
		pause_b.setSize(new Dimension(50,200));
		pause_b.addActionListener(new Command(Command.button_pause,gameScr));
		
		
		//���尴ť Quit
		Button quit_b=new Button("�˳���Ϸ");
		quit_b.setSize(new Dimension(50,200));
		quit_b.addActionListener(new Command(Command.button_quit,gameScr));
		//�����а�ť��ӵ������
		controlScr.add(play_b);
		controlScr.add(level_up_b);
		controlScr.add(level_down_b);
		controlScr.add(pause_b);
		controlScr.add(quit_b);
		setVisible(true);//��ʾ������
		gameScr.requestFocus();  //��ȡ���㣬 �ѽ�����������Ϸ�����
		
				
	}
	
	
	
}
	
//��Ϸ������
class GameCanvas extends Canvas implements KeyListener {
	final int unitSize = 30; // С����߳�
	int rowNum; // �����������
	int columnNum; // �����������
	int maxAllowRowNum; // �����ж�����δ��
	int blockInitRow; // �³��ֿ����ʼ������
	int blockInitCol; // �³��ֿ����ʼ������
	int[][] scrArr; // ��Ļ����
	Block b; // �Է��������

	// ������Ĺ��췽��
	GameCanvas() {
		rowNum = 15;
		columnNum = 10;
		maxAllowRowNum = rowNum - 2;
		b = new Block(this);
		blockInitRow = rowNum - 1;
		blockInitCol = columnNum / 2 - 2;//ʹ�����м�����
		scrArr = new int[32][32];//����������������¼�������ɫ�ģ���ֵ��3�֣�0ֵ��ʾ��ɫ��1ֵ��ʾ��ɫ��2ֵ��ۺ�
	}

	// ��ʼ����Ļ��������Ļ��������ķ���
	void initScr() {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++)
				scrArr[i][j] = 0;//��ʼΪ0��ʾû���κη���
		b.reset();
		repaint();
	}

	// ����ˢ�»�������
	public void paint(Graphics g) {
		for (int i = 0; i < rowNum; i++)
			for (int j = 0; j < columnNum; j++)
				drawUnit(i, j, scrArr[i][j]);
	}

	// ������ķ���
	public void drawUnit(int row, int col, int type) {
		scrArr[row][col] = type;
		Graphics g = getGraphics();
		switch (type) { // ��ʾ������ķ���
		case 0:
			g.setColor(Color.gray);
			break; // �Ա���Ϊ��ɫ��
		case 1:
			g.setColor(Color.yellow);
			break; // ����������ķ���
		case 2:
			g.setColor(Color.pink);
			break; // ���Ѿ����µķ���
		}
		g.fill3DRect(col * unitSize, getSize().height - (row + 1) * unitSize,
				unitSize, unitSize, true);         //���û�ͼ�����������꣨row��col������һ������
		g.dispose();                     //�ύ���л�ͼ����
	}

	public Block getBlock() {
		return b; // ����blockʵ��������
	}

	// ������Ļ������(row,col)λ�õ�����ֵ
	//���ܳ�����Ļ�߿�
	public int getScrArrXY(int row, int col) {
		if (row < 0 || row >= rowNum || col < 0 || col >= columnNum)
			return (-1);
		else
			return (scrArr[row][col]);
	}

	// �õ��¿�ĳ�ʼ�����귽��
	public int getInitRow() {
		return (blockInitRow);
	}

	// �õ��¿�ĳ�ʼ�����귽��
	public int getInitCol() {
		return (blockInitCol); 
	}

	        // ����ɾ������   
	       //ɾ�����е�˼·��
          //���۵�ǰ��i���ǲ������ж������ı䣬ֻ�е�ѭ������i+1��ʱ�ŶԵ�i��������
         //������������������Ϊ���У���kֵΪ0,��ô��if��䲻��ִ�С�ͬ����isfullҲ���ж��Ƿ���δ����
			//��K!=0����isfull����������������˵������δ���У�����˵k-1!=i�������
			//i��ʾ���ǵ�i+1�У���Ϊ������±��Ǵ�0��ʼ�ģ����Ե�k-1==iʱ��˵��ǰ��i+1�ж���δ���У���Ȼ��Ҫ���в�����
			//��k-1!=i��˵���������д��ڣ�����ѭ����֪���������Ǵӵ�1�п�ʼ�����ģ�kֵ�ı仯�Ǹ��ݵ�i+1���ǲ������ж��ı䣬
			//���kֵ��1��˵�����������С�������Ӧ�ñ�ɾ���ģ�ȡ�����е�ֵ�����е���ֵ��
	void deleteFullLine() {
		int full_line_num = 0;//��¼���е�����
		int k = 0;
		for (int i = 0; i < rowNum; i++) {
			boolean isfull = true;//�ж����еı�ʶ����ֵΪtrue��ʾ���У�false��ʾ������

			 for (int j = 0; j < columnNum; j++)         //ִ�и��е���ѭ��
				if (scrArr[i][j] == 0) {                             //�жϸ������Ƿ񱻷����������
					k++;                                                  //��¼û���������������
					isfull = false;                                    //���в������У����Խ�ֵ��Ϊfalse
					
					break ;                                           //������ǰ��ѭ��
				}
			if (isfull)                                           //��������������full_line_numֵ��1
				full_line_num++;		
        
			if (k != 0 && k - 1 != i && !isfull)//
				for (int j = 0; j < columnNum; j++) {
					if (scrArr[i][j] == 0)
						drawUnit(k - 1, j, 0);//����λ�÷�����ɫ��ʾ�ɺ�ɫ��ʾû������
					else
						drawUnit(k - 1, j, 2);//����λ�÷�����ɫ��ʾ��Ʒ���ʾ�Ѿ�ͣ����
					scrArr[k - 1][j] = scrArr[i][j];//
				}
		}
		//ֻ����û�����еķ��飬����(k - 1)<0?0:k-1��ʾ��������������������������������ʱ��kֵ0����SRCArr�����±�ֻ�ܴ�0��ʼ�����ܴ�-1��ʼ
		for (int i = (k - 1)<0?0:k-1; i < rowNum; i++) {
			for (int j = 0; j < columnNum; j++) {
				drawUnit(i, j, 0);//����λ�÷�����ɫ��ʾ�ɺ�ɫ��ʾû������
				scrArr[i][j] = 0;
			}
		}
		ERS_Block.score += full_line_num;
		ERS_Block.scoreField.setText("" + ERS_Block.score);
	}

	// �ж���Ϸ�Ƿ��������
	boolean isGameEnd() {
		for (int col = 0; col < columnNum; col++) {
			if (scrArr[maxAllowRowNum][col] != 0)//���δ�������ﵽ����ֵ�����ʾ�������
				return true;
		}
		return false;
	}

	public void keyTyped(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	// �����������ķ���
	public void keyPressed(KeyEvent e) {
		if (!ERS_Block.isPlay)
			return;
		switch (e.getKeyCode()) {
		case KeyEvent.VK_DOWN://���ü������¼�ʵ�ַ�������
			b.fallDown();
			break;
		case KeyEvent.VK_LEFT://���ü��������ʵ�ַ�������
			b.leftMove();
			break;
		case KeyEvent.VK_RIGHT://���ü������Ҽ�ʵ�ַ�������
			b.rightMove();
			break;
		case KeyEvent.VK_UP://���ü������ϼ�ʵ�ַ���ı�״̬
			b.leftTurn();
			break;
		}
	}
}


//������
class Block {
	static int[][] pattern = {
			{ 0x0f00, 0x4444, 0x0f00, 0x4444 },// ��ʮ��������ʾ�����б�ʾ��������״̬
			{ 0x04e0, 0x0464, 0x00e4, 0x04c4 },
			{ 0x4620, 0x6c00, 0x4620, 0x6c00 },
			{ 0x2640, 0xc600, 0x2640, 0xc600 },
			{ 0x6220, 0x1700, 0x2230, 0x0740 },
			{ 0x6440, 0x0e20, 0x44c0, 0x8e00 },
			{ 0x0660, 0x0660, 0x0660, 0x0660 } };
	int blockType; // ���ģʽ�ţ�0-6��
	int turnState; // ��ķ�ת״̬��0-3��
	int blockState; // �������״̬
	int row, col; // ���ڻ����ϵ�����
	GameCanvas scr;

	// ����Ĺ��췽��
	Block(GameCanvas scr) {
		this.scr = scr;
		blockType = (int) (Math.random() * 1000) % 7;
		turnState = (int) (Math.random() * 1000) % 4;
		blockState = 1;
		row = scr.getInitRow();
		col = scr.getInitCol();
	}

	// ���³�ʼ���飬����ʾ�¿�
	public void reset() {
		blockType = (int) (Math.random() * 1000) % 7;//��ʾ��7�п����״
		turnState = (int) (Math.random() * 1000) % 4;//ֻ��4�з�ת����
		blockState = 1;
		row = scr.getInitRow();
		col = scr.getInitCol();
		dispBlock(1);
	}

	// ʵ�֡��顱��ת�ķ���
	public void leftTurn() {
		if (assertValid(blockType, (turnState + 1) % 4, row, col)) {
			dispBlock(0);
			turnState = (turnState + 1) % 4;
			dispBlock(1);
		}
	}

	// ʵ�֡��顱�����Ƶķ���
	public void leftMove() {
		if (assertValid(blockType, turnState, row, col - 1)) {
			dispBlock(0);
			col--;
			dispBlock(1);
		}
	}

	// ʵ�ֿ������
	public void rightMove() {
		if (assertValid(blockType, turnState, row, col + 1)) {
			dispBlock(0);
			col++;
			dispBlock(1);
		}
	}

	// ʵ�ֿ����µĲ����ķ���
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

	// �жϷ����Ƿ���Ա���
	boolean assertValid(int t, int s, int row, int col) {
		int k = 0x8000;         		//����һ��4*4��������ӣ��ڲ�����ʱ�򣬲��ܳ����߽�
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

	// ��ʾ�����ͼ�εķ���
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







//���������
class Command implements ActionListener {
	static final int button_play=1;//����ť ������
	static final int button_levelup=2;
	static final int button_leveldown=3;
	static final int button_quit=4;
	static final int button_pause=5;
	static boolean pause_resume=true;
	
	int curButton; //��ǰ��ť
	GameCanvas scr;
	
	//���ư�ť��Ĺ��췽��
	Command(int button,GameCanvas scr){
		curButton=button;
		this.scr=scr;
	}
	//��ťִ�еķ���
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
			int n=JOptionPane.showConfirmDialog(null, "ȷ���˳���", "ȷ��������", JOptionPane.YES_NO_OPTION);
		    if (n==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			} else {

			}
		
		}
		
	}
	
	
}























//��дMyPanel�࣬ʹ��panel���������¿ռ�
class MyPanel extends Panel{
	public Insets getInsets(){
		return new Insets(30,50,30,50);
	}
}










//��ʱ�߳�
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
			if (!scr.getBlock().fallDown()) {//Ĭ�ϵ������Ʋ���
				scr.deleteFullLine();
				if (scr.isGameEnd()) {
					ERS_Block.isPlay=false;
					suspend();
					
			}else
				scr.getBlock().reset();//�������һ�ַ���
			}
			
			
		}
	}
	
	
}


class WinListener extends WindowAdapter{
	public void windowClosing(WindowEvent l){
		System.exit(0);
	}
	
}


	
	
	
	

