package oop;

public class week6 {

    public static void main(String[] args) {
        int MHS = 8, SOAL = 10;
        char[][] JAWAB = 
        {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        char[] KUNCI = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
    
        int[] HASIL = new int[MHS];

        for(int i=0; i<MHS; ++i) 
        {
            int BENAR = 0;
            for(int j=0; j<SOAL; ++j) 
            {
                if(JAWAB[i][j] == KUNCI[j])
                BENAR++;
            }
            HASIL[i] = BENAR;
        }

        for(int i=0; i<MHS; ++i) 
        {
            System.out.println("Mahasiswa " + i + " jumlah jawaban benar adalah " + HASIL[i]);
        }
    }
    
}
