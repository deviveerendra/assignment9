public class same {
    public static  void main (String[] args){
        String apt="34563";
        int dev=0;
        for(int i=0;i<apt.length();i++){
            String ass=String.valueOf(apt.charAt(i));
            apt=apt.replaceFirst(ass,"*");
            System.out.println(apt);
            if(apt.contains(apt)){

                continue;
            }
            dev++;
        }
    }
}
