public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 1000;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.print("Some Error Occured. Error : ");
            System.out.println(e);
        }


        System.out.println("The Program is Over Now !!!");
    }
}

/*
methods to print the exception information:
1. printstacktrace()
this method prints exception information in the format of the name of the exception: description of the exception, stack trace.

2. tostring()
the tostring() method prints exception information in the format of the name of the exception: description of the exception.

3. getmessage()
the getmessage() method prints only the description of the exception.


 */
