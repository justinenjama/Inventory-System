/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comm;

import dao.InventoryUtils;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author justine
 */
public class OpenPdf {

    public static void OpenById(String id) {
        if (new File(InventoryUtils.billPath + id + ".pdf").exists()) {
            try {
                Process p = Runtime.getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler \"" + InventoryUtils.billPath + id + ".pdf\"");

            } catch (IOException ex) {
                Logger.getLogger(OpenPdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "File does not exists");
        }
    }
}
