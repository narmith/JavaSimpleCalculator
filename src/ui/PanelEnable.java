package ui;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class PanelEnable extends JPanel implements ChangeListener {
	private static final long serialVersionUID = 1L;

	private JCheckBox toggle;
	
	public PanelEnable() { addComponents(); }
	
	private void addComponents() {
		setLayout(new FlowLayout());
		toggle=new JCheckBox("Toggle",true);
		toggle.addChangeListener(this);
		add(toggle);
		toggle.setSelected(PanelNumberBtns.ToggleBtnsState());
	}
	
	@Override
	public void stateChanged(ChangeEvent e) { PanelNumberBtns.ToggleBtns(false); }
}