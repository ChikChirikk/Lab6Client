package Commands;
import java.io.IOException;
import java.io.Serializable;

/**
 * interface for all commands
 * @author Diana
 */
public interface Commandable extends Serializable {
	Object execute(Object object) throws IOException, ClassNotFoundException;
	String getName();
}
