class Vehicle {
   private String make;
   private String model;
   private int year;

   Vehicle(String make, String model, int year)   {
      this.make = make;
      this.model = model;
      this.year = year;
   }

   public String getMake(){
       return make;
   }

   public String getModel(){
       return model;
   }

   public int getYear(){
       return year;
   }

   public void setMake(String newMake){
       make = newMake;
   }

   public void setModel(String newModel){
       model = newModel;
   }

   public void setYear(int newYear){
       year = newYear;
   }


   void print() {
     System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
   }
}
