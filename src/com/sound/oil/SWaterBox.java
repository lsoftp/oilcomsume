package com.sound.oil;

public class SWaterBox implements OilBox{

	double l=65;
	double w=20.942;
	double h1=13;
	double b=3.90497;
	double hr;
	SWaterBox()
	{
		hr= h1-2*b;
	}

	
	/*
	 * =-0.0356144*x*x+0.745854*x+3.69773
	 * =POWER((270766982641-35614400000*y),1.5)/1902578231040000 integration
	 * 
	*/
	@Override
	public double getVolume(double h) throws Exception {
		//System.out.printf("intergration %.6f\n",getIntegration(b));


		h=h1+0.36+0.06-h;
		if(h < -0.5){
			throw new Exception("invalid height:" + h);
		}
		double v=-1;
		if (h<=b){// down side curve
			if(h<0) h=0;
			v= getIntegration(h)*l/1000;
		}
		if(h>b && h<=b+hr){  // mid rect
			v=(getIntegration(b)+(h-b)*w)*l/1000;
		}
		if(h>3.9254+5.3492){ //up side curve
			if(h>h1) h= h1;
			v=(2*getIntegration(b)+hr*w-getIntegration(h1-h))*l/1000;
			
			
		}
		return v;
	}
	//=POWER((270766982641-35614400000*B23),1.5)/1902578231040000
	private double getIntegration(double h) throws Exception
	{
		if(h<0 || h> b) throw new Exception("invalid integration range h is :"+ h);
		double t,t1;
		double hh=7.6027;
		double hht=hh-h;
		t= Math.pow((270766982641L-35614400000L*(hht)),1.5)/1902578231040000L;
		//System.out.printf("intergration t %.6f\n",t);
		t1= Math.pow((270766982641L-35614400000L*hh),1.5)/1902578231040000L;
		//System.out.printf("intergration t1 %.6f\n",t1);
		t=t-t1;
		t*=2;
		return t;
		
	}
	
	@Override
	public String toString() {
		return "SWaterBox [l=" + l + ", w=" + w + ", h=" + h1 + "]";
	}

}
