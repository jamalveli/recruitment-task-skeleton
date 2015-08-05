package tester;

import com.googlecode.jcsv.reader.CSVEntryParser;
import com.googlecode.jcsv.reader.CSVReader;
import com.googlecode.jcsv.reader.internal.CSVReaderBuilder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class TestCsvLoad {

    private static final String SAMPLE_CSV = "sample.csv";
    private static final String EXPECTED_CSV_FIRST_ENTRY = "[1, 2, 3]";

    public static List<String> readDataPoints(String fileName) throws IOException {

        class DataPointEntryParser implements CSVEntryParser<String> {

            @Override
            public String parseEntry(String... data) {
                return Arrays.toString(data);
            }
        }

        Reader csvFile = new InputStreamReader(new FileInputStream(fileName));

        CSVReader<String> points_Reader = new CSVReaderBuilder<String>(csvFile).entryParser(new DataPointEntryParser()).build();
        return points_Reader.readAll();

    }

    public static void main(String[] args) throws IOException {
        List<String> csvReadIn = readDataPoints(SAMPLE_CSV);

        if (csvReadIn.size() == 1 && EXPECTED_CSV_FIRST_ENTRY.equals(csvReadIn.get(0))) {
            System.out.println("Hello world from csv loader!");
        } else {
            System.err.println("Hmm, I wasn't expecting " + csvReadIn);
            System.exit(1);
        }
    }

}
