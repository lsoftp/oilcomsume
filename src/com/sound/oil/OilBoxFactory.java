package com.sound.oil;

public class OilBoxFactory {

	// oilbox type,按照底盘类型来分
	public static final int DFA1070SDJ41D6=1;
    public static final int DFA1070SJ12N5=2;
    public static final int DFA1070SJ35D6=3;
    public static final int DFA1080SJ11D3=4;
    public static final int DFD1O32GJ=5;
    public static final int DFL1100BX7=6;
    public static final int DFL1120B3=7;
    public static final int DFL1160BX1V=8;
    public static final int DFL1160BX4=9;
    public static final int DFL1160BX5=10;
    public static final int DFL1160BXB=11;
	public static final int DFL1250A11=12;
    public static final int DFL1250A13=13;
    public static final int EQ1160GD5NJ=14;
    public static final int EQ1160ZZ4GJ=15;
    public static final int EG3160GNJ_50=16;
    public static final int HFC1073P83K1C3=17;
    public static final int QL1060A1HAY=18;
    public static final int QL10703HARY=19;
    public static final int QL1070A1ARY=20;
    public static final int QL11009KARY=21;
    public static final int QL11009LARY=22;
    public static final int SC1022DB4N4=23;
    public static final int SC1026DAN4=24;
    public static final int SC1034DD44=25;
    public static final int JAC_XI_CENG_WHLG=26; //武汉理工江淮吸尘车
    //add 易县 张家口 油箱登记表 咸宁
    public static final int BJ1073VEJEA_B1 =27; 	
    public static final int BJ3045D8JD5_1 = 28; 	
    public static final int DFA1080SJ12D3 = 29; 	
    public static final int DFD1030GJ = 30;      	
    public static final int DFL1120B19 = 31;    	
    public static final int DFL1120B21	=32;	
    public static final int DFL1160BX	=33;	
   	
    public static final int DFL1250A12	=34;	
    public static final int EQ1162GKJ	=35;	
    public static final int EQ1168KJ	=36;	
    public static final int EQ3071GLJ6	=37;	
    public static final int HFC1070P81K2C7	=38;
    public static final int HFC1081P91K2C5 =39;	
    public static final int QL1070A1HAY	 = 40;
    public static final int QL1070A1KAY =41;
    public static final int QL11019MARY	=42;	
    
    public static final int BJ1163VJPGA_XA =43;
    public static final int DFL1120B1 =44;
    
    public static final int DFL1160BX2 =45;
    public static final int EQ2110G6DJ =46;
    
    public static final int EQ3044TJAC =47;
    public static final int EQ3093GD4JAC =48;
    public static final int HFC1070P73K1C32V =49;
    public static final int LG850 =50;
    public static final int LG850_1 =51;
    public static final int QL11019MARY_1=52;
    public static final int TANGXIAN_SHASHUI_S3 =53;
    public static final int ZL30F =54;
    
    public static final int  BJ1089VEJEA_FC = 55;
    public static final int  BJ1125UKPFA_1 = 56;
    public static final int  BJ2815PDQ = 57;
    public static final int  BJ3045D9PB5_2 = 58;
    public static final int  BJ3053DBPB5_1 = 59;
    public static final int  BJ5089XXY_FA = 60;
    public static final int  DFD1022GUJ1 = 61;
    public static final int  EQ1040TJ20D3 = 62;
    public static final int  EQ1110GLJ = 63;
    public static final int  EQ1110GLJ_HKB9_JP10 = 64;
    public static final int  EQ1121GKJ = 65;
    public static final int  EQ1162GJAC = 66;
    public static final int  HFC1073P83K1B4 = 67;
    
    public static final int  ZZ3257N4647D1 = 68;
    public static final int  EQ21110GLJ = 69;
    public static final int  EQ3044TAC = 70;
    public static final int  EQ3093GD4AC = 71;
    public static final int  HFC1081P91K1C5ZV = 72;

    public static final int  QL1071A1HAY = 73;
    public static final int  	EQ3126GD3GJ = 74;
    public static final int  	BJ1103VEJEA_1 = 75;
    public static final int  	BJ1083VEJEA_S = 76;
   
