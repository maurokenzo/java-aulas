/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author maurosaiki
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension d = tk.getScreenSize();
System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
        
   //     System.out.println("Sua tela está em resolução");
    }
    
}
