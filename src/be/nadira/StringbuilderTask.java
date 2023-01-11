package be.nadira;

public class StringbuilderTask {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("this is first text");
        StringBuilder sb2 = new StringBuilder("this is seco3@nd text");

        System.out.println(sb1);
      //  System.out.println(sb2);

        sb1.append(" this is additional text");
        System.out.println(sb1);

        sb2.reverse();
    //    System.out.println(sb2);

        //spaties verwijderen in SB
        for(int i=0;i<sb2.length();i++){
            if(sb2.charAt(i) == ' '){
                sb2.deleteCharAt(i);
            }
        }
     //   System.out.println(sb2); //result:txetdn@3ocessisiht [zonder spaties]

        //verdubbelen 't'
       for(int i=0; i<sb2.length();i++){
           if(sb2.charAt(i) == 't'){
               sb2.insert(i++,'t');
           }
       }
        System.out.println(sb2);
    }
}
