package ch9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9_2 {
	public static void main(String[] args) {
		paths();
	}
	
	
	public static void paths()	{
		Path absolute = Paths.get("/", "home", "cay");
		Path relative = Paths.get("myprog", "conf", "user.properties");
		System.out.println(absolute);
		System.out.println(relative);
	}
}
