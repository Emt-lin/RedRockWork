package work1;

public class TestDemoLevle1 {
    public static void main(String[] args) {
        String s = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String arr[] = s.split(",");
        isNumber(arr);//判断是否有全是数字的字符串
        isUpperCase(arr);//判断是否有全是大写的字符串
        isLowerCase(arr);//判断是否有全是小写的字符串
        toUPPercase(arr);//如果全是字母，就将全部转为大写
        change(arr);//将全是数字的进行排序
        changeTwo(arr);//将全是字母的按升序排序
    }

    public static void isNumber(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= '0' && arr1[j] <= '9') {
                    if (k == arr1.length - 1)
                        System.out.println("全是数字：" + arr[i]);
                    k++;
                }
            }
        }
    }

    public static void isUpperCase(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= 'A' && arr1[j] <='Z') {
                    if (k == arr1.length - 1)
                        System.out.println("全是大写：" + arr[i]);
                    k++;
                }
            }
        }
    }

    public static void isLowerCase(String arr[]) {
        for (int i=0;i<arr.length;i++){
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j=0;j<arr1.length;j++){
                if (arr1[j]>='a'&&arr1[j]<='z') {
                    if (k == arr1.length - 1)
                        System.out.println("全是小写：" + arr[i]);
                        k++;
                }
            }
        }
    }
    public static void toUPPercase(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= 'A' && arr1[j] <='z') {
                    if (k == arr1.length - 1){
                        for (int a=0;a<arr1.length;a++){
                            if (arr1[a]>='a'&&arr1[a]<='z'){
                                arr1[a] -=32;
                            }
                        }
                        System.out.print("转换成大写后的：");
                        System.out.println(arr1);
                    }
                    k++;
                }
            }
        }
    }
    public static void change(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= '0' && arr1[j]<= '9') {
                    if (k == arr1.length - 1){
                        java.util.Arrays.sort(arr1);
                        System.out.print("按升序排序后的：");
                        System.out.println(arr1);
                    }

                    k++;
                }
            }
        }
    }
    public static void changeTwo(String arr[]){
        for (int i = 0; i < arr.length; i++) {
            char[] arr1 = arr[i].toCharArray();
            int k=0;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] >= 'A' && arr1[j] <='z') {
                    if (k == arr1.length - 1){
                       java.util.Arrays.sort(arr1);
                        System.out.print("排序后的字母：");
                        System.out.println(arr1);
                    }
                    k++;
                }
            }
        }
    }
}
