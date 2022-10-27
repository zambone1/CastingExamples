package CASTING;

public class exscasting {

    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;  //DOWN-CAST, DIMINUIÇÃO DA INFORMAÇÃO. CAUSA PERDA.
        b1 = (byte) s1;

        long l1;
        int i1 = 10;  //UP-CAST, PROMOÇÃO DA INFORMAÇÃO. NÃO CAUSA PERDA.
        l1 = i1;

        int i2;
        long l2 = 1000000000000L; //DOWN-CAST, DIMINUIÇÃO DA INFORMAÇÃO. CAUSA PERDA.
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;  //DOWN-CAST, DIMINUIÇÃO DE INFORMAÇÃO. NESTE CASO NÃO CAUSOU PERDA
        i3 = (int) l3;      //PQ O 10000 É UM NÚMERO INTEIRO.

        double d1;
        float f1 = 10.5f;   //UP-CAST, PROMOÇÃO DE INFORMAÇÃO.
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;   // DOWN-CAST, DIMINUIÇÃO DE INFORMAÇÃO. POUCA PERDA DE INFORMAÇÃO
        f2 = (float) d2;
        double d3 = 10000.5888888888888888888888888888888888888888888888d;
        f3 = (float) d3;          //DOWN-CAST, DIMINUIÇÃO DE INFORMAÇÃO. PERDA DE MUITA INFORMAÇÃO

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1:" + b1);

    }

}
