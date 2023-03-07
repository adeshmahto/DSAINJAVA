package FSP_Program.Final;

import CompanyOriented.Mindtree.SelfSufficient;

class driver{
    final void drive(){
        System.out.println("my upper limit of speed is 60kmph");
    }
}


public class FInal_Method extends driver  {
//    void drive(){
//        System.out.println("my upper limit of spped is 100 kmph");
//    }
    public static void main(String[] args) {

        FInal_Method d1=new FInal_Method();
        d1.drive();



    }
}
