import java.io.*;

class Test{
    public static void getIoException throws IOException{
        throw new IOException();
    }

    public staticvoid getArithmeticEXception throws ArithmeticException{
        throw new ArithmeticException();
    }

    public static void main(String arg[]){
        try{
            getIoException();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        getArithmeticEXception();
    }
}