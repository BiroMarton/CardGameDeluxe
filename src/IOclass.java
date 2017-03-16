import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class IOclass {


	public void write(Socket soc, String str) throws IOException{
		OutputStream o = soc.getOutputStream();
		ObjectOutput s = new ObjectOutputStream(o);
		s.writeObject(str);
		s.flush();
	}
	
	public String read(Socket soc) throws ClassNotFoundException, IOException{
		String str;
		InputStream ou = soc.getInputStream();
		ObjectInput su = new ObjectInputStream(ou);
		str = (String) su.readObject();
		return str;		
	}
	

	
	
	}


