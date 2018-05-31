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
	//窗体离屏幕顶端的距离
	private int top;
	//窗体的宽
	private int width;
	//窗体的高
	private int height;
	//鼠标的位置
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
		//获取窗体的轮廓
		rect = new Rectangle(0,0,width,height);
		
		//获取鼠标的在窗体的位置
		point = getMousePosition();
		if((top<0)&& isPtInRect(rect,point)){
			//当鼠标在当前的窗体内，并且窗体的top<0
			//设置窗体的top属性为0，就是将窗口上部紧靠顶部
			setLocation(left, 0);
		}else if(top>-5&& top<5 &&!(isPtInRect(rect,point))){
			//当前的窗体的上边框与屏幕的距离小于5时，
			//并且鼠标的位置不在窗体上。将窗体吟唱
			setLocation(left,5-height);
		}
		
	}

/**
 * 判断一个点书否在一个矩形内
 * @param rect2
 * @param point2
 * @return
 */


	private boolean isPtInRect(Rectangle rect2, Point point2) {
		// TODO Auto-generated method stub
		return false;
	}

}
