import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SonarSystems extends Applet implements KeyListener, MouseListener
{
	@Override
	public void init()
	{
		addKeyListener(this);
		addMouseListener(this);
	}

	@Override
	public void start()
	{

	}

	@Override
	public void stop()
	{

	}

	@Override
	public void destroy()
	{

	}

	@Override
	public void paint(Graphics grph)
	{
		grph.drawString("I am FreeHand", 100, 67);
	}

	@Override
	public void keyPressed(KeyEvent event)
	{

	}

	@Override
	public void keyReleased(KeyEvent event)
	{

	}

	@Override
	public void keyTyped(KeyEvent event)
	{
		char ch = event.getKeyChar();

		System.out.println(ch);

		//repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		int x = e.getX();
		int y = e.getY();

		System.out.println(x + " : " + y);
	}

	@Override
	public void mousePressed(MouseEvent e)
	{

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{

	}

	@Override
	public void mouseEntered(MouseEvent e)
	{

	}

	@Override
	public void mouseExited(MouseEvent e)
	{

	}
}