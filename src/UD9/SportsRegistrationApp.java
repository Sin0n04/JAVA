package UD9;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SportsRegistrationApp extends JFrame {

    public SportsRegistrationApp() {
        setTitle("SPORTS REGISTRATION");
        setSize(550, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Create Mock Data
        DefaultListModel<Person> listModel = new DefaultListModel<>();
        listModel.addElement(new Person("Ana Aguirre", 37, "", null, true));
        listModel.addElement(new Person("Jorge Pérez", 45, "Swimming", null, false));
        listModel.addElement(new Person("", 52, "Stretching", createPlaceholderIcon(Color.GRAY), false));
        listModel.addElement(new Person("Ander Sanz", 75, "", null, true));
        listModel.addElement(new Person("", 24, "Athletics", createPlaceholderIcon(Color.DARK_GRAY), false));
        listModel.addElement(new Person("Carlos Suárez", 45, "Swimming", null, false));
        listModel.addElement(new Person("", 60, "Pilates", createPlaceholderIcon(Color.LIGHT_GRAY), false));

        // 2. Setup the JList with the Custom Renderer
        JList<Person> personList = new JList<>(listModel);
        personList.setCellRenderer(new PersonListCellRenderer());
        personList.setBackground(new Color(143, 178, 201)); // Matching the blue-grey background

        // Remove default cell selection coloring to keep UI clean
        personList.setSelectionBackground(personList.getBackground());
        personList.setSelectionForeground(personList.getForeground());

        // 3. Add to a Scroll Pane
        JScrollPane scrollPane = new JScrollPane(personList);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        add(scrollPane);
    }

    // Helper to generate a colored block as a placeholder image
    private ImageIcon createPlaceholderIcon(Color color) {
        int width = 60, height = 45;
        java.awt.image.BufferedImage img = new java.awt.image.BufferedImage(width, height, java.awt.image.BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setColor(color);
        g.fillRect(0, 0, width, height);
        g.dispose();
        return new ImageIcon(img);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SportsRegistrationApp().setVisible(true);
        });
    }
}

// ==========================================
// DATA MODEL
// ==========================================
class Person {
    String name;
    int age;
    String sport;
    ImageIcon image;
    boolean isEnrolled; // Determines if the button is disabled or enabled

    public Person(String name, int age, String sport, ImageIcon image, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.image = image;
        this.isEnrolled = isEnrolled;
    }
}

// ==========================================
// CUSTOM LIST CELL RENDERER
// ==========================================
class PersonListCellRenderer extends JPanel implements ListCellRenderer<Person> {

    private JLabel lblName = new JLabel();
    private JLabel lblImage = new JLabel();
    private JLabel lblAge = new JLabel();
    private JLabel lblSport = new JLabel();
    private JButton btnEnroll = new JButton("ENROLL");

    public PersonListCellRenderer() {
        // Use GridBagLayout for precise control over rows and columns
        setLayout(new GridBagLayout());
        setBackground(new Color(143, 178, 201)); // Background matching image
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 150, 170))); // Subtle row separator

        Font mainFont = new Font("SansSerif", Font.BOLD, 14);
        Font subFont = new Font("SansSerif", Font.PLAIN, 13);

        lblName.setFont(mainFont);
        lblAge.setFont(subFont);
        lblSport.setFont(subFont);

        // Button Styling to match screenshot
        btnEnroll.setFont(mainFont);
        btnEnroll.setFocusable(false);
        btnEnroll.setBackground(new Color(165, 198, 224));
        btnEnroll.setBorder(BorderFactory.createRaisedBevelBorder());
        btnEnroll.setPreferredSize(new Dimension(100, 45));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(8, 15, 8, 15); // Padding around components

        // Column 0: Name OR Image
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.4;
        add(lblName, gbc);
        gbc.gridy = 1;
        add(lblImage, gbc);

        // Column 1: Age
        gbc.gridx = 1; gbc.gridy = 0; gbc.gridheight = 2; gbc.weightx = 0.3;
        add(lblAge, gbc);

        // Column 2: Sport
        gbc.gridx = 2; gbc.weightx = 0.3;
        add(lblSport, gbc);

        // Column 3: Enroll Button
        gbc.gridx = 3; gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        add(btnEnroll, gbc);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Person> list, Person person,
                                                  int index, boolean isSelected, boolean cellHasFocus) {
        // Handle conditional logic for rows that have images vs text names
        if (person.name != null && !person.name.isEmpty()) {
            lblName.setText(person.name);
            lblName.setVisible(true);
            lblImage.setVisible(false);
        } else if (person.image != null) {
            lblImage.setIcon(person.image);
            lblImage.setVisible(true);
            lblName.setVisible(false);
        } else {
            lblName.setVisible(false);
            lblImage.setVisible(false);
        }

        // Handle Age text
        lblAge.setText(person.age + " years old");

        // Handle Sport text
        lblSport.setText(person.sport);

        // Handle Button state (Grayed out / Disabled if already enrolled)
        if (person.isEnrolled) {
            btnEnroll.setEnabled(false);
            btnEnroll.setText("ENROLL");
            btnEnroll.setBackground(new Color(143, 178, 201)); // blend with background
        } else {
            btnEnroll.setEnabled(true);
            btnEnroll.setText("ENROLL");
            btnEnroll.setBackground(new Color(165, 198, 224));
        }

        return this;
    }
}