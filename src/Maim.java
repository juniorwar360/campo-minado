import modelo.Tabuleiro;
import visao.TabuleiroConsole;

public class Maim {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}

}