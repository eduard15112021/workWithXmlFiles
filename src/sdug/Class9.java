package sdug;

/*

 */

public class Class9 {
    public static void main(String[] args) {
//        String st1 = new String("odin");//new -это разные объекты
//        String st2 = new String("odin");
//        String s1="opa";// поиск такой строки в хипе все имеют одну ссылку
//        String s2="opa";
//        if (st1.equals(st2)) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equals");
//        }
//        if (s1 == s2) {
//            System.out.println("equals");
//        } else {
//            System.out.println("not equals");
//        }
        /*
        создать 3 строк, найти самую длинную и самую короткую. вывести строки и их длины
        вывести их в порядке возрастания и убывания
        вывести строки длинна которых больше стредней длинны
         */
        String st1=new String("oiashfeohasf");
        String st2 = new String("ausfhusdg");
        String st3=new String("isdghjsdof");
        String mass[]=new String[]{st1,st2,st3};
        System.out.println("max length:");
        if (st1.length()>=st2.length()){
            if (st1.length()>=st3.length()){
                System.out.println("st1 "+st1.length());
            }else if (st3.length()>=st2.length()){
                System.out.println("st3 "+st3.length());
            }
        }else {
            System.out.println("st2 "+st2.length());
        }
        System.out.println("st1 "+st1.length());
        System.out.println("st2 "+st2.length());
        System.out.println("st3 "+st3.length());
        for (int i=0;i<mass.length-1;i++){
            String temp1=mass[i];
            String temp2=mass[i+1];
            if (temp1.length()>temp2.length()){
                mass[i]=mass[i+1];
                mass[i+1]=temp1;
            }
        }
        for (int i=0;i<3;i++){
            System.out.println(mass[i]);
        }
    }
}
