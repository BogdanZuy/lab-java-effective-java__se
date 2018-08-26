package name.zuy.lab.java.item1;

import java.util.EnumSet;

public class A03ReturnObjectOfAnySubtype {

    enum somesmall {VALUE1, VALUE2, VALUE3, VALUE4}
    enum somelarge {VALUE1, VALUE2, VALUE3, VALUE4, VALUE5, VALUE6, VALUE7, VALUE8, VALUE9, VALUE10, VALUE11, VALUE12, VALUE13, VALUE14, VALUE15, VALUE16, VALUE17, VALUE18, VALUE19, VALUE20, VALUE21, VALUE22, VALUE23, VALUE24, VALUE25, VALUE26, VALUE27, VALUE28, VALUE29, VALUE30, VALUE31, VALUE32, VALUE33, VALUE34, VALUE35, VALUE36, VALUE37, VALUE38, VALUE39, VALUE40, VALUE41, VALUE42, VALUE43, VALUE44, VALUE45, VALUE46, VALUE47, VALUE48, VALUE49, VALUE50, VALUE51, VALUE52, VALUE53, VALUE54, VALUE55, VALUE56, VALUE57, VALUE58, VALUE59, VALUE60, VALUE61, VALUE62, VALUE63, VALUE64, VALUE65, VALUE66, VALUE67, VALUE68}

    public static void info() {

        // This gives great flexibility in choosing the class of the returned object
        // Factory method EnumSet.of() returns RegularEnumSet or JumboEnumSet (see noneOf method)
        EnumSet esRegular = EnumSet.of(somesmall.VALUE1, somesmall.VALUE2, somesmall.VALUE3);
        EnumSet esJumbo = EnumSet.of(
                somelarge.VALUE1, somelarge.VALUE2, somelarge.VALUE3, somelarge.VALUE4,
                somelarge.VALUE5, somelarge.VALUE6, somelarge.VALUE7, somelarge.VALUE8,
                somelarge.VALUE9, somelarge.VALUE10, somelarge.VALUE11, somelarge.VALUE12,
                somelarge.VALUE13, somelarge.VALUE14, somelarge.VALUE15, somelarge.VALUE16,
                somelarge.VALUE17, somelarge.VALUE18, somelarge.VALUE19, somelarge.VALUE20,
                somelarge.VALUE21, somelarge.VALUE22, somelarge.VALUE23, somelarge.VALUE24,
                somelarge.VALUE25, somelarge.VALUE26, somelarge.VALUE27, somelarge.VALUE28,
                somelarge.VALUE29, somelarge.VALUE30, somelarge.VALUE31, somelarge.VALUE32,
                somelarge.VALUE33, somelarge.VALUE34, somelarge.VALUE35, somelarge.VALUE36,
                somelarge.VALUE37, somelarge.VALUE38, somelarge.VALUE39, somelarge.VALUE40,
                somelarge.VALUE41, somelarge.VALUE42, somelarge.VALUE43, somelarge.VALUE44,
                somelarge.VALUE45, somelarge.VALUE46, somelarge.VALUE47, somelarge.VALUE48,
                somelarge.VALUE49, somelarge.VALUE50, somelarge.VALUE51, somelarge.VALUE52,
                somelarge.VALUE53, somelarge.VALUE54, somelarge.VALUE55, somelarge.VALUE56,
                somelarge.VALUE57, somelarge.VALUE58, somelarge.VALUE59, somelarge.VALUE60,
                somelarge.VALUE61, somelarge.VALUE62, somelarge.VALUE63, somelarge.VALUE64,
                somelarge.VALUE65, somelarge.VALUE66, somelarge.VALUE67, somelarge.VALUE68
                );

//        for(int i = 1; i<=68; i++) {
//            System.out.print("VALUE" + i + ", ");
//            if(i % 4 == 0)
//                System.out.println();
//        }
//        System.out.println();

        System.out.println("Class from 3 elements EnumSet static factory method:");
        System.out.println(esRegular.getClass().getName());
        System.out.println("Class from 68 elements EnumSet static factory method:");
        System.out.println(esJumbo.getClass().getName());

    }

}
