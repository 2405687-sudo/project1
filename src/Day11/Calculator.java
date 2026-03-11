package Day11;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{
    TextField display;
    String num="", op="";
    double n1,n2,res;

    Calculator()
    {
        setTitle("Calculator");
        setSize(320,260);
        setLayout(new BorderLayout());
        setBackground(Color.cyan);

        Panel top = new Panel(new BorderLayout());

        Label title = new Label("CALCULATOR");
        display = new TextField(" ");

        top.add(title,BorderLayout.WEST);
        top.add(display,BorderLayout.CENTER);

        add(top,BorderLayout.NORTH);

        Panel buttons = new Panel();
        buttons.setLayout(new GridLayout(4,4,2,2));

        String b[]={
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "/","0","%","="
        };

        for(String s:b)
        {
            Button bt=new Button(s);
            bt.addActionListener(this);
            buttons.add(bt);
        }

        add(buttons,BorderLayout.CENTER);

        Panel bottom=new Panel();
        Button off=new Button("OFF");
        off.addActionListener(this);
        bottom.add(off);

        add(bottom,BorderLayout.SOUTH);

        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();

        if(s.matches("[0-9]"))
        {
            num=num+s;
            display.setText(num);
        }
        else if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("%"))
        {
            n1=Double.parseDouble(num);
            op=s;
            num="";
        }
        else if(s.equals("="))
        {
            n2=Double.parseDouble(num);

            if(op.equals("+")) res=n1+n2;
            if(op.equals("-")) res=n1-n2;
            if(op.equals("*")) res=n1*n2;
            if(op.equals("/")) res=n1/n2;
            if(op.equals("%")) res=n1%n2;

            display.setText(""+res);
            num=""+res;
        }
        else if(s.equals("OFF"))
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        new Calculator();
    }
}