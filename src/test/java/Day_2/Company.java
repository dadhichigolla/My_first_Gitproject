package Day_2;

public class Company
{
    public static void main(String[] args)
    {
        //Calling static method to main class.
        //Syntax :- classname.methodename
        Itdept.smethod1();
        Itdept.smethod2();
        Itdept.smethod3();
        Itdept.smethod4();
       //calling non static method to main class
        // Syntax :- classname objname = new classname
        Csc_dept obj1 =new Csc_dept();
        obj1.Cmethod1();
        obj1.Cmentho4();
        Csc_dept obj2 = new Csc_dept();
        obj2.Cmentho2();
        obj2.Cmentho3();

        Mec_dept.mmethod1();
        Mec_dept.mmethod2();
        Mec_dept Obj3 = new Mec_dept();
        Obj3.mmethod3();
//Addition of three number
        Addition_of_three_numbers.addition();
        Addition_of_three_numbers Obj = new Addition_of_three_numbers();
// Latest of three number
        Greater_number.largest();

        // Even or odd
        Even_odd.ENum();





    }

}
