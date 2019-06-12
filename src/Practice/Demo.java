package Practice;
class Demo
{
    public static void  main(String[]args){
        Abc a1=new Abc();
        a1.sum(20);

        }
}
class Abc
{
    int i=10;
    Abc()
    {
        System.out.println("hello world");
    }
   public void sum( int i)
   {
       System.out.println(i);
       System.out.println(this.i);

   }
}