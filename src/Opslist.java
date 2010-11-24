
import java.util.LinkedHashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class Opslist extends FileLoader {
	protected LinkedHashSet<String> ops;

	public Opslist() {
		this.filename = "ops.txt";
		ops = new LinkedHashSet<String>();
	}
	
	public boolean isOp(String player) {
		return ops.contains(player);
	}

	@Override
	protected void beforeLoad() {
		ops.clear();
	}

	@Override
	protected void loadLine(String line) {
		ops.add(line);
	}

	@Override
	protected String saveString() {
		String line="";
		for( String o: ops) {
			line+=o;
			line+="\r\n";
		}
		return line;
	}

}
