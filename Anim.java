import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Anim" width="200" height="300">
</applet>*/
public class Anim extends Applet
{ int a,b,c=0,d=0;
Image backGround;
	 public void init()
	{     //setBackground(Color.blue);
		  backGround = getImage(getCodeBase(), "pic5.png");
		// setBackgroundImage(backGround);
		 addMouseListener(new MouseAdapter(){public void mouseEntered(MouseEvent e)
			                                  {a=e.getX();b=e.getY();
		                                        showStatus(" "+a+" "+b);
											  }
		 
		                                 public void mouseClicked(MouseEvent e)
			                                  {a=e.getX();b=e.getY();
		                                        showStatus(" "+a+" "+b);
											  } 
		 
		 
		 
		 });
	   addMouseMotionListener(new MouseMotionAdapter(){public void mouseDragged(MouseEvent e)
		   { if(b>e.getY())
			   {c=c+1;
	   showStatus(" "+e.getX()+" "+e.getY());}
	      else
			   {c=c-1;}
			   
		   }
	   });
	
	}
	public void paint(Graphics g)
	{//for(c=0;c<20;c)
		// g.drawImage(backGround, 0, 0,
          //    (int)getBounds().getWidth(), (int)getBounds().getHeight(), this);
		c=c-3;
		//{
		g.drawOval(50-c,100,50,50);
	 g.drawLine(74-c,150,77-c,198);
	 g.drawLine(74-c,150,98-c,168);
g.drawLine(74-c,150,47-c,168);
g.drawLine(47-c,168,48-c,133);
g.drawLine(98-c,168,73-c,172);

 //g.drawImage(backGround, 0, 0,
              //(int)getBounds().getWidth(), (int)getBounds().getHeight(), this);
if(c%2==0)
		{setBackground(Color.red);
	Color co=new Color(55,89,12);
	setForeground(co);
	g.drawLine(77-c,198,52-c,226);
g.drawLine(77-c,198,51-c,215);
g.drawLine(52-c,226,68-c,242);
g.drawLine(51-c,215,80-12-c,242-11);}
else
		{setBackground(Color.blue);
          setForeground(Color.red);
	g.drawLine(77-c,198,52-c,226);
g.drawLine(77-c,198,63-c,226);
g.drawLine(52-c,226,45-c,242);
g.drawLine(63-c,226,80-c,242);}
		try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e)
		{
		}
		//}

 repaint();
	}
}
