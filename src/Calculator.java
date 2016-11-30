package Calculator_1606954773;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by Charly Micolas Butarbutar on 28/11/2016.
 * 1606954773
 */
public class Calculator extends JFrame {
    public static final Font biasa = new Font("Times New Roman", 0, 12);
    public static final Font tebal = new Font("Times New Roman", 1, 12);
    /*
        public static final String[][] BUTTON_TEXTS = {
                {"1", "2", "3", "/"},
                {"4", "5", "6", "*"},
                {"7", "8", "9", "-"},
                {"0", ".", "+", "="}
        };*/
    JTextField fieldDisplay;
    private JMenu jmenuFile, jmenuHelp;
    private JLabel jlbOutput;
    private JButton jbnButtons[], jbnDisplay;
    private JPanel jtopPanelBoard, jpanelBoard, jpanelDisplay;
    private double result = 0;
    private String lastCommand = "=";
    private boolean isStart = true;
    private JButton btn;

    public Calculator(String name) {

        setTitle(name);
        setLayout(new GridLayout(3, 1));

        createFileMenu();
        createHelpMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuBar.add(jmenuFile);
        menuBar.add(jmenuHelp);

        panelDisplay();
        panelBoard();
        topPanelBoard();

        add(jpanelDisplay);
        add(jtopPanelBoard);
        add(jpanelBoard);

        setSize(230, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("Calculator");
    }

    private void panelDisplay() {

        jpanelDisplay = new JPanel(new FlowLayout());
        fieldDisplay = new JTextField(19);
        fieldDisplay.setText("0");
        fieldDisplay.setEnabled(false);
        fieldDisplay.setPreferredSize(new Dimension(230, 25));
        jpanelDisplay.add(fieldDisplay);

    }

    private void panelBoard() {
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        jpanelBoard = new JPanel();
        jpanelBoard.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("+", command);
        addButton("=", command);

    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        if (isInteger(label)) {
            button.setForeground(Color.BLUE);
        } else {
            button.setForeground(Color.RED);
        }
        button.addActionListener(listener);
        jpanelBoard.add(button);
    }

    private void addTopButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.setForeground(Color.RED);
        button.addActionListener(listener);
        if (label.equalsIgnoreCase("Backspace")) {

            jtopPanelBoard.add(button, BorderLayout.WEST);
        } else {
            jtopPanelBoard.add(button, BorderLayout.EAST);

        }
    }

    private void topPanelBoard() {

        jtopPanelBoard = new JPanel();
        jtopPanelBoard.setLayout(new BorderLayout());
        JButton btnBsp;
        // btnBsp = new JButton("Backspace");

        ActionListener backspace = new BackspaceAction();
        addTopButton("Backspace", backspace);
        ActionListener clear = new ClearAction();
        addTopButton("C", clear);

        //jtopPanelBoard.setPreferredSize(new Dimension(50, 45));
    }

    private void createHelpMenu() {
        JMenuItem item;
        jmenuHelp = new JMenu("Help");
        item = new JMenuItem("About"); //Cut
        //item.addActionListener(this);
        jmenuHelp.add(item);
    }

    private void createFileMenu() {
        JMenuItem item;
        jmenuFile = new JMenu("File");
        jmenuFile.setFont(tebal);
        jmenuFile.setMnemonic(KeyEvent.VK_F);

        item = new JMenuItem("New");
        // item.addActionListener(this);
        jmenuFile.add(item);

        item = new JMenuItem("Open"); //Open...
        // item.addActionListener(this);
        jmenuFile.add(item);

        item = new JMenuItem("Save"); //Save
        //item.addActionListener(this);
        jmenuFile.add(item);

        item = new JMenuItem("Save As..."); //Save As...
        //item.addActionListener(this);
        jmenuFile.add(item);

        jmenuFile.addSeparator(); //add a horizontal separator line
        item = new JMenuItem("Quit"); //Quit
        //item.addActionListener(this);
        jmenuFile.add(item);

    }

    private class ClearAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            fieldDisplay.setText("0");
            isStart = true;
        }
    }


    private class BackspaceAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = fieldDisplay.getText();

            String result = input.substring(0, (input.length() - 1));
            fieldDisplay.setText(result);
            isStart = false;
        }
    }

    /**
     * Listener untuk insert button
     */
    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (isStart) {
                fieldDisplay.setText("");
                isStart = false;
            }
            fieldDisplay.setText(fieldDisplay.getText() + input);
        }
    }

    /**
     * Listener Untuk Operan
     */
    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            if (isStart) {
                if (command.equals("-")) {
                    fieldDisplay.setText(command);
                    isStart = false;
                } else lastCommand = command;
            } else {
                calculate(Double.parseDouble(fieldDisplay.getText()));
                lastCommand = command;
                isStart = true;
            }
        }
    }

    /**
     * Fungsi untuk menghitung
     *
     * @param x
     */
    public void calculate(double x) {
        if (lastCommand.equals("+")) result += x;
        else if (lastCommand.equals("-")) result -= x;
        else if (lastCommand.equals("*")) result *= x;
        else if (lastCommand.equals("/")) result /= x;
        else if (lastCommand.equals("=")) result = x;
        fieldDisplay.setText("" + result);
    }

}
