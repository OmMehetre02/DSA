/*

Q33. Write a Java pro g
        s equilateral , isoscale or scalene. 
                /
                
                blic class CheckTheTriangleIsW
                  public static void main(String[
                      int a = 5;
                      int b = 4;  
                      int c = 3;  
        
        boolean valid = a+b>c && a+c> b&& b+c>a;

        Boolean equlatrial = valid && (a==b)&&(b==c)&&(c==a);
        Boolean isoscale = valid && (a+b>c && a+c>b && b+c>a && a==b)||b==c||c==a;
        Boolean scalene = valid && (a!=b && b!=c && c!=a);
        //a + b > c && b + c > a && a + c > b
//        String result = ( ? "Equilatral":(a==b && b!=c)||(b==c && c||c==a? "";
        System.out.println(" equlatrial : "+equlatrial + " ,isoscale : " + isoscale + " ,scalene : "+ scalene );
    }
}