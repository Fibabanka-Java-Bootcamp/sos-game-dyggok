package org.kodluyoruz;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Random rnd = new Random();
        int i = 0, j = 0, satir, sutun, siz = 0, bilgisayar = 0, satirsayisi = 0, sutunsayisi = 0;
        String matris[][] = new String[1][1];
        boolean control = true, control1 = true;
        String[] ifadeler = {"Bilgisayar", "Siz"};
        String[] ifadeler2 = {"s", "o"};

        while (control) {
            System.out.println("Oyun alanı kaç satır olsun:");
            i = klavye.nextInt();
            if (i < 3 || i > 7) {
                System.out.println("Girilen sayı 3 ila 7 arasında olmalıdır");
            } else {
                control = false;
            }
        }
        control = true;
        while (control) {
            System.out.println("Oyun alanı kaç sütun olsun:");
            j = klavye.nextInt();
            if (j != i)
                System.out.println("Satır ve sutun eşit olmalıdır!");

            else if (j < 3 || j > 7)
                System.out.println("Girilen sayı 3 ila 7 arasında olmalıdır");

            else {
                control = false;
            }


        }
        control = true;
        matris = new String[i][j];

        String select = ifadeler[rnd.nextInt(ifadeler.length)];
        String select1 = ifadeler2[rnd.nextInt(ifadeler2.length)];
        String select2;
        if (select1 == "o") {
            select2 = "s";
        } else {
            select2 = "o";
        }
        if (select == "Bilgisayar") {
            for (int bloksayisi = 0; bloksayisi <= i * i; ) {

                System.out.println(select + " oynuyor");
                control = true;
                control1 = true;
                while (control1) {
                    int secilen = rnd.nextInt(matris.length);
                    int secilen2 = rnd.nextInt(matris[0].length);
                    if (matris[secilen][secilen2] != "s" && matris[secilen][secilen2] != "o") {
                        matris[secilen][secilen2] = select1;
                        if (select1 == "s") {
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen][secilen2 + 1] == "o") {
                                    if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                        if (matris[secilen][secilen2 + 2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (matris[secilen][secilen2 - 1] == "o") {
                                    if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                        if (matris[secilen][secilen2 - 2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                if (matris[secilen - 1][secilen2] == "o") {
                                    if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                        if (matris[secilen - 2][secilen2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                if (matris[secilen + 1][secilen2] == "o") {
                                    if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                        if (matris[secilen + 2][secilen2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                    if (matris[secilen - 1][secilen2 - 1] == "o") {
                                        if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                            if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                                if (matris[secilen - 2][secilen2 - 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                    if (matris[secilen - 1][secilen2 + 1] == "o") {
                                        if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                            if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                                if (matris[secilen - 2][secilen2 + 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                    if (matris[secilen + 1][secilen2 + 1] == "o") {
                                        if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                            if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                                if (matris[secilen + 2][secilen + 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                    if (matris[secilen + 1][secilen2 - 1] == "o") {
                                        if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                            if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                                if (matris[secilen + 2][secilen - 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (select1 == "o") {
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen][secilen2 + 1] == "s") {
                                    if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length && matris[secilen][secilen2 - 1] == "s") {
                                        bilgisayar++;
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                if (matris[secilen - 1][secilen2] == "s") {
                                    if (-1 < (secilen + 1) && (secilen + 1) < matris.length && matris[secilen + 1][secilen2] == "s") {
                                        bilgisayar++;
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length && -1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen - 1][secilen2 + 1] == "s") {
                                    if (-1 < (secilen + 1) && (secilen + 1) < matris.length && -1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                        if (matris[secilen + 1][secilen2 - 1] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                        }

                        control1 = false;

                    }

                }
                System.out.print(" ");
                for (satirsayisi = 1; satirsayisi < i + 1; satirsayisi++) {
                    System.out.print(satirsayisi + " ");
                }
                System.out.println();
                for (satirsayisi = 1; satirsayisi < (i + 1); satirsayisi++) {
                    System.out.print(satirsayisi);
                    for (sutunsayisi = 0; sutunsayisi < j; sutunsayisi++) {
                        if (matris[satirsayisi - 1][sutunsayisi] == null) {
                            System.out.print(" ");
                        } else {
                            System.out.print(matris[satirsayisi - 1][sutunsayisi] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Bilgisayarın puanı: " + bilgisayar);
                System.out.println("Sizin puanınız: " + siz);
                bloksayisi++;
                if(bloksayisi>=i*i){
                    break;
                }
                while (control) {
                    System.out.println("Kaçıncı satır: ");
                    satir = klavye.nextInt();
                    System.out.println("Kaçıncı sütun: ");
                    sutun = klavye.nextInt();
                    if (matris[satir-1][sutun-1] == "o" || matris[satir-1][sutun-1] == "s") {
                        System.out.println("Seçtiğiniz alan doludur, başka bir yer seçiniz");
                    } else {
                        control = false;
                        matris[satir - 1][sutun - 1] = select2;
                        if (select2 == "s") {
                            if (-1 < sutun && sutun < matris.length) {
                                if (matris[satir - 1][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length) {
                                        if (matris[satir - 1][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length) {
                                if (matris[satir - 1][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length) {
                                        if (matris[satir - 1][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 1] == "o") {
                                    if (-1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir && satir < matris.length) {
                                if (matris[satir][sutun - 1] == "o") {
                                    if (-1 < satir + 1 && satir + 1 < matris.length) {
                                        if (matris[satir + 1][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length && -1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length && -1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir && satir < matris.length) {
                                if (matris[satir][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length && -1 < satir + 1 && satir + 1 < matris.length) {
                                        if (matris[satir + 1][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir && satir < matris.length) {
                                if (matris[satir][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length && -1 < satir+1 && satir+1 < matris.length) {
                                        if (matris[satir + 1][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                        }
                        if (select2 == "o") {
                            if (-1 < sutun && sutun < matris.length) {
                                if (matris[satir - 1][sutun] == "s") {
                                    if (-1 < sutun - 2 && sutun - 2 < matris.length) {
                                        if (matris[satir - 1][sutun - 2] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 1] == "s") {
                                    if (-1 < satir && satir < matris.length) {
                                        if (matris[satir][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun] == "s") {
                                    if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir && satir < matris.length) {
                                        if (matris[satir][sutun - 2] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                        }
                        System.out.print(" ");
                        for (satirsayisi = 1; satirsayisi < i + 1; satirsayisi++) {
                            System.out.print(satirsayisi + " ");
                        }
                        System.out.println();
                        for (satirsayisi = 1; satirsayisi < (i + 1); satirsayisi++) {
                            System.out.print(satirsayisi);
                            for (sutunsayisi = 0; sutunsayisi < j; sutunsayisi++) {
                                if (matris[satirsayisi - 1][sutunsayisi] == null) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print(matris[satirsayisi - 1][sutunsayisi] + " ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.println("Bilgisayarın puanı: " + bilgisayar);
                        System.out.println("Sizin puanınız: " + siz);
                    }
                }
                bloksayisi++;
                if(bloksayisi>=i*i){
                    break;
                }
            }
        }
        else {
            System.out.println(select + " oynuyorsunuz");
            System.out.println(select2 + " koyarak oynayacaksınız");
            System.out.println("Koordinatları giriniz");
            for (int bloksayisi2 = 0; bloksayisi2 <= i * i; ) {
                control1=true;
                while (control) {
                    System.out.println("Kaçıncı satır: ");
                    satir = klavye.nextInt();
                    System.out.println("Kaçıncı sütun: ");
                    sutun = klavye.nextInt();
                    if (matris[satir-1][sutun-1] == "o" || matris[satir-1][sutun-1] == "s") {
                        System.out.println("Seçtiğiniz alan doludur, başka bir yer seçiniz");
                    } else {
                        control = false;
                        matris[satir - 1][sutun - 1] = select2;
                        if (select2 == "s") {
                            if (-1 < sutun && sutun < matris.length) {
                                if (matris[satir - 1][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length) {
                                        if (matris[satir - 1][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length) {
                                if (matris[satir - 1][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length) {
                                        if (matris[satir - 1][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 1] == "o") {
                                    if (-1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir && satir < matris.length) {
                                if (matris[satir][sutun - 1] == "o") {
                                    if (-1 < satir + 1 && satir + 1 < matris.length) {
                                        if (matris[satir + 1][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length && -1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length && -1 < satir - 3 && satir - 3 < matris.length) {
                                        if (matris[satir - 3][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir && satir < matris.length) {
                                if (matris[satir][sutun] == "o") {
                                    if (-1 < sutun + 1 && sutun + 1 < matris.length && -1 < satir + 1 && satir + 1 < matris.length) {
                                        if (matris[satir + 1][sutun + 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir && satir < matris.length) {
                                if (matris[satir][sutun - 2] == "o") {
                                    if (-1 < sutun - 3 && sutun - 3 < matris.length && -1 < satir+1 && satir+1 < matris.length) {
                                        if (matris[satir + 1][sutun - 3] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                        }
                        if (select2 == "o") {
                            if (-1 < sutun && sutun < matris.length) {
                                if (matris[satir - 1][sutun] == "s") {
                                    if (-1 < sutun - 2 && sutun - 2 < matris.length) {
                                        if (matris[satir - 1][sutun - 2] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun - 1] == "s") {
                                    if (-1 < satir && satir < matris.length) {
                                        if (matris[satir][sutun - 1] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                            if (-1 < sutun && sutun < matris.length && -1 < satir - 2 && satir - 2 < matris.length) {
                                if (matris[satir - 2][sutun] == "s") {
                                    if (-1 < sutun - 2 && sutun - 2 < matris.length && -1 < satir && satir < matris.length) {
                                        if (matris[satir][sutun - 2] == "s") {
                                            siz++;
                                        }
                                    }
                                }
                            }
                        }
                        System.out.print(" ");
                        for (satirsayisi = 1; satirsayisi < i + 1; satirsayisi++) {
                            System.out.print(satirsayisi + " ");
                        }
                        System.out.println();
                        for (satirsayisi = 1; satirsayisi < (i + 1); satirsayisi++) {
                            System.out.print(satirsayisi);
                            for (sutunsayisi = 0; sutunsayisi < j; sutunsayisi++) {
                                if (matris[satirsayisi - 1][sutunsayisi] == null) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print(matris[satirsayisi - 1][sutunsayisi] + " ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.println("Bilgisayarın puanı: " + bilgisayar);
                        System.out.println("Sizin puanınız: " + siz);
                    }

                }
                bloksayisi2++;
                if(bloksayisi2>=i*i){
                    break;
                }

                control = true;
                System.out.println(ifadeler[0] + " oynuyor");

                while (control1) {
                    int secilen = rnd.nextInt(matris.length);
                    int secilen2 = rnd.nextInt(matris[0].length);
                    if (matris[secilen][secilen2] != "s" && matris[secilen][secilen2] != "o") {
                        matris[secilen][secilen2] = select1;
                        if (select1 == "s") {
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen][secilen2 + 1] == "o") {
                                    if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                        if (matris[secilen][secilen2 + 2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (matris[secilen][secilen2 - 1] == "o") {
                                    if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                        if (matris[secilen][secilen2 - 2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                if (matris[secilen - 1][secilen2] == "o") {
                                    if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                        if (matris[secilen - 2][secilen2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                if (matris[secilen + 1][secilen2] == "o") {
                                    if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                        if (matris[secilen + 2][secilen2] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                    if (matris[secilen - 1][secilen2 - 1] == "o") {
                                        if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                            if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                                if (matris[secilen - 2][secilen2 - 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                    if (matris[secilen - 1][secilen2 + 1] == "o") {
                                        if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                            if (-1 < (secilen - 2) && (secilen - 2) < matris.length) {
                                                if (matris[secilen - 2][secilen2 + 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                    if (matris[secilen + 1][secilen2 + 1] == "o") {
                                        if (-1 < (secilen2 + 2) && (secilen2 + 2) < matris[0].length) {
                                            if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                                if (matris[secilen + 2][secilen + 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                if (-1 < (secilen + 1) && (secilen + 1) < matris.length) {
                                    if (matris[secilen + 1][secilen2 - 1] == "o") {
                                        if (-1 < (secilen2 - 2) && (secilen2 - 2) < matris[0].length) {
                                            if (-1 < (secilen + 2) && (secilen + 2) < matris.length) {
                                                if (matris[secilen + 2][secilen - 2] == "s") {
                                                    bilgisayar++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (select1 == "o") {
                            if (-1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen][secilen2 + 1] == "s") {
                                    if (-1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length && matris[secilen][secilen2 - 1] == "s") {
                                        bilgisayar++;
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length) {
                                if (matris[secilen - 1][secilen2] == "s") {
                                    if (-1 < (secilen + 1) && (secilen + 1) < matris.length && matris[secilen + 1][secilen2] == "s") {
                                        bilgisayar++;
                                    }
                                }
                            }
                            if (-1 < (secilen - 1) && (secilen - 1) < matris.length && -1 < (secilen2 + 1) && (secilen2 + 1) < matris[0].length) {
                                if (matris[secilen - 1][secilen2 + 1] == "s") {
                                    if (-1 < (secilen + 1) && (secilen + 1) < matris.length && -1 < (secilen2 - 1) && (secilen2 - 1) < matris[0].length) {
                                        if (matris[secilen + 1][secilen2 - 1] == "s") {
                                            bilgisayar++;
                                        }
                                    }
                                }
                            }
                        }

                        control1 = false;

                    }

                }
                System.out.print(" ");
                for (satirsayisi = 1; satirsayisi < i + 1; satirsayisi++) {
                    System.out.print(satirsayisi + " ");
                }
                System.out.println();
                for (satirsayisi = 1; satirsayisi < (i + 1); satirsayisi++) {
                    System.out.print(satirsayisi);
                    for (sutunsayisi = 0; sutunsayisi < j; sutunsayisi++) {
                        if (matris[satirsayisi - 1][sutunsayisi] == null) {
                            System.out.print(" ");
                        } else {
                            System.out.print(matris[satirsayisi - 1][sutunsayisi] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Bilgisayarın puanı: " + bilgisayar);
                System.out.println("Sizin puanınız: " + siz);
                bloksayisi2++;
                if(bloksayisi2>=i*i){
                    break;
                }
            }
        }
    }
}







