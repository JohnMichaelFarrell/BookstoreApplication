/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoreapplication;

//Import List//
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * BookstoreApplication.Java
 * @author john f . x19141301
 * 03/01/2021
 */
public class BookstoreApplication extends javax.swing.JFrame 
{
    //************************************************//
    //        Book Store Application Variables        //
    //************************************************//
    //I/O variables//
    JFileChooser fileChooser = new JFileChooser();      //File Finder Window//
    File file;                                          //File//
    FileInputStream ioStream;                           //File Input Stream//
    FileOutputStream fileStream;                        //File Output Stream//
    ObjectInputStream inputStream;                      //Object Input Stream//
    ObjectOutputStream outputStream;                    //Object Output Stream//
    //Table//
    DefaultTableModel model = null;                     //Table to store the data for the array//
    //Array//
    public static Books[] books;                        //Object Array of books//
    public static int size;                             //Size int to help with the object of arrays//
    /**
     * Creates new form BookstoreApplication
     */
    public BookstoreApplication() 
    {
        initComponents();
        //Init size and books//
        size = 0;
        books = new Books[10]; 
        //Set the application title//
        this.setTitle("Bookstore Application");
        /*
        Always set location of the application to the center
        Source: https://stackoverflow.com/a/2442614 
        */
        this.setLocationRelativeTo(null);
        /*
        Disable the resize feature of the swing. 
        Basically, don't allow the window to resize
        Source: https://stackoverflow.com/a/9033310
        */     
        this.setResizable(false);
        //Disable people from moving column headers in the table//
        //Source; https://stackoverflow.com/a/17641226//
        bookTable.getTableHeader().setReorderingAllowed(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        bookPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        displayUpdateBtn = new javax.swing.JButton();
        lblAppTitle = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        FileMenuOption = new javax.swing.JMenu();
        openFileOption = new javax.swing.JMenuItem();
        saveFileOption = new javax.swing.JMenuItem();
        editMenuOption = new javax.swing.JMenu();
        addBookMenuOption = new javax.swing.JMenuItem();
        deleteBookOption = new javax.swing.JMenuItem();
        themeMenuOption = new javax.swing.JMenu();
        darkThemeOption = new javax.swing.JMenuItem();
        brightThemeOption = new javax.swing.JMenuItem();
        helpMenuOption = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookPanel.setBackground(new java.awt.Color(153, 153, 153));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "author", "title", "cost", "file format", "audio book narrator"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);
        if (bookTable.getColumnModel().getColumnCount() > 0) {
            bookTable.getColumnModel().getColumn(0).setResizable(false);
            bookTable.getColumnModel().getColumn(1).setResizable(false);
            bookTable.getColumnModel().getColumn(2).setResizable(false);
            bookTable.getColumnModel().getColumn(3).setResizable(false);
            bookTable.getColumnModel().getColumn(4).setResizable(false);
        }

        displayUpdateBtn.setText("Display books");
        displayUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookPanelLayout = new javax.swing.GroupLayout(bookPanel);
        bookPanel.setLayout(bookPanelLayout);
        bookPanelLayout.setHorizontalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addComponent(displayUpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        bookPanelLayout.setVerticalGroup(
            bookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayUpdateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAppTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAppTitle.setText("Book Store");

        FileMenuOption.setText("File");

        openFileOption.setText("Open File...");
        openFileOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileOptionActionPerformed(evt);
            }
        });
        FileMenuOption.add(openFileOption);

