public class StrCount{
    public static void main(String[]args){
        String str=" Monica ";
        int count=0;
        for( int i=1;i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            if(c == 'a'|| c == 'e'|| c =='i'|| c =='o'|| c =='u'){
            count+=i;
            }
        }
    
        System.out.println("vowel count:" +count);
        }
}

public class StrCount{
    public static void main(String[]args){
        String str = "Monica";

        int count = str.length();  

        System.out.println("String count: " + count);
    }
}
