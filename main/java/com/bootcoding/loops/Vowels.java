class Vowels{
      public static void main(String[]args){
      String name="Volkswagen";
      int count=0;
      char ch;
      for(int i=0;i<name.length();i++)
          {
            ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               {
                 count++;
               }
          }
            System.out.println("Total Vowel is:"+count);
          } 
}  