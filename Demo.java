import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 class GUI
{
    private JTextArea Chatarea= new JTextArea();
    private JTextField Chatbox= new JTextField();
    
    public GUI()
    {
        JFrame frame=new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chatbot");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(700,600);
        frame.add(Chatarea);
        frame.add(Chatbox);
        
        
        Chatarea.setSize(578,450);
        Chatarea.setLocation(2,2);
        
        
        Chatbox.setSize(580,30);
        Chatbox.setLocation(2,500);
        
        
        Chatarea.append("HELLO I am a chatbot and i might answer to your question\n");
        Chatarea.append(" i was created by the students of raghunathpur Goverment Polytecnic\n");
        Chatarea.append(" whose name's are Shankadeep, Biswarup, Arbaz,Mukesh,soumen and Aditya\n\n\n");
        Chatarea.append("WRITE SOME THING IN THE BOTTOM TO TALK WITH ME\n\n");
        Chatbox.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent arg0)
          {
            String gtext=Chatbox.getText();
            Chatarea.append("you ->"+ gtext+"\n");
            Chatbox.setText("");
            
            if(gtext.equalsIgnoreCase("hi"))
            {
                bot("Hi how can i help you");
            }
            else
            {
                bot("SORRY i have not understand you....");
            }
          }
        });
    }
    private void bot(String string)
    {
        Chatarea.append("BOT ->"+string+"\n\n");
        
    }
    public static void main(String[] args)
    {
        new GUI();
    }
}