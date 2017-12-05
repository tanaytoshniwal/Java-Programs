import java.io.File;

public class FileClass {
	public static void main(String[] args){
		File f=new File("combined.txt");
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.isAbsolute());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getParent());
		System.out.println(f.getParentFile());
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.setReadOnly());
		System.out.println(f.canWrite());
		System.out.println(f.setReadable(false));
		System.out.println(f.canRead());
		System.out.println(f.renameTo(new File("changed.dat")));
	}
}
