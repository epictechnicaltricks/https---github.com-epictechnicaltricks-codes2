class replaceVowel{
    
public static void main(String args[]){

    String s1,s2,s3,s4,s5, 
    
    input = "sipu";

s1 = input.replaceAll("a","");
s2 = s1.replaceAll("e","");
s3 = s2.replaceAll("i","");
s4 = s3.replaceAll("o","");
s5 = s4.replaceAll("u","");

System.out.println(
"\n\n\nInput : "+input+"\nVowel removed : "+s5+"\n\n");
}


}