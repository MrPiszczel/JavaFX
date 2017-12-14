package kontrola;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controllerKik {

 public	int p = 2;
 
 public int wynik1 = 0;
 public int wynik2 = 0;
   Gracze gr1 = new Gracze("X");
   Gracze gr2 = new Gracze("O");
    
   @FXML
   private Button a;

   @FXML
   private Button b;

   @FXML
   private Button c;

   @FXML
   private Button d;

   @FXML
   private Button f;

   @FXML
   private Button g;

   @FXML
   private Button h;

   @FXML
   private Button i;

   @FXML
   private Button j;
   
   @FXML
   private TextField wynikgr1;

   @FXML
   private TextField wynikgr2;
   
   @FXML Button spr;

    
	@FXML
    private TextField miejsce;
	
	@FXML
	public void test(ActionEvent e){
		if(a.getText() == b.getText() && b.getText() == c.getText() && a.getText() == "X"||
				d.getText() == f.getText() && f.getText() == g.getText() && d.getText() == "X" ||
				h.getText() == i.getText() && i.getText() == j.getText() && h.getText() == "X" ||
				a.getText() == d.getText() && d.getText() == h.getText() && a.getText() == "X" ||
				b.getText() == f.getText() && f.getText() == i.getText() && b.getText() == "X" ||
				c.getText() == g.getText() && g.getText() == j.getText() && c.getText() == "X" ||
				a.getText() == f.getText() && f.getText() == j.getText() && a.getText() == "X" ||
				c.getText() == f.getText() && f.getText() == h.getText() && c.getText() == "X"  ){
		miejsce.setText("wygrywa X");
		wynik1++;
		wynikgr1.setText("Gracz X ma punktów " + wynik1);
		
		a.setText("");
		b.setText("");
		c.setText("");
		d.setText("");
		f.setText("");
		g.setText("");
		h.setText("");
		i.setText("");
		j.setText("");
		}else if(a.getText() == b.getText() && b.getText() == c.getText() && a.getText() == "O"||
				d.getText() == f.getText() && f.getText() == g.getText() && d.getText() == "O" ||
				h.getText() == i.getText() && i.getText() == j.getText() && h.getText() == "O" ||
				a.getText() == d.getText() && d.getText() == h.getText() && a.getText() == "O" ||
				b.getText() == f.getText() && f.getText() == i.getText() && b.getText() == "O" ||
				c.getText() == g.getText() && g.getText() == j.getText() && c.getText() == "O" ||
				a.getText() == f.getText() && f.getText() == j.getText() && a.getText() == "O" ||
				c.getText() == f.getText() && f.getText() == h.getText() && c.getText() == "O" ){
			miejsce.setText("wygrywa Y");
		wynik2++;
		wynikgr2.setText("Gracz Y ma punktów " + wynik2);
		
		a.setText("");
		b.setText("");
		c.setText("");
		d.setText("");
		f.setText("");
		g.setText("");
		h.setText("");
		i.setText("");
		j.setText("");
		
		}else {
			miejsce.setText("remis");
			a.setText("");
			b.setText("");
			c.setText("");
			d.setText("");
			f.setText("");
			g.setText("");
			h.setText("");
			i.setText("");
			j.setText("");
		}
	}
	
    
	@FXML
	public void przypisz(ActionEvent e){
	if(p % 2 == 0){
		a.setText(gr1.zwroc());
	p++;
	}else{
		a.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz2(ActionEvent e){
	if(p % 2 == 0){
		b.setText(gr1.zwroc());
	p++;
	}else{
		b.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz3(ActionEvent e){
	if(p % 2 == 0){
		c.setText(gr1.zwroc());
	p++;
	}else{
		c.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz4(ActionEvent e){
	if(p % 2 == 0){
		d.setText(gr1.zwroc());
	p++;
	}else{
		d.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz5(ActionEvent e){
	if(p % 2 == 0){
		f.setText(gr1.zwroc());
	p++;
	}else{
		f.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz6(ActionEvent e){
	if(p % 2 == 0){
		g.setText(gr1.zwroc());
	p++;
	}else{
		g.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz7(ActionEvent e){
	if(p % 2 == 0){
		h.setText(gr1.zwroc());
	p++;
	}else{
		h.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz8(ActionEvent e){
	if(p % 2 == 0){
		i.setText(gr1.zwroc());
	p++;
	}else{
		i.setText(gr2.zwroc());
		p++;
	}
	
     }
	
	@FXML
	public void przypisz9(ActionEvent e){
	if(p % 2 == 0){
		j.setText(gr1.zwroc());
	p++;
	}else{
		j.setText(gr2.zwroc());
		p++;
	}
	
     }
	
}
