package GUI;

import Classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class MainFrame {


    private Player player;

    private JFrame main;//Global frame

    //Main Menu attributes
    private JButton menuButton;
    private JLabel menuLabel1;
    private JLabel menuLabel2;
    private JPanel menuPanel1;
    private JPanel menuPanel2;
    private JPanel menuPanel3;


    //Character Builder attributes

    private JPanel builderPanel1;
    private JPanel builderPanel2;
    private JPanel builderPanel3;
    private JPanel builderPanel4;
    private JPanel builderPanel5;
    private JPanel builderPanel6;




    private JLabel builderLabel1;
    private JLabel builderLabel2;
    private JLabel builderLabel3;
    private JLabel builderLabel4;
    private JLabel builderLabel5;
    private JLabel builderLabel6;
    private JLabel builderLabel7;
    private JLabel builderLabel8;
    private JLabel builderLabel9;
    private JLabel builderLabel10;
    private JLabel builderLabel11;
    private JLabel builderLabel12;
    private JLabel builderLabel13;
    private JLabel builderLabel14;
    private JLabel builderLabel15;
    private JLabel builderLabel16;
    private JLabel builderLabel17;
    private JLabel builderLabel18;


    //Builder Radio Buttons
    private JRadioButton builderRadio1;
    private JRadioButton builderRadio2;
    private JRadioButton builderRadio3;
    private JRadioButton builderRadio4;
    private JRadioButton builderRadio5;
    private JRadioButton builderRadio6;


    private JButton builderButton1;
    private JButton builderButton2;



     private JTextField builderTextInput1;


     private JTextField builderTextDisplay1;
     private JTextField builderTextDisplay2;
     private JTextField builderTextDisplay3;
     private JTextField builderTextDisplay4;
     private JTextField builderTextDisplay5;
     private JTextField builderTextDisplay6;
     private JTextField builderTextDisplay7;
     private JTextField builderTextDisplay8;


     //Final frame Attributes
     private JPanel finalPanel;

     private JButton playAgain;

     private JLabel finalLabel1;
     private JLabel finalLabel2;
     private JLabel finalLabel3;
     private JLabel finalLabel4;
     private JLabel finalLabel5;


     private JTextArea finalTextField;


    public MainFrame() throws IOException {
        activate();
    }

    private void activate() {



        //SplashScreen Attributes ---- START




        //Splashscreen header text
        menuLabel1 = new JLabel("DARK SOULS");
        menuLabel1.setForeground(Color.decode("#B33F40"));
        menuLabel1.setFont(new Font("Algerian", Font.BOLD, 60));
        menuLabel1.setBounds(0,0,0,0);


        //Splashscreen photo
        ImageIcon menuPhoto = new ImageIcon(getClass().getResource("/Images/menuPhoto.png"),"Enemy photo");
        menuLabel2 = createLabel();
        menuLabel2.setIcon(menuPhoto);



        //Splashscreen button attributes
        menuButton = createButton("Build a Character");
        menuButton.setFont(new Font("Sans-serif", Font.BOLD, 20));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player = new Player("Player1"); //creates a new player with default name and switches to the character builder.
                characterBuilder();
            }
        });



        //Menu-panel1 attributes (Top bar and header text)
        menuPanel1 = createPanel();
        menuPanel1.setBounds(0,0,1300,230);
        menuPanel1.setBackground(Color.decode("#424549"));
        menuPanel1.add(menuLabel1);


        //Menu-Panel2 attributes (Splash photo)
        menuPanel2 = createPanel();
        menuPanel2.setBounds(0,230,1300,450);
        menuPanel2.setBackground(Color.decode("#424549"));
        menuPanel2.add(menuLabel2);


        //Menu-panel3 attributes (Bottom button)
        menuPanel3 = createPanel();
        menuPanel3.setBounds(0,680,1300,300);
        menuPanel3.setBackground(Color.decode("#424549"));
        menuPanel3.add(menuButton);



        //splashScreen attributes ---------------------------------------- END


        //Character Builder attributes ----------------------------------- START

        Random random = new Random();


        //builder Reroll button
        builderButton1 = createButton("Reroll");
        builderButton1.setFont(new Font("Sans-serif", Font.BOLD, 15));
        builderButton1.setBounds(150, 450, 200,35);
        builderButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reroll(random);
            }
        });


        //Start battle button
        builderButton2 = createButton("Start the battle.");
        builderButton2.setFont(new Font("Algerian", Font.BOLD, 15));
        builderButton2.setBounds(150, 230, 200,35);
        builderButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalScreen();
            }
        });





        //builder Radio1 (Warrior)
        builderRadio1 = new JRadioButton("Warrior");
        builderRadio1.setBounds(106, 60, 150, 60);
        builderRadio1.setBackground(Color.decode("#424549"));
        builderRadio1.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio1.setForeground(Color.WHITE);
        builderRadio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setHero(new Warrior());
                builderLabel4.setVisible(true);
                builderLabel5.setVisible(false);
                builderLabel6.setVisible(false);

                builderTextDisplay1.setText(player.getDescription());
                builderTextDisplay2.setText("" + player.getHealth());
                builderTextDisplay3.setText("" + player.getDefense());
                builderTextDisplay4.setText("" + player.getAgility());
                builderTextDisplay5.setText("" + player.getBaseAttack());
            }
        });


        //builder Radio2 (Mage)
        builderRadio2 = new JRadioButton("Mage");
        builderRadio2.setBounds(106, 140, 150, 60);
        builderRadio2.setBackground(Color.decode("#424549"));
        builderRadio2.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio2.setForeground(Color.WHITE);
        builderRadio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setHero(new Mage());
                builderLabel4.setVisible(false);
                builderLabel5.setVisible(true);
                builderLabel6.setVisible(false);
                builderTextDisplay1.setText(player.getDescription());
                builderTextDisplay2.setText("" + player.getHealth());
                builderTextDisplay3.setText("" + player.getDefense());
                builderTextDisplay4.setText("" + player.getAgility());
                builderTextDisplay5.setText("" + player.getBaseAttack());
            }
        });


        //builder Radio3 (Thief)
        builderRadio3 = new JRadioButton("Thief");
        builderRadio3.setBounds(106, 220, 150, 60);
        builderRadio3.setBackground(Color.decode("#424549"));
        builderRadio3.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio3.setForeground(Color.WHITE);
        builderRadio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setHero(new Thief());
                builderLabel4.setVisible(false);
                builderLabel5.setVisible(false);
                builderLabel6.setVisible(true);

                builderTextDisplay1.setText(player.getDescription());
                builderTextDisplay2.setText("" + player.getHealth());
                builderTextDisplay3.setText("" + player.getDefense());
                builderTextDisplay4.setText("" + player.getAgility());
                builderTextDisplay5.setText("" + player.getBaseAttack());
            }
        });



        //Builder weapon radio(Dagger)
        builderRadio4 = new JRadioButton("Dagger");
        builderRadio4.setBounds(106, 70, 150, 60);
        builderRadio4.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio4.setForeground(Color.WHITE);
        builderRadio4.setBackground(Color.decode("#424549"));
        builderRadio4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setWeapon(new Dagger());
                builderLabel13.setVisible(true);
                builderLabel14.setVisible(false);
                builderLabel15.setVisible(false);

                builderTextDisplay6.setText("+" + player.getWeaponModifier());
                builderTextDisplay7.setText("" + player.getWeaponWeight());
                builderTextDisplay8.setText(player.getWeaponDescription());

