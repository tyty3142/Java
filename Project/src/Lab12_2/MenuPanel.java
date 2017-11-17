package Lab12_2;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuPanel  extends JMenuBar{

	private JMenu file;
	private JMenu settings;
	private JMenu summary;
	private JMenu view;
	
	private JCheckBoxMenuItem totMem;
	private JCheckBoxMenuItem oldMem;
	private JCheckBoxMenuItem newMem;
	private JCheckBoxMenuItem topSt;
	private JCheckBoxMenuItem listState;
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
		
		totMem = new JCheckBoxMenuItem("Total Members");
		totMem.setMnemonic('T');
		
		oldMem = new JCheckBoxMenuItem("Oldest Member");
		oldMem.setMnemonic('O');
		
		newMem = new JCheckBoxMenuItem("New Member");
		newMem.setMnemonic('N');
		
		topSt = new JCheckBoxMenuItem("Top State");
		topSt.setMnemonic('P');
		
		listState = new JCheckBoxMenuItem("List State");
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

	public void setTotMem(JCheckBoxMenuItem totMem) {
		this.totMem = totMem;
	}

	public JMenuItem getOldMem() {
		return oldMem;
	}

	public void setOldMem(JCheckBoxMenuItem oldMem) {
		this.oldMem = oldMem;
	}

	public JMenuItem getNewMem() {
		return newMem;
	}

	public void setNewMem(JCheckBoxMenuItem newMem) {
		this.newMem = newMem;
	}

	public JMenuItem getTopSt() {
		return topSt;
	}

	public void setTopSt(JCheckBoxMenuItem topSt) {
		this.topSt = topSt;
	}

	public JMenuItem getListState() {
		return listState;
	}

	public void setListState(JCheckBoxMenuItem listState) {
		this.listState = listState;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
	
	
	
}
