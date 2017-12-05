import java.io.File;

public class GettingListOfFilesAndFolders {
	public static void main(String[] args){
		File f=new File("T://");
		String[] str=f.list();
		for(String s:str)
			System.out.println(s);
	}
}
