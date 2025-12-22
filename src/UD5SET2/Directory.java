package UD5SET2;

public class Directory {
    private String name;
    private int size;
    private final int MAXCHAR = 40;

    private Directory(String name , int size){
        this.name = name;
        this.size = size;
    }

    private void view(){
        System.out.println("name of the directory: " + this.name + " , size of the directory in bytes: " + this.size);
    }

    public int levels() {
        int levels = 0;
        for(int i = 0; i < this.name.length();i++){
            if(this.name.charAt(i)== '/'){
                levels++;
            }
        }
        return levels + 1;
    }

    public String lastLevel(){
        String str = this.name;
        for(int i = str.length() - 1 ; i >= 0 ; i-- ){
            if(str.charAt(i) == '/'){
                str = str.substring(i+1);
                break;
            }
        }
        return str;
    }

    private boolean illegalChars(){
        String str = this.name;
        boolean result = false;
        for(int i = 0 ; i < str.length();i++){
          char c = str.charAt(i);
          if(c == '@' || c == '#' || c == '$'){
              return true;
          }
        }
        return false;
    }



}
