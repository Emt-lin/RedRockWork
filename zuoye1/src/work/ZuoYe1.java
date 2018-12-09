package work;

public class ZuoYe1 {
    public static void main(String[] args) {
        love();
        rhombus();

    }
    public static void love(){
        for(float j = (float) 1.5;j>-1.5;j -=0.1)  {
            for(float i= (float) -1.5;i<1.5;i+= 0.05){
                float a = i*i+j*j-1;
                if((a*a*a-i*i*j*j*j)<=0.0)  {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void rhombus(){
        for (int i=1;i<=20;i++){

            if(i<=10 )
            {
                for (int k=10;k>=i;k--)
            {
                System.out.print("\t");
            }
               for (int j=1;j<=i;j++){

                    System.out.print("*");
                    System.out.print("\t\t");
                }
            }
                else{
                    for (int k=10;k<=i;k++)
                    {
                        System.out.print("\t");
                    }
                    for (int j=20;j>i;j--){
                        System.out.print("*");
                        System.out.print("\t\t");
                    }

                }


            System.out.println();
        }
    }
}
