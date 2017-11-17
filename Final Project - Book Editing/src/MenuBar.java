import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuBar extends JMenuBar{

	private JMenu file;
	private JMenu summary;
	
	private JCheckBoxMenuItem totChap;
	private JCheckBoxMenuItem totPage;
	private JMenuItem update;
	private JMenuItem insert;
	private JMenuItem delete;
	
	private JMenuItem exit;	
	
	public MenuBar(){
		file = new JMenu("File");
		file.setMnemonic('F');
		
		summary = new JMenu("Summary");
		summary.setMnemonic('S');
		
		totChap = new JCheckBoxMenuItem("Total Chapters");
		totChap.setMnemonic('C');
		
		totPage = new JCheckBoxMenuItem("Total Page");
		totPage.setMnemonic('P');
		
		update = new JMenuItem("Update");
		update.setMnemonic('U');
		
		insert= new JMenuItem("Insert");
		insert.setMnemonic('I');
		
		delete= new JMenuItem("Delete");
		delete.setMnemonic('D');
		
		exit = new JMenuItem("Exit");
		exit.setMnemonic('E');
		
		summary.add(totChap);
		summary.add(totPage);
		
		file.add(update);
		file.add(insert);
		file.add(delete);
		file.add(exit);
		
		this.add(file);
		this.add(summary);
	}

	public JMenu getFile() {
		return file;
	}

	public void setFile(JMenu file) {
		this.file = file;
	}

	public JMenu getSummary() {
		return summary;
	}

	public void setSummary(JMenu summary) {
		this.summary = summary;
	}

	public JCheckBoxMenuItem getTotChap() {
		return totChap;
	}

	public void setTotChap(JCheckBoxMenuItem totChap) {
		this.totChap = totChap;
	}

	public JCheckBoxMenuItem getTotPage() {
		return totPage;
	}

	public void setTotPage(JCheckBoxMenuItem totPage) {
		this.totPage = totPage;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}
	
}
