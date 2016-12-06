
package sdp;

import java.awt.*;
import javax.swing.*;

public class UserMainMenu {
    private JFrame frame;
    private Button btnViewIntakeTimetable, btnViewLecturerTimetable, btnClassReservation, btnFeedback, btnLogout;
    private Panel North,Center, South, Right;
    private Label lblUserID; 

public UserMainMenu(){
frame = new JFrame("Main Menu");
frame.setSize(600,400);
frame.setVisible(true);
frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
lblUserID= new Label("Student Name");
btnLogout = new Button("Logout");
North = new Panel();
North.add(lblUserID);
North.add(btnLogout);
Center =new Panel();
btnViewIntakeTimetable = new Button ("Intake Timetable");
btnViewLecturerTimetable=new Button("Lecturer Timetable");
btnClassReservation = new Button ("Classroom Reservation");
btnFeedback = new Button ("Feedback or Comment");
Center.add(btnViewIntakeTimetable);
Center.add(btnViewLecturerTimetable);
Center.add(btnClassReservation);
Center.add(btnFeedback);
frame.add(North, BorderLayout.NORTH);
frame.add(Center,BorderLayout.CENTER);


}
}