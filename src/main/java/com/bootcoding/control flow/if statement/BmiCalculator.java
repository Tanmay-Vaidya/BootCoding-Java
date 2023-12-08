class BmiCalculator{
      public static void main(String[]args){
      
      double weight=70;
      double height=1.635;
      double bmi=(weight/(height*height));
      if(bmi<25){
      System.out.println("This is underweight:"+bmi);
      }
      else if(bmi<60)
      {
      System.out.println("This is normalweight:"+bmi);
      }
      else if(bmi<90)
      {
      System.out.println("This is overweight:"+bmi);
      }
      else{
      System.out.println("This is obese:"+bmi);
      }
      }
}
                