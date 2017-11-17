package Lab12_2;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class MembershipDemo extends JFrame {

	// ********************************
	// ATTRIBUTE
	// ********************************


	private int gloablNum;
	private listPanel listPanel;
	private InputPanel inputPanel;
	private SummaryPanel summaryPanel;
	private ButtonPanel buttonPanel;
	private memberData memberData;
	private MenuPanel menubar;
	private toolBarPanel toolBar;

	public MembershipDemo() {
		this.listPanel = new listPanel();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setTitle("Membership");
		this.inputPanel = new InputPanel();
		this.summaryPanel = new SummaryPanel();
		this.buttonPanel = new ButtonPanel();
		this.memberData = new memberData();
		this.menubar = new MenuPanel();
		this.toolBar = new toolBarPanel();
		
		this.add(inputPanel, "Center");
		this.add(summaryPanel, "East");
		this.add(buttonPanel, "South");
		this.add(listPanel, "West");
		this.setJMenuBar(menubar);
		this.add(toolBar, "North");
		
		this.toolBar.getClose().setEnabled(false);
		
		pack();

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		this.setLocation(x, y);

		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error setting the look and feel.");
			System.exit(0);
		}
		
		this.setResizable(false);
		

		// test if read ok
//		if (!memberData.readFile()) {
//			JOptionPane.showMessageDialog(null, "Problem reading the file");
//			System.exit(0);
//		}

//		this.listPanel.getMemberList().setListData(memberData.getMembers().toArray());
		
		this.updateSummary();
		summaryPanel.getLabelOldest().setVisible(false);
		summaryPanel.getTfOldest().setVisible(false);
		summaryPanel.getLabelTotal().setVisible(false);
		summaryPanel.getTfTotal().setVisible(false);
		summaryPanel.getLabelTopState().setVisible(false);
    	summaryPanel.getTfTopState().setVisible(false);
		setVisible(true);

		
		this.buttonPanel.getAddButton().addActionListener(new AddButtonListener());
		this.buttonPanel.getCancelButton().addActionListener(new CancelButtonListener());
		this.listPanel.getMemberList().addListSelectionListener(new MemberSelectionListener());
		this.buttonPanel.getUpdateButton().addActionListener(new UpdateButtonListener());
		this.toolBar.getOpenFile().addActionListener(new OpenFileListener());
		this.toolBar.getClose().addActionListener(new CloseFileListener());
		this.menubar.getExit().addActionListener(new ExitListener());
		this.buttonPanel.getDeleteButton().addActionListener(new DeleteListener());
		
		this.menubar.getTotMem().addItemListener(new TotMemListener());
		this.menubar.getOldMem().addItemListener(new OldMemListener());
		this.menubar.getNewMem().addItemListener(new NewMemListener());
		this.menubar.getTopSt().addItemListener(new TopStListener());
		this.menubar.getListState().addItemListener(new ListStateListener());

		
	} // end of constructor

	// ********************************
	// METHODS
	// ********************************
	
	public static void main(String[] args) {
		new MembershipDemo();
	}
	

	public void updateSummary() {
		this.summaryPanel.getTfTotal().setText(String.valueOf(memberData.getTotalMembers()));
		this.summaryPanel.getTfOldest().setText(memberData.getOldestMember().getName());
		this.summaryPanel.getLabelOldest().setVisible(false);
		this.summaryPanel.getTfOldest().setVisible(false);
		this.summaryPanel.getLabelTotal().setVisible(false);
		this.summaryPanel.getTfTotal().setVisible(false);
		this.summaryPanel.getLabelTopState().setVisible(false);
		this.summaryPanel.getTfTopState().setVisible(false);
		
		
	}

	public void loadMember(int num){
		if (num>=0){
			Membership member = memberData.getMembers().get(num);
			
			SimpleDateFormat sdf = new SimpleDateFormat("M/d/Y");
			
			
			this.inputPanel.getTfId().setText(member.getId());
			this.inputPanel.getTfName().setText(member.getName());
			this.inputPanel.getTfCompany().setText((member.getCompany()));
			this.inputPanel.getTfDOB().setText((sdf.format(member.getDob().getTime())));
			this.inputPanel.getTfEmail().setText(member.getEmail());
			this.inputPanel.getTfMembershipDate().setText((sdf.format(member.getMembershipDate().getTime())));
			this.inputPanel.getTfPhone().setText(member.getPhone());
			this.inputPanel.getCbState().setSelectedItem(member.getState());
		}
	}

	

	// ********************************
	// INNER CLASSES
	// ********************************
	
	private class CloseFileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			inputPanel.clearForm();

			memberData.getMembers().clear();
			
			listPanel.getMemberList().setListData(memberData.getMembers().toArray());
			updateSummary();
			toolBar.getClose().setEnabled(false);
			toolBar.getOpenFile().setEnabled(true);
			//Clear from summary list, and clear the JList
		}
		
	}
	
	private class OpenFileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if (!memberData.readFile()) {
				JOptionPane.showMessageDialog(null, "Problem reading the file");
				System.exit(0);
			}
			listPanel.getMemberList().setListData(memberData.getMembers().toArray());
			updateSummary();
			toolBar.getOpenFile().setEnabled(false);
			toolBar.getClose().setEnabled(true);
		}
		
	}
	
	private class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			
		}
		
	}

	private class AddButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// extract ID from the form
			String id = inputPanel.getTfId().getText();

			// check if id is empty
			if (id.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Invalid ID!");
			}
			// check if id already exists
			else if (memberData.idExists(id)) {
				JOptionPane.showMessageDialog(null, "ID already exist!");
				// continue creating new member
			} else {

				// extract remaining information from the form
				String name = inputPanel.getTfName().getText();
				String phone = inputPanel.getTfPhone().getText();
				String state = (String) inputPanel.getCbState().getSelectedItem();
				String company = inputPanel.getTfCompany().getText();
				String dob = inputPanel.getTfDOB().getText();
				String membershipDate = inputPanel.getTfMembershipDate().getText();
				String email = inputPanel.getTfEmail().getText();

				// create instance of member
				Membership tempMember = new Membership();
				
				// set member information
				tempMember.setId(id);
				tempMember.setName(name);
				tempMember.setPhone(phone);
				tempMember.setState(state);
				tempMember.setCompany(company);
				
				String[] DOBdate = dob.split("/");
				Calendar memberDOB = Calendar.getInstance();
				memberDOB.set(Integer.parseInt(DOBdate[2]), Integer.parseInt(DOBdate[0])-1, Integer.parseInt(DOBdate[1]));
				
				tempMember.setDob(memberDOB);
				
				String[] MEMBERdate = membershipDate.split("/");
				Calendar memberDate = Calendar.getInstance();
				memberDate.set(Integer.parseInt(MEMBERdate[2]), Integer.parseInt(MEMBERdate[0])-1, Integer.parseInt(MEMBERdate[1]));
				
				tempMember.setMembershipDate(memberDate);

				tempMember.setEmail(email);

				// update the list of members with the new member
				memberData.getMembers().add(tempMember);

				// print the new member to the file
				memberData.printToFile(tempMember);

				// clear form
				inputPanel.clearForm();
				
				updateSummary();
			}
		}

	} // end of inner class AddButtonListener

	private class CancelButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}

	} // end of inner class CancelButtonListener

	private class MemberSelectionListener implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			if (!arg0.getValueIsAdjusting()){
				gloablNum = listPanel.getMemberList().getSelectedIndex();
				int num = listPanel.getMemberList().getSelectedIndex();
				loadMember(num);
				inputPanel.setIDNotEditable();
				buttonPanel.setUpdateButtonsVisible();
			}
		}
	}

	private class UpdateButtonListener implements ActionListener{

		@SuppressWarnings("unchecked")
		@Override
		public void actionPerformed(ActionEvent arg0) {
			buttonPanel.setAddButtonsVisible();
			inputPanel.setIDEditable();
			
			String id = inputPanel.getTfId().getText();
			String name = inputPanel.getTfName().getText();
			String phone = inputPanel.getTfPhone().getText();
			String state = (String) inputPanel.getCbState().getSelectedItem();
			String company = inputPanel.getTfCompany().getText();
			String dob = inputPanel.getTfDOB().getText();
			String membershipDate = inputPanel.getTfMembershipDate().getText();
			String email = inputPanel.getTfEmail().getText();
			
			Membership tempMember = new Membership();
			
			tempMember.setId(id);
			tempMember.setName(name);
			tempMember.setPhone(phone);
			tempMember.setState(state);
			tempMember.setCompany(company);
			
			String[] DOBdate = dob.split("/");
			Calendar memberDOB = Calendar.getInstance();
			memberDOB.set(Integer.parseInt(DOBdate[2]), Integer.parseInt(DOBdate[0])-1, Integer.parseInt(DOBdate[1]));
			
			tempMember.setDob(memberDOB);
			
			String[] MEMBERdate = membershipDate.split("/");
			Calendar memberDate = Calendar.getInstance();
			memberDate.set(Integer.parseInt(MEMBERdate[2]), Integer.parseInt(MEMBERdate[0])-1, Integer.parseInt(MEMBERdate[1]));
			
			tempMember.setMembershipDate(memberDate);

			tempMember.setEmail(email);
			
			memberData.getMembers().remove(gloablNum);
			memberData.getMembers().add(tempMember);
			gloablNum = 0;

			memberData.printToFile(tempMember);

			inputPanel.clearForm();
			
			listPanel.getMemberList().setListData(memberData.getMembers().toArray());
			updateSummary();
	}
	}

	
	private class DeleteListener implements ActionListener {

		@SuppressWarnings("unchecked")
		@Override
		public void actionPerformed(ActionEvent arg0) {
			memberData.getMembers().remove(gloablNum);
			listPanel.getMemberList().setListData(memberData.getMembers().toArray());
			updateSummary();
		}
	}

	private class TotMemListener implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			
			summaryPanel.getLabelTotal().setVisible(true);
			summaryPanel.getTfTotal().setVisible(true);

		} else {
			summaryPanel.getLabelTotal().setVisible(false);
			summaryPanel.getTfTotal().setVisible(false);
		}

	}
}

	private class OldMemListener implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			summaryPanel.getLabelOldest().setVisible(true);
			summaryPanel.getTfOldest().setVisible(true);

		} else {
			summaryPanel.getLabelOldest().setVisible(false);
			summaryPanel.getTfOldest().setVisible(false);
		}

	}
}

	private class NewMemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getStateChange() == ItemEvent.SELECTED) {

				setVisible(true);

			} else {
				setVisible(false);
			}
		}
	}

	private class  TopStListener implements ItemListener {
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		 if (e.getStateChange() == ItemEvent.SELECTED) {
			 summaryPanel.getLabelTopState().setVisible(true);
		      summaryPanel.getTfTopState().setVisible(true);
		      
		    } else {
		    	summaryPanel.getLabelTopState().setVisible(false);
		    	summaryPanel.getTfTopState().setVisible(false);
		    }
		
}
}
	private class  ListStateListener implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		 if (e.getStateChange() == ItemEvent.SELECTED) {
			 setVisible(true);
		      
		    } else {
		      setVisible(false);
		    } 
		
	}
}

	}
 // end of class
