package ���߳�.thread.create;
/**
 * ���㹲����Դ
 * @author Administrator
 *
 */
public class Web12306 implements Runnable {
	private int num =99;

	@Override
	public void run() {
		while(true){
			if(num<=0){
				break; //����ѭ��
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"������"+num--);
		}
	}
	
	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web = new Web12306();
		//����
		Thread t1 =new Thread(web,"·�˼�");
		Thread t2 =new Thread(web,"��ţ��");
		Thread t3 =new Thread(web,"����ʦ");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
