class File {
	
    String name;
    int size;
    FileType type;
    String path;
    boolean readable;

    File(String name, int size, FileType type) 
	{
        this.name = name;
        this.size = size;
        this.type = type;
    }

    void info() 
	{
        System.out.println("Running info in File");
        System.out.println("Name: " + this.name);
        System.out.println("Size: " + this.size);
        System.out.println("Type: " + this.type);
        System.out.println("Path: " + this.path);
        System.out.println("Readable: " + this.readable);
    }
}