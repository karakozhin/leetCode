package test.leetCode.easy.defangingAnIpAddress_1108;

public class DefangingAnIpAddress1108 {
    public static void main(String[] args) {
        String a = "12.15.61.131";
        String newString = new String();
        char l = '[';
        char r = ']';
        char[] substr = a.toCharArray();
        for (int i = 0; i < substr.length; i++) {
            if(a.charAt(i) != '.'){
                newString = newString + a.charAt(i);
                System.out.println(newString);
            }else if(a.charAt(i) == '.'){
                newString=newString + l + "." + r;
                System.out.println(newString);}
        }
    }
}
