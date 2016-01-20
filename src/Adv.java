import javax.swing.JOptionPane;

public class Adv {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "You wake up in a strange place. It is very light (although you can see no light sources)");
		int choice1 = JOptionPane.showOptionDialog(null, "You can go two directions- left and right.", "CHOOSE!", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Right", "Left" }, null);
		if(choice1==1){
			JOptionPane.showMessageDialog(null, "Right is always right. You die.");
		}
		else{
			int choice2 = JOptionPane.showOptionDialog(null, "There are two more ways to go.","CHOOSE!", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Right", "Left" }, null);
			if(choice2==0){
				String code= JOptionPane.showInputDialog("You come to a steel door. You need a four digit key code");
				if(code.equals("8134")){
					int choice3 = JOptionPane.showOptionDialog(null, "The door opens. You come to a room with two staircases. One goes up and one goes down.", "Pop-up Title", 0,
							JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Down","Up" }, null);

				}
				if(code.equals("42")){
					JOptionPane.showMessageDialog(null, "THE MEANING OF LIFE WILL NOT HELP YOU");
				}
				if(code.equals("88")){
					JOptionPane.showMessageDialog(null,"You forgot your DeLorean.");
				}
				if(!code.equals("88")&&!code.equals("42")&&!code.equals("8134")){
					JOptionPane.showMessageDialog(null, "Wrong code. You die.");
				}
			}else{
				JOptionPane.showMessageDialog(null, "You come to a blank room. On the wall, it says 8134. Then you die.");
			}

		}
	}
}
