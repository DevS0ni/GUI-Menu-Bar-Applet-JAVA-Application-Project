import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code="MenuBar" height=300 width=300></applet>*/

/*class jPanel extends JPanel
{
	JTextField tx;
	jPanel()
	{
		tx=new JTextField(10);
		add(tx);
	}
}*/
public class MenuBar extends JApplet implements ActionListener
{
	JMenuBar jmb;
	JButton b;
	JPanel jpp;
	public void init()
	{
		jmb=new JMenuBar();
		jpp=new JPanel();
		
		JMenu jm=new JMenu("File");
		JMenu sub=new JMenu("Close");
		JMenu sub1=new JMenu("Website");
		JMenuItem jmi=new JMenuItem("New...");
		JMenuItem jmi1=new JMenuItem("Open...");
		JMenuItem jmi2=new JMenuItem("Exit...");
		//JMenuItem jmi3=new JMenuItem("Website");
		b=new JButton("New");
		jm.add(jmi);
		jm.add(jmi1);
		jm.addSeparator();
		sub.add("Project");
		sub1.add("Website");
		jm.add(sub);
		jm.add(sub1);
		//jm.add(jmi3);
		//jmi.add(b);
		jpp.add(b);
		
		jpp.setVisible(false);
		jmi.addActionListener(this);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		
		add(jpp);
		jmb.add(jm);
		setJMenuBar(jmb);
	}
	public void actionPerformed(ActionEvent e)
	{
		JMenuItem i=(JMenuItem)e.getSource();
		String im=i.getActionCommand();
		if(im.equals("New..."))
		{
			showStatus("You have Selected New...");
			jpp.setVisible(true);
		}
		else if(im.equals("Open..."))
		{
			showStatus("You hava Selected Open...");
			jpp.setVisible(true);
		}
	}
}