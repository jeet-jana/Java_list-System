import java.util.Scanner;


class Par_Main{
    void Start(){
        chi_Currency c3 = new chi_Currency();
        chi_Tempreture t3 = new chi_Tempreture();
        chi_Distance d3 = new chi_Distance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option Number You want(\n1.Convert Currency\n2.Convert Temperature\n3.Convert Distance\n4.Exit)");
        int Opt = sc.nextInt();
        // sc.close();

        switch (Opt) {
            case 1:
                c3.submenu();
                break;
            case 2:
                t3.submenu3();
            break;
            case 3:
                d3.submenu5();
            break;
            case 4:
                
            break;
            default:
                System.out.println("Please ans me valid Input option!!!");
                break;
        
        }
        sc.close();
    }

    Double Inp_number(){
        Scanner sc = new Scanner(System.in);
        double Inp_num = sc.nextDouble();
        sc.close();
        return Inp_num;
    }
}


// currency method and clss here
class chi_Currency extends Par_Main{
    void submenu(){
        Currency_Method c1 = new Currency_Method();
        System.out.println("Enter the option Number You want\n(1.Convert Rs to Dollar\n2.Convert Rs to Pound\n3.Convert Rs to Euro\n4.Convert Rs to Dirham\n5.Convert Rs to Mark\n6.Convert Rs to Yen\n7.Exit)");
        Scanner sc = new Scanner(System.in);
        int Optc = sc.nextInt();
        switch (Optc) {
            case 1:
                c1.Dollar();
                break;
            case 2:
                c1.Pound();
                break;
            case 3:
                c1.Euro();
                break;
            case 4:
                c1.Dirham();
                break;
            case 5:
                c1.Mark();
                break;
            case 6:
                c1.Yen();
                break;
            case 7:
                Start();
                break;
        
            default:
                System.out.println("Please ans me valid Input option!!!");
                break;
        }
        sc.close();
    }
}

class Currency_Method extends Par_Main{
    void Dollar(){
        System.out.println("Rupees to Dollar");
        double Inr = Inp_number();
        double ex_rate = 0.0106;
        double Usd = Inr * ex_rate;
        System.out.println("The Dollar of this "+Inr+" amount is=="+Usd);
    }
    void Pound(){
        System.out.println("Rupees to Pound");
        double Inr = Inp_number();
        double ex_rate = 1.0/120;
        double Pound = Inr * ex_rate;
        System.out.println("The Pound of this "+Inr+" amount is=="+Pound);
    }
    void Euro(){
        System.out.println("Rupees to Euro");
        double Inr = Inp_number();
        double ex_rate = 1.0/90;
        double Euro = Inr * ex_rate;
        System.out.println("The Euro of this "+Inr+" amount is=="+Euro);
    }
    void Dirham(){
        System.out.println("Rupees to Dirham");
        double Inr = Inp_number();
        double ex_rate = 1.0/22;
        double cont = Inr * ex_rate;
        System.out.println("The Euro of this "+Inr+" amount is=="+cont);
    }
    void Mark(){
        System.out.println("Rupees to Mark");
        double Inr = Inp_number();
        double ex_rate = 1.0/90;
        double cont = Inr * ex_rate;
        double Final = cont * 1.95583;
        System.out.println("The Euro of this "+Inr+" amount is=="+Final);
    }
    void Yen(){
        System.out.println("Rupees to Yen");
        double Inr = Inp_number();
        double ex_rate = 1.7;
        double cont = Inr * ex_rate;
        System.out.println("The Euro of this "+Inr+" amount is=="+cont);
    }
}



// Tempreture method and clsss
class chi_Tempreture extends Par_Main{
    void submenu3(){
        Temperature_Method t1 = new Temperature_Method();
        System.out.println("Enter the option Number You want\n(1.Convert Centigrade to Fahrenheit\n2.Convert Fahrenheit to Centigrade\n3.Exit)");
        Scanner sc = new Scanner(System.in);
        int Optc = sc.nextInt();
        switch (Optc) {
            case 1:
                t1.Fahrenheit();
                break;
            case 2:
                t1.Centigrade();
                break;
            case 3:
                Start();
                break;
            default:
                System.out.println("Please ans me valid Input option!!!");
                break;
        }
        sc.close();
    }
}
class Temperature_Method extends chi_Tempreture{
    void Fahrenheit(){
        System.out.println("Centigrade to Farenheight");
        double cen = Inp_number();
        double Fer = cen * (9.0/5) + 32;
        System.out.println("The "+cen+" tempreture is equal to "+Fer+" Fahrenheight");
    }
    void Centigrade(){
        System.out.println("Fahrenheight to Centrigrade");
        double Fer = Inp_number();
        double cen = Fer * (5.0/9) - 32;
        System.out.println("The "+Fer+" tempreture is equal to "+cen+" Centigrade");
    }
}



// Distance method and class




class chi_Distance extends Par_Main{
    void submenu5(){
        Distance_methods d2 = new Distance_methods();
        System.out.println("Enter the option Number You want\n(1.Convert Yards to Feet\n2.Convert Miles to Km\n3.Convert Km to Meter\n4.Convert Meter to Centimetre\n5.Exit)");
        Scanner sc = new Scanner(System.in);
        int Optc = sc.nextInt();
        switch (Optc) {
            case 1:
                d2.one();;
                break;
            case 2:
                d2.Two();;
                break;
            case 3:
                d2.Three();;
                break;
            case 4:
                d2.Four();;
                break;
            case 5:
                Start();
                break;
        
            default:
                System.out.println("Please ans me valid Input option!!!");
                break;
        }
        sc.close();
    }
}


class Distance_methods extends chi_Distance{
    void one(){
        System.out.println("Convert Yards to Feet");
        double value = Inp_number();
        double same = 3;
        double ans = value * same;
        System.out.println("Answer "+ans);
    }
    void Two(){
        System.out.println("Convert Miles to Km");
        double value = Inp_number();
        double same = 1.609;
        double ans = value * same;
        System.out.println("Answer "+ans);
    }
    void Three(){
        System.out.println("Convert Km to Meter");
        double value = Inp_number();
        double same = 1000;
        double ans = value * same;
        System.out.println("Answer "+ans);
    }
    void Four(){
        System.out.println("Convert Meter to Centimetre");
        double value = Inp_number();
        double same = 100;
        double ans = value * same;
        System.out.println("Answer "+ans);
    }
}

class Compute{
    public static void main(String args[]) {
        Par_Main p1 = new Par_Main();
        p1.Start();
        
    }
}