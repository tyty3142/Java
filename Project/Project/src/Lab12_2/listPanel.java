package Lab12_2;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class listPanel extends JPanel{

	private JList memberList;

	public listPanel() {
		
		memberList = new JList();
		JScrollPane listScrollPane = new JScrollPane(memberList);
		
		listScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		memberList.setBorder(BorderFactory.createTitledBorder("List of Members"));
		memberList.setVisibleRowCount(30);
		memberList.setFixedCellWidth(200);
		memberList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.add(listScrollPane);
		
	}

	public JList getMemberList() {
		return memberList;
	}

	public void setMemberList(JList memberList) {
		this.memberList = memberList;
	}
	
	
	
}