    public static final int  EQ1126KBJ = 77;
    public static final int  	LH1040D = 78;
    public static final int  	QL1100TLARY = 79;
    public static final int  	DFL1140B2 = 80;

    public static final int  	BJ5163XXY_XP=81;
    public static final int  	LZ1161RAPAT =82;

    public static final int  	NJ1072ZFDCMZ=83;
    public static final int  	HFC1070P93K1C3ZV =84;
    
    public static final int  	QL5040XXY3HAR=85;
    public static final int    BJ3046D9PDA_1=86;
    
    public static final int  		DFA1070SJ20D5=87;
    public static final int    DFL1250A8=88;
    public static final int BJ1030V4JV4_F1=89;
   
    public static final int EQ1081TJ12D1=90;
    public static final int EQ1032T51DJ3=91;//	835	400	280	1270	18	18	2	7.97	3.96	2.76	0.524226641	0.524226641
    public static final int BJ1043V9JEA_A1=92;
    public static final int BJ1163VKPHK_AA=93;
    public static final int BJ5042V9BB5_S=94;
    public static final int HFC1073P83K1C3_PINYI=95;
    
 //   public static final int BJ3046D9PDA_1=97;
    public static final int BJ5162TXSE5_H1=96;
    public static final int EQ5161ZYSS4=97;
    public static final int HFC1070K5T=98;
    public static final int NKR77PLPACJAY=99;
    public static final int QL1070A5HAY=100;
    public static final int ZZ1164G4715C1=101;
    public static final int BJ1069VEJ06_AS=102;
    public static final int BJ1252VMPHE_AB=103;
    public static final int EQ1128GLJ2=104;
    public static final int EQ3141G7DJ=105;
    public static final int BJ3042V3PBB_B1=106;
    public static final int FD1041D13K4=107;

    public static final int BJ1036V4AV5_D2=108;
    public static final int BJ5032ZXXE5_H1=109;
    public static final int BJ5043XXY_J7=110;
    public static final int BQJ5100ZXXC=111;
    public static final int FLM5020TYHC5=112;
    public static final int FLM5080TXSJL5=113;
    public static final int JX1083TGA25=114;
    public static final int JX1083TK25=115;
    public static final int QL1060AFAY=116;
    public static final int YD5076ZYSCHFE5=117;


    //public static final int YD5076ZYSCHFE5=117;
    public static final int EQ1060TJ20D1=118;
    public static final int EQ1102FLJ5=119;
    public static final int EQ3030T14DJ9=120;
    public static final int EQ3102FJ=121;
    public static final int EQ3168KJ=122;
    public static final int FD1041DBK4=123;
    public static final int FD3041MP12K4=124;
    public static final int HFC1071KT=125;
    public static final int HFC3160KR1ZT=126;
    public static final int LMLDAR9G=127;
    public static final int LMLDAB3G=128;
    public static final int Lu_G28825=129;
    public static final int Lu_H7P19=130;
    public static final int Lu_H7P326=131;
    public static final int LVZHOU_YUTONGDONGFENG=132;
    public static final int SC1022BBN3D=133;
    public static final int YUTAI_WUZHENG=134;
    public static final int ZZ1251M4441C_JUIXIAN=135;
    public static final int ZZ1251M4441C=136;
    public static final int ZZ3257N4147D1=137;

    public static final int EQ1100LJ13DC=138;
    public static final int SC1022DB4N=139;
    public static final int BJ1082V4JBB_E1=140;


    public static final int LAIYUAN_ZHIFA_09=141;
    public static final int DFH1180BX1V=142;
    
    public static final int YTQ3036DR6TV=143;
    public static final int BJ3046D8ABA_1=144;
    public static final int JX3045XSG2=145;

