class FolderRunner {
	
    public static void main(String... args) 
	{

        File file1 = new File("Doc1", 100, FileType.TEXT);
        file1.path = "/docs/text";
        file1.readable = true;

        File file2 = new File("Project", 200, FileType.PDF);
        file2.path = "/docs/pdf";
        file2.readable = true;

        File file3 = new File("Image1", 300, FileType.IMAGE);
        file3.path = "/docs/image";
        file3.readable = false;

        File[] files = {file1, file2, file3};

        Folder folder = new Folder("MyFolder", "Private", "/home/user", files);
        folder.hidden = false;
        folder.count = 3;

        folder.display();
    }
}