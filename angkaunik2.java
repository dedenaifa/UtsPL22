       import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

    public class angkaunik2 {
        private Set<Integer> nomor;

        public angkaunik2() {
            nomor = new HashSet<>();
        }

        public void addNomor(int number) {
            nomor.add(number);
        }

        public boolean hasDuplicates() {
            return nomor.size() != 20;
        }

        public static void main(String[] args) {
            angkaunik2 nomorList = new angkaunik2();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan 20 angka: ");
            for (int i = 0; i < 20; i++) {
                int nomor = scanner.nextInt();
                nomorList.addNomor(nomor);
            }

            boolean hasDuplicates = nomorList.hasDuplicates();
            System.out.println(hasDuplicates);
        }
    }


