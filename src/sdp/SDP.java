
package sdp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SDP implements ActionListener {
private JFrame frame;
private Button btnViewIntakeTimetable, btnViewLecturerTimetable, btnLogin;
private Panel North,Center, South;
private Label lblUsername, lblPassword;
private TextField txtUsername;
private JPasswordField Password;
    public static void main(String[] args) {
       new SDP();
       
    }
    public SDP(){
    frame = new JFrame("Timetable Scheduling System");
    frame.setSize(400, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    North = new Panel();
    btnViewIntakeTimetable = new Button ("Intake Timetable");
    
    btnViewLecturerTimetable = new Button ("Lecturer Timetable");
    
    lblUsername = new Label("Username: ");
    txtUsername = new TextField (15);
    lblPassword = new Label("Password: ");
    Password = new JPasswordField (15);
    North.add(btnViewIntakeTimetable);
    North.add(btnViewLecturerTimetable);
    Center = new Panel();
    Center.setLayout(new GridLayout(2,2));
    Center.add(lblUsername);
    Center.add(txtUsername);
    Center.add(lblPassword);
    Center.add(Password);
    South = new Panel();
    btnLogin= new Button ("Login");
    btnLogin.addActionListener(this);
    South.add(btnLogin);
    frame.setLayout(new FlowLayout());
    frame.add(North, BorderLayout.NORTH);
    frame.add(Center, BorderLayout.CENTER);
    frame.add(South, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource()==btnLogin)
         new UserMainMenu();
        else
            new UserMainMenu();
            }

}