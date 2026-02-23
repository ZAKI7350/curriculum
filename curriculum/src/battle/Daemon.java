package battle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

    public Daemon(String filePath) throws IOException {
        super("", 0, 0, 0);
        loadDaemon(filePath);
    }

    private void loadDaemon(String filePath) throws IOException {
    	 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

    		 setName(br.readLine());
             setHp(Integer.parseInt(br.readLine()));
             setAt(Integer.parseInt(br.readLine()));
             setSp(Integer.parseInt(br.readLine()));

    	 }
    }
}