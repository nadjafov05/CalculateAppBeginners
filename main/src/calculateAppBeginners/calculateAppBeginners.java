package calculateAppBeginners;
import java.util.Scanner;

public class calculateAppBeginners {
    public static void calculateApp(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("her hansi bir emeliyyati secin: " +
                    "\n 1- toplama" +
                    "\n 2- cixma" +
                    "\n 3- vurma" +
                    "\n 4- bolme" +
                    "\n");
            int operation = sc.nextInt();

            if (operation <1 || operation > 4){
                scannersEror();
            }else {
                selectOperations(operation);
            }
        }
    }


    //=================================================================================
    // selectOperations methodu
    //daxil edilen operatora gore emeliyyati icra edir
    public static void selectOperations(int operation){
        if (operation == 1){
            operations1();
        }else if (operation == 2){
            operations2();
        }else if (operation == 3){
            operations3();
        }else if (operation == 4){
            operations4();
        }
    }
    //=================================================================================

    //=================================================================================
    //operatorda daxil edilmis emeliyyata uygun reqem olarsa, bu method ise dusur.. ve sistemden cixilir..
    public static void scannersEror(){
        System.out.println("Secilmis reqeme gore emeliyyat yoxdur.." +
                "\n Sistemden cixilir..");
        System.exit(0);
    }
    //=================================================================================

    //=================================================================================
    //bu methodlar emeliyyata uygun toplama,cixma,vurma, bolme edir ve cap edir ekrana
    public static void toplama(int birinciReqem,int ikinciReqem){
        int cem = birinciReqem + ikinciReqem;
        System.out.println("cem :"+cem);
    }
    public static void cixma(int birinciReqem,int ikinciReqem){
        int cem = birinciReqem - ikinciReqem;
        System.out.println("cem :"+cem);
    }
    public static void vurma(int birinciReqem,int ikinciReqem){
        int cem = birinciReqem * ikinciReqem;
        System.out.println("cem :"+cem);
    }
    public static void bolme(int birinciReqem,int ikinciReqem){
        int cem = birinciReqem / ikinciReqem;
        System.out.println("cem :"+cem);
    }
    //=================================================================================


    //=================================================================================
    //bu methodlar secdiyimiz operatora uygun emeliiyati icra edir
    public static void operations1(){
        Scanner operations1 = new Scanner(System.in);
        System.out.print("birinci reqemi daxil edin: ");
        int birinciReqem = operations1.nextInt();
        System.out.print("ikinci reqemi daxil edin: ");
        int ikinciReqem = operations1.nextInt();
        toplama(birinciReqem,ikinciReqem);
    }
    public static void operations2(){
        Scanner operations2 = new Scanner(System.in);
        System.out.print("birinci reqemi daxil edin: ");
        int birinciReqem = operations2.nextInt();
        System.out.print("ikinci reqemi daxil edin: ");
        int ikinciReqem = operations2.nextInt();
        cixma(birinciReqem,ikinciReqem);
    }
    public static void operations3(){
        Scanner operations3 = new Scanner(System.in);
        System.out.print("birinci reqemi daxil edin: ");
        int birinciReqem = operations3.nextInt();
        System.out.print("ikinci reqemi daxil edin: ");
        int ikinciReqem = operations3.nextInt();
        vurma(birinciReqem,ikinciReqem);
    }
    public static void operations4(){
        Scanner operations4 = new Scanner(System.in);
        System.out.print("birinci reqemi daxil edin: ");
        int birinciReqem = operations4.nextInt();
        System.out.print("ikinci reqemi daxil edin: ");
        int ikinciReqem = operations4.nextInt();
        bolme(birinciReqem,ikinciReqem);
    }
    //=================================================================================
}
