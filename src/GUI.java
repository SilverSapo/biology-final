import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import index.*;

public class GUI {
	public static JFrame frame;
	public static int counter;
	
	public GUI() {
		counter = 0;
		//Set frames
		frame = new JFrame("Final project"); //Rename
		frame.setSize(800, 600);
		frame.setLayout(new GridLayout(1, 2, 10, 5));
		//Add panels
		//frame.add(PanelIndex.test);
		frame.add(PanelIndex.baseInfo);
		//frame.add(PanelIndex.two);
		frame.add(PanelIndex.progress);
		PanelIndex.progress.add(PanelIndex.backL);
		PanelIndex.two.setLayout(new GridLayout(2, 1));
		//PanelIndex.two.add(PanelIndex.baseInfo);
		//PanelIndex.two.add(PanelIndex.recentInfo);
		PanelIndex.baseInfo.setLayout(new GridLayout(9, 2));
		//PanelIndex.recentInfo.setLayout(new GridLayout(6, 2, 10, 5));
		PanelIndex.radioTextA.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextB.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextC.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioTextD.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioYN.setLayout(new GridLayout(3, 1, 10, 5));
		PanelIndex.radioG.setLayout(new GridLayout(2, 1, 10, 5));
		PanelIndex.wrapperName.setLayout(new FlowLayout());
		//BaseInfo adding stuff
		PanelIndex.baseInfo.add(PanelIndex.nameL);
		PanelIndex.baseInfo.add(PanelIndex.nameI);
		PanelIndex.baseInfo.add(PanelIndex.wrapperG);	//wrapper
		PanelIndex.baseInfo.add(PanelIndex.radioG);
		PanelIndex.baseInfo.add(PanelIndex.ageL);
		PanelIndex.baseInfo.add(PanelIndex.age);
		PanelIndex.baseInfo.add(PanelIndex.wrapperP);	//wrapper
		PanelIndex.baseInfo.add(PanelIndex.radioYN);
		PanelIndex.wrapperG.add(PanelIndex.genderL);
		PanelIndex.wrapperP.add(PanelIndex.pregnancyL);
		//Setting borders
		PanelIndex.nameI.setBorder(new LineBorder(Color.black, 1));
		PanelIndex.radioG.setBorder(BorderFactory.createLineBorder(Color.black));
		//Setting colors
		PanelIndex.baseInfo.setBackground(PanelIndex.blueA);
		PanelIndex.wrapperG.setBackground(PanelIndex.blueB);
		PanelIndex.wrapperP.setBackground(PanelIndex.blueB);
		//RecentInfo adding stuff
		PanelIndex.baseInfo.add(PanelIndex.preexisting);
		PanelIndex.baseInfo.add(PanelIndex.radioTextA);
		PanelIndex.baseInfo.add(PanelIndex.wrapperHist);	//wrapper
		PanelIndex.baseInfo.add(PanelIndex.radioTextB);
		PanelIndex.baseInfo.add(PanelIndex.med);
		PanelIndex.baseInfo.add(PanelIndex.currMed);
		PanelIndex.baseInfo.add(PanelIndex.radioTextC);
		PanelIndex.baseInfo.add(PanelIndex.wrapperAl);		//wrapper
		PanelIndex.baseInfo.add(PanelIndex.radioTextD);
		PanelIndex.baseInfo.add(PanelIndex.wrapperNext);
		PanelIndex.wrapperHist.add(PanelIndex.history);
		PanelIndex.wrapperAl.add(PanelIndex.al);
		PanelIndex.wrapperNext.add(PanelIndex.next);
		PanelIndex.wrapperNext.setMaximumSize(new Dimension(680, 20));
		PanelIndex.next.setPreferredSize(new Dimension(300, 60));
		PanelIndex.wrapperNext.setBackground(PanelIndex.blueA);
		PanelIndex.wrapperHist.setBackground(PanelIndex.blueB);
		PanelIndex.wrapperAl.setBackground(PanelIndex.blueB);
		/*PanelIndex.radioG.setBackground(PanelIndex.blueB);
		PanelIndex.radioYN.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextB.setBackground(PanelIndex.blueB);
		PanelIndex.radioTextD.setBackground(PanelIndex.blueB);*/
		//RadioText adding stuff
		PanelIndex.radioTextA.add(PanelIndex.yesA);
		PanelIndex.radioTextA.add(PanelIndex.noA);
		PanelIndex.ynA.add(PanelIndex.yesA);
		PanelIndex.ynA.add(PanelIndex.noA);
		PanelIndex.yesA.setActionCommand("yes");
		PanelIndex.noA.setActionCommand("no");
		PanelIndex.radioTextA.add(PanelIndex.preex);
		
		PanelIndex.radioTextB.add(PanelIndex.yesB);
		PanelIndex.radioTextB.add(PanelIndex.noB);
		PanelIndex.ynB.add(PanelIndex.yesB);
		PanelIndex.ynB.add(PanelIndex.noB);
		PanelIndex.radioTextB.add(PanelIndex.hist);
		PanelIndex.radioYN.add(PanelIndex.yesP);
		PanelIndex.radioYN.add(PanelIndex.noP);
		PanelIndex.radioYN.add(PanelIndex.idk);
		PanelIndex.ynP.add(PanelIndex.yesP);
		PanelIndex.ynP.add(PanelIndex.noP);
		PanelIndex.ynP.add(PanelIndex.idk);
		PanelIndex.radioG.add(PanelIndex.male);
		PanelIndex.radioG.add(PanelIndex.female);
		PanelIndex.genderB.add(PanelIndex.male);
		PanelIndex.genderB.add(PanelIndex.female);
		PanelIndex.radioTextC.add(PanelIndex.yesC);
		PanelIndex.radioTextC.add(PanelIndex.noC);
		PanelIndex.radioTextC.add(PanelIndex.currMed);
		PanelIndex.radioTextD.add(PanelIndex.yesAl);
		PanelIndex.radioTextD.add(PanelIndex.noAl);
		PanelIndex.radioTextD.add(PanelIndex.allergies);
		//Set ActionCommands
		PanelIndex.yesA.setActionCommand("Yes");
		PanelIndex.noA.setActionCommand("No");
		PanelIndex.yesB.setActionCommand("Yes");
		PanelIndex.noB.setActionCommand("No");
		PanelIndex.yesP.setActionCommand("Yes");
		PanelIndex.noP.setActionCommand("No");
		PanelIndex.idk.setActionCommand("I don't know");
		PanelIndex.male.setActionCommand("Male");
		PanelIndex.female.setActionCommand("Female");
		//PanelIndex.two.add(PanelIndex.st);
		//PanelIndex.two.add(PanelIndex.a);
		//Add labels and buttons and such
		
		/*PanelIndex.test.add(PanelIndex.tests);
		PanelIndex.st.add(PanelIndex.fr);
		PanelIndex.a.add(PanelIndex.levelA);
		PanelIndex.a.add(PanelIndex.pot);*/
		
		//Add listeners
		PanelIndex.levelA.addActionListener(new Listener());
		PanelIndex.levelB.addActionListener(new Listener());
		PanelIndex.next.addActionListener(new Listener());
		PanelIndex.pathA.addActionListener(new Listener());
		PanelIndex.pathB.addActionListener(new Listener());
		PanelIndex.pathC.addActionListener(new Listener());
		PanelIndex.pathD.addActionListener(new Listener());
		PanelIndex.lessWeek.addActionListener(new Listener());
		PanelIndex.oneTwoWeek.addActionListener(new Listener());
		PanelIndex.twoThreeWeek.addActionListener(new Listener());
		PanelIndex.threeFourWeek.addActionListener(new Listener());
		PanelIndex.moreThanMonth.addActionListener(new Listener());
		PanelIndex.head.addActionListener(new Listener());
		PanelIndex.neck.addActionListener(new Listener());
		PanelIndex.chest.addActionListener(new Listener());
		PanelIndex.stomach.addActionListener(new Listener());
		PanelIndex.arms.addActionListener(new Listener());
		PanelIndex.legs.addActionListener(new Listener());
		PanelIndex.back.addActionListener(new Listener());
		PanelIndex.joint.addActionListener(new Listener());
		PanelIndex.muscles.addActionListener(new Listener());
		PanelIndex.bones.addActionListener(new Listener());
		PanelIndex.nextB.addActionListener(new Listener());
		//Set visible
		frame.setVisible(true);
		
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//Remove, revalidate, repaint, add
			Object x = e.getSource();
			if(x == PanelIndex.next){
				if(Processing.checkBase(x)){
					counter++;
					Processing.gatherBase(x);
					Processing.switchToCat();
					FileWriter.writeFile();
				}
				else{
					PanelIndex.baseInfo.add(PanelIndex.blankField);
					PanelIndex.baseInfo.revalidate();
					PanelIndex.baseInfo.repaint();
				}
				/*System.out.println(counter);
				PanelIndex.recentInfo.add(PanelIndex.blankField);
				PanelIndex.recentInfo.revalidate();
				PanelIndex.recentInfo.repaint();
				Processing.checkBase(x);
				System.out.println("finish");*/
			}
			else if(x == PanelIndex.pathA){
				Processing.switchToA();
				Processing.reason = "Pain";
			}
			else if(x == PanelIndex.pathB){
				Processing.switchToB();
				Processing.reason = "Illness";
			}
			else if(x == PanelIndex.pathC){
				Processing.switchToC();
				Processing.reason = "Accident";
			}
			else if(x == PanelIndex.pathD){
				Processing.switchToD();
				Processing.reason = "Other";
			}
			else if(x == PanelIndex.lessWeek || x == PanelIndex.oneTwoWeek ||
					x == PanelIndex.twoThreeWeek || x == PanelIndex.threeFourWeek ||
					x == PanelIndex.moreThanMonth){
				Processing.pathALevelTwo();
				Processing.duration = ((JButton)x).getName();
				System.out.println(((JButton)x).getName());
			}
			else if(x == PanelIndex.head || x == PanelIndex.neck ||
					x == PanelIndex.chest || x == PanelIndex.stomach ||
					x == PanelIndex.arms || x == PanelIndex.legs ||
					x == PanelIndex.back || x == PanelIndex.joint ||
					x == PanelIndex.muscles || x == PanelIndex.bones) {
				Processing.pathALevelThree();
			}
			else if(x == PanelIndex.nextB) {
				Processing.endScreen();
			}
			String result = "";
			 		
		}
		
	}
	
}