package com.swing.frames;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MyFrame extends JFrame implements ActionListener{
	private Rectangle  rect;
	private int left;
	//��������Ļ���˵ľ���
	private int top;
	//����Ŀ�
	private int width;
	//����ĸ�
	private int height;
	//����λ��
	private Point point;
	private Timer time = new Timer(10, this);
	
    public MyFrame() {
    	time.start();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		left = getLocationOnScreen().x;
		top  = getLocationOnScreen().y;
		width = getWidth();
		height = getHeight();
		//��ȡ���������
		rect = new Rectangle(0,0,width,height);
		
		//��ȡ�����ڴ����λ��
		point = getMousePosition();
		if((top<0)&& isPtInRect(rect,point)){
			//������ڵ�ǰ�Ĵ����ڣ����Ҵ����top<0
			//���ô����top����Ϊ0�����ǽ������ϲ���������
			setLocation(left, 0);
		}else if(top>-5&& top<5 &&!(isPtInRect(rect,point))){
			//��ǰ�Ĵ�����ϱ߿�����Ļ�ľ���С��5ʱ��
			//��������λ�ò��ڴ����ϡ�����������
			setLocation(left,5-height);
		}
		
	}

/**
 * �ж�һ���������һ��������
 * @param rect2
 * @param point2
 * @return
 */


	private boolean isPtInRect(Rectangle rect2, Point point2) {
		// TODO Auto-generated method stub
		return false;
	}

}
