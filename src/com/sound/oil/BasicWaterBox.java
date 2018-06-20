package com.sound.oil;

/**
 * 油箱  底面积x高 
 */
public class BasicWaterBox implements OilBox {

	/**
	 * 底面积, 单位:平方分米
	 */
	double h2,w2,l2;
	double h1,w1,l1;
	double hlimit;
	
	public BasicWaterBox() {
		h2=13.25;
		w2=10.897*2;
		l2=39.95;
		
		h1=12.9;
		w1=10.897*2;
		l1=11.3;
	}
	
	public double getintdown(double h) throws Exception{
		if(h<0 ||h>(6.6381-2.6493)) throw new Exception("invalid height:" + h);
		h=6.6381-h;
		return 7.27488*Math.pow(h, 1.5);
		
		
	}
	
	public double getintup(double h) throws Exception{
         if(h<0 ||h>(6.778-3.94224)) throw new Exception("invalid height:" + h);
		double a,b;
		double t=3.94224+h;
		if (t>6.777995988){ 
			a=0; 
		}
		else
		 a=- 2.92241*Math.pow(10, -19)*Math.pow(64746400000000L-9552440000000L*(t), 1.5);
		 b=- 2.92241*Math.pow(10, -19)*Math.pow(64746400000000L-9552440000000L*(3.94224), 1.5);
			
		return a-b;
	}
	

	@Override
	public double getVolume(double h) throws Exception {

		h=h2+0.36+0.06-h;
		if(h < -0.3){
			throw new Exception("invalid height:" + h);
		}	
		double v = getVolume1(h)+getVolume2(h);
		return v;
	}

	public double getVolume1(double h) throws Exception {
		double b= 6.6381-2.6493;
		double hr=h2-(6.6381-2.6493)-(6.778-3.94224);
		double v=-1;
		if (h<=b){// down side curve
			if(h<0) h=0;
			v= getintdown(h)*l2/1000;
		}
		if(h>b && h<=b+hr){  // mid rect
			v=(getintdown(b)+(h-b)*w2)*l2/1000;
		}
		if(h>b+hr){ //up side curve
			if(h>h2) h= h2;
			v=(getintdown(b)+hr*w2+getintup(h-b-hr))*l2/1000;
			
			
		}
		return v;
	}
	
	public double getVolume2(double h) throws Exception {
		double v=-1;
		h=h-2.05;
		if (h<0) h=0;
		if(h<=8){
			v= h*w1*l1;
			v=v/1000;
		}
		if(h>8){
			if (h>h1) h=h1;
			double v1,v2,v3;
			v1=8*w1*l1;
			v2= 2*0.291139*((3.95*3.95)-(3.95-h+8)*(3.95-h+8))*l1;
			v3=(3.95-h+8)*(w1-2.3*2)*l1;
			v=v1+v2+v3;
			v=v/1000;
		}
		return v;
	}

	@Override
	public String toString() {
		return "BasicWaterBox [h2=" + h2 + ", w2=" + w2 + ", l2=" + l2 + ", h1=" + h1 + ", w1=" + w1 + ", l1=" + l1
				+ ", hlimit=" + hlimit + "]";
	}

	


}
