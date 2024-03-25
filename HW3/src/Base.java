import javax.swing.*;

public abstract class Base extends JFrame {
    protected User user;

    public Base(String title){
        initialize(title);
    }
    public Base(String title, User user){
        this.user = user;

        initialize(title);
    }

    private void initialize(String title){
        setTitle(title);

        setSize(400, 600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setResizable(false);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    protected abstract void addGuiComponents();
}














