import java.awt.*;
import javax.swing.*;

import index.*;;

public class Processing {
	private Signal sig;
	private static String name;
	private static String gender;
	private static String age;
	private static String pregnant;
	private static String prevVisit;
	private static String med;
	private static String hist;
	private static String allergies;
	public static String category;
	public static String reason = "";
	public static String duration = "";
	private static boolean selected = false;
	private String[] ynA = {"yesA", "noA"};
	private String[] ynB = {"yesB", "noB"};
	
	
	public Processing(Signal s){
		sig = s;
	}
	
	public static void infoPanel(){
		PanelIndex.personalInfo.setLayout(new GridLayout(9, 1));
		PanelIndex.personalInfo.add(PersonalPI.nameP);
		PanelIndex.personalInfo.add(PersonalPI.birthP);
		PanelIndex.personalInfo.add(PersonalPI.addrP);
		PanelIndex.personalInfo.add(PersonalPI.contactP);
		PanelIndex.personalInfo.add(PersonalPI.eConP);
		PanelIndex.personalInfo.add(PersonalPI.insInputP);
		PanelIndex.personalInfo.add(PersonalPI.insComboP);
		PanelIndex.personalInfo.add(PersonalPI.empPA);
		PanelIndex.personalInfo.add(PersonalPI.empPB);
		
		PersonalPI.nameP.setLayout(new GridLayout(2, 3));
		PersonalPI.addrP.setLayout(new GridLayout(2, 1));
		PersonalPI.contactP.setLayout(new GridLayout(2, 2));
		PersonalPI.birthP.setLayout(new GridLayout(2, 3));
		PersonalPI.eConP.setLayout(new GridLayout(2, 2));
		PersonalPI.insInputP.setLayout(new GridLayout(2, 3));
		PersonalPI.insComboP.setLayout(new GridLayout(2, 2));
		PersonalPI.empPA.setLayout(new GridLayout(2, 2));
		PersonalPI.empPB.setLayout(new GridLayout(2, 2));
		
		PersonalPI.nameP.add(PersonalPI.fNL);
		PersonalPI.nameP.add(PersonalPI.mNL);
		PersonalPI.nameP.add(PersonalPI.lNL);
		PersonalPI.nameP.add(PersonalPI.fN);
		PersonalPI.nameP.add(PersonalPI.mN);
		PersonalPI.nameP.add(PersonalPI.lN);
		PersonalPI.addrP.add(PersonalPI.addrL);
		PersonalPI.addrP.add(PersonalPI.addr);
		PersonalPI.contactP.add(PersonalPI.emailL);
		PersonalPI.contactP.add(PersonalPI.numL);
		PersonalPI.contactP.add(PersonalPI.email);
		PersonalPI.contactP.add(PersonalPI.number);
		PersonalPI.birthP.add(PersonalPI.birthL);
		PersonalPI.birthP.add(PersonalPI.genL);
		PersonalPI.birthP.add(PersonalPI.raceL);
		PersonalPI.birthP.add(PersonalPI.dob);
		PersonalPI.birthP.add(PersonalPI.genC);
		PersonalPI.birthP.add(PersonalPI.raceC);
		PersonalPI.eConP.add(PersonalPI.eNameL);
		PersonalPI.eConP.add(PersonalPI.eNumL);
		PersonalPI.eConP.add(PersonalPI.eName);
		PersonalPI.eConP.add(PersonalPI.eNumber);
		PersonalPI.insInputP.add(PersonalPI.insProvL);
		PersonalPI.insInputP.add(PersonalPI.insHoldL);
		PersonalPI.insInputP.add(PersonalPI.insIDL);
		PersonalPI.insInputP.add(PersonalPI.insProv);
		PersonalPI.insInputP.add(PersonalPI.insHold);
		PersonalPI.insInputP.add(PersonalPI.insID);
		PersonalPI.insComboP.add(PersonalPI.covTypeL);
		PersonalPI.insComboP.add(PersonalPI.relL);
		PersonalPI.insComboP.add(PersonalPI.covTypeC);
		PersonalPI.insComboP.add(PersonalPI.relC);
		PersonalPI.empPA.add(PersonalPI.occL);
		PersonalPI.empPA.add(PersonalPI.empL);
		PersonalPI.empPA.add(PersonalPI.occupation);
		PersonalPI.empPA.add(PersonalPI.employer);
		PersonalPI.empPB.add(PersonalPI.empAddL);
		PersonalPI.empPB.add(PersonalPI.empNumL);
		PersonalPI.empPB.add(PersonalPI.empAdd);
		PersonalPI.empPB.add(PersonalPI.empNum);
	}
	public static void basePanel(){
		PanelIndex.baseInfo.setLayout(new GridLayout(8, 1));
		PanelIndex.radioTextA.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextB.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextC.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioTextD.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.radioYN.setLayout(new GridLayout(1, 1, 10, 5));
		PersonalPI.primCarePA.setLayout(new GridLayout(2, 2));
		PersonalPI.primCarePB.setLayout(new GridLayout(2, 1));
		PersonalPI.alP.setLayout(new GridLayout(2, 2));
		PersonalPI.medP.setLayout(new GridLayout(2, 2));
		PersonalPI.preexP.setLayout(new GridLayout(2, 2));
		PersonalPI.histP.setLayout(new GridLayout(2, 2));
		PersonalPI.prP.setLayout(new GridLayout(2, 2));
		
		PanelIndex.baseInfo.add(PersonalPI.primCarePA);
		PanelIndex.baseInfo.add(PersonalPI.primCarePB);
		PanelIndex.baseInfo.add(PersonalPI.alP);
		PanelIndex.baseInfo.add(PersonalPI.medP);
		PanelIndex.baseInfo.add(PersonalPI.preexP);
		PanelIndex.baseInfo.add(PersonalPI.histP);
		PanelIndex.baseInfo.add(PersonalPI.prP);
		
		PersonalPI.primCarePA.add(PersonalPI.pcNameL);
		PersonalPI.primCarePA.add(PersonalPI.pcNumL);
		PersonalPI.primCarePA.add(PersonalPI.pcName);
		PersonalPI.primCarePA.add(PersonalPI.pcNum);
		PersonalPI.primCarePB.add(PersonalPI.pcAddrL);
		PersonalPI.primCarePB.add(PersonalPI.pcAddr);
		PersonalPI.alP.add(PanelIndex.al);
		PersonalPI.alP.add(PersonalPI.alA);
		PersonalPI.alP.add(PanelIndex.alC);
		PersonalPI.alP.add(PanelIndex.allergies);
		PersonalPI.medP.add(PanelIndex.med);
		PersonalPI.medP.add(PersonalPI.medA);
		PersonalPI.medP.add(PanelIndex.medC);
		PersonalPI.medP.add(PanelIndex.currMed);
		PersonalPI.preexP.add(PanelIndex.preexisting);
		PersonalPI.preexP.add(PersonalPI.preexA);
		PersonalPI.preexP.add(PanelIndex.preexC);
		PersonalPI.preexP.add(PanelIndex.preex);
		PersonalPI.histP.add(PanelIndex.history);
		PersonalPI.histP.add(PersonalPI.histA);
		PersonalPI.histP.add(PanelIndex.histC);
		PersonalPI.histP.add(PanelIndex.hist);
		PersonalPI.prP.add(PanelIndex.pregnancyL);
		PersonalPI.prP.add(PanelIndex.prC);
		
		PanelIndex.baseInfo.add(PanelIndex.wrapperNext);
		PanelIndex.wrapperNext.setLayout(new GridLayout(1, 2));
		PanelIndex.wrapperNext.add(PanelIndex.next);
	}
	public static boolean checkBase(Object x){
		String alStr = PanelIndex.alC.getSelectedItem().toString();
		String preexStr = PanelIndex.preexC.getSelectedItem().toString();
		String histStr = PanelIndex.histC.getSelectedItem().toString();
		String medStr = PanelIndex.medC.getSelectedItem().toString();
		String prStr = PanelIndex.prC.getSelectedItem().toString();
		if(PersonalPI.fN.getText().equals("")||
				PersonalPI.mN.getText().equals("")||
				PersonalPI.lN.getText().equals("")||
				PersonalPI.dob.getText().equals("")||
				PersonalPI.addr.getText().equals("")||
				PersonalPI.email.getText().equals("")||
				PersonalPI.number.getText().equals("")||
				PersonalPI.eName.getText().equals("")||
				PersonalPI.eNumber.getText().equals("")||
				PersonalPI.insProv.getText().equals("")||
				PersonalPI.insID.getText().equals("")||
				alStr.equals("") || preexStr.equals("")||
				histStr.equals("")||medStr.equals("")||
				prStr.equals("")){
			//PanelIndex.baseInfo.add(PanelIndex.blankField);
			//System.out.println("checkBase");
			//GUI.counter--;
			//System.out.println(GUI.counter);
			return false;
		}
		else if(alStr.equals("Yes") && PanelIndex.allergies.getText().equals("")){
			return false;
		}
		else if(preexStr.equals("Yes") && PanelIndex.preex.getText().equals("")){
			return false;
		}
		else if(histStr.equals("Yes") && PanelIndex.hist.getText().equals("")){
			return false;
		}
		else if(medStr.equals("Yes") && PanelIndex.currMed.getText().equals("")){
			return false;
		}
		else {
			//System.out.println(PanelIndex.ynA.getSelection().getActionCommand());
			//System.out.println("true");
			return true;
		}	
	}
	
