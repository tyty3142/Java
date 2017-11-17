import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class LibDemo extends JFrame{
	private ButtonPanel buttonPanel;
	private MenuBar menuBar;
	private SummaryPanel summaryPanel;

	public LibDemo(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		buttonPanel = new ButtonPanel();
		menuBar = new MenuBar();
		summaryPanel = new SummaryPanel();
		
		setJMenuBar(menuBar);
		add(buttonPanel, "South");
		add(summaryPanel, "East");
		
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
		summaryPanel.getChapters().setVisible(false);
		summaryPanel.getTfChapters().setVisible(false);

		summaryPanel.getPages().setVisible(false);
		summaryPanel.getTfPages().setVisible(false);
		


		setVisible(true);
		
//		this.menuBar.getTotChap().addItemListener(new TotChapListener());
//		this.menuBar.getTotPage().addItemListener(new TotPageListener());
	}
	
	public static void main(String[] args){
		new LibDemo();
	}
	private class TotChapListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getStateChange() == ItemEvent.SELECTED) {
				
				summaryPanel.getChapters().setVisible(true);
				summaryPanel.getTfChapters().setVisible(true);

			} else {
				summaryPanel.getChapters().setVisible(false);
				summaryPanel.getTfChapters().setVisible(false);
			}

		}
	}
}