	/**
	 * @param oilBoxType
	 * @return
	 * @throws Exception
	 * 
	 */
	public static OilBox createOilBox(int oilBoxType) throws Exception {
		OilBox ob=null;
		
		switch(oilBoxType) {
		case DFA1070SDJ41D6:
			ob = new BasalAreaOilBox(10);
			break;  
		case DFA1070SJ12N5:
			ob = new BasalAreaOilBox(10);
			break;
		case DFA1070SJ35D6:
			ob = new OilBox10(7.92,3.985,2.805,0.55335);
			break;
		case DFA1080SJ11D3:
			ob = new OilBox10(10,3,10,1);//TEST
			break;
		case DFD1O32GJ:  
		case DFL1100BX7: 
		case DFL1120B3:  
			ob =  new OilBox10(5.8	,6.12,	4.97,	1.281442901);

			break;
		case DFL1160BX1V:
			ob = new OilBox10(10,3,10,1);//TEST1.368814
			break;
		case DFL1160BX4: 
			ob =  new OilBox10(5.82,6.15,4.94,1.1);
			break;
		case DFL1160BX5:
			ob =  new OilBox10(5.82,6.15,4.94,1.1);
			//ob =  new OilBox10(9.08,	4.96,	3.96,	1.164948092);

			break;
		case DFL1160BXB:
			ob = new BasalAreaOilBox(10);
			break; 
		case DFL1250A11:
			ob = new OilBox10( 11.48, 6.08, 5.94, 1.28144290073951);
			break;
		case DFL1250A13:
			ob = new OilBox10( 8.58,	6.76,	6.56,	1.164948092);
			break;
			
		case EQ1160GD5NJ:
		case EQ1160ZZ4GJ:
		case EG3160GNJ_50:
			ob = new BasalAreaOilBox(10);
			break;
		case HFC1073P83K1C3:
			ob = new OilBox10(6.6,4.06,3.26,0.465979237);
			break;
		case QL1060A1HAY:
			ob = new OilBox10(9.58,3.36,3.26,0.465979237);	
			break;
		case QL10703HARY:
			ob = new BasalAreaOilBox(10);
			break;
		case QL1070A1ARY:
			ob = new OilBox10(9.58,3.395,3.295,0.4951);
			break;
		case QL11009KARY:
			ob = new OilBox10(9.62,3.36,3.21,0.314536);
			break;
		case QL11009LARY:
		case SC1022BBN3D:
		case SC1026DAN4:
			ob = new BasalAreaOilBox(25.84538662);
			break;
		case SC1034DD44:
			ob = new OilBox10(6.295,2.536,2.636,0.3087);
			break;
		case JAC_XI_CENG_WHLG:
			ob = new OilBox10(9.32,4.06,3.24,0.535876);
			break;
			
		case BJ1073VEJEA_B1:
			ob = new OilBox10(7.64,3.46,2.86,0.669845153);
			break;
		case BJ3045D8JD5_1:
			ob = new OilBox10(5.8,4.06,3.26,0.465979237);
			break;
			
		case DFA1080SJ12D3:
			ob = new OilBox10(8.42,4.79,3.99,1.01350484);
			break;
		case DFD1030GJ:
			ob = new OilBox10(6.1,2.96,2.46,0.582474046);
			break;
		case DFL1120B19:
			ob = new OilBox10( 5.8, 6.13, 4.91, 1.01350483967579);
			break;
		case DFL1120B21:
			ob = new OilBox10(5.78,	6.17,	4.97,	1.281442901);
			break;	
			
		case DFL1160BX:
			ob = new OilBox10(9.4,4.86,3.96,1.106700687);
			break;	
		case DFL1250A12:
			ob = new OilBox10(11.6,6.06,5.46,0.698968855);
			break;	
		case EQ1162GKJ:
			ob = new OilBox10( 9.09, 4.78, 3.97, 1.12417490837602);
			break;	
		case EQ1168KJ:
			ob = new OilBox10(8.6,4.86,3.86,0.990205878);
			break;
		case EQ3071GLJ6:
			ob = new OilBox10(9.4,4.76,3.96,0.990205878);
			break;	
		case HFC1070P81K2C7:
			ob = new OilBox10(7.8,3.36,2.66,0.291237023);
			break;
		case HFC1081P91K2C5:
			ob = new OilBox10(9.8,4.06,3.26,0.582474046);
			break;
		case QL1070A1HAY:
			ob = new OilBox10(9.5,3.36,3.16,0.320360725);
			break;
		case QL1070A1KAY:
			ob = new OilBox10(9.6,/*10.08*/3.41,3.27,0.559175084);
			break;
		
		case QL11019MARY:
			//ob = new OilBox10(9.1,3.26,3.06,0.058247405);
			ob = new OilBox10(9.88,	3.37,	3.27,0.465979237);
			

			break;
		case BJ1163VJPGA_XA:
			ob = new  BasalAreaOilBox(44.3928); 
			break;
		case DFL1120B1:
			ob = new OilBox10(9.23,4.86,4.11,1.281442901);
			break;
		case DFL1160BX2:
			ob = new OilBox10(9.02,4.91,4.07,1.333865565);
			break;
		case EQ2110G6DJ:
			ob = new OilBox10(8.31,4.79,4.05,1.129999649);
			break;
		case EQ3044TJAC:
			ob = new OilBox10(8.28,4.77,4.07,1.182422313);
			break;
		case EQ3093GD4JAC:
			ob = new OilBox10(9.15,4.9,4.07,1.380463489);
			break;
		case HFC1070P73K1C32V:
			ob = new OilBox10(5.82,6.13,4.96,1.304741863);
			break;
		case LG850:
			ob = new BasalAreaOilBox(16.0308); 
			break;
		case LG850_1:
			ob = new BasalAreaOilBox(13.5568); 
			break;
		case TANGXIAN_SHASHUI_S3:
			ob = new OilBox10(11.48,6.06,5.86,1.164948092);
			break;
		case ZL30F:
			ob = new BasalAreaOilBox(17.1288);
			break;
			  
		case QL11019MARY_1:
			ob = new OilBox10(9.1,3.26,3.06,0.058247405);
			break;
		case BJ1089VEJEA_FC:
			ob = new OilBox10( 6.78, 3.96, 3.26, 0.407731832);   
			break;
		case BJ1125UKPFA_1:   
			ob = new OilBox10( 7.98, 4.96, 3.96, 1.164948092);
			break;
		case BJ2815PDQ:
			ob = new OilBox10( 7.98, 2.96, 2.46,0);
			break;
		case BJ3045D9PB5_2:
			ob = new OilBox10( 5.68, 4.01, 3.16, 0.34948443);
			break;
		case BJ3053DBPB5_1:   
			ob = new OilBox10( 9.08, 4.76, 3.96, .931958473);
			break;
		case BJ5089XXY_FA:   
			ob = new OilBox10( 6.78, 3.96, 3.26, .407731832); 
			break;
		case DFD1022GUJ1:  
			ob = new OilBox10( 5.98, 2.96, 2.36, .465979237); 
			break;
		case EQ1040TJ20D3:  
			ob = new OilBox10( 7.98, 3.96, 2.76, .465979237);
			break;
		case EQ1110GLJ: 
			ob = new OilBox10( 9.08, 4.76, 3.96, .931958473); 
			break;
		case EQ1110GLJ_HKB9_JP10:   
			ob = new OilBox10( 4.58, 4.16, 1.76,0);  
			break;
		case EQ1121GKJ: 
			ob = new OilBox10( 9.08, 4.76, 3.96, 1.048453282); 
			break;
		case EQ1162GJAC: 
			ob = new OilBox10( 9.18, 4.86, 3.96, 1.164948092);   
			break;
		case HFC1073P83K1B4: 
			ob = new OilBox10( 7.58, 3.46, 2.76, .64072145);
			break;
		case ZZ3257N4647D1:    ob = new OilBox10( 9.48, 6.86, 6.96, 2.56288580147902);   break;
		case EQ21110GLJ:    ob = new OilBox10( 8.31, 4.79, 4.05, 1.12999964883393);   break;
		case EQ3044TAC:    ob = new OilBox10( 8.28, 4.77, 4.07, 1.18242231295509);   break;
		case EQ3093GD4AC:    ob = new OilBox10( 9.15, 4.9, 4.07, 1.38046348852393);   break;
		case HFC1081P91K1C5ZV:    ob = new OilBox10( 7.68, 3.46, 2.81, .582474045790686);   break;
		case QL1071A1HAY:    ob = new OilBox10( 9.41, 3.36, 3.23, .460154496174642);   break;
		case EQ3126GD3GJ:    ob = new OilBox10( 8.28, 4.76, 3.96, .932);   break;
		case BJ1103VEJEA_1:    ob = new OilBox10( 7.685, 4.09, 3.28, .55335);   break;
		case BJ1083VEJEA_S:    ob = new OilBox10( 8.22, 3.26, 2.48, .838762626);   break;	
		case EQ1126KBJ:    ob = new OilBox10( 8.48,4.76,3.96,1.106700687);   break;
		case LH1040D:    ob = new OilBox10( 6.38,2.41,2.86,0.349484427);   break;
		case QL1100TLARY:    ob = new OilBox10(9.58,3.26,3.26,0.407731832);   break;
		case DFL1140B2:    ob = new OilBox10(9.18,4.91,3.96,1.106700687);   break;	
		
		case BJ5163XXY_XP: ob = new OilBox10(7.03,	6.56,	5.36,	1.33963);   break;	
		//case BJ5163XXY_XP_BAODING:ob = new OilBox10(5.78,	6.16,	4.96,	1.39793771);   break;
		case LZ1161RAPAT:ob = new OilBox10(5.78,	6.16,	4.96,	1.39793771);   break;
		
		case HFC1070P93K1C3ZV: ob = new OilBox10(9.58	,3.46,	3.36	,0.757216261);   break;	
		case NJ1072ZFDCMZ:ob = new OilBox10(7.38,	3.96,	3.26,	0.291237023);   break;	
		case QL5040XXY3HAR:ob = new OilBox10(9.98,	3.46,	3.26,	0.21237023);   break;	
		case BJ3046D9PDA_1:ob = new OilBox10(8.28,	4.06,	3.26,	0.46598);   break;
		case DFA1070SJ20D5:ob = new OilBox10(7.88,	3.96,	2.76,	0.233);   break;	
		case DFL1250A8:ob = new OilBox10(11.58,5.86,	5.96,	0.99);   break;
		case BJ1030V4JV4_F1:ob = new OilBox10(6.88,2.66,	2.96,	0.75722);   break;
		case EQ1081TJ12D1:ob = new OilBox10(8.08,3.96,	2.76,	0.34948);   break;
		case EQ1032T51DJ3:ob = new OilBox10(7.97,	3.96,2.76,	0.524226641);   break;
		case BJ1043V9JEA_A1:ob = new OilBox10(9.78,	3.06,	2.7	,0.174742214);   break;
		case BJ1163VKPHK_AA:ob = new OilBox10(5.98,	5.86,	5.06,	0.582474046);   break;
		case BJ5042V9BB5_S:ob = new OilBox10(5.98,	3.96,	1.8,	0.349484427);   break;
		case HFC1073P83K1C3_PINYI:
			ob = new OilBox10(9.58,	3.56,	2.76,	0.058247405);
			break;
		case BJ5162TXSE5_H1:ob = new OilBox10(6.13,	6.27,	5.27,/*some prolem	3.669586488*/0.5);   break;
		case  EQ5161ZYSS4:ob = new OilBox10(5.84,	6.27,	4.97,	1.456185114);   break;
		case  HFC1070K5T:ob = new OilBox10(9.68,	3.47,	3.32,	0.553350344);   break;
		case  NKR77PLPACJAY:ob = new OilBox10(10.08,	3.37,	3.27,	0.407731832);   break;
		case  QL1070A5HAY:	ob = new OilBox10(9.88,	3.37,	3.27,	0.465979237);   break;
		case  ZZ1164G4715C1: ob = new CylinderOilBox(2.705634033,9.5);   break;
		case  BJ1069VEJ06_AS: ob = new OilBox10(6.58,	4.06,	3.26,	0.465979237);   break;
		case  BJ1252VMPHE_AB: ob = new OilBox10(6.88,	6.47,	5.47,	1.164948092);   break;
		case  EQ1128GLJ2: ob = new OilBox10(7.38	,6.16,	4.96,	1.281442901);   break;
		case  EQ3141G7DJ: ob = new OilBox10(8.43	,4.86,	4.06,	1.281442901);   break;
		case  BJ3042V3PBB_B1: ob = new OilBox10(7.08,	3.36,	2.76,	0.232989618);   break;
		case  FD1041D13K4: ob = new OilBox10(8.17,2.58,3.02,0.530051382);break;
		case BJ1036V4AV5_D2: ob = new OilBox10(6.98,4.96,2.26,0.25); break;
		case BJ5032ZXXE5_H1: ob = new OilBox10(7.18,2.26,2.96,0.25); break;
		case BJ5043XXY_J7: ob = new OilBox10(9.68,3.26,2.96,0.25); break;
		case BQJ5100ZXXC: ob = new OilBox10(9.28,4.81,3.96,0.25); break;
		case FLM5020TYHC5: ob = new OilBox10(8.78,2.96,1.66,0.25); break;
		case FLM5080TXSJL5: ob = new OilBox10(10.48,3.86,3.06,0.25); break;
		case JX1083TGA25: ob = new OilBox10(9.64,2.96,3.66,0.40773183205348); break;
		case JX1083TK25: ob = new OilBox10(10.04,2.91,3.71,0.465979236632549); break;
		case QL1060AFAY: ob = new OilBox10(9.54,3.36,3.21,0.465979236632549); break;
		case YD5076ZYSCHFE5: ob = new OilBox10(5.78,4.96,3.16,0.25); break;
		
		case EQ1060TJ20D1: ob = new OilBox10(7.944,2.86,2.56,0.25); break;
		case EQ1102FLJ5: ob = new OilBox10(9.12,4.76,3.96,0.931958473265097); break;
		case EQ3030T14DJ9: ob = new OilBox10(7.944,2.86,2.56,0.25); break;
		case EQ3102FJ: ob = new OilBox10(8.576,4.86,3.96,0.25); break;
		case EQ3168KJ: ob = new OilBox10(8.576,4.86,3.96,0.25); break;
		case FD1041DBK4: ob = new OilBox10(9.12,2.56,3.01,0.349484427474412); break;
		case FD3041MP12K4: ob = new OilBox10(7.18,3.36,1.96,0.25); break;
		case HFC1071KT: ob = new OilBox10(7.776,3.46,2.86,0.25); break;
		case HFC3160KR1ZT: ob = new OilBox10(4.86,6.46,5.56,0.25); break;
		case LMLDAR9G: ob = new OilBox10(9.98,3.36,3.16,0.349484427474412); break;
		case LMLDAB3G: ob = new OilBox10(9.98,3.36,3.06,0.291237022895343); break;
		case Lu_G28825: ob = new OilBox10(8.88,4.76,3.96,1.04845328242323); break;
		case Lu_H7P19: ob = new OilBox10(9.58,3.36,3.26,0.524226641211617); break;
		case Lu_H7P326: ob = new OilBox10(5.78,6.16,4.96,1.45618511447671); break;
		case LVZHOU_YUTONGDONGFENG: ob = new OilBox10(7.98,3.96,2.76,0.524226641211617); break;
		
		//case SC1022BBN3D: ob = new OilBox10(9.18,3.16,1.56,-3.55309167932318); break;
		
		case YUTAI_WUZHENG: ob = new OilBox10(7.18,3.26,2.56,0.0582474045790686); break;
		case ZZ1251M4441C_JUIXIAN: ob = new OilBox10(6.18,6.46,6.66,1.1067006870023); break;
		case ZZ1251M4441C: ob = new CylinderOilBox(3.48,8.98);   break;
		case ZZ3257N4147D1: ob = new OilBox10(9.68,5.96,5.16,0.25); break;
		case SC1022DB4N4: ob = new OilBox10(9.88,2.76,1.76,0.757216259527892); break;
		case EQ1100LJ13DC: ob = new OilBox10(11.58,4.81,4.01,0.25); break;
		case SC1022DB4N: ob = new OilBox10(9.48,2.96,1.56,0.25); break;
		case BJ1082V4JBB_E1: ob = new OilBox10(9.48,3.16,2.76,0.25); break;
		case LAIYUAN_ZHIFA_09: ob = new OilBox10(9.28,4.06,4.76,0.25); break;
		case DFH1180BX1V: ob = new OilBox10(5.8,6.16,4.96,1.28144290073951); break;
		case YTQ3036DR6TV: ob = new OilBox10(5.38,3.16,3.16,0.116494809158137); break;
		case BJ3046D8ABA_1: ob = new OilBox10(6.78,4.16,3.26,0.582474045790686); break;
		case JX3045XSG2: ob = new OilBox10(9.58,4.06,3.26,0.582474045790686); break;


		default:
			throw new Exception("invalid Oil box type:" + oilBoxType );
		}
		return ob;
	}




}
