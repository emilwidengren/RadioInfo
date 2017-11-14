import javax.swing.*;

public class Interface {

    private JFrame mainWindow;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenu menu2;
    private JMenuItem menuItem;

    public Interface(){

        /* -- INITIALIZE COMPONENTS -- */
        mainWindow = new JFrame();
        menuBar = new JMenuBar();
        menu = new JMenu("Save");
        menu2 = new JMenu("File");
        menuItem = new JMenuItem("Testing");
        menu.add(menuItem);

        /* -- MANAGE COMPONENTS -- */
        menuBar.add(menu);
        menuBar.add(menu2);
        mainWindow.setJMenuBar(menuBar);

        /* -- INITIALIZE PANELS -- */

        /* -- MANAGE PANELS -- */

        /* -- MANAGE FRAME -- */
        mainWindow.setSize(800, 800);
        mainWindow.setTitle("RadioInfo v1.0");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
