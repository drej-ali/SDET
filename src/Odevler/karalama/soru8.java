package Odevler.karalama;

public class soru8 {
    public static void main(String[] args) {
        Object o = new Object() {
            public boolean equals(Object obj) {
                return true;
            }
        };

        System.out.println(o.equals("Hasan"));
    }
}