//                System.out.println("\nCurrent enemy name" + player.gete());
//                System.out.println("\nCurrent eney hp" + player.getHeroName());
            }
        });

        //Builder weapon radio(Sword)
        builderRadio5 = new JRadioButton("Sword");
        builderRadio5.setBounds(106, 120, 150, 60);
        builderRadio5.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio5.setForeground(Color.WHITE);
        builderRadio5.setBackground(Color.decode("#424549"));
        builderRadio5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setWeapon(new Sword());
                builderLabel14.setVisible(true);
                builderLabel13.setVisible(false);
                builderLabel15.setVisible(false);

                builderTextDisplay6.setText("+" + player.getWeaponModifier());
                builderTextDisplay7.setText("" + player.getWeaponWeight());
                builderTextDisplay8.setText(player.getWeaponDescription());
            }
        });

        //Builder weapon radio(Axe)
        builderRadio6 = new JRadioButton("Axe");
        builderRadio6.setBounds(106, 170, 150, 60);
        builderRadio6.setFont(new Font("Sans-serif", Font.PLAIN, 25));
        builderRadio6.setForeground(Color.WHITE);
        builderRadio6.setBackground(Color.decode("#424549"));
        builderRadio6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setWeapon(new Axe());
                builderLabel15.setVisible(true);
                builderLabel14.setVisible(false);
                builderLabel13.setVisible(false);

                builderTextDisplay6.setText("+" + player.getWeaponModifier());
                builderTextDisplay7.setText("" + player.getWeaponWeight());
                builderTextDisplay8.setText(player.getWeaponDescription());
            }
        });



        //builder TextField1 attributes(Enter name);
        builderTextInput1 = createTextField();
        builderTextInput1.setBounds(315,35,270,30);
        builderTextInput1.setFont(new Font("Sans-serif", Font.BOLD, 12));
        builderTextInput1.setToolTipText("Enter your name!! (press enter to confirm.)");
        builderTextInput1.setMargin(new Insets(5,10,5,10));
        builderTextInput1.addActionListener(new ActionListener() { // used to grab name input.
            @Override
            public void actionPerformed(ActionEvent e) {
                player.setName(builderTextInput1.getText());
            }
        });


        //Builder hero description textField
        builderTextDisplay1 = createTextField();
        builderTextDisplay1.setBounds(100,300,600, 100);
        builderTextDisplay1.setFont(new Font("Sans-serif", Font.BOLD, 12));
        builderTextDisplay1.setForeground(Color.black);
        builderTextDisplay1.setBackground(Color.decode("#B33F40"));

        //Weapon Description textField2
        builderTextDisplay8 = createTextField();
        builderTextDisplay8.setBounds(110,230,280, 40);
        builderTextDisplay8.setFont(new Font("Sans-serif", Font.BOLD, 12));
        builderTextDisplay8.setForeground(Color.black);
        builderTextDisplay8.setBackground(Color.decode("#B33F40"));


        //builder character health stat
        builderTextDisplay2 = createTextField();
        builderTextDisplay2.setBounds(320, 220, 50,35);
        builderTextDisplay2.setFont(new Font("Sans-serif", Font.BOLD, 15));

        //builder character defense stat
        builderTextDisplay3 = createTextField();
        builderTextDisplay3.setBounds(320, 260, 50,35);
        builderTextDisplay3.setFont(new Font("Sans-serif", Font.BOLD, 15));

        //builder character agility stat
        builderTextDisplay4 = createTextField();
        builderTextDisplay4.setBounds(320, 300, 50,35);
        builderTextDisplay4.setFont(new Font("Sans-serif", Font.BOLD, 15));

        //builder character baseAttack stat
        builderTextDisplay5 = createTextField();
        builderTextDisplay5.setBounds(320, 340, 50,35);
        builderTextDisplay5.setFont(new Font("Sans-serif", Font.BOLD, 15));


        //Attack Modifier
        builderTextDisplay6 = createTextField();
        builderTextDisplay6.setBounds(320, 110, 50,35);
        builderTextDisplay6.setFont(new Font("Sans-serif", Font.BOLD, 15));

        //Weapon weight
        builderTextDisplay7 = createTextField();
        builderTextDisplay7.setBounds(320, 160, 50,35);
        builderTextDisplay7.setFont(new Font("Sans-serif", Font.BOLD, 15));




        //builder label1(Character generator text)
        builderLabel1 = new JLabel("Character Generator");
        builderLabel1.setForeground(Color.decode("#B33F40"));
        builderLabel1.setFont(new Font("Algerian", Font.BOLD, 40));

        //builder label2 attributes(Enter name text)
        builderLabel2 = new JLabel("Enter name");
        builderLabel2.setForeground(Color.black);
        builderLabel2.setFont(new Font("Algerian", Font.BOLD, 30));
        builderLabel2.setBounds(106, 25, 240, 60);

        //builder label3 attributes (Character type text)
        builderLabel3 = new JLabel("Character Type");
        builderLabel3.setForeground(Color.black);
        builderLabel3.setFont(new Font("Algerian", Font.BOLD, 30));
        builderLabel3.setBounds(106, 0, 360, 60);

        //Warrior image label (Label 4)
        ImageIcon warriorImg = new ImageIcon(getClass().getResource("/Images/warrior.jpg"), "Warrior photo");
        builderLabel4 = createLabel();
        builderLabel4.setIcon(warriorImg);
        builderLabel4.setBounds(450, 10, 240,300);
        builderLabel4.setVisible(false);

        //Mage image label (label5)
        ImageIcon mageImg = new ImageIcon(getClass().getResource("/Images/mage.jpg"), "Mage photo");
        builderLabel5 = createLabel();
        builderLabel5.setIcon(mageImg);
        builderLabel5.setBounds(450, 10, 240,300);
        builderLabel5.setVisible(false);

        //Thief image label (label 6)
        ImageIcon thiefImg = new ImageIcon(getClass().getResource("/Images/Thief.png"), "Thief photo");
        builderLabel6 = createLabel();
        builderLabel6.setIcon(thiefImg);
        builderLabel6.setBounds(450, 10, 240,300);
        builderLabel6.setVisible(false);


        //Dagger image label(label13)
        ImageIcon daggerImg = new ImageIcon(getClass().getResource("/Images/dagger.png"), "dagger");
        builderLabel13 = createLabel();
        builderLabel13.setIcon(daggerImg);
        builderLabel13.setBounds(450, 10, 240,300);
        builderLabel13.setVisible(false);

        //Sword image label(label14)
        ImageIcon swordImg = new ImageIcon(getClass().getResource("/Images/sword.png"), "Sword photo");
        builderLabel14 = createLabel();
        builderLabel14.setIcon(swordImg);
        builderLabel14.setBounds(450, 10, 240,300);
        builderLabel14.setVisible(false);

        //Axe image label(label15)
        ImageIcon axeImg = new ImageIcon(getClass().getResource("/Images/axe.png"), "Axe photo.");
        builderLabel15 = createLabel();
        builderLabel15.setIcon(axeImg);
        builderLabel15.setBounds(450, 10, 240,300);
        builderLabel15.setVisible(false);


        //Character stats label (label 7)
        builderLabel7 = new JLabel("Character Stats");
        builderLabel7.setFont(new Font("Algerian", Font.BOLD, 30));
        builderLabel7.setForeground(Color.BLACK);
        builderLabel7.setBounds(105, 150, 360, 60);

        //health stat text label(label 8)
        builderLabel8 = new JLabel("Health");
        builderLabel8.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel8.setForeground(Color.BLACK);
        builderLabel8.setBounds(135,205, 150,60);

        //health stat text label(label 9)
        builderLabel9 = new JLabel("Defense");
        builderLabel9.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel9.setForeground(Color.BLACK);
        builderLabel9.setBounds(135,245, 150,60);

        //health stat text label(10)
        builderLabel10 = new JLabel("Agility");
        builderLabel10.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel10.setForeground(Color.BLACK);
        builderLabel10.setBounds(135,285, 150,60);

        //health stat text label(11)
        builderLabel11 = new JLabel("Base Attack");
        builderLabel11.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel11.setForeground(Color.BLACK);
        builderLabel11.setBounds(135,325, 150,60);


        //Builder weapon text label(12)
        builderLabel12 = new JLabel("Select Your Weapon");
        builderLabel12.setFont(new Font("Algerian", Font.BOLD, 30));
        builderLabel12.setForeground(Color.BLACK);
        builderLabel12.setBounds(106,20,360,60);


        //Weapon stat label(16)
        builderLabel16 = new JLabel("Weapon Stats");
        builderLabel16.setFont(new Font("Algerian", Font.BOLD, 30));
        builderLabel16.setForeground(Color.BLACK);
        builderLabel16.setBounds(106,20,360,60);

        //Attack Modifier label(17)
        builderLabel17 = new JLabel("Attack Modifier");
        builderLabel17.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel17.setForeground(Color.BLACK);
        builderLabel17.setBounds(106,90, 360,60);

        //Weapon weight label(18)
        builderLabel18 = new JLabel("Weight");
        builderLabel18.setFont(new Font("Sans-serif", Font.BOLD, 25));
        builderLabel18.setForeground(Color.BLACK);
        builderLabel18.setBounds(106,140, 360,60);






        //builder panel1 attributes(top screen)
        builderPanel1 = createPanel();
        builderPanel1.setBounds(0,0,750,45);
        builderPanel1.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
        builderPanel1.setBackground(Color.decode("#424549"));
        builderPanel1.add(builderLabel1);


        //builder panel2 attributes (enter name)
        builderPanel2 = createPanel();
        builderPanel2.setBounds(0,45,750,100);
        builderPanel2.setBackground(Color.decode("#424549"));
        builderPanel2.add(builderLabel2);
        builderPanel2.add(builderTextInput1);
        builderPanel2.setLayout(null);


        //builder panel3 attributes (character types)
        builderPanel3 = createPanel();
        builderPanel3.setLayout(null);
        builderPanel3.setBounds(0,145,750,430);
        builderPanel3.setBackground(Color.decode("#424549"));
        builderPanel3.add(builderLabel3);
        builderPanel3.add(builderLabel4);
        builderPanel3.add(builderLabel5);
        builderPanel3.add(builderLabel6);
        builderPanel3.add(builderRadio1);
        builderPanel3.add(builderRadio2);
        builderPanel3.add(builderRadio3);
        builderPanel3.add(builderTextDisplay1);


        //Builder panel4 attributes(stats)
        builderPanel4 = createPanel();
        builderPanel4.setLayout(null);
        builderPanel4.setBounds(750,0,550,575);
        builderPanel4.setBackground(Color.decode("#424549"));

        builderPanel4.add(builderLabel7);
        builderPanel4.add(builderLabel8);
        builderPanel4.add(builderLabel9);
        builderPanel4.add(builderLabel10);
        builderPanel4.add(builderLabel11);
        builderPanel4.add(builderTextDisplay2);
        builderPanel4.add(builderTextDisplay3);
        builderPanel4.add(builderTextDisplay4);
        builderPanel4.add(builderTextDisplay5);
        builderPanel4.add(builderButton1);


        //Builder weapon panel (panel5)
        builderPanel5 = createPanel();
        builderPanel5.setLayout(null);
        builderPanel5.setBounds(0,575,750,290);
        builderPanel5.setBackground(Color.decode("#424549"));

        builderPanel5.add(builderRadio4);
        builderPanel5.add(builderRadio5);
        builderPanel5.add(builderRadio6);
        builderPanel5.add(builderLabel12);
        builderPanel5.add(builderLabel13);
        builderPanel5.add(builderLabel14);
        builderPanel5.add(builderLabel15);
        builderPanel5.add(builderTextDisplay8);


        //Weapon stats panel(6)
        builderPanel6 = createPanel();
        builderPanel6.setLayout(null);
        builderPanel6.setBounds(750, 575,550,290);
        builderPanel6.setBackground(Color.decode("#424549"));
        builderPanel6.add(builderButton2);

        builderPanel6.add(builderTextDisplay6);
        builderPanel6.add(builderTextDisplay7);

        builderPanel6.add(builderLabel16);
        builderPanel6.add(builderLabel17);
        builderPanel6.add(builderLabel18);

        //Character Builder attributes ----------------------------------- END

        //Final Screen attributes-------------------------------------------START



        //Final TextBox
        finalTextField = new JTextArea();
        finalTextField.setBackground(Color.decode("#B33F40"));
        finalTextField.setForeground(Color.BLACK);
        finalTextField.setBounds(300, 450, 700, 280);
        finalTextField.setFont(new Font("Sans-serif", Font.BOLD, 15));


        //Play again button
        playAgain = createButton("Play again.");
        playAgain.setFont(new Font("Sans-serif", Font.BOLD, 25));
        playAgain.setBounds(520, 750, 200,35);
        playAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                finalPanel.setVisible(false);
                menuPanel1.setVisible(true);
                menuPanel2.setVisible(true);
                menuPanel3.setVisible(true);
            }
        });

        //final screen Header(1)
        finalLabel1 = new JLabel("Battle to the Death!");
        finalLabel1.setBounds(320,30,700, 60);
        finalLabel1.setForeground(Color.decode("#B33F40"));
        finalLabel1.setFont(new Font("Algerian", Font.BOLD, 60));

        //final screen character name(2)
        finalLabel2 = new JLabel("");
        finalLabel2.setBounds(370, 140, 400,40);
        finalLabel2.setFont(new Font("Sans-serif", Font.BOLD, 25));
        finalLabel2.setForeground(Color.BLACK);

        //final screen Enemy name(3)
        finalLabel3 = new JLabel("Enemy: Enemy");
        finalLabel3.setBounds(730, 140, 400,40);
        finalLabel3.setFont(new Font("Sans-serif", Font.BOLD, 25));
        finalLabel3.setForeground(Color.BLACK);

        //final screen character photo(4)
        finalLabel4 = createLabel();
        finalLabel4.setBounds(382, 120, 200,400);

        //final screen enemy photo(4)
        finalLabel4 = createLabel();
        finalLabel4.setBounds(382, 120, 200,400);

        //Final Screen enemy photo
        finalLabel5 = createLabel();
        finalLabel5.setBounds(700,120,600,400);




        //final Panel
        finalPanel = createPanel();
        finalPanel.setLayout(null);
        finalPanel.setBounds(0,0,1300,900);
        finalPanel.setBackground(Color.decode("#424549"));
        finalPanel.add(playAgain);
        finalPanel.add(finalLabel1);
        finalPanel.add(finalLabel2);
        finalPanel.add(finalLabel3);
        finalPanel.add(finalLabel4);
        finalPanel.add(finalLabel5);
        finalPanel.add(finalTextField);

        //Final frame attributes-------------------------------------------END

        //GLOBAL ATTRIBUTES -----------------------------------------------START
        // Frame attributes
        main = new JFrame();
        main.setLayout(null);
        main.setTitle("Dark souls");
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        main.setSize(1300, 900);
        main.setResizable(false);
        main.setLocationRelativeTo(null);

        //splashScreen adds
        main.add(menuPanel1);
        main.add(menuPanel2);
        main.add(menuPanel3);


        //BuilderScreen adds
        main.add(builderPanel1);
        main.add(builderPanel2);
        main.add(builderPanel3);
        main.add(builderPanel4);
        main.add(builderPanel5);
        main.add(builderPanel6);
        //builderScreen defaults to invisible
        builderPanel1.setVisible(false);
        builderPanel2.setVisible(false);
        builderPanel3.setVisible(false);
        builderPanel4.setVisible(false);
        builderPanel5.setVisible(false);
        builderPanel6.setVisible(false);


        //Final Screen adds
        main.add(finalPanel);
        //final Screen defaults
        finalPanel.setVisible(false);




        this.main.setVisible(true);

    }

    private void characterBuilder(){
        menuPanel1.setVisible(false);
        menuPanel2.setVisible(false);
        menuPanel3.setVisible(false);
        builderPanel1.setVisible(true);
        builderPanel1.setVisible(true);
        builderPanel2.setVisible(true);
        builderPanel3.setVisible(true);
        builderPanel4.setVisible(true);
        builderPanel5.setVisible(true);
        builderPanel6.setVisible(true);
        Player player = new Player("Noname");
        builderTextDisplay1.setText("Please select a Character"); // used for class description default.
    }

    private void finalScreen(){
        Monster monster = new Monster("Gastly");
        builderPanel1.setVisible(false);
        builderPanel2.setVisible(false);
        builderPanel3.setVisible(false);
        builderPanel4.setVisible(false);
        builderPanel5.setVisible(false);
        builderPanel6.setVisible(false);

        finalPanel.setVisible(true);

        finalLabel2.setText("Player: " + player.getHeroName());
        finalLabel3.setText("Enemy: " + monster.getName());
        finalLabel4.setIcon(player.getPhoto());
        finalLabel5.setIcon(monster.getPhoto());

        finalTextField.setText("Player: " + player.getName()
                + "\n----------------------------------\n" +
                "Class: " + player.getHeroName() + "\n"
                + "HP: " + player.getHealth() + "    Defense: " + player.getDefense() + "   Agility: " + player.getAgility() + "  Base Attack: " + player.getBaseAttack()
                + "\nWeapon: " + player.getWeaponName() + "         Weight: " + player.getWeaponWeight() + "     Attack Mod: " + player.getWeaponModifier()

                + "\n\nMonster: " + monster.getName() + "\n----------------------------------\n"
                + "HP: " + monster.getHealth() + "   Defense: " + monster.getDefense() + " Agility: " + monster.getAgility() + "  Base Attack: " + monster.getBasicAttack());

    }

    private void reroll(Random random){
        player.setHealth(random.nextInt(100));
        player.setDefense(random.nextInt(100));
        player.setAgility(random.nextInt(100));
        player.setBaseAttack(random.nextInt(100));

        builderTextDisplay2.setText("" + player.getHealth());
        builderTextDisplay3.setText("" + player.getDefense());
        builderTextDisplay4.setText("" + player.getAgility());
        builderTextDisplay5.setText("" + player.getBaseAttack());
    }




    private JButton createButton(String text){
        return new JButton(text);
    }

    private JPanel createPanel(){
        return new JPanel();
    }
    private JLabel createLabel(){
        return new JLabel();
    }

    private JTextField createTextField(){
        return new JTextField();
    }






}

