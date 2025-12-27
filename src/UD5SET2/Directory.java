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

    public String isValidir(){
        String name = this.name;
        int count = 1;
        if (name.length()<= MAXCHAR && name.length() >= 2){
            if(this.illegalChars()){
                return "This directory name is not valid because it contains illegal characters";
            }
            else{
                for(int i = 1 ; i < name.length() -1; i++){
                    if(name.charAt(i) =='/' && name.charAt(i - 1) == '/'){
                        return "This directory is not valid because it has repetitive // ";
                    }
                }
                if( ( ((int)name.charAt(0) >= 97 && (int)name.charAt(0) <= 122)||(int)name.charAt(0) >= 65 && (int)name.charAt(0) <= 90) && (int)name.charAt(1) == 58){
                    return "OK";
                }
                return "This directory is invalid because it has an invalid disc name";
            }
        }
        if(name.length() < 2){
            return "This directory is not valid because it has less than 2 chars.";
        }

        return "This directory is not valid because it exceeds the maximum character limit";

    }

    public void compact(){}





}
