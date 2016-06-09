import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.PublicKey;

/**
 * Created by nurudeenlawal on 6/9/16.
 */
public class app {
    public static void main(String[] args) throws IOException {
        app apps = new app();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        String out = "";
        while ((s = in.readLine()) != null) {
            out = apps.numberInWordOut(apps.stringInIntOut(s));
            System.out.println(out);
        }

    }
    public class ArraysOfNumbers{
        String[] nothingToNine ={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tenToNineteen = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String twenties = "Twenty";
        String thirties = "Thirty";
        String forties = "Forty";
        String fifties = "Fifty";
        String sixties = "Sixty";
        String seventies = "Seventy";
        String eighties = "Eighty";
        String nineties = "Ninety";
        String hundreds = "Hundred";
        String thousands = "Thousand";
        String millions = "Million";
        String billions = "Billion";
    }
        ArraysOfNumbers array = new ArraysOfNumbers();
        public int stringInIntOut(String input){
            int output = Integer.parseInt(input);
            return output;
        }

    public String lessThanHundred(int input){
        ArraysOfNumbers array = new ArraysOfNumbers();
        String output ="";
        if(input<10){
            output += array.nothingToNine[input];
        }else if(input<20){
            output+= array.tenToNineteen[input - 10];
        }else if(input<30){
            output+= array.twenties;
            output += array.nothingToNine[input-20];
        } else if(input<40){
            output+= array.thirties;
            output += array.nothingToNine[input-30];
        }  else if(input<50){
            output+= array.forties;
            output += array.nothingToNine[input-40];
        } else if(input<60){
            output+=array.fifties;
            output += array.nothingToNine[input-50];
        }else if(input<70){
            output+=array.sixties;
            output += array.nothingToNine[input-60];
        }else if(input<80){
            output += array.seventies;
            output += array.nothingToNine[input-70];
        }else if(input<90){
            output+= array.eighties;
            output += array.nothingToNine[input-80];
        }else if(input<100){
            output += array.nineties;
            output += array.nothingToNine[input-90];
        }
        return output;
    }



    public String hundredHandler(int input){
        String out = "";
        int placeHolder = 0;
        placeHolder =(input/100);
        out += lessThanHundred(placeHolder);
        out+=array.hundreds;
        return out;
    }
    public String thousandHandler(int input){
        String out = "";
        int placeHolder = 0;
        placeHolder=(input/1000);
        out+= lessThanHundred(placeHolder);
        out+= array.thousands;
        return out;
    }
    public String millionHandler(int input){
        String out = "";
        int placeHolder = 0;
        placeHolder = (input/1000000);
        out+= lessThanHundred(placeHolder);
        out += array.millions;
        return out;
    }




    public String numberInWordOut(int input){
        ArraysOfNumbers array = new ArraysOfNumbers();
        String finalOut = "";
        int placeHolder = 0;
        if(input<1000000000 && input>=1000000){
            if(input>=100000000){
                finalOut+=hundredHandler(input/1000000);
            }
            finalOut+=millionHandler(input);
            while(input>=1000000){
                input = (input - 1000000);
            }
        }
        if (input<1000000 && input>=1000){
            if(input>=100000){
                finalOut+= hundredHandler(input/1000);
            }
            finalOut += thousandHandler(input);
            while(input>=1000){
                input = (input - 1000);
            }
        }
        if(input<1000 && input>=100){
            finalOut+= hundredHandler(input);
            while (input>=100){
                input = (input - 100);
            }
        }
        if(input<100){
            finalOut += lessThanHundred(input);
        }
        finalOut += "Dollars";
        return finalOut;
    }

}

