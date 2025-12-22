package biblio;

public class BiblioString {

    protected static String reverseConcatenate(){
        String str = "";
        String toreverse = "";
        for (int count = 1; count <= 10 ; count ++){
            str = Console.readString() ;
            if (str.equals("end")){
                break;
            }
            else{
                toreverse += str + " ";
            }
        }
        String Reversed = "";
        int end = toreverse.length() -1;
        for (int i = toreverse.length()-1 ; i >= 0 ;i-- ){
            if(toreverse.charAt(i) == ' '){
                Reversed += toreverse.substring(i + 1, end + 1 ) + " ";
                end = i - 1;
            }

        }
        return Reversed.trim();


    }

    protected static int replace(String str, char ocurrence, char substitute){
        int replacecounter = 0;
        for (int i = 0 ; i < str.length(); i ++){
            if (str.charAt(i) == ocurrence){
                str = str.substring(0,i) + substitute + str.substring(i+1);
                replacecounter++;
            }

        }
        return replacecounter;

    }

    protected static String removeChar(String str, char occurence){
        String result = "";
        for(int i = 0; i < str.length(); i ++){
            if (str.charAt(i) != occurence){
                result += str.charAt(i);
            }
        }
        return result;
    }

    protected static String completeWith$(String str,int length){
        String result = str;
        for(int i = str.length(); i < length; i++){
            result += "$";
        }
        return result;
    }

    protected static String removeWord(String str1, String str2) {
        String result = "";
        int str2length = str2.length();
        for (int i = 0; i < str1.length(); i++) {
            if (i + str2length <= str1.length() && str1.substring(i, i + str2length).equals(str2)) {
                i += str2length-1;
            }
            else {
                result += str1.charAt(i);
            }

        }
        return result;
    }

    protected static String wordsInReverse(String str){
        String reversed = "";
        int strlength = str.length();
        int i;

        for(i = strlength -1; i >=0; i--){
           if(str.charAt(i) == ' '){
               reversed += str.substring(i + 1,strlength)+ " ";
               strlength = i;
           }
        }
        reversed += str.substring(0,strlength);
        return reversed;
    }



    }

