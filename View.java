package tp03;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame implements ActionListener {       
        
        //CRIAÇÃO DOS COMPONENTES 
        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnMulti = new JButton("*");
        JButton btnDiv = new JButton("/");
        JButton btnSoma = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnIgual = new JButton("=");
        JButton btnPonto = new JButton(".");
        JButton btnClear = new JButton("C");
        JTextField textFieldInput = new JTextField(" ");
        JTextField textFieldOut = new JTextField(" ");
        
        
        
        View(String titulo,int largura, int altura, int colinic, int lininic){
            JFrame f = new JFrame();
            JPanel panel1 = new JPanel();
            f.setTitle("Calculadora ");
            f.setSize(300,300);
            f.setLayout(new GridLayout(6,4));  
            
            //ADICIONANDO COMPONENTES NO FRAME
            f.add(textFieldInput);
            f.add(btn7);
            f.add(btn8);
            f.add(btn9);
            f.add(btnDiv);
            f.add(btn4);
            f.add(btn5);
            f.add(btn6);
            f.add(btnMulti);
            f.add(btn1);
            f.add(btn2);
            f.add(btn3);
            f.add(btnSub);
            f.add(btn0);
            f.add(btnPonto);
            f.add(btnIgual);
            f.add(btnSoma);
            f.add(btnClear); 
            f.add(textFieldOut);
        
            f.setVisible(true);
            
            Calcular c = new Calcular();
            //CRIANDO EVENTOS DOS JBUTTONS
            btn0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"0");
            }
        });
            btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"1");
            }
        });
            btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"2");
            }
        });
            btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"3");
            }
        });
            btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"4");
            }
        });
            btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"5");
            }
        });
            btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"6");
            }
        });
            btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"7");
            }
        });
            btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"8");
            }
        });
            btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textFieldInput.setText(textFieldInput.getText()+"9");
            }
        });
            btnSoma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Float numero1 = Float.parseFloat(textFieldInput.getText());
                textFieldInput.setText(textFieldInput.getText()+"+");
            }
        });
            btnSub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Float numero1 = Float.parseFloat(textFieldInput.getText());
                textFieldInput.setText(textFieldInput.getText()+"-");
            }
        });
            btnMulti.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Float numero1 = Float.parseFloat(textFieldInput.getText());
                textFieldInput.setText(textFieldInput.getText()+"*");
            }
        });
            btnDiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                Float numero1 = Float.parseFloat(textFieldInput.getText());
                textFieldInput.setText(textFieldInput.getText()+"/");
                c.setNumero1(Float.parseFloat("numero1"));                
            }
        });
    
}   
    
    

    
    /*public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == btn0){
                textFieldInput.setText("0");
            }
            else if(e.getSource() == btn1){
                textFieldInput.setText("1");
            }
            else if(e.getSource() == btn2){
                textFieldInput.setText("2");
            }
            else if(e.getSource() == btn3){
                textFieldInput.setText("3");
            }
            else if(e.getSource() == btn4){
                textFieldInput.setText("4");
            }
            else if(e.getSource() == btn5){
                textFieldInput.setText("5");
            }
            else if(e.getSource() == btn6){
                textFieldInput.setText("6");
            }
            else if(e.getSource() == btn7){
                textFieldInput.setText("7");
            }
            else if(e.getSource() == btn8){
                textFieldInput.setText("8");
            }
            else if(e.getSource() == btn9){
                textFieldInput.setText("9");
            }
        }
        catch(Exception erro){
            System.out.println(erro.getMessage());
        }
        finally
        {
            System.out.println("Deu ruim!");
        }
    }
*/

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

