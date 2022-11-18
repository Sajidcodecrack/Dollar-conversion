import javax.swing.*;
public class Currency{
    public static void main(String[] args){
        String a=JOptionPane.showInputDialog(null,"Enter the rate of todays currency",
        "Exchanger",JOptionPane.INFORMATION_MESSAGE);
       float rate=Float.parseFloat(a);
      a= JOptionPane.showInputDialog(null,"Press 0 for USD to BDT ,Press 1 for BDT to USD"
      ,"OPtion menu",JOptionPane.QUESTION_MESSAGE);
    int Menu= Integer.parseInt(a);
    if(Menu==0)
    {
        a=JOptionPane.showInputDialog(null,"Enter the amount in USD",
        "USD dollar",JOptionPane.QUESTION_MESSAGE);
        float amount=Float.parseFloat(a);
        JOptionPane.showMessageDialog(null,"The amount in BDT:" +amount*rate,
        "converted to BDT",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(Menu==1)
    {
        a=JOptionPane.showInputDialog(null,"Enter the amount in BDT",
        "BDT Taka",JOptionPane.QUESTION_MESSAGE);
        float amount=Float.parseFloat(a);
        JOptionPane.showMessageDialog(null,"The amount in USD: " +amount/rate,
        "Converted to USD ",JOptionPane.INFORMATION_MESSAGE);

    }

}
}