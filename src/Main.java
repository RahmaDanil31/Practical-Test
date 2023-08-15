import Model.Orang;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * PT NUTECH INTEGRASI
 * Author: Rahma Danil
 * Create : 15-08-2023
 *
 */

public class Main {

    public static void main(String[] args) {

        //  1. Memasukan Object ke dalam array[Object].

        List<Orang> orangList = new ArrayList<>(Arrays.asList(
                new Orang("Budi", LocalDate.of(1999, 1, 1), 123456789),
                new Orang("Wati", LocalDate.of(1999, 12, 31), 987654321)
        ));

        //2. Menulis data di dalam array tersebut di atas kedalam file profile.txt dengan format NIK,Nama,TanggalLahir.

        String fileName = "profile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Orang orang : orangList) {
                writer.write(orang.getNik() + "," + orang.getNama() + "," + orang.getTanggalLahir());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        //3. Membaca isi file profile.txt dan memasukan hanya Nama saja ke dalam array[String].

        try {
            List<String> namaList = Files.lines(Paths.get(fileName))
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length >= 2)
                    .map(parts -> parts[1].trim())
                    .collect(Collectors.toList());

            System.out.println(namaList);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
