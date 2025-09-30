// works when put in vscode with swing library

package edu.bhscs;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PracticingJFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Tic Tac Toe");
    JLabel label = new JLabel("Under Construction");
    frame.add(label);
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
