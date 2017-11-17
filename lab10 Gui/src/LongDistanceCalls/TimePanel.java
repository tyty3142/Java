package LongDistanceCalls;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TimePanel extends JPanel {

	private JSlider slider;
	private JTextField text;

	private JPanel BottomPanel;
	private JPanel TopPanel;

	public TimePanel() {
		setBorder(BorderFactory.createTitledBorder("Time of Call"));

		setLayout(new GridLayout(2, 1));

		slider = new JSlider();
		this.slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 40);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(10);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);

		text = new JTextField(15);
		text.setEditable(false);

		slider.addChangeListener(new SliderChange());

		TopPanel = new JPanel();
		TopPanel.add(slider, "North");

		BottomPanel = new JPanel();
		BottomPanel.add(text, "South");

		this.add(TopPanel);
		this.add(BottomPanel);

	}

	public JSlider getSlider() {
		return slider;
	}

	public JTextField Text() {
		return text;
	}

	public JTextField setText(JTextField text) {
		return this.text = text;
	}

	private class SliderChange implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
			String dtext = Integer.toString(slider.getValue());
			text.setText(dtext + " minutes");
		}
	}
}
