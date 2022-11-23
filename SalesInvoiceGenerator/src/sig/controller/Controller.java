/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sig.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sig.view.SIGFrame;

/**
 *
 * @author Islam
 */
public class Controller implements ActionListener{
    
    SIGFrame frame;

    public Controller(SIGFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Welcome");
        if(e.getActionCommand().equals("Load File")){loadFile();}
        else if(e.getActionCommand().equals("Save File")){saveFile();}
        else if(e.getActionCommand().equals("Create New Invoice")){createNewInvoice();}
        else if(e.getActionCommand().equals("Delete Invoice")){deleteInvoice();}
        else if(e.getActionCommand().equals("Save")){save();}
        else if(e.getActionCommand().equals("Cancel")){cancel();}
    }

    private void loadFile() {}

    private void saveFile(){}

    private void createNewInvoice(){
    }

    private void deleteInvoice() {
    }

    private void save() {
    }

    private void cancel() {
    }
}
