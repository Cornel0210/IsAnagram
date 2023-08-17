public class Anagram {
    public static void main(String[] args){
        System.out.println(isAnagram("ACE", "cae"));
        System.out.println(isAnagram("CAr", "rac"));
        System.out.println(isAnagram("Master", "Disaster"));
    }

    static boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        a = a.toUpperCase();
        b = b.toUpperCase();
        while (a.length()>0){
            char ch = a.charAt(0);
            a = a.substring(1);
            int count = 0;
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ch){
                    b = b.substring(0, i) + b.substring(i+1);
                    count++;
                    break;
                }
            }
            if (count == 0){
                return false;
            }
        }
        if (a.equals("") && b.equals("")){
            return true;
        }
        return false;
    }
}
