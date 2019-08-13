package test.ai;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;

public class MouseEvents {
	public static void getMouseXy(){
		//È¡×ø±ê
		try {
			Thread.sleep(500);
			PointerInfo pinfo = MouseInfo.getPointerInfo();
			Point p = pinfo.getLocation();
			int mx = (int) p.getX();
			int my = (int) p.getY();
			System.out.println(mx);
			System.out.println(my);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getMouseXy();
	}
}
