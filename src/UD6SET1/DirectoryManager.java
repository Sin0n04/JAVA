package UD6SET1;

public class DirectoryManager {
    private Directory[] paths;
    private int useful_pos;


    DirectoryManager(int size){
        this.paths = new Directory[size];
        this.useful_pos = 0;
    }

    public void view(){
        for (int i = 0; i < paths.length; i++) {
            System.out.println(paths[i]);
        }
    }

    public boolean addDirectory(Directory toadd){
        for (int i = 0; i < this.paths.length; i++) {
            if(this.paths[i] == null){
                this.paths[i] = toadd;
                useful_pos++;
                return true;
            }
        }
        return false;
    }

    private int totalSize(){
        int sum = 0;
        for (int i = 0; i < this.paths.length; i++) {
            sum+= this.paths[i].getSize();
        }
        return sum;
    }

    public void viewTotalSize(){
        int size = this.totalSize();
        int megabytes = size / (1024*1024);
        int remainder = size % (1024*1024);
        int kilobytes = remainder/1024;
        int bytes = remainder % 1024;
        System.out.println("Total size: " + megabytes + " MB, " + kilobytes + " KB, " + bytes + " B");
    }

}
