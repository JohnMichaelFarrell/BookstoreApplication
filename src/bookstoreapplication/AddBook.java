package bookstoreapplication;

//Import List//
import static bookstoreapplication.BookstoreApplication.books;  //import books array//
import static bookstoreapplication.BookstoreApplication.size;   //import size int///
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * AddBook.Java
 * @author john f . x19141301
 * 03/01/2021
 */
public class AddBook extends javax.swing.JFrame 
{
    /**
     * Creates new form AddBook
     */
    public AddBook()
    {
        initComponents();
        //Set the application title//
        this.setTitle("Add Book");
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
        /*
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE 
        is used to close this window ONLY!... 
        If this isn't implimented, it would close all JFrames
        source: https://stackoverflow.com/a/1944474
        */
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookPanel = new javax.swing.JPanel();
        lblAuthor = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        lblFileFormat = new javax.swing.JLabel();
        lblAudioBookNarrator = new javax.swing.JLabel();
        addBookBtn = new javax.swing.JButton();
        authorTextfield = new javax.swing.JTextField();
        titleTextfield = new javax.swing.JTextField();
        costTextfield = new javax.swing.JTextField();
        audioBookNarratorTextfield = new javax.swing.JTextField();
        fileFormatComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        addBookPanel.setBackground(new java.awt.Color(51, 51, 51));

        lblAuthor.setBackground(new java.awt.Color(255, 255, 255));
        lblAuthor.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthor.setText("Author:");

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Title:");

        lblCost.setBackground(new java.awt.Color(255, 255, 255));
        lblCost.setForeground(new java.awt.Color(255, 255, 255));
        lblCost.setText("Cost:");

        lblFileFormat.setBackground(new java.awt.Color(255, 255, 255));
        lblFileFormat.setForeground(new java.awt.Color(255, 255, 255));
        lblFileFormat.setText("File Format:");

        lblAudioBookNarrator.setBackground(new java.awt.Color(255, 255, 255));
        lblAudioBookNarrator.setForeground(new java.awt.Color(255, 255, 255));
        lblAudioBookNarrator.setText("Audio Book Narrator:");

        addBookBtn.setText("Add Book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });

        fileFormatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doc", "DocX", "iBook", "PDF", "Audio Book", "ePub" }));

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFileFormat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAudioBookNarrator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCost, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authorTextfield)
                    .addComponent(fileFormatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(audioBookNarratorTextfield)
                    .addComponent(costTextfield)
                    .addComponent(titleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addBookBtn)
                .addGap(108, 108, 108))
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(authorTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(titleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCost))
                .addGap(18, 18, 18)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileFormatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFileFormat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(audioBookNarratorTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAudioBookNarrator))
                .addGap(18, 18, 18)
                .addComponent(addBookBtn)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBookPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(addBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //************************************************//
    //                 Add Book Button                //
    //************************************************//
    /*
       This will add a new book to the array
    */
    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed
        try
        {
            //Create a temp book object///
            Books newBook = new Books();
            //Add the temp values into the temp book object//
            newBook.setBookAuthor(authorTextfield.getText());
            newBook.setBookTitle(titleTextfield.getText());
            newBook.setBookCost(Double.parseDouble(costTextfield.getText()));
            newBook.setFileFormat(String.valueOf(fileFormatComboBox.getSelectedItem()));
            newBook.setAudioBookNarrator(audioBookNarratorTextfield.getText());
            //Store the temp object into the books object in the BookstoreApplication class
            books[size] = newBook;
            //Increase size for next book//
            size++;
            //Prompt user with a message stating that the book was added//
            JOptionPane.showMessageDialog(null, "Book has been succesfully added!");

            /*
            Resource I found to close the window
            https://stackoverflow.com/a/1235321
             */
            this.setVisible(false); //Set this frame visible to false after book has been added
            this.dispose();         //Dispose this JFrame      
        }
        //Catch any errors if a string is entered instead of a number//
        catch (NumberFormatException n)
        {
            JOptionPane.showMessageDialog(null, "Please enter a number in the Cost Textfield");
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println(a);
        }
    }//GEN-LAST:event_addBookBtnActionPerformed
    
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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new AddBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JTextField audioBookNarratorTextfield;
    private javax.swing.JTextField authorTextfield;
    private javax.swing.JTextField costTextfield;
    private javax.swing.JComboBox<String> fileFormatComboBox;
    private javax.swing.JLabel lblAudioBookNarrator;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblFileFormat;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField titleTextfield;
    // End of variables declaration//GEN-END:variables
}
