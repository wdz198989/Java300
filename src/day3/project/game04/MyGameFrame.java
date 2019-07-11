package day3.project.game04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �ɻ���Ϸ��������
 * @author ���
 *
 */
public class MyGameFrame  extends  JFrame {
	
	Image   planeImg  = GameUtil.getImage("images/plane.png");
	Image   bg  = GameUtil.getImage("images/bg.jpg");
	
	Plane   plane = new Plane(planeImg,250,250);
	Plane   plane2 = new Plane(planeImg,350,250);
	Plane   plane3 = new Plane(planeImg,450,250);
	
	@Override
	public void paint(Graphics g) {		//�Զ������á�  g�൱��һֻ����
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);  //���ɻ�
		plane2.drawSelf(g);  //���ɻ�
		plane3.drawSelf(g);  //���ɻ�
		
	}
	
	
	//�������Ƿ������ػ����ڣ�
	class  PaintThread  extends  Thread  {
		@Override
		public void run() {
			while(true){
				repaint();		//�ػ�
				
				try {
					Thread.sleep(40);   	//1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		}
		
	}
	
	
	/**
	 * ��ʼ������
	 */
	public  void  launchFrame(){
		this.setTitle("��ѧ��ѧԱ_����Գ��Ʒ");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();	//�����ػ����ڵ��߳�
		
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();
		f.launchFrame();
	}
	
}