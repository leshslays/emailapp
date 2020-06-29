package emailapp;

import javax.swing.*;

public class EmailApp {

    private JPanel panel1;

    public static void main(String[] args){
        Email em1 = new Email("John","Smith");

        System.out.println(em1.showInfo());
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