        saveFileOption.setText("Save File...");
        saveFileOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileOptionActionPerformed(evt);
            }
        });
        FileMenuOption.add(saveFileOption);

        menuBar.add(FileMenuOption);

        editMenuOption.setText("Edit");

        addBookMenuOption.setText("Add book");
        addBookMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookMenuOptionActionPerformed(evt);
            }
        });
        editMenuOption.add(addBookMenuOption);

        deleteBookOption.setText("Delete book");
        deleteBookOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookOptionActionPerformed(evt);
            }
        });
        editMenuOption.add(deleteBookOption);

        menuBar.add(editMenuOption);

        themeMenuOption.setText("Theme");
        themeMenuOption.setToolTipText("");

        darkThemeOption.setText("Dark Theme");
        darkThemeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkThemeOptionActionPerformed(evt);
            }
        });
        themeMenuOption.add(darkThemeOption);

        brightThemeOption.setText("Bright Theme");
        brightThemeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brightThemeOptionActionPerformed(evt);
            }
        });
        themeMenuOption.add(brightThemeOption);

        menuBar.add(themeMenuOption);

        helpMenuOption.setText("Help");
        helpMenuOption.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                helpMenuOptionMenuSelected(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });
        menuBar.add(helpMenuOption);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAppTitle)
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAppTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //************************************************//
    //                 Dark Mode Option               //
    //************************************************//
    /*
        Makes the U.I a bit darker
    */
    private void darkThemeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkThemeOptionActionPerformed
       //Make text colour white//
       lblAppTitle.setForeground(Color.white);
       bookTable.setForeground(Color.white);
       //Make U.I darker//
       this.getContentPane().setBackground(Color.darkGray);
       bookPanel.setBackground(Color.black);    
       bookTable.setBackground(Color.darkGray);
       
    }//GEN-LAST:event_darkThemeOptionActionPerformed
    //************************************************//
    //               Bright Mode Option               //
    //************************************************//
    /*
        Makes U.I a bit brighter
    */
    private void brightThemeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brightThemeOptionActionPerformed
       //Make text colour black//
       lblAppTitle.setForeground(Color.black);
       bookTable.setForeground(Color.black);
       //Make U.I brighter//
       this.getContentPane().setBackground(Color.lightGray);
       bookPanel.setBackground(Color.lightGray);    
       bookTable.setBackground(Color.lightGray);
    }//GEN-LAST:event_brightThemeOptionActionPerformed
    //************************************************//
    //                     Open File                  //
    //************************************************//
    /*
        Option to open a file and load into the table
    */
    private void openFileOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileOptionActionPerformed
      //Try open a file//
      try
      {
          //Get the file saved data file//
          fileChooser = new JFileChooser();
          fileChooser.showOpenDialog(null);
          file = fileChooser.getSelectedFile();
          //Stream the data into the books object array//
          ioStream = new FileInputStream(file);
          inputStream = new ObjectInputStream(ioStream);
          books = (Books[])inputStream.readObject( );

          //Close the input stream//
          inputStream.close();
          //Prompt user that it succesfully got the data//
          JOptionPane.showMessageDialog(null, "Data succesfulled added!");
          //Load the data into the table
          loadDataIntoTable();
          
      }
      catch(Exception e)
      {
          System.out.println(e);
      } 
    }//GEN-LAST:event_openFileOptionActionPerformed
    //************************************************//
    //                Help [Menu Option]:             //
    //************************************************//
    /*
    This opens a JOptionPane window describing how the program workss
    */
    private void helpMenuOptionMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_helpMenuOptionMenuSelected
        JOptionPane.showMessageDialog(null, 
                "To begin,\neither:\n1. Create a new project by adding books by going to [Ediit] > [Add book] and start by adding books and then save the file by going to [File] > [Save File]."
                        + "\n2. Open a pre-made book by going to [File] > [Open File...] and edit along.\n\nPlease note that you must save the file before closing as not doing so will mean unsaved progress", "Help", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_helpMenuOptionMenuSelected
    //************************************************//
    //         Display/Update Table with books        //
    //************************************************//
    private void displayUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayUpdateBtnActionPerformed
       //Try load data into the table//
        try
        {    
          loadDataIntoTable();   
        }
        //If no data is found, it will try this exception//
        catch (Exception x)
        {
            //Print out error to console for debugging//
            System.out.println(x);  
        }    
    }//GEN-LAST:event_displayUpdateBtnActionPerformed
    //************************************************//
    //   Add book Button: open JFrame to add a book   //
    //************************************************//
    private void addBookMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookMenuOptionActionPerformed
        //Open the add book JFrame window//
        //Create the object//
        AddBook addBook = new AddBook();
        //Set the visible as true//
        addBook.setVisible(true);
    }//GEN-LAST:event_addBookMenuOptionActionPerformed
    //************************************************//
    //   Delete book Button: Delete book from array   //
    //************************************************//
    private void deleteBookOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookOptionActionPerformed
    String deleteTerm = JOptionPane.showInputDialog(null, "Enter a book name to delete!");
    //Set the model//
    model = (DefaultTableModel)bookTable.getModel();
    //Try search for the delete term//
    //If deleteterm is not an empty value
    if (deleteTerm != null || !deleteTerm.isEmpty()) 
    {
            try 
            {
                //Loop over the row count//
                for (int i = 0; i < model.getRowCount(); i++) 
                {
                    //Check if row 1 has value of the delete term//
                    if (((String) model.getValueAt(i, 1)).equals(deleteTerm)) 
                    {
                        //Remove the element from table and array and decrease size by 1//
                        model.removeRow(i);
                        books[i] = null;
                        size -= 1;
                        //Break loop when found and deleted//
                        break;
                    } 
                    else 
                    {
                        //Not found
                        JOptionPane.showMessageDialog(null, deleteTerm + " was not found!");
                    }
                }
                //Prompt user that value was deleted//
                JOptionPane.showMessageDialog(null, deleteTerm + " was deleted!");
            } 
            catch (java.lang.NullPointerException nE) 
            {

            }
        } else {
            JOptionPane.showMessageDialog(null, "No value was entered");
        }

    }//GEN-LAST:event_deleteBookOptionActionPerformed
    //************************************************//
    //       Save book Button: Save book to file      //
    //************************************************//
    private void saveFileOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileOptionActionPerformed
        //Save to a file//
        try
        {
            //Save the file as, 'bookstoreData.dat'//
            file = new File("bookstoreData.dat");
            fileStream = new FileOutputStream(file);
            outputStream = new ObjectOutputStream(fileStream);
            //Write data from the books array to the outputStream//
            outputStream.writeObject(books);
            //Close the stream//
            outputStream.close();
            //Prompt to user that file was saved//
            JOptionPane.showMessageDialog(null, "File has been sucessfully saved!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveFileOptionActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookstoreApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookstoreApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookstoreApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookstoreApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new BookstoreApplication().setVisible(true);
            }
        });
    }   
    //************************************************//
    //         Load Data Into The Table Method        //
    //************************************************//
    public void loadDataIntoTable() 
    {
        //Setup the model table//
        model = (DefaultTableModel) bookTable.getModel();
        //Remove unused rows//
        model.setRowCount(0);
        /*
            Resource used to load data into a JTable:
            https://stackoverflow.com/a/33402160
         */
        //Loop over the size variable//
        for (int i = 0; i < size; i++) 
        {
            //Temp vars of storing the data//
            String author = books[i].getBookAuthor();
            String title = books[i].getBookTitle();
            Double cost = books[i].getBookCost();
            String format = books[i].getFileFormat();
            String narrator = books[i].getAudioBookNarrator();
            //Loop through and add the data to the table//
            model.addRow(new Object[]{author, title, cost, format, narrator});
            bookTable.setModel(model);
        }
        //Set the data for the table//
        bookTable.setModel(model);

        //Output this message to the user if the table is empty//
        if (bookTable.getModel().getRowCount() == 0) 
        {
            JOptionPane.showMessageDialog(null, "No data!. Please Add data by going to [Edit] > [Add a book]");
        }   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenuOption;
    private javax.swing.JMenuItem addBookMenuOption;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JTable bookTable;
    private javax.swing.JMenuItem brightThemeOption;
    private javax.swing.JMenuItem darkThemeOption;
    private javax.swing.JMenuItem deleteBookOption;
    private javax.swing.JButton displayUpdateBtn;
    private javax.swing.JMenu editMenuOption;
    private javax.swing.JMenu helpMenuOption;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openFileOption;
    private javax.swing.JMenuItem saveFileOption;
    private javax.swing.JMenu themeMenuOption;
    // End of variables declaration//GEN-END:variables
}