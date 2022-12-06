package list.exerciselistqueue;

import javax.swing.*;
import java.awt.event.*;

public class ATM extends JFrame implements ActionListener {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JButton button1;

    public ATM() {
        setLayout(null);
        button1 = new JButton("Enable simulation");
        button1.setBounds(10, 10, 180, 30);
        add(button1);
        button1.addActionListener(this);
        label1 = new JLabel("Attended:");
        label1.setBounds(10, 50, 300, 30);
        add(label1);
        label2 = new JLabel("In line:");
        label2.setBounds(10, 90, 300, 30);
        add(label2);
        label3 = new JLabel("Arrival minute:");
        label3.setBounds(10, 130, 400, 30);
        add(label3);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            simulation();
        }
    }

    public void simulation() {
        int status = 0; // 0 if ATM is free, 1 ATM is busy
        int arrival = 2 + (int) (Math.random() * 2); // time between 2 and 3
        int exit = -1; // time customer is attended
        int quantityAttended = 0;
        ListQueueExercise queue = new ListQueueExercise();
        for (int minute = 0; minute < 600; minute++) { // 600 minutes = 10 hours
            if (arrival == minute) {
                if (status == 0) {
                    status = 1;
                    exit = minute + 2 + (int) (Math.random() * 3);
                } else {
                    queue.push(minute);
                }
                arrival = minute + 2 + (int) (Math.random() * 2);
            }
            if (exit == minute) {
                status = 0;
                quantityAttended++;
                if (!queue.empty()) {
                    queue.pull();
                    status = 1;
                    exit = minute + 2 + (int) (Math.random() * 3);
                }
            }
        }
        label1.setText("Attended: " + String.valueOf(quantityAttended));
        label2.setText("In line: " + String.valueOf(queue.quantity()));
        label3.setText("Arrival minute: " + String.valueOf(queue.pull()));
    }

    public static void main(String[] ar) {
        ATM atm1 = new ATM();
        atm1.setBounds(100, 100, 340, 250);
        atm1.setVisible(true);
        atm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}