package Lab12_2;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPanel  extends JMenuBar{

	private JMenu file;
	private JMenu settings;
	private JMenu summary;
	private JMenu view;
	
	private JMenuItem totMem;
	private JMenuItem oldMem;
	private JMenuItem newMem;
	private JMenuItem topSt;
	private JMenuItem listState;
	private JMenuItem exit;
	
	public MenuPanel(){
		file = new JMenu("File");
		file.setMnemonic('F');
		
		settings = new JMenu("Settings");
		settings.setMnemonic('S');
		
		summary = new JMenu("Summary");
		summary.setMnemonic('U');
		
		view = new JMenu("View");
		view.setMnemonic('V');
		
		totMem = new JMenuItem("Total Members");
		totMem.setMnemonic('T');
		
		oldMem = new JMenuItem("Oldest Member");
		oldMem.setMnemonic('O');
		
		newMem = new JMenuItem("New Member");
		newMem.setMnemonic('N');
		
		topSt = new JMenuItem("Top State");
		topSt.setMnemonic('P');
		
		listState = new JMenuItem("List State");
		listState.setMnemonic('L');
		
		exit = new JMenuItem("Exit");
		exit.setMnemonic('E');
		
		
		summary.add(totMem);
		summary.add(oldMem);
		summary.add(newMem);
		summary.add(topSt);
		summary.add(listState);
		
		file.add(exit);
		this.add(file);
		this.add(settings);
		this.add(summary);
		this.add(view);
	}

	public JMenu getFile() {
		return file;
	}

	public void setFile(JMenu file) {
		this.file = file;
	}

	public JMenu getSettings() {
		return settings;
	}

	public void setSettings(JMenu settings) {
		this.settings = settings;
	}

	public JMenu getSummary() {
		return summary;
	}

	public void setSummary(JMenu summary) {
		this.summary = summary;
	}

	public JMenu getView() {
		return view;
	}

	public void setView(JMenu view) {
		this.view = view;
	}

	public JMenuItem getTotMem() {
		return totMem;
	}

	public void setTotMem(JMenuItem totMem) {
		this.totMem = totMem;
	}

	public JMenuItem getOldMem() {
		return oldMem;
	}

	public void setOldMem(JMenuItem oldMem) {
		this.oldMem = oldMem;
	}

	public JMenuItem getNewMem() {
		return newMem;
	}

	public void setNewMem(JMenuItem newMem) {
		this.newMem = newMem;
	}

	public JMenuItem getTopSt() {
		return topSt;
	}

	public void setTopSt(JMenuItem topSt) {
		this.topSt = topSt;
	}

	public JMenuItem getListState() {
		return listState;
	}

	public void setListState(JMenuItem listState) {
		this.listState = listState;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
	
	
	
}
