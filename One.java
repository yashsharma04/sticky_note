import java.io.* ;
import java.awt.*;
import java.awt.event.*;
class One extends Exception implements WindowListener
{

		Console con =System.console();
		Frame f ;
		TextArea ta;
		String str1,str2;
		File fl =new File("name.txt");
		FileOutputStream fos;
		FileInputStream fis;
		public One()
		{
				f =new Frame();
				f.setSize(300,300);
				f.addWindowListener(this);
				f.setTitle("StiCkY noTe");

				//f.setBackgroundColor(Color.Red);
				ta = new TextArea();
				ta.setBackground(Color.CYAN);
				ta.setFont(new Font("Serif",Font.ITALIC,16));
				f.add(ta);
				open();
				f.setVisible(true);

		}
		public void func()
		{	
			if(ta.getText()==null)
			{
				
			}
			else 
			{
					try
					{

						fos=new FileOutputStream(fl);
						str1=ta.getText();
						int j=0;
						int ch;
						while(j<str1.length())
						{
							ch=str1.charAt(j);
							fos.write((char)ch);
							j++;
						}
						fos.close();
						str2=ta.getText();
					}
					catch (Exception e1)
					{

					}
			}
		}
		public void open()
		{
				int ch;
				try
				{
					fis = new FileInputStream(fl);
					while((ch=fis.read())!=-1)
					{
						//fos.write((char)ch);
						ta.appendText(Character.toString((char)ch));
					}
				}
				catch(Exception e) 
				{

				}
		}


		public static void main (String args[])
		{
			One o = new One();
			

		}

		public void windowClosing(WindowEvent e)
		{
			Window w = e.getWindow();
			func();
			w.setVisible(false);
			w.dispose();
			System.exit(1);
		
		}
		public void windowDeactivated(WindowEvent e)
		{
		}
		
		public void windowActivated(WindowEvent e)
		{
		}
		public void windowDeiconified(WindowEvent e)
		{
		}
		public void windowIconified(WindowEvent e)
		{
		}
		public void windowClosed(WindowEvent e)
		{
		}
		public void windowOpened(WindowEvent e)
		{	
		}



}