import java.util.*;
class Currency
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("LIST OF CURRENCIES:\n1. INR\n2. USD \n3. EURO\n4. Yen\n5. Pound");
        int n1,n2=0;
        double INR=0, USD=0, EURO=0, YEN=0, POUND=0;
        System.out.println("Enter a Currency 1 to 5: ");
        n1=sc.nextInt();
        System.out.println("Enter a Currency 1 to 5 except thee one selected before: ");
        n2=sc.nextInt();
        System.out.println("Enter the amount of Money to be converted: ");
        double n=sc.nextInt();
        if(n1==1)
        {
            if(n2==2)
            {
                USD=n/80;
                System.out.println("USD: "+USD);
            }
        }
        if(n1==1)
        {
            if(n2==3)
            {
                EURO=n/90;
                System.out.println("Euro: "+EURO);
            }
        }
        if(n1==1)
        {
            if(n2==4)
            {
                YEN=2*n;
                System.out.println("Yen: "+YEN);
            }
        }
        if(n1==1)
        {
            if(n2==5)
            {
                POUND=n/110;
                System.out.println("Pound: "+POUND);
            }
        }
        if(n1==2)
        {
            if(n2==1)
            {
                INR=n*80;
                System.out.println("INR: "+INR);
            }
        }
        if(n1==2)
        {
            if(n2==3)
            {
                EURO = n;
                System.out.println("EURO: "+EURO);
            }
        }
        if(n1==2)
        {
            if(n2==4)
            {
                YEN= n*154;
                System.out.println("YEN: "+YEN);
            }
        }
        if(n1==2)
        {
            if(n2==5)
            {
                POUND= n*2;
                System.out.println("POUND: "+POUND);
            }
        }
        if(n1==3)
        {
            if(n2==1)
            {
                INR= n*90;
                System.out.println("INR: "+INR);
            }
        }
        if(n1==3)
        {
            if(n2==2)
            {
                USD=n;
                System.out.println("USD: "+USD);
            }
        }
        if(n1==3)
        {
            if(n2==4)
            {
                YEN= n*167;
                System.out.println("YEN: "+YEN);
            }
        }
        if(n1==3)
        {
            if(n2==5)
            {
                POUND= (n*8)/10;
                System.out.println("POUND: "+POUND);
            }
        }
        if(n1==4)
        {
            if(n2==1)
            {
                INR= (n)/2;
                System.out.println("INR: "+INR);
            }
        }
        if(n1==4)
        {
            if(n2==2)
            {
                USD=(n*65)/1000;
                System.out.println("USD: "+USD);
            }
        }
        if(n1==4)
        {
            if(n2==3)
            {
                EURO=(n*6)/100;
                System.out.println("EURO: "+EURO);
            }
        }
        if(n1==4)
        {
            if(n2==5)
            {
                POUND= (n*5)/100;
                System.out.println("POUND: "+POUND);
            }
        }
        if(n1==5)
        {
            if(n2==1)
            {
                INR= n*110;
                System.out.println("INR: "+INR);
            }
        }
        if(n1==5)
        {
            if(n2==2)
            {
                USD=(n*129)/100;
                System.out.println("USD: "+USD);
            }
        }
        if(n1==5)
        {
            if(n2==3)
            {
                EURO=(n*119)/100;
                System.out.println("EURO: "+EURO);
            }
        }
        if(n1==5)
        {
            if(n2==4)
            {
                YEN= n*198;
                System.out.println("YEN: "+YEN);
            }
        }
    }
}