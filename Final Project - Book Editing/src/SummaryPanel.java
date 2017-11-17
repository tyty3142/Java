import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SummaryPanel extends JPanel {

	private JLabel Chapters;
	private JLabel Pages;
	private JTextField tfChapters;
	private JTextField tfPages;
	
	public SummaryPanel(){
		setLayout(new GridLayout(6,1));
		
		Chapters = new JLabel("Total Chapters");
		tfChapters = new JTextField(30);
		tfChapters.setEditable(false);
		tfChapters.setVisible(false);
		Chapters.setVisible(false);
		
		
		Pages = new JLabel("Total Pages");
		tfPages = new JTextField();
		tfPages.setEditable(false);
		tfPages.setVisible(false);
		Pages.setVisible(false);
		
		this.add(Chapters);
		this.add(tfChapters);
		this.add(Pages);
		this.add(tfPages);
		
	}

	/**
	 * @return the chapters
	 */
	public JLabel getChapters() {
		return Chapters;
	}

	/**
	 * @param chapters the chapters to set
	 */
	public void setChapters(JLabel chapters) {
		Chapters = chapters;
	}

	/**
	 * @return the pages
	 */
	public JLabel getPages() {
		return Pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(JLabel pages) {
		Pages = pages;
	}

	/**
	 * @return the tfChapters
	 */
	public JTextField getTfChapters() {
		return tfChapters;
	}

	/**
	 * @param tfChapters the tfChapters to set
	 */
	public void setTfChapters(JTextField tfChapters) {
		this.tfChapters = tfChapters;
	}

	/**
	 * @return the tfPages
	 */
	public JTextField getTfPages() {
		return tfPages;
	}

	/**
	 * @param tfPages the tfPages to set
	 */
	public void setTfPages(JTextField tfPages) {
		this.tfPages = tfPages;
	}
	public JLabel Chapters() {
		return Chapters;
	}
	public JLabel Pages(){
		return Pages;
	}
}
