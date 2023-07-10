
package ilkprogram;
import java.util.Scanner;
         public class Ilkprogram {
         public static void main(String[] args) {
         String userName, passWord;
         int select ;
         int balance = 1500;
         Scanner input = new Scanner(System.in);
        int haklar=3;
        while(haklar>0){
        System.out.println("kullanıcı adını giriniz:");
        userName = input.nextLine();
      //  System.out.println(userName);
        System.out.println("parolanızı giriniz:");
        passWord=input.nextLine();    
        if(userName.equals("patika") && passWord.equals("kod")){
            System.out.println("basarıyla giris yaptiniz");
            do{
                System.out.println("""
                                    yapmak istedi\u011finiz i\u015flemi se\u00e7iniz:
                                    1-)para yat\u0131rma
                                   2-)para \u00e7ekme
                                   3-)bakiye sorgula
                                   4-)\u00e7\u0131k\u0131\u015f yap
                                   """);
                select=input.nextInt();
               /* if(select==1){
                    System.out.println("yatırmak istediğiniz miktarı yazın");
                    int price=input.nextInt();
                    balance+=price;
                }else if(select==2){
                    System.out.println("çekmek istediğiniz miktarı yazın");
                    int take =input.nextInt();
                    balance-=take;
                    
                }else if(select==3){
                    System.out.println(balance);
                }*/
               switch(select){
                   case 1:
                       System.out.println("yatırmak istediğiniz miktarı yazın");
                    int price=input.nextInt();
                    balance+=price;
               break;
                   case 2:
                       System.out.println("çekmek istediğiniz miktarı yazın");
                    int take =input.nextInt();
                    balance-=take;
               break;
                   case 3:
                       System.out.println(balance );
               break;
               }
    }    while(select!=4);
         break;
            
        }else{haklar--;
        System.out.println("yanlıs kullanıcı adı veya sifre girdiniz.");
            System.out.println("kalan hakkınız:"+haklar);
        }
        }
    }
         }