	public static void gatherBase(Object x){
		name = PanelIndex.nameI.getText();
		//age = Integer.parseInt(PanelIndex.age.getText());	
	}
	public static void switchToCat(){
		GUI.frame.remove(PanelIndex.baseInfo);
		//PanelIndex.two.remove(PanelIndex.recentInfo);
		resetPanels();
		GUI.frame.add(PanelIndex.two);
		resetPanels();
		PanelIndex.two.add(PanelIndex.question);
		PanelIndex.two.add(PanelIndex.multResponses);
		PanelIndex.multResponses.setLayout(new GridLayout(4, 1));
		//PanelIndex.question.add(PanelIndex.reasonL);
		PanelIndex.question.add(PanelIndex.reasonL);
		PanelIndex.multResponses.add(PanelIndex.pathA);
		PanelIndex.multResponses.add(PanelIndex.pathB);
		PanelIndex.multResponses.add(PanelIndex.pathC);
		PanelIndex.multResponses.add(PanelIndex.pathD);
	}
	
	public static void switchToA(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.timeL);
		PanelIndex.two.add(PanelIndex.duration);
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}
	
	public static void pathALevelTwo(){
		PanelIndex.question.remove(PanelIndex.timeL);	//remove time question
		PanelIndex.two.remove(PanelIndex.duration);
		resetPanels();
		PanelIndex.question.add(PanelIndex.locationL);
		PanelIndex.two.add(PanelIndex.locationP);
		PanelIndex.locationP.setLayout(new GridLayout(5, 2));
		PanelIndex.locationP.add(PanelIndex.head);
		PanelIndex.locationP.add(PanelIndex.neck);
		PanelIndex.locationP.add(PanelIndex.chest);
		PanelIndex.locationP.add(PanelIndex.stomach);
		PanelIndex.locationP.add(PanelIndex.arms);
		PanelIndex.locationP.add(PanelIndex.legs);
		PanelIndex.locationP.add(PanelIndex.back);
		PanelIndex.locationP.add(PanelIndex.joint);
		PanelIndex.locationP.add(PanelIndex.muscles);
		PanelIndex.locationP.add(PanelIndex.bones);
	}
	public static void pathALevelThree(){
		PanelIndex.question.remove(PanelIndex.locationL);
		PanelIndex.two.remove(PanelIndex.locationP);
		resetPanels();
		PanelIndex.two.add(PanelIndex.rateP);
		PanelIndex.question.add(PanelIndex.rateL);
		PanelIndex.rateP.setLayout(new GridLayout(4, 1));
		PanelIndex.rateP.add(PanelIndex.blankA);
		PanelIndex.rateP.add(PanelIndex.rate);
		PanelIndex.rateP.add(PanelIndex.blankB);
		PanelIndex.rateP.add(PanelIndex.nextB);
		PanelIndex.rate.setLayout(new GridLayout(1, 10, 5, 10));
		RateIndex.fillC(ArrayListIndex.pathARate);
		for(int i = 0; i < ArrayListIndex.pathARate.size(); i++) {
			PanelIndex.rate.add(ArrayListIndex.pathARate.get(i));
			PanelIndex.oneToTenA.add(ArrayListIndex.pathARate.get(i));
		}
	}
	
	public static void switchToB(){
		switchCat();
		resetPanels();
		PanelIndex.two.add(PanelIndex.duration);
		PanelIndex.question.add(PanelIndex.timeL);
		//Replace question
		PanelIndex.duration.setLayout(new GridLayout(5, 1));
		PanelIndex.duration.add(PanelIndex.lessWeek);
		PanelIndex.duration.add(PanelIndex.oneTwoWeek);
		PanelIndex.duration.add(PanelIndex.twoThreeWeek);
		PanelIndex.duration.add(PanelIndex.threeFourWeek);
		PanelIndex.duration.add(PanelIndex.moreThanMonth);
	}
	
	public static void pathBLevelTwo(){
		PanelIndex.question.remove(PanelIndex.timeL);
		PanelIndex.two.remove(PanelIndex.duration);
		resetPanels();
		PanelIndex.question.add(PanelIndex.locationL);
		PanelIndex.two.add(PanelIndex.locationP);
		//Ask where symptoms are located
	}
	
	public static void pathBLevelThree(){
		
		resetPanels();
		PanelIndex.two.add(PanelIndex.rateP);
		PanelIndex.question.add(PanelIndex.rateL);
		PanelIndex.rateP.setLayout(new GridLayout(4, 1));
		PanelIndex.rateP.add(PanelIndex.blankA);
		PanelIndex.rateP.add(PanelIndex.rate);
		PanelIndex.rateP.add(PanelIndex.blankB);
		PanelIndex.rateP.add(PanelIndex.nextB);
		PanelIndex.rate.setLayout(new GridLayout(1, 10, 5, 10));
		RateIndex.fillC(ArrayListIndex.pathBRate);
		for(int i = 0; i < ArrayListIndex.pathBRate.size(); i++) {
			PanelIndex.rate.add(ArrayListIndex.pathBRate.get(i));
			PanelIndex.oneToTenA.add(ArrayListIndex.pathBRate.get(i));
		}
	}

	public static void switchToC(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.reasonL);
		PanelIndex.two.add(PanelIndex.pathCQ);
		PanelIndex.pathCQ.setLayout(new GridLayout(1, 3));
		PanelIndex.pathCQ.add(PanelIndex.accident);
		PanelIndex.pathCQ.add(PanelIndex.cuts);
		PanelIndex.pathCQ.add(PanelIndex.pregnancy);
		//Add responses	
	}
	
	public static void pathCLevelTwo(){
		PanelIndex.question.remove(PanelIndex.reasonL);
		PanelIndex.two.remove(PanelIndex.pathCQ);
		resetPanels();
		PanelIndex.question.add(PanelIndex.locationL);
		PanelIndex.two.add(PanelIndex.locationP);
	}
	
	public static void pathCLevelThree(){
		PanelIndex.question.remove(PanelIndex.locationL);
		resetPanels();
		//Swap picture
		//Add rate
		PanelIndex.question.add(PanelIndex.rateL);
		PanelIndex.rate.setLayout(new GridLayout(10, 1, 5, 10));
		RateIndex.fillC(ArrayListIndex.pathCRate);
		for(int i = 0; i < ArrayListIndex.pathCRate.size(); i++) {
			PanelIndex.rate.add(ArrayListIndex.pathCRate.get(i));
			PanelIndex.oneToTenC.add(ArrayListIndex.pathCRate.get(i));
		}
		//Scale of 1-10
	}
	public static void switchToD(){
		switchCat();
		resetPanels();
		PanelIndex.question.add(PanelIndex.wotDoL);
		PanelIndex.two.add(PanelIndex.pathDQ);
		PanelIndex.pathDQ.setLayout(new GridLayout(2, 2));
		
		//Add responses
	}
	
	public static void pathDLevelTwo(){
		PanelIndex.question.remove(PanelIndex.wotDoL);
		PanelIndex.two.remove(PanelIndex.pathDQ);
		resetPanels();
		//Man what did you do
	}
	public static void pathDLevelThree(){
		resetPanels();
		PanelIndex.question.add(PanelIndex.timeL);
		PanelIndex.two.add(PanelIndex.duration);
		PanelIndex.duration.setLayout(new GridLayout(1, 4));
		//Duration
	}
	public void transferInfo(){
		UserInfo.name = name;
		UserInfo.gender = gender;
		
	}
	public static void resetPanels() {
		GUI.frame.revalidate();
		GUI.frame.repaint();
		PanelIndex.two.revalidate();
		PanelIndex.two.repaint();
	}
	
	public static void switchCat(){
		PanelIndex.question.remove(PanelIndex.reasonL);
		PanelIndex.two.remove(PanelIndex.multResponses);
	}
	public static void endScreen(){
		GUI.frame.remove(PanelIndex.two);
		GUI.frame.add(PanelIndex.endTwo);
		resetPanels();
		PanelIndex.endTwo.setLayout(new GridLayout(2, 1));
		PanelIndex.endTwo.add(PanelIndex.endP);
		PanelIndex.endP.add(PanelIndex.endL);
		PanelIndex.endTwo.setBackground(PanelIndex.blueA);
	}
	public static void loopThrough(){
		while(!selected){
			
		}
	}
	public static void getRec(){
		
	}
}