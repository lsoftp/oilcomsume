package com.sound.oil;

public class WaterBoxFactory {

	// oilbox type,按照底盘类型来分
	public static final int HJK5160GSS=1;
    public static final int HJK5250GSSD5=2;
    public static final int DFA1070SJ35D6=3;
    public static final int DFA1080SJ11D3=4;
    public static final int DFD1O32GJ=5;


//    public static final int BJ5163XXY_XP=95;


    //public static final int QL1070A1KAY=90;
    //public static final int BJ5163XXY_XP_BAODING=90;
	/**
	 * @param oilBoxType
	 * @return
	 * @throws Exception
	 * 
	 */
	public static OilBox createWaterBox(int oilBoxType) throws Exception {
		OilBox ob=null;
		
		switch(oilBoxType) {
		case HJK5160GSS:
			ob = new BasicWaterBox();
			break;  
		case HJK5250GSSD5:
			ob = new SWaterBox();
			break;
		case DFA1070SJ35D6:
			ob = new BasicWaterBox();
			break;
		case DFA1080SJ11D3:
			ob = new BasicWaterBox();//TEST
			break;
		case DFD1O32GJ:  

			ob = new BasicWaterBox();//TEST1.368814
			break;

		default:
			ob = new BasicWaterBox();//TEST1.368814
			//throw new Exception("invalid water box type:" + oilBoxType );
		}
		return ob;
	}




}
