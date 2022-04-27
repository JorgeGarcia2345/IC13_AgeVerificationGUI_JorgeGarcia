import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Every Dialog - asking user for input
        // is provided by JoptionPane

        // Parent Component, which frame if any should this dialog appear in?
        // nest frames within other frames
        // Ctrl + P show params
        /*
            starting at index 0 - yes
                              1 - No
                              2 - Retry
                             -1 - x out

         */

        int response;
        do {
             response = JOptionPane.showConfirmDialog(null,
                    "Are you 21 years of age or older?",
                    "Age Verification",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            System.out.println(response);

            switch (response) {
                case JOptionPane.YES_OPTION:
                    // For messages (output only, no user input
                    JOptionPane.showMessageDialog(null,
                            "Proceed on, adult!",
                            "You are an adult", JOptionPane.OK_OPTION);
                    // Display "Proceed on Adult"
                    break;
                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null,
                            "You shall not Pass!",
                            "Minor Detected",
                            JOptionPane.OK_OPTION);
                    // "You shall not pass"
                    break;

                case JOptionPane.CLOSED_OPTION:
                    //"Display Aversion Detected"
                    JOptionPane.showMessageDialog(null,
                            "You must answer the question",
                            "Aversion Detected",
                            JOptionPane.OK_OPTION);
                    break;
            }
        }while (response == JOptionPane.CLOSED_OPTION);
    }
}
