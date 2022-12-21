/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package phonebook;


/**
 *
 * @author Simbahan
 */
public class SimbaPhone implements CRUD_Interface {

    public static void main(String[] args) {
        //Initialize Data Structure
        CRUD_Interface.DB_Initialize();
        //Insert Sample Data
      
        CRUD_Interface.addRow("Shairmain", "Simbahan", "04/23/2002", "Tanauan City", "2020646@ub.edu.ph", "09368546707");
        //Initialize GUI
        MainF app = new MainF();
        app.setVisible(true);
        
        
    }
}